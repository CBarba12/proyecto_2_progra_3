package MODELO;
//import laboratorio.Calibracion;
//import laboratorio.Instrumento;
//import laboratorio.Medicion;
//import laboratorio.TipoInstrumentos;
import MODELO.IDENTIDADES.*;
import java.util.ArrayList;

public class ArrayTipoInstrumento {

    public ArrayList<TipoInstrumentos> listaInstrumentos;

    public ArrayTipoInstrumento() {
        listaInstrumentos = new ArrayList();
    }

    public Object[] creaFilallena(TipoInstrumentos t) {
        Object[] filAux = new Object[10];
        filAux[0] = t.getCodigoInstrumento();
        filAux[1] = t.getNombreInstrumento();
        filAux[2] = t.getUnidadInstrumento();
        return filAux;
    }

    public Object[] retornaFila(int i) {
        Object[] filAux = new Object[4];
        if (i < listaInstrumentos.size()) {
            TipoInstrumentos t = listaInstrumentos.get(i);
            filAux[0] = t.getCodigoInstrumento();
            filAux[1] = t.getNombreInstrumento();
            filAux[2] = t.getUnidadInstrumento();
        }
        return filAux;
    }

    public int getCantidad() {
        return listaInstrumentos.size();
    }

    public TipoInstrumentos getElemento(int i) {
        return listaInstrumentos.get(i);
    }

    public void insertarTipoInstrumento(TipoInstrumentos e) {
        listaInstrumentos.add(e);
    }

    //-----------------------------------------------------------------------------------------------
    public ArrayList<TipoInstrumentos> getArrayList() {
        return listaInstrumentos;
    }

    public int retornaPos(String t) {

        for (int i = 0; i < listaInstrumentos.size(); i++) {
            if (listaInstrumentos.get(i).getNombreInstrumento().equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public TipoInstrumentos retornaTipoIntrumento(String t) {

        for (int i = 0; i < listaInstrumentos.size(); i++) {
            if (listaInstrumentos.get(i).getCodigoInstrumento().equals(t)) {
                return listaInstrumentos.get(i);
            }
        }
        return null;
    }

    public void eliminarElemento(int pos) {
        listaInstrumentos.remove(pos);
    }
}
