package ejemplo.serializacion;

/*
 * Javier Abellán. 3 de diciembre de 2003
 *
 * OtroDato.java
 *
 */
import java.io.*;
/**
 * Clase Serializable para enviar por el socket.
 */
public class Direccion implements Serializable{

     String provincia ;
     String canton ;
     
    public Direccion(String provincia, String canton  ){
          this.provincia= provincia;
          this.canton = canton;
     }
     
     
     public String toString() {
         return "   Provincia: "+ provincia + " \n" + "   Canton: "  +  canton  ;
     }

     /*******
      *
      * LOS SIGUIENTES MÉTODOS SON INNECESARIOS SALVO QUE QUERAMOS QUE SE
      * ENVIEN Y RECIBAN LOS DATOS DE FORMA NO STANDARD.
      * Puedes descomentarlos y todo funcionará exactamente igual
      *
      *******/
     private void writeObject(java.io.ObjectOutputStream out) throws IOException  {
         out.writeUTF (provincia);
         out.writeUTF (canton);
     }
     private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException{
         provincia = in.readUTF();
         canton = in.readUTF();
     }
}

 


