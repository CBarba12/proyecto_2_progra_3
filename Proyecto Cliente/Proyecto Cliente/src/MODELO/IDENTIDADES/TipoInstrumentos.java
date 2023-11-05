package MODELO.IDENTIDADES;

import java.io.IOException;
import java.io.Serializable;

public class TipoInstrumentos implements Serializable{
    
    private String codigoInstrumento;
    private String nombreInstrumento;
    private String unidadInstrumento;

    public TipoInstrumentos() {

    }

    public TipoInstrumentos(String codigoInstrumento, String nombreInstrumento, String unidadInstrumento) {
        this.codigoInstrumento = codigoInstrumento;
        this.nombreInstrumento = nombreInstrumento;
        this.unidadInstrumento = unidadInstrumento;
    }

    public String getCodigoInstrumento() {
        return codigoInstrumento;
    }

    public void setCodigoInstrumento(String codigoInstrumento) {
        this.codigoInstrumento = codigoInstrumento;
    }

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }

    public String getUnidadInstrumento() {
        return unidadInstrumento;
    }

    public void setUnidadInstrumento(String unidadInstrumento) {
        this.unidadInstrumento = unidadInstrumento;
    }
    
     private void writeObject(java.io.ObjectOutputStream out)   throws IOException {
         out.writeUTF (codigoInstrumento);      
         out.writeUTF ( nombreInstrumento);
         out.writeUTF ( unidadInstrumento);
         
         
     }
     
     private void readObject(java.io.ObjectInputStream in)  throws IOException, ClassNotFoundException {
         codigoInstrumento= in.readUTF();
         nombreInstrumento = in.readUTF();
         unidadInstrumento = in.readUTF();
     }
    
}
