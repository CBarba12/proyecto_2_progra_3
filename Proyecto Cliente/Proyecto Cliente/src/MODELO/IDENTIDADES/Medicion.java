package MODELO.IDENTIDADES;

public class Medicion {
      private String numero;
    private String referencia;
    private String lectura;
    Calibracion calibracion;

    public Medicion() {
    }

    public Medicion(String numero, String referencia, String lectura) {
        this.numero = numero;
        this.referencia = referencia;
        this.lectura = lectura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getLectura() {
        return lectura;
    }

    public void setLectura(String lectura) {
        this.lectura = lectura;
    }

    public Calibracion getCalibracion() {
        return calibracion;
    }

    public void setCalibracion(Calibracion calibracion) {
        this.calibracion = calibracion;
    }
}
