package ejemplo.serializacion;


import java.io.*;

/**
 * Dato para enviar por el socket. Sus atributos son simples y una Clase Atributo
 */
public class Paciente implements Serializable{
     public int  peso ;
     public String id ;
     Direccion dir;
     
     
     public Paciente (int  p, String i, Direccion d){
       this.peso=p;
       this.id=i ;
       this.dir= d;
     }

    @Override
    public String toString() {
        return "Paciente{\n" + "   Peso=" + peso + "\n"+ "   id=" + id + "\n"+ "   Direccion\n" + dir.toString() + "\n}";
    }
     
     /** Método para devolver un String en el que se represente el valor de
      * todos los atributos. */


     /*******
      *
      * LOS SIGUIENTES MÉTODOS SON INNECESARIOS SALVO QUE QUERAMOS QUE SE
      * ENVIEN Y RECIBAN LOS DATOS DE FORMA NO STANDARD.
      * Puedes descomentarlos y todo funcionará exactamente igual
      *
      *******/
     private void writeObject(java.io.ObjectOutputStream out)   throws IOException {
         out.writeInt (peso);
         out.writeUTF (id);
         out.writeUTF  (dir.provincia);
         out.writeUTF (dir.canton);
     }
     
     
     private void readObject(java.io.ObjectInputStream in)  throws IOException, ClassNotFoundException {
         peso= in.readInt();
         id = in.readUTF();
         if (dir==null){
             dir = new Direccion("--", "--");
         }
         dir.provincia = in.readUTF();
         dir.canton = in.readUTF();
     }
}

 


