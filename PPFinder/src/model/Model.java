/*
 *  Role Game Character Creator
 *  Programa para crear fichas de personajes de rol en varios
 *  sistemas: Mundo de Tinieblas, NSD20, Malefic Time: Plenilunio,
 *  ...
 *  Permite además, guardar la ficha, editarla y enviarla por
 *  correo electrónico al director de partida.
 */
package model;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Vector;

/**
 *
 * Los mensajes del Modelo seguiran la estructura:
 *      "Model -- nombre_de_funcion -- mensaje"
 * @author Jorge
 */
public class Model {
    
    private static final int n_cli = 20;
    
    private Vector<Cliente> v_cli;
    private Servidor servidor;
    private InetAddress ip; // IP LOCAL AL ORDENADOR
    private int port = 6000; // CAMBIAR ESTO PORQUE NO SÉ QUE PUERTO ES EL DEL CLIENTE (PUERTO DIFERENTE PARA CADA CLIENTE?)
    
    
    /******************************************************************
    * Constructor que crea el servidor y los clientes pero no inicializa
    * ****************************************************************/
    public Model() throws UnknownHostException {
    
        CreaServer();
        CreaClientes();
        
    }

    /******************************************************************
    * Función que declara el server con un máximo de clientes indicado
    * ****************************************************************/    
    public void CreaServer() {
        
        servidor = new Servidor(20); // Inicialmente que el servidor acepte únicamente 20 clientes (EN FASE DE PRUEBAS)
        System.out.println("Model -- CreaServer -- Servidor creado pero NO inicializado");
        
    }
    
    
    /******************************************************************
    * Función que declara los clientes pero no los inicializa
    * ****************************************************************/
    public void CreaClientes() throws UnknownHostException {
        
        try {
        
            ip = InetAddress.getLocalHost();

            for(int i = 0; i < n_cli; i++) {

                Cliente cli_aux = new Cliente(ip, port);
                v_cli.add(cli_aux);
            }

            System.out.println("Model -- CreaClientes -- Clientes creados pero NO inicializados");
        
        }
        
        catch (UnknownHostException e) 
        {
            System.out.println("Model -- CreaClientes -- Error al obtener la IP local"); // puede ser que el ordenador no esté conectado y no tenga IP asignada (?)
            System.err.println("Cliente -- CreaClientes -- "  + e.getMessage());
            System.exit(1);
        }
        
    }
    
    
    /******************************************************************
    * Función que pone en funcionamiento al servidor
    * ****************************************************************/    
    public void IniciaServer() {
        
        servidor.run();
        System.out.println("Model -- CreaServer -- Servidor creado pero NO inicializado");
        
    }
    
    /******************************************************************
    * Función que pone en funcionamiento a todos los clientes
    * ****************************************************************/
    public void iniciaClientes() {
        
        for(int i = 0; i < n_cli; i++) {

            v_cli.elementAt(i).run();

        }
        
        System.out.println("Model -- CreaClientes -- Clientes inicializados");
        
    }
        


    
    

    /**
     * Deberia poder: -guardar las preferencias de busqueda -guardar las
     * preferencias de perfil -enviar y recibir localizaciones -mandar mensajes
     * de error -...
     */
}
