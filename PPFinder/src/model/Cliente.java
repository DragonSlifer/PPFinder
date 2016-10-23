/*
 *  Clase Cliente
 */
package model;

import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends Thread
{
    private INFO info;              ///< Esta clase guardará la información del cliente en cuestion
    private Vector<INFO> ubi;
    int puerto;
    String ip;
    Socket socket;
    DatagramSocket socketUDP;
    PrintStream out;

    /******************************************************************
     * Constructor de la clase cliente al cual se le pasa el puerto
     * y la direccion ip del servidor. Ademas se le pasa la salida de
     * consola.
     *
     * @param ip         Ip del servidor
     * @param puerto     Puerto del Servidor
     * @param out        Salida de consola
     ****************************************************************/
    public Cliente(String ip, int puerto, PrintStream out) 
    {
        info = new INFO();
        this.puerto = puerto;
        this.ip = ip;
        System.setOut(out);
        System.setErr(out);
    }
    
    /******************************************************************
    * Envia una petición de conexión al servidor 
    * ****************************************************************/
    private void peticionConexion()
    {
        try 
        {
            socket = new Socket(ip, puerto);
        } 
        
        catch (IOException ex) 
        {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /******************************************************************
    * Espera a que el servidor le envie la peticion de inicio de
    * comunicación
    * ****************************************************************/
    private void establecerConexion()
    {
        String mensaje ="";
        boolean empieza = false;
        byte[] mensaje_bytes = new byte[256];
        DatagramPacket resp_paquete = new DatagramPacket(mensaje_bytes,256);
        
        do
        {
            try 
            {
                socketUDP = new DatagramSocket();
                socketUDP.receive(resp_paquete);

                mensaje_bytes = resp_paquete.getData();
                mensaje = Arrays.toString(mensaje_bytes);

                if(mensaje == "start")
                    empieza = true;
            } catch (IOException ex) 
            {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while(!empieza);
    }
    
    /******************************************************************
    * El cliente envia al servidor sus coordenadas
    * ****************************************************************/
    private void enviarCoordenadas() throws UnknownHostException
    {
        String mensaje;
        DatagramPacket paquete;
        InetAddress address;
        byte[] mensaje_bytes = new byte[256];
        
        try 
        {
            ///< Esto manda la localización
            address = InetAddress.getByName("localhost");
            
            mensaje = Float.toString(info.retrieveLatitud()) + "/" + Float.toString(info.retrieveLongitud());
            mensaje_bytes = mensaje.getBytes();
            paquete = new DatagramPacket(mensaje_bytes, mensaje.length(), address, puerto);

            socketUDP.send(paquete);                ///< Envio paquete
        }
        catch (IOException e) 
        {
            System.err.println("Cliente -- sendLocation -- "  + e.getMessage());
            System.exit(1);
        }
    }
    
    /******************************************************************
    * El cliente esperara a recibir la confirmación de todos sus vecinos
    * ****************************************************************/
    private void recibirConfirmaciones()
    {
        byte[] mensaje_bytes = new byte[256];
        DatagramPacket servPaquete;
        boolean fin = false;
        int contador = 0, numeroVecinos = 10;
        String mensaje = "";
        
        while(!fin)
        {
            try 
            {
                mensaje_bytes = new byte[256];
                servPaquete = new DatagramPacket(mensaje_bytes, 256);
                socketUDP.receive(servPaquete); // Esta función tiene asumido un TIMEOUT por defecto que le viene con UDP, si salta este TIMEOUT se lanza una EXCEPCIÓN
                
                mensaje = Arrays.toString(mensaje_bytes);
                
                if(contador == numeroVecinos || "fin".equals(mensaje))//Esta parte no tengo claro como hacerla pero os lo dejo a vosotros, basicamente es comprobar que recibe todas las confirmaciones de los clientes
                    fin = true;                        //Os he dejado la estructura de como deberia ser pero no conteis con que esta bien por que no lo esta
                    
                contador++;
                
                
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
    }
    
    /******************************************************************
    * Se encarga de crear los nuevos valor de las coordenadas en cada
    * iteracion
    * ****************************************************************/
    private void actualizarCoordenadas()
    {
        
    }
    
    
    //Esto lo comento por si jorge lo quiere pero nose para que sirve
    /*
    private void receiveLocation(DatagramSocket socket, DatagramPacket servPaquete) throws UnknownHostException
    {
        ///< Esto recibe la localización
        DatagramSocket s = socket;
        byte[] mensaje_bytes = new byte[256];
        
        try 
        {
            s.receive(servPaquete);
            mensaje_bytes = servPaquete.getData();
            String message = mensaje_bytes.toString();
            long message_long = Long.valueOf(message).longValue();

            INFO aux = new INFO();
            aux.addInfo(message_long);

            ubi.add(aux);
        }
        catch (IOException e) 
        {
            System.err.println("Cliente -- receiveLocation -- "  + e.getMessage());
            System.exit(1);
        }
    }*/
    
    @Override
    public void run()
    {
        do 
        {           
            try 
            {
                peticionConexion(); //< Envio mediante TCP inicial y///< En caso de que la Informacion haya sido actualizada, la reenvi de actualizacion
                establecerConexion(); //Esta funcion esperara el mensaje del servidor confirmando el inciio de la comunicación
                
                enviarCoordenadas(); //< Envio mediante UDP de la localizacion
                recibirConfirmaciones(); //El cliente espera hasta recibir la confirmación de todos sus vecinos
                actualizarCoordenadas(); //Aqui se calcularian las nuevas coordenadas
                //sleep(20000);                                               ///< Personalmente, no tengo muy claro esto // Yo nose por que esta puesto aqui
            } 
            catch (UnknownHostException ex) 
            {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);   ///< Esta condicion OBVIAMENTE hay que cambiarla
    }
}
