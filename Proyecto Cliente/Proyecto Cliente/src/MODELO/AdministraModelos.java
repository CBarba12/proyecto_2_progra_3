package MODELO;

import MODELO.IDENTIDADES.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class AdministraModelos {

    private DefaultTableModel modeloTI;
    private DefaultTableModel modeloI;
    private DefaultTableModel modeloCal;
    private DefaultTableModel modeloMed;
    private ArrayTipoInstrumento arrayTI;
    private ArrayInstrumentos arrayI;
    private ArrayCalibraciones arrayC;
//    private ArrayMediciones arrayM;

    //--------------------------------------------------------------------
    public AdministraModelos() {
        modeloTI = new DefaultTableModel();
        modeloI = new DefaultTableModel();    
        modeloCal = new DefaultTableModel(); 
        modeloMed = new DefaultTableModel();  
        darFormatoModelos();
    }
    //--------------------------------------------------------------------

    public void darFormatoModelos() {
        //Modelo tipo instrumentos
        modeloTI.addColumn("Codigo");
        modeloTI.addColumn("Nombre");
        modeloTI.addColumn("Unidad");
        //Modelo instrumento
        modeloI.addColumn("No. Serie");
        modeloI.addColumn("Descripcion");
        modeloI.addColumn("Minimo");
        modeloI.addColumn("Maximoo");
        modeloI.addColumn("Tolerancia");
        //Modelo Calibraciones        
        modeloCal.addColumn("Número");
        modeloCal.addColumn("Fecha");
        modeloCal.addColumn("Mediciones");
        //Modelo Mediciones
        modeloMed.addColumn("Medida");
        modeloMed.addColumn("Referencia");
        modeloMed.addColumn("Lectura");
    }

    public void insertarFilaModeloTipoInstrumento(Object[] filaAux) {
        modeloTI.addRow(filaAux);
    }

    public void insertarFilaModeloInstrumento(Object[] filaAux) {
        modeloI.addRow(filaAux);
    }

    public void insertarFilaModeloCalibracion(Object[] filaAux) {
        modeloCal.addRow(filaAux);
    }

    public void insertarFilaModeloMedicion(Object[] filaAux) {
        modeloMed.addRow(filaAux);
    }
    //--------------------------------------------------------------------------------------------------------  

    public void borrarRegistroTipoInstrumento(int linea) {
        modeloTI.removeRow(linea);

    }

    public void borrarRegistroInstrumento(int linea) {
        modeloI.removeRow(linea);

    }

    public void borrarRegistroCalibracion(int linea) {
        modeloCal.removeRow(linea);

    }
//-----------------------------------------------------------------------
    public DefaultTableModel getModeloTipoInstrumento() {
        return modeloTI;
    }

    public DefaultTableModel getModeloInstrumento() {
        return modeloI;
    }

    public DefaultTableModel getModeloCalibracion() {
        return modeloCal;
    }

    public DefaultTableModel getModeloMedicion() {
        return modeloMed;
    }

    public DefaultTableModel getModeloTI() {
        return modeloTI;
    }

    public void setModeloTI(DefaultTableModel modeloTI) {
        this.modeloTI = modeloTI;
    }

    public DefaultTableModel getModeloI() {
        return modeloI;
    }

    public void setModeloI(DefaultTableModel modeloI) {
        this.modeloI = modeloI;
    }

    public DefaultTableModel getModeloCal() {
        return modeloCal;
    }

    public void setModeloCal(DefaultTableModel modeloCal) {
        this.modeloCal = modeloCal;
    }

    public DefaultTableModel getModeloMed() {
        return modeloMed;
    }

    public void setModeloMed(DefaultTableModel modeloMed) {
        this.modeloMed = modeloMed;
    }
}
