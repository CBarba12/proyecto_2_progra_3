package CONTROLADOR;

import MODELO.AdministraModelos;
import VISTA.INTERFAZ;
import org.jdom2.JDOMException;

public class Principal {

    public static void main(String[] args) throws JDOMException {
        
        INTERFAZ v = new INTERFAZ();
        AdministraModelos m = new AdministraModelos();
//        m.cargarDatosDesdeXML("datos.xml");
        Control c = new Control(m, v);
        Thread hilo=new Thread(c);
        hilo.start();
     
    }

}//probando colisiones en github
