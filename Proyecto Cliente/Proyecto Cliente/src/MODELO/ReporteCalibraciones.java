package MODELO;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class ReporteCalibraciones {

    String numero;
    String fecha;
    String mediciones;
    ArrayCalibraciones listCalibraciones;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public ReporteCalibraciones(String numero, String fecha, String mediciones) {
        this.numero = numero;
        this.fecha = fecha;
        this.mediciones = mediciones;
        
        documento = new Document();
        titulo = new Paragraph("REPORTE DE CALIBRACIONES");
    }

    public void crearReporte() throws FileNotFoundException, DocumentException {
        archivo = new FileOutputStream("Calibraciones.pdf");
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        titulo.setAlignment(1);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);

        PdfPTable tabla = new PdfPTable(3);
        tabla.setWidthPercentage(100);
        PdfPCell numero = new PdfPCell(new Phrase("Número"));
        PdfPCell fecha = new PdfPCell(new Phrase("Fecha"));
        PdfPCell mediciones = new PdfPCell(new Phrase("Mediciones"));

        tabla.addCell(numero);
        tabla.addCell(fecha);
        tabla.addCell(mediciones);

        for (int i = 0; i < listCalibraciones.getCantidad(); i++) {

            tabla.addCell(listCalibraciones.getElemento(i).getNumero());
            tabla.addCell(listCalibraciones.getElemento(i).getFecha());
            tabla.addCell(listCalibraciones.getElemento(i).getMediciones());

        }
        documento.add(tabla);
        documento.close();
        JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

    }

}
