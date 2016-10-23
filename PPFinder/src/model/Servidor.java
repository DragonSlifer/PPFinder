package model;

import java.net.*;
import java.io.*;
import java.util.*;

public class Servidor extends Thread
{
    int num_clientes;
    ServerSocket socketTCP;
    DatagramSocket socketUDP;
    Vector<Vector<Socket>> vec_clientes = new Vector<Vector<Socket>>(num_clientes);
    PrintStream out;
    
    /******************************************************************
     * Constructor de la clase a la que se le pasa desde el modelo el 
     * numero de clientes con el que se va a trabajar
     *
     * @param num_clientes 
     * @param out 
     ******************************************************************/
    public Servidor(int num_clientes,PrintStream out)
    {
        this.num_clientes = num_clientes;
        this.out = out;                     ///< Para los mensajes de la consola
        System.setOut(out);
        System.setErr(out);
    }
    
    /******************************************************************
    * Función que se encarga de permanecer a la espera de nuevas conexiones
    * por parte de los clientes hasta que se llega al numero de clientes
    * establecido.
    * 
    * De momento falta establecer que a los 20 segundos se dejara de esperar
    * conexiones
    * ****************************************************************/
    void clientesConexion()///////////////Servidor TCP
    {
        int clientes_conectados = 0, grupo = 0;
        // En este try catch el servidor se queda en espera hasta que todos los clientes le manda una solicitud de conexion
        try 
        {
            socketTCP = new ServerSocket(6000);

            while(clientes_conectados != num_clientes) 
            {
                System.out.println("Esperando conexion...");

                Socket socket_conexion = socketTCP.accept();

                System.out.println("Nuevo cliente conectado");

                clientes_conectados++;

                if(clientes_conectados%10 == 0)
                    grupo++;

                vec_clientes.get(grupo).add(socket_conexion);
            }
        }
        catch (IOException e) 
        {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
    
    /******************************************************************
    * Se encarga de enviar a todos los clientes conectados un mensaje
    * indicandoles que puede comenzar el intercambio de coordenadas
    * ****************************************************************/
    void inicioComunicacion()
    {
        String mensaje;
        
        try
        {
            Socket aux;
            DataOutputStream out;
             
            for(int i = 0; i < vec_clientes.size(); i++)
            {
                for(int j = 0; i <vec_clientes.get(i).size(); i++)
                {
                    aux = (Socket)vec_clientes.get(i).get(j);

                    out = new DataOutputStream(aux.getOutputStream());

                    mensaje = "start";

                    out.writeUTF(mensaje);
                }
            }
        }
        catch (IOException e) 
        {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
    
    /******************************************************************
    * Esta función auxiliar se encarga de averiguar el grupo al que
    * pertenece el cliente que ha enviado las ultimas coordenadas
    * recividas, esto lo realizara mediante el uso de su puerto y su
    * ip obtenidas del paquete recibido
    * ****************************************************************/
    int obtenerGrupo(int puerto, InetAddress address)
    {
        int grupo_cliente = 0;
        
        for(int i = 0; i < vec_clientes.size(); i++)
        {
            for(int j = 0; j < vec_clientes.get(i).size(); j++)
            {
                if(vec_clientes.get(i).get(j).getPort() == puerto && vec_clientes.get(i).get(j).getInetAddress() == address)
                {
                    //socket = vec_clientes.get(i).get(j);
                    grupo_cliente = i;
                    break;
                }
            }
        }
        
        return grupo_cliente;
    }
    
    /******************************************************************
    * Se encarga de reenviar a todos los miembros del grupo las 
    * coordenadas del cliente que envio el paquete con su posición
    * ****************************************************************/
    void distribuirCoordenadas(int grupo_cli, int puerto, InetAddress address, DatagramPacket recv_paquete)
    {
        int puerto_vecino;
        InetAddress address_vecino;
        String mensaje;
        byte[] mensaje_bytes = new byte[256];
        DatagramPacket env_paquete = new DatagramPacket(mensaje_bytes,256);
        
        try
        {
            for(int i = 0; i < vec_clientes.get(grupo_cli).size(); i++)
            {
                puerto_vecino = vec_clientes.get(grupo_cli).get(i).getPort();
                address_vecino = vec_clientes.get(grupo_cli).get(i).getInetAddress();

                if(puerto_vecino != puerto && address_vecino != address)
                {
                    mensaje_bytes = recv_paquete.getData();

                    mensaje = Arrays.toString(mensaje_bytes);

                    //Preparamos el paquete que queremos enviar
                    env_paquete = new DatagramPacket(mensaje_bytes,mensaje.length(),address,puerto); // Envía 

                    // realizamos el envio
                    socketUDP.send(env_paquete);
                }
            }
        }
        catch (IOException e) 
        {       
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
    
    /******************************************************************
    * Se encarga de recibir las confirmaciones de cada uno de los vecinos
    * del grupo y de renviarlas al cliente que envio las coordenadas
    * ****************************************************************/
    void tramitarRespuestas(int grupo_cli, int puerto, InetAddress address)
    {
        int contador = 0;
        String mensaje;
        byte[] mensaje_bytes = new byte[256];
        DatagramPacket resp_paquete = new DatagramPacket(mensaje_bytes,256);
        DatagramPacket env_paquete = new DatagramPacket(mensaje_bytes,256);
           
        try
        {
            while(contador != vec_clientes.get(grupo_cli).size())
            {
                socketUDP.receive(resp_paquete);

                mensaje_bytes = resp_paquete.getData();

                mensaje = Arrays.toString(mensaje_bytes);

                env_paquete = new DatagramPacket(mensaje_bytes,mensaje.length(),address,puerto);

                socketUDP.send(env_paquete);

                contador++;
            }
        }
        catch (IOException e) 
        {       
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
    
    /******************************************************************
    * Función que se inicia al ejecutar el hilo Servidor desde el main
    * mediante el comando .start()
    * ****************************************************************/
    @Override
    public void run()
    {
        //////////// Servidor UDP
        
        byte[] mensaje_bytes = new byte[256];
        String mensaje;
        int puerto,  grupo_cli;
        InetAddress address;
        DatagramPacket recv_paquete = new DatagramPacket(mensaje_bytes,256);
        
        try 
        {
            //Creamos el socket
            socketUDP = new DatagramSocket(6000);

            //Iniciamos el bucle
            do 
            {
                // Recibimos el paquete
                socketUDP.receive(recv_paquete);
                
                // Lo formateamos
                mensaje = new String(mensaje_bytes).trim();
                
                // Lo mostramos por pantalla
                System.out.println(mensaje);
                
                //Obtenemos IP Y PUERTO
                puerto = recv_paquete.getPort();
                address = recv_paquete.getAddress();
                
                grupo_cli = obtenerGrupo(puerto, address); //Obtenemos el grupo al que pertenece el cliente que manda las coordenadas
                
                distribuirCoordenadas(grupo_cli, puerto, address, recv_paquete); //Distribuimos sus coordenadas entre todos sus vecinos
                
                tramitarRespuestas(grupo_cli, puerto, address); // Esperamos las confirmaciones de los vecinos y las reenviamos al cliente que mando las coordenadas
                
            } while (1>0);
        }
        catch (IOException e) 
        {       
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}