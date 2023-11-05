package MODELO;
//import laboratorio.Calibracion;
import MODELO.IDENTIDADES.*;
import java.util.ArrayList;

public class ArrayCalibraciones {

    public ArrayList<Calibracion> listaCalibracion;

    public ArrayCalibraciones() {
        listaCalibracion = new ArrayList();
    }

    public Object[] creaFilallena(Calibracion cali) {
        Object[] filAux = new Object[10];
        filAux[0] = cali.getNumero();
        filAux[1] = cali.getFecha();
        filAux[2] = cali.getMediciones();
        return filAux;
    }

    public Object[] retornaFila(int i) {
        Object[] filAux = new Object[4];
        if (i < listaCalibracion.size()) {
            Calibracion cali = listaCalibracion.get(i);
            filAux[0] = cali.getNumero();
            filAux[1] = cali.getFecha();
            filAux[2] = cali.getMediciones();
        }
        return filAux;
    }

    public int getCantidad() {
        return listaCalibracion.size();
    }

    public Calibracion getElemento(int i) {
        return listaCalibracion.get(i);
    }

    public void insertarCalibracion(Calibracion e) {
        listaCalibracion.add(e);
    }

    //-----------------------------------------------------------------------------------------------
    public ArrayList<Calibracion> getArrayList() {
        return listaCalibracion;
    }

    void eliminarElemento(int pos) {
        listaCalibracion.remove(pos);
    }
}
