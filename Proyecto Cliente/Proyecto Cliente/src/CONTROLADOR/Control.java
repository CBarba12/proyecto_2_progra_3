package CONTROLADOR;

import VISTA.*;
import MODELO.*;
import MODELO.IDENTIDADES.*;
import com.itextpdf.text.DocumentException;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdom2.JDOMException;

//import Conexion.*;
//import static MODELO.Conexion.getConnection;
import com.mysql.jdbc.PreparedStatement;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;

public class Control implements ActionListener, MouseListener, WindowListener, Runnable {

    private Socket socket;
    DataOutputStream salida;
    DataInputStream entrada;
    String mensaje;
    //-------------------------------MODELO VISTA-------------------------------------
    public AdministraModelos modelo;
    public INTERFAZ vista;

    //----------------------------------SERVIDOR------------------------------------------
    final String HOST = "localhost";
    final int PUERTO = 5000;

//    private class ServerReader implements Runnable {
//        @Override
//        public void run() {
//            try {
//                // Coloca aquí el código para leer datos del servidor
//                while (true) {
//                    mensaje = entrada.readUTF();//mensaje y objeto
//                    
//                    
//                    // Realiza las acciones necesarias en respuesta al mensaje recibido
//                    JOptionPane.showMessageDialog(vista, mensaje);
//                   
//                    // Puedes llamar a métodos en tu Control principal para manejar los mensajes
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    public Control(AdministraModelos m, INTERFAZ v) throws JDOMException {
        modelo = m;
        vista = v;

        
        ImageIcon imagenBotonReporte = new ImageIcon("src/imagenes/imagenPdf.png");
        Icon imagenReporte = new ImageIcon(imagenBotonReporte.getImage().getScaledInstance(25, 20, Image.SCALE_DEFAULT));
        vista.getBtnReporteTI().setIcon(imagenReporte);
        vista.getBtnReporteInstrumentos().setIcon(imagenReporte);
        vista.getBtnReporteCalibracion().setIcon(imagenReporte);
        mostrar();
        actualizarJComboBoxInstrumentos();

        vista.getTabla1().setModel(modelo.getModeloTipoInstrumento());
        vista.getTabla2Instrumentos().setModel(modelo.getModeloInstrumento());
        vista.getTabla3Calibraciones().setModel(modelo.getModeloCalibracion());
        vista.getTabla4Mediciones().setModel(modelo.getModeloMedicion());
        //eventos   
        //----------------------TIPO DE INSTRUMENTO----------------
        this.vista.getBtnGuardarTI().addActionListener(this);
        this.vista.getBtnBuscarTI().addActionListener(this);
        this.vista.getBtnLimpiarTI().addActionListener(this);
        this.vista.getBtnBorrarTI().addActionListener(this);
        this.vista.getTabla1().addMouseListener(this);
        this.vista.getBtnReporteTI().addActionListener(this);

        // ------------------------INSTRUMENTO----------------------
        this.vista.getBtnGuardarInstrumentos().addActionListener(this);
        this.vista.getBtnlimpiarInstrumentos().addActionListener(this);
        this.vista.getBtnBorrarInstrumentos().addActionListener(this);
        this.vista.getTabla2Instrumentos().addMouseListener(this);
        this.vista.getBtnBuscarInstrumentos().addActionListener(this);
        this.vista.getBtnReporteInstrumentos().addActionListener(this);

        // ------------------------Calibraciones----------------------
        this.vista.getBtnGuardarCalibracion().addActionListener(this);
        this.vista.getTabla3Calibraciones().addMouseListener(this);
        this.vista.getBtnLimpiarCalibracion().addActionListener(this);
        this.vista.getBtnBorrarCalibracion().addActionListener(this);
        this.vista.getBtnBuscarCalibracion().addActionListener(this);
        this.vista.getBtnReporteCalibracion().addActionListener(this);
        this.vista.addWindowListener(this);

        vista.getTabla4Mediciones().setVisible(false);
        vista.getJlblInfoInstrumento().setText("");
        vista.getTabla3Calibraciones().setVisible(false);
        vista.getJtxtMedicionesCalibracion().setEditable(false);
        vista.getJtxtFecha().setEditable(false);
        vista.getJtxtNumBusqCalib().setEditable(false);
        vista.getBtnReporteCalibracion().setEnabled(false);

        try {

            socket = new Socket(HOST, PUERTO);
            System.out.println("Conectado");
            salida = new DataOutputStream(socket.getOutputStream());
            entrada = new DataInputStream(socket.getInputStream());

            // Inicia un hilo para leer datos del servidor
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        this.vista.getBtnBorrarTI().setEnabled(true);
    }

    public void mostrar() {
        vista.setVisible(true);
    }

    public void ocultar() {
        vista.setVisible(false);
    }

    @Override
    public void run() {
        try {
            try {
                // Coloca aquí el código para leer datos del servidor
                while (true) {
                    mensaje = entrada.readUTF();//mensaje y objeto

                    //------------------------------metodos de instrumento-----------------------------
                    if (mensaje.equals("TiposInstrumentos guardado")) {

                        String mensaje_2 = entrada.readUTF();
                        String mensaje_3 = entrada.readUTF();
                        String mensaje_4 = entrada.readUTF();

                        TipoInstrumentos tipo = new TipoInstrumentos(mensaje_2, mensaje_3, mensaje_4);
                        guardarTipoInstrumentos(tipo);
                    } else if (mensaje.equals("TiposInstrumentos eliminado")) {
                      String mensaje_2 = entrada.readUTF();
                      borrarTipoInstrumentos(mensaje_2);
                    }

                    // Realiza las acciones necesarias en respuesta al mensaje recibido
                    JOptionPane.showMessageDialog(vista, mensaje);

                    // Puedes llamar a métodos en tu Control principal para manejar los mensajes
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    //---Evento Action Performed---
    @Override
    public void actionPerformed(ActionEvent e) {
        //--Eventos de tipo de instrumentos
        if (e.getSource().equals(vista.getBtnGuardarTI())) {
            guardarTipoInstrumentos();
        }
        if (e.getSource().equals(vista.getBtnLimpiarTI())) {
            limpiarTipoInstrumentos();
        }
        if (e.getSource().equals(vista.getBtnBorrarTI())) {
            borrarTipoInstrumentos();
        }
        if (e.getSource().equals(vista.getBtnBuscarTI())) {
            buscarTipoInstrumento();
        }
        if (e.getSource().equals(vista.getBtnReporteTI())) {
            ReporteTipoInstrumento reporte = new ReporteTipoInstrumento(vista.getJtxtCodigo().getText(), vista.getJtxtNombre().getText(), vista.getJtxtUnidad().getText());
            try {
                reporte.crearReporte();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                abrirPDFTipoInstrumento();
            } catch (IOException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //--Eventos de instrumentos
        if (e.getSource().equals(vista.getBtnGuardarInstrumentos())) {
            this.guardarInstrumento();
        }
        if (e.getSource().equals(vista.getBtnlimpiarInstrumentos())) {
            this.limpiarInstrumento();
        }
        if (e.getSource().equals(vista.getBtnBorrarInstrumentos())) {
            this.borrarInstrumento();
        }
        if (e.getSource().equals(vista.getBtnBuscarInstrumentos())) {
            this.buscarInstrumento();
        }
        if (e.getSource().equals(vista.getBtnReporteInstrumentos())) {
            ReporteInstrumento reporte = new ReporteInstrumento(vista.getJtxtNumSerie().getText(), vista.getJtxtDescripcion().getText(), vista.getJtxtMinimo().getText(), vista.getJtxtMaximo().getText(), vista.getJtxtTolerancia().getText());
            try {
                reporte.crearReporte();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                abrirPDFInstrumento();
            } catch (IOException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //-----------------------------evento de calibraciones  
        //--Eventos de calibracion
        if (e.getSource().equals(vista.getBtnGuardarCalibracion())) {
            guardarCalibracion();
        }
        if (e.getSource().equals(vista.getBtnLimpiarCalibracion())) {
            limpiarCalibracion();
        }

        if (e.getSource().equals(vista.getBtnBorrarCalibracion())) {
            borrarCalibracion();
        }

        if (e.getSource().equals(vista.getBtnBuscarCalibracion())) {
            buscarCalibracion();
        }
        if (e.getSource().equals(vista.getBtnReporteCalibracion())) {
            ReporteCalibraciones reporte = new ReporteCalibraciones(vista.getJtxtNumCalibracion().getText(), vista.getJtxtFecha().getText(), vista.getJtxtMedicionesCalibracion().getText());
            try {

                reporte.crearReporte();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                abrirPDFCalibraciones();
            } catch (IOException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void abrirPDFTipoInstrumento() throws IOException {
        File path = new File("TipoInstrumento.pdf");
        Desktop.getDesktop().open(path);
    }

    public void abrirPDFInstrumento() throws IOException {
        File path = new File("Instrumento.pdf");
        Desktop.getDesktop().open(path);
    }

    public void abrirPDFCalibraciones() throws IOException {
        File path = new File("Calibraciones.pdf");
        Desktop.getDesktop().open(path);
    }

    //---Evento Mouse Clicked---
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        if (e.getSource().equals(vista.getTabla1())) {
            clickTablaTipoInstrumentos(e);
        }
        if (e.getSource().equals(vista.getTabla2Instrumentos())) {
            clickTablaInstrumento(e);
        }
        if (e.getSource().equals(vista.getTabla3Calibraciones())) {
            clickTablaCalibracion(e);
        }

    }

    //---METODOS TIPO DE INSTRUMENTO---
    public void guardarTipoInstrumentos(TipoInstrumentos tip) {

        Object[] columna = new Object[modelo.getModeloTipoInstrumento().getColumnCount()];

        columna[0] = tip.getCodigoInstrumento();
        columna[1] = tip.getNombreInstrumento();
        columna[2] = tip.getUnidadInstrumento();

        modelo.getModeloTipoInstrumento().addRow(columna);
        vista.getTabla1().setModel(modelo.getModeloTipoInstrumento());
        vista.getBtnBorrarTI().setEnabled(true);
    }

    public void guardarTipoInstrumentos() {
        String Codigo = vista.getJtxtCodigo().getText();
        String Nombre = vista.getJtxtNombre().getText();
        String Unidad = vista.getJtxtUnidad().getText();
        String tipo_de_accion = "guardarTipoInstrumentos";

        try {

            System.out.println("Conectado");
            salida = new DataOutputStream(socket.getOutputStream());

            salida.writeUTF(tipo_de_accion);
            salida.writeUTF(Codigo);
            salida.writeUTF(Nombre);
            salida.writeUTF(Unidad);

            entrada = new DataInputStream(socket.getInputStream());

//                String p=entrada.readUTF();
//                 JOptionPane.showMessageDialog(vista, p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        actualizarJComboBoxInstrumentos();
        limpiarTipoInstrumentos();
    }

    public void limpiarTipoInstrumentos() {
        vista.getJtxtCodigo().setText("");
        vista.getJtxtNombre().setText("");
        vista.getJtxtUnidad().setText("");
        vista.getTabla1().clearSelection();
        vista.getBtnBorrarTI().setEnabled(false);
        vista.getJtxtCodigo().setEnabled(true);
    }

    public void borrarTipoInstrumentos(String m) {

        String aux;
        int pos;
        boolean opcion = true;
        if (vista.getTabla1().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debes elegir la fila a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            aux = vista.getJtxtNombre().getText();
            int linea = vista.getTabla1().getSelectedRow();
            String nombre = (String) vista.getTabla1().getValueAt(linea, 1);

            for (int i = 0; i < vista.getTabla1().getRowCount(); i++) {
                String cadena = (String) vista.getTabla1().getValueAt(i, 0);

                if (cadena.equals(m)) {
                    vista.getTabla1().changeSelection(i, 0, false, false);
//                    int selectedRow = vista.getTabla1().getSelectedRow();
                    modelo.getModeloTI().removeRow(i);
                }
            }

//            modelo.getModeloTI().removeRow(linea);

            vista.getBtnBorrarTI().setEnabled(false);
            vista.getJtxtCodigo().setEnabled(true);

        }

    }

    public void borrarTipoInstrumentos() {

        String Codigo = vista.getJtxtCodigo().getText();
        String Nombre = vista.getJtxtNombre().getText();
        String Unidad = vista.getJtxtUnidad().getText();
        String tipo_de_accion = "borrarTipoInstrumentos";
        try {

            Socket socket = new Socket(HOST, PUERTO);
            System.out.println("Conectado");
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());

            salida.writeUTF(tipo_de_accion);
            salida.writeUTF(Codigo);
            salida.writeUTF(Nombre);
            salida.writeUTF(Unidad);

            salida.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void actualizarJComboBoxInstrumentos() {
        int total;

        total = vista.getjCBTipoInstrumentos().getItemCount();

        for (int i = total; i > 0; i--) {
            vista.getjCBTipoInstrumentos().removeItemAt(i - 1);
        }

        try {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error actualizarJComboBoxInstrumentos  " + e);
        }

        vista.getjCBTipoInstrumentos().repaint();
    }

    public void clickTablaTipoInstrumentos(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 1) { // Detectar un solo clic
            vista.getBtnBorrarTI().setEnabled(true);
            int selectedRow = vista.getTabla1().getSelectedRow();
            if (selectedRow >= 0) {
                String codigo = (String) vista.getTabla1().getValueAt(selectedRow, 0);
                String nombre = (String) vista.getTabla1().getValueAt(selectedRow, 1);
                String unidad = (String) vista.getTabla1().getValueAt(selectedRow, 2);
                vista.getJtxtCodigo().setText(codigo);
                vista.getJtxtNombre().setText(nombre);
                vista.getJtxtUnidad().setText(unidad);
                vista.getJtxtCodigo().setEnabled(false);// Deshabilitar la edición del campo "Código"
            }
        }
    }

    public void buscarTipoInstrumento() {

        String cadena;
        boolean bandera;
        bandera = false;
        System.out.println("hola");
        for (int i = 0; i < vista.getTabla1().getRowCount(); i++) {
            cadena = (String) vista.getTabla1().getValueAt(i, 1);

            if (cadena.equals(vista.getJtxtBusquedaNombre().getText())) {
                vista.getTabla1().changeSelection(i, 0, false, false);
                int selectedRow = vista.getTabla1().getSelectedRow();
                // Modificar los valores de la fila seleccionada
                String codigo = (String) vista.getTabla1().getValueAt(selectedRow, 0);
                String nombre = (String) vista.getTabla1().getValueAt(selectedRow, 1);
                String unidad = (String) vista.getTabla1().getValueAt(selectedRow, 2);
                vista.getJtxtCodigo().setText(codigo);
                vista.getJtxtNombre().setText(nombre);
                vista.getJtxtUnidad().setText(unidad);
                vista.getJtxtCodigo().setEnabled(false);// Deshabilitar la edición del campo "Código"      
                vista.getJtxtBusquedaNombre().setText("");

                bandera = true;
                break;
            }
        }
        if (bandera == false) {
            JOptionPane.showMessageDialog(null, "Este registro no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            vista.getJtxtBusquedaNombre().setText("");

        }
    }

    //---METODOS INSTRUMENTO---
    public void guardarInstrumento() {
        String Serie = vista.getJtxtNumSerie().getText();
        TipoInstrumentos tipoInstrumento = (TipoInstrumentos) vista.getjCBTipoInstrumentos().getSelectedItem();
        String tipoI = tipoInstrumento.getCodigoInstrumento();
        String Descripcion = vista.getJtxtDescripcion().getText();
        String Minimo = vista.getJtxtMinimo().getText();
        String Maximo = vista.getJtxtMaximo().getText();
        String Tolerancia = vista.getJtxtTolerancia().getText();
        String tipo_de_accion = "guardarInstrumento";

        int seleccion_2;
        if (vista.getTabla2Instrumentos().getSelectedRow() >= 0) {
//            // Seleccionar una fila existente para editar
//            int selectedRow = vista.getTabla2Instrumentos().getSelectedRow();
//            // Modificar los valores de la fila seleccionada
//            for (int i = 0; i < modelo.getArrayI().getCantidad(); i++) {
//                if (vista.getJtxtNumSerie().getText().equals(String.valueOf(modelo.getArrayI().getElemento(i).getSerie()))) {
//                    modelo.getArrayI().getElemento(i).setDescripcion(vista.getJtxtDescripcion().getText());
//                    modelo.getArrayI().getElemento(i).setMinimo(vista.getJtxtMinimo().getText());
//                    modelo.getArrayI().getElemento(i).setMaximo(vista.getJtxtMaximo().getText());
//                    modelo.getArrayI().getElemento(i).setTolerancia(vista.getJtxtTolerancia().getText());
//                }
//            }
//            vista.getTabla2Instrumentos().setValueAt(vista.getJtxtNumSerie().getText(), selectedRow, 0);
//            vista.getTabla2Instrumentos().setValueAt(vista.getJtxtDescripcion().getText(), selectedRow, 1);
//            vista.getTabla2Instrumentos().setValueAt(vista.getJtxtMinimo().getText(), selectedRow, 2);
//            vista.getTabla2Instrumentos().setValueAt(vista.getJtxtMaximo().getText(), selectedRow, 3);
//            vista.getTabla2Instrumentos().setValueAt(vista.getJtxtTolerancia().getText(), selectedRow, 4);
//            seleccion_2 = vista.getjCBTipoInstrumentos().getSelectedIndex();
//            Instrumento p = new Instrumento(vista.getJtxtNumSerie().getText(), vista.getJtxtDescripcion().getText(), vista.getJtxtMinimo().getText(), vista.getJtxtMaximo().getText(), vista.getJtxtTolerancia().getText(), modelo.getArrayTI().getElemento(seleccion_2));
//            modelo.getArrayI().getArrayList().add(p);

        } else {

            try {
                Socket socket = new Socket(HOST, PUERTO);
                System.out.println("Conectado");
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                salida.writeUTF(tipo_de_accion);
                salida.writeUTF(Serie);
                salida.writeUTF(tipoI);
                salida.writeUTF(Descripcion);
                salida.writeUTF(Minimo);
                salida.writeUTF(Maximo);
                salida.writeUTF(Tolerancia);
                DataInputStream entrada = new DataInputStream(socket.getInputStream());

                //hacer validacion para mostrar el mensaje que cesar nos envie, si fue exitoso o no
                String mensaje = (String) entrada.readUTF();
                JOptionPane.showMessageDialog(this.vista, mensaje);

                salida.close();
                socket.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        vista.getJtxtNumSerie().setEditable(true);
        limpiarInstrumento();

    }

    public void limpiarInstrumento() {
        vista.getJtxtNumSerie().setText("");
        vista.getJtxtDescripcion().setText("");
        vista.getJtxtMinimo().setText("");
        vista.getJtxtMaximo().setText("");
        vista.getJtxtTolerancia().setText("");
        vista.getTabla2Instrumentos().clearSelection();
        vista.getBtnBorrarInstrumentos().setEnabled(false);
        vista.getJtxtNumSerie().setEnabled(true);
        vista.getJtxtNumSerie().setEditable(true);
        vista.getJtxtMedicionesCalibracion().setEditable(false);
        vista.getJtxtFecha().setEditable(false);
        vista.getTabla4Mediciones().setVisible(false);
        vista.getJtxtNumBusqCalib().setEditable(false);
        vista.getTabla3Calibraciones().setVisible(false);
        vista.getJlblInfoInstrumento().setText("");
        vista.getJlblInfoInstrumento_2().setText("");
        vista.getBtnReporteCalibracion().setEnabled(false);
    }

    public void borrarInstrumento() {

        boolean opcion = true;
        if (vista.getTabla2Instrumentos().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debes elegir la fila a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String Serie = vista.getJtxtNumSerie().getText();
            TipoInstrumentos tipoInstrumento = (TipoInstrumentos) vista.getjCBTipoInstrumentos().getSelectedItem();
            String tipoI = tipoInstrumento.getCodigoInstrumento();
            String Descripcion = vista.getJtxtDescripcion().getText();
            String Minimo = vista.getJtxtMinimo().getText();
            String Maximo = vista.getJtxtMaximo().getText();
            String Tolerancia = vista.getJtxtTolerancia().getText();
            String tipo_de_accion = "borrarInstrumento";

            try {
                Socket socket = new Socket(HOST, PUERTO);
                System.out.println("Conectado");
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                salida.writeUTF(tipo_de_accion);
                salida.writeUTF(Serie);
                salida.writeUTF(tipoI);
                salida.writeUTF(Descripcion);
                salida.writeUTF(Minimo);
                salida.writeUTF(Maximo);
                salida.writeUTF(Tolerancia);
                DataInputStream entrada = new DataInputStream(socket.getInputStream());

                //hacer validacion para mostrar el mensaje que cesar nos envie, si fue exitoso o no
                String mensaje = (String) entrada.readUTF();
                JOptionPane.showMessageDialog(this.vista, mensaje);

                salida.close();
                socket.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
//            if (opcion) {

//            } else {
//                JOptionPane.showMessageDialog(null, "No se puede eliminar el instrumento ya que posee calibraciones asociadas", "ERROR", JOptionPane.ERROR_MESSAGE);
//            }
//        }
    }

    public void clickTablaInstrumento(java.awt.event.MouseEvent evt) {
//        Random random = new Random();
//        int rangoMinimo = 01;
//        int rangoMaximo = 10000;
//        int numeroAutogenerado = random.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;
//
//        if (evt.getClickCount() == 1) { // Detectar un solo clic
//            vista.getJtxtMedicionesCalibracion().setEditable(true);
//            vista.getJtxtFecha().setEditable(true);
//            vista.getTabla3Calibraciones().setVisible(true);
//            vista.getJtxtNumBusqCalib().setEditable(true);
//            vista.getBtnBorrarInstrumentos().setEnabled(true);
//            int selectedRow = vista.getTabla2Instrumentos().getSelectedRow();
//            vista.getJtxtNumSerie().setEditable(false);
//            if (selectedRow >= 0) {
//                String serie = (String) vista.getTabla2Instrumentos().getValueAt(selectedRow, 0);
//                String descripcion = (String) vista.getTabla2Instrumentos().getValueAt(selectedRow, 1);
//                String minimo = (String) vista.getTabla2Instrumentos().getValueAt(selectedRow, 2);
//                String maximo = (String) vista.getTabla2Instrumentos().getValueAt(selectedRow, 3);
//                String tolerancia = (String) vista.getTabla2Instrumentos().getValueAt(selectedRow, 4);
//                vista.getJtxtNumSerie().setText(serie);
//                vista.getJtxtDescripcion().setText(descripcion);
//                vista.getJtxtMinimo().setText(minimo);
//                vista.getJtxtMaximo().setText(maximo);
//                vista.getJtxtTolerancia().setText(tolerancia);
//                vista.getJtxtNumCalibracion().setText(String.valueOf(numeroAutogenerado));
//                vista.getJlblInfoInstrumento().setText(serie);
//                String tip = vista.getJtxtDescripcion().getText();
//                String unidad;
//                for (int i = 0; i < modelo.getArrayI().getCantidad(); i++) {
//                    if (modelo.getArrayI().getArrayList().get(i).getDescripcion().equals(tip)) {
//                        unidad = (String) modelo.getArrayI().getArrayList().get(i).getTipo().getUnidadInstrumento();
//                        vista.getJlblInfoInstrumento_2().setText("-  " + descripcion + "( " + minimo + " - " + maximo + unidad + " )");
//                    }
//                }
//                modelo.getModeloCalibracion().setRowCount(0);
//                vista.getTabla3Calibraciones().setModel(modelo.getModeloCalibracion());
//
//                //-----------------------------------------agregar  de los intrumento existente las calibraciones en la tabla de calibraciones----------------------
//                if (serie.equals(modelo.getArrayI().getElemento(selectedRow).getSerie())) { // valida si el numero de seria que se selecciono en la tabla
//
//                    for (int j = 0; j < modelo.getArrayC().getArrayList().size(); j++) {// si es igual entra y se busca la cantidad total de calibraciones
//
//                        if (modelo.getArrayC().getArrayList().get(j).getInstrumento().equals(modelo.getArrayI().getElemento(selectedRow))) {
//                            Object[] columna = new Object[modelo.getModeloCalibracion().getColumnCount()];
//                            columna[0] = modelo.getArrayC().getArrayList().get(j).getNumero();
//                            columna[1] = modelo.getArrayC().getArrayList().get(j).getFecha();
//                            columna[2] = modelo.getArrayC().getArrayList().get(j).getMediciones();
//                            modelo.getModeloCalibracion().addRow(columna);
//                            vista.getTabla3Calibraciones().setModel(modelo.getModeloCalibracion());
//                        }
//                    }
//                    vista.getJtxtMedicionesCalibracion().setText("");
//                    vista.getJtxtFecha().setText("");
//                    vista.getJtxtNumBusqCalib().setText("");
//                    vista.getTabla3Calibraciones().clearSelection();
//                }
//            }
//        }
    }

    public void buscarInstrumento() {

        String cadena;
        boolean bandera;
        bandera = false;

        for (int i = 0; i < vista.getTabla2Instrumentos().getRowCount(); i++) {
            cadena = (String) vista.getTabla2Instrumentos().getValueAt(i, 1);

            if (cadena.equals(vista.getJtxtBusq_DescripcionInstrumentos().getText())) {
                vista.getTabla2Instrumentos().changeSelection(i, 0, false, false);
                vista.getJtxtBusq_DescripcionInstrumentos().setText("");
                bandera = true;
                break;
            }
        }
        if (bandera == false) {
            JOptionPane.showMessageDialog(null, "Este registro no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            vista.getJtxtBusq_DescripcionInstrumentos().setText("");
        }
    }

    //---------------METODOS DE CALIBRACION
    public void guardarCalibracion() {
        String tipo_de_accion = "guardarCalibracion";
        String NumCalibracion = vista.getJtxtNumCalibracion().getText();
        String instrumento = vista.getJlblInfoInstrumento().getText();
        String Fecha = vista.getJtxtFecha().getText();
        String numero_mediciones = vista.getJtxtMedicionesCalibracion().getText();

//        String referencia;
//        String lectura;
        int posicion = -1;

        if (posicion >= 0) {
            int selectedRow = vista.getTabla3Calibraciones().getSelectedRow();
            if (vista.getTabla3Calibraciones().getSelectedRow() >= 0) {
                // Seleccionar una fila existente para editar
                // Modificar los valores de la fila seleccionada
                vista.getTabla3Calibraciones().setValueAt(vista.getJtxtNumCalibracion().getText(), selectedRow, 0);
                vista.getTabla3Calibraciones().setValueAt(vista.getJtxtFecha().getText(), selectedRow, 1);
                vista.getTabla3Calibraciones().setValueAt(vista.getJtxtMedicionesCalibracion().getText(), selectedRow, 2);
//                modelo.getArrayC().getArrayList().get(selectedRow).setMediciones(vista.getJtxtMedicionesCalibracion().getText());
//                modelo.getArrayC().getArrayList().get(selectedRow).setMediciones(vista.getJtxtFecha().getText());
            } else {
                // No se seleccionó ninguna fila, agregar un nuevo registro

                try {
                    Socket socket = new Socket(HOST, PUERTO);
                    System.out.println("Conectado");
                    DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                    salida.writeUTF(tipo_de_accion);
                    salida.writeUTF(NumCalibracion);
                    salida.writeUTF(instrumento);
                    salida.writeUTF(Fecha);
                    salida.writeUTF(numero_mediciones);
                    DataInputStream entrada = new DataInputStream(socket.getInputStream());

                    //hacer validacion para mostrar el mensaje que cesar nos envie, si fue exitoso o no
                    String mensaje = (String) entrada.readUTF();
                    JOptionPane.showMessageDialog(this.vista, mensaje);

                    salida.close();
                    socket.close();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

//                String numero = vista.getJtxtNumCalibracion().getText();
//                String mediciones = vista.getJtxtMedicionesCalibracion().getText();
//                String fecha = vista.getJtxtFecha().getText();
//                Object[] columna = new Object[modelo.getModeloCalibracion().getColumnCount()];
//                columna[0] = numero;
//                columna[1] = fecha;
//                columna[2] = mediciones;
//                Calibracion p = new Calibracion(numero, fecha, mediciones);
//                p.setInstrumento(modelo.getArrayI().getElemento(posicion));    // se busca en el vector de intrumento segun la posicion mandada y se introduce el instrumento
//                modelo.getArrayC().getArrayList().add(p);
//                for (int i = 0; i < Integer.parseInt(mediciones); i++) {
//                    numero_medicione = String.valueOf(i + 1);
//                    referencia = JOptionPane.showInputDialog("Ingrese el valor de la referencia de la medicion numero " + numero_medicione);
//                    lectura = JOptionPane.showInputDialog("Ingrese el valor  de la lectura de la medicion numero " + numero_medicione);
//                    Medicion e = new Medicion(numero_medicione, referencia, lectura);
//                    e.setCalibracion(p);
//                    //e.getCalibracion().setNumero(numero);
//                    //modelo.getArrayM().getArrayList().add(e);
//                }
//                modelo.getModeloCalibracion().addRow(columna);
//                vista.getTabla3Calibraciones().setModel(modelo.getModeloCalibracion());
            }
        } else if (posicion == -1) {
        }
    }

    public void limpiarCalibracion() {
        vista.getJtxtNumCalibracion().setText("");
        vista.getJtxtMedicionesCalibracion().setText("");
        vista.getJtxtFecha().setText("");
        vista.getJtxtNumBusqCalib().setText("");
        vista.getTabla3Calibraciones().clearSelection();
        vista.getBtnBorrarInstrumentos().setEnabled(false);
        vista.getJtxtNumSerie().setEnabled(true);
        Random random = new Random();
        int rangoMinimo = 01;
        int rangoMaximo = 10000;
        int numeroAutogenerado = random.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;
        vista.getJtxtNumCalibracion().setText(String.valueOf(numeroAutogenerado));
        DefaultTableModel modelo = (DefaultTableModel) vista.getTabla4Mediciones().getModel();
        modelo.setRowCount(0);
        vista.getJtxtFecha().setEnabled(true);
        vista.getJtxtMedicionesCalibracion().setEnabled(true);

    }

    public void borrarCalibracion() {

        String tipo_de_accion = "borrarCalibracion";
        String NumCalibracion = vista.getJtxtNumCalibracion().getText();
        String instrumento = vista.getJlblInfoInstrumento().getText();
        String Fecha = vista.getJtxtFecha().getText();
        String numero_mediciones = vista.getJtxtMedicionesCalibracion().getText();

        if (vista.getTabla3Calibraciones().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debes elegir la fila a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int linea = vista.getTabla3Calibraciones().getSelectedRow();
            modelo.getModeloCalibracion().removeRow(linea);
            modelo.getModeloMed().setRowCount(0);
            vista.getJtxtFecha().setText("");
            vista.getJtxtMedicionesCalibracion().setText("");
            try {
                Socket socket = new Socket(HOST, PUERTO);
                System.out.println("Conectado");
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
                salida.writeUTF(tipo_de_accion);
                salida.writeUTF(NumCalibracion);
                salida.writeUTF(instrumento);
                salida.writeUTF(Fecha);
                salida.writeUTF(numero_mediciones);
                DataInputStream entrada = new DataInputStream(socket.getInputStream());

                //hacer validacion para mostrar el mensaje que cesar nos envie, si fue exitoso o no
                String mensaje = (String) entrada.readUTF();
                JOptionPane.showMessageDialog(this.vista, mensaje);

                salida.close();
                socket.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

//            for (int i = 0; i < modelo.getArrayC().getCantidad(); i++) {
//                if (modelo.getArrayC().getElemento(i).getNumero().equals(numero)) {
//                    modelo.getArrayC().getArrayList().remove(i);
//                }
//            }
            vista.getBtnBorrarCalibracion().setEnabled(false);
        }

    }

    public void clickTablaCalibracion(java.awt.event.MouseEvent evt) {
        String mediciones;
        if (evt.getClickCount() == 1) { // Detectar un solo clic
            vista.getTabla4Mediciones().setVisible(true);
            vista.getBtnBorrarCalibracion().setEnabled(true);
            vista.getBtnReporteCalibracion().setEnabled(true);
            int selectedRow = vista.getTabla3Calibraciones().getSelectedRow();
            if (selectedRow >= 0) {
                String numero = (String) vista.getTabla3Calibraciones().getValueAt(selectedRow, 0);
                String fecha = (String) vista.getTabla3Calibraciones().getValueAt(selectedRow, 1);
                mediciones = String.valueOf(vista.getTabla3Calibraciones().getValueAt(selectedRow, 2));
                vista.getJtxtNumCalibracion().setText(numero);
                vista.getJtxtFecha().setText(fecha);
                vista.getJtxtMedicionesCalibracion().setText(mediciones);
                modelo.getModeloMed().setRowCount(0);
//                for (int i = 0; i < modelo.getArrayM().getArrayList().size(); i++) {
//                    if (modelo.getArrayM().getArrayList().get(i).getCalibracion().getNumero().equals(numero)) {
//                        Object[] columna = new Object[modelo.getModeloMed().getColumnCount()];
//                        columna[0] = modelo.getArrayM().getArrayList().get(i).getNumero();
//                        columna[1] = modelo.getArrayM().getArrayList().get(i).getReferencia();
//                        columna[2] = modelo.getArrayM().getArrayList().get(i).getLectura();
//                        modelo.getModeloMed().addRow(columna);
//                        vista.getTabla4Mediciones().setModel(modelo.getModeloMed());
//                    }
//                }
            }
            vista.getJtxtNumCalibracion().setEnabled(false);
            vista.getJtxtMedicionesCalibracion().setEditable(true);
            vista.getJtxtFecha().setEditable(true);
        }
    }

    public void insertarTabla4(int numMed) {
        modelo.getModeloMed().setRowCount(0);
        for (int i = 0; i < numMed; i++) {
            Object[] columna = new Object[modelo.getModeloMed().getColumnCount()];
            columna[0] = i + 1;
            modelo.getModeloMed().addRow(columna);
        }
        vista.getTabla4Mediciones().setModel(modelo.getModeloMed());
    }

    public void buscarCalibracion() {

        String cadena;
        boolean bandera;
        bandera = false;

        for (int i = 0; i < vista.getTabla3Calibraciones().getRowCount(); i++) {
            cadena = (String) vista.getTabla3Calibraciones().getValueAt(i, 0);
            if (cadena.equals(vista.getJtxtNumBusqCalib().getText())) {
                vista.getTabla3Calibraciones().changeSelection(i, 0, false, false);
                vista.getJtxtNumBusqCalib().setText("");
                bandera = true;
                break;
            }
        }
        if (bandera == false) {
            JOptionPane.showMessageDialog(null, "Este registro no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            vista.getJtxtNumBusqCalib().setText("");

        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //modelo.guardarDatosEnXML("datos.xml");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
