package MODELO;
//import laboratorio.Calibracion;
//import laboratorio.Instrumento;
//import laboratorio.Medicion;
//import laboratorio.TipoInstrumentos;
import MODELO.IDENTIDADES.*;
import java.util.ArrayList;

public class ArrayInstrumentos {

    public ArrayList<Instrumento> listaInstrumentos;

    public ArrayInstrumentos() {
        listaInstrumentos = new ArrayList();
    }

    public Object[] creaFilallena(Instrumento instru) {
        Object[] filAux = new Object[10];
        filAux[0] = instru.getSerie();
        filAux[1] = instru.getDescripcion();
        filAux[2] = instru.getMinimo();
        filAux[3] = instru.getMaximo();
        filAux[4] = instru.getTolerancia();
        return filAux;
    }

    public Object[] retornaFila(int i) {
        Object[] filAux = new Object[4];
        if (i < listaInstrumentos.size()) {
            Instrumento instru = listaInstrumentos.get(i);
            filAux[0] = instru.getSerie();
            filAux[1] = instru.getDescripcion();
            filAux[2] = instru.getMinimo();
            filAux[3] = instru.getMaximo();
            filAux[4] = instru.getTolerancia();
        }
        return filAux;
    }

    public int getCantidad() {
        return listaInstrumentos.size();
    }

    public Instrumento getElemento(int i) {
        return listaInstrumentos.get(i);
    }

    public void insertarInstrumento(Instrumento e) {
        listaInstrumentos.add(e);
    }

    //-----------------------------------------------------------------------------------------------
    public ArrayList<Instrumento> getArrayList() {
        return listaInstrumentos;
    }

    void eliminarElemento(int pos) {
        listaInstrumentos.remove(pos);
    }

}
