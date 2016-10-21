/*
 *  Clase Cliente
 */
package model;

import java.io.DataOutputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class Cliente {

    private INFO info;              ///< Esta clase guardará la información del cliente en cuestion

    public Cliente(String ip, int puerto) {
        info = new INFO();
        do {
            try {
                if (!info.changedInfoAsk()) {                                   ///< En caso de que la Informacion haya sido actualizada, la reenvia
                    this.sendStartMessage(new Socket(ip, puerto));              ///< Envio mediante TCP inicial y de actualizacion
                } else {
                    this.sendLocation(new DatagramSocket(), puerto);            ///< Envio mediante UDP de la localizacion
                    sleep(20000);                                               ///< Personalmente, no tengo muy claro esto
                }

            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);   ///< Esta condicion OBVIAMENTE hay que cambiarla
    }

    private void sendStartMessage(Socket socket) throws IOException {
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeInt(0);
        //out.writeLong(info.getInfo());   ///< Se deja para la sesion 3
    }

    private void sendLocation(DatagramSocket socket, int puerto) throws UnknownHostException, IOException {
        ///< Esto manda la localización
        DatagramSocket s = socket;
        InetAddress address = InetAddress.getByName("localhost");
        byte[] mensaje_bytes = new byte[256];
        byte[] RecogerServidor_bytes = new byte[256];
        DatagramPacket servPaquete;

        String mensaje = Float.toString(info.retrieveLatitud()) + "/" + Float.toString(info.retrieveLongitud());
        mensaje_bytes = mensaje.getBytes();
        DatagramPacket paquete = new DatagramPacket(mensaje_bytes, mensaje.length(), address, puerto);

        s.send(paquete);                ///< Envio paquete

        RecogerServidor_bytes = new byte[256];
        servPaquete = new DatagramPacket(RecogerServidor_bytes, 256);
        s.receive(servPaquete);

        String cadenaMensaje = new String(RecogerServidor_bytes).trim();        ///< Este es el mensaje del server
        //out.writeBytes("Ubicacion");
    }
}
