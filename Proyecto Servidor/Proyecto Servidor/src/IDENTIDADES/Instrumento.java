package IDENTIDADES;

import java.io.Serializable;
import java.util.ArrayList;


public class Instrumento implements Serializable{
    
    private String serie;
    private String descripcion;
    private int maximo;
    private int minimo;
    private int tolerancia;
    private TipoInstrumentos tipo;
    private ArrayList<Calibracion> list_calibraciones;

    public Instrumento() {
    }

    public Instrumento(String serie, String descripcion, int maximo, int minimo, int tolerancia) {
        this.serie = serie;
        this.descripcion = descripcion;
        this.maximo = maximo;
        this.minimo = minimo;
        this.tolerancia = tolerancia;
    }

    public Instrumento(String serie, String descripcion, int maximo, int minimo, int tolerancia, TipoInstrumentos tipo) {
        this.serie = serie;
        this.descripcion = descripcion;
        this.maximo = maximo;
        this.minimo = minimo;
        this.tolerancia = tolerancia;
        this.tipo = tipo;
        list_calibraciones = new ArrayList<>();
    }

  
  

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }



    public TipoInstrumentos getTipo() {
        return tipo;
    }

    public void setTipo(TipoInstrumentos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "serie=" + serie + ", descripcion=" + descripcion + ", maximo=" + maximo + ", minimo=" + minimo + ", tolerancia=" + tolerancia + ", tipo=" + tipo + '}';
    }

    public ArrayList<Calibracion> getList_calibraciones() {
        return list_calibraciones;
    }

    public void setList_calibraciones(ArrayList<Calibracion> list_calibraciones) {
        this.list_calibraciones = list_calibraciones;
    }

}