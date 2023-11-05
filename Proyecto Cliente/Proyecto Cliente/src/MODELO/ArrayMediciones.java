//package MODELO;
//import laboratorio.Instrumento;
//import laboratorio.Medicion;
//import java.util.ArrayList;
//
//public class ArrayMediciones {
//
//    public ArrayList<Medicion> listaMediciones;
//
//    public ArrayMediciones() {
//        listaMediciones = new ArrayList();
//    }
//
//    public Object[] creaFilallena(Instrumento instru) {
//        Object[] filAux = new Object[10];
//        filAux[0] = instru.getSerie();
//        filAux[1] = instru.getDescripcion();
//        filAux[2] = instru.getMinimo();
//        filAux[3] = instru.getMaximo();
//        filAux[4] = instru.getTolerancia();
//        return filAux;
//    }
//
//    public Object[] retornaFila(int i) {
//        Object[] filAux = new Object[4];
//        if (i < listaMediciones.size()) {
//            Medicion med = listaMediciones.get(i);
//            filAux[0] = med.getNumero();
//            filAux[1] = med.getReferencia();
//            filAux[2] = med.getLectura();
//        }
//        return filAux;
//    }
//
//    public int getCantidad() {
//        return listaMediciones.size();
//    }
//
//    public Medicion getElemento(int i) {
//        return listaMediciones.get(i);
//    }
//
//    public void insertarMedicion(Medicion e) {
//        listaMediciones.add(e);
//    }
//
//    //-----------------------------------------------------------------------------------------------
//    public ArrayList<Medicion> getArrayList() {
//        return listaMediciones;
//    }
//
//    void eliminarElemento(int pos) {
//        listaMediciones.remove(pos);
//    }
//}
