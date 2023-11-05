package ejemplo.serializacion;

import java.net.*;
import java.io.*;

/**
 * Clase que crea un socket cliente, establece la conexión y lee los datos del
 * servidor, escribiéndolos en pantalla.
 */
public class Cliente {
    //---------------------------------------------------------------

    /**
     * Programa principal, crea el socket cliente
     */
    public static void main(String[] args) {
        new Cliente();
    }
    //---------------------------------------------------------------

    public Cliente() {
        try {
            Socket socket = new Socket("localhost", 35557);
            System.out.println("conectado cliente");

        

         
            
            //-----------------------------------------------------------------
            Paciente obj1 = new Paciente(50, "111", new Direccion("Heredia", "San Francisco"));

            ObjectOutputStream salidaObjeto = new ObjectOutputStream(socket.getOutputStream());

            salidaObjeto.writeObject(obj1);
        
            //------------------------------------------------------------
            
            salidaObjeto.close();
            socket.close();
            
            
           
       
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
