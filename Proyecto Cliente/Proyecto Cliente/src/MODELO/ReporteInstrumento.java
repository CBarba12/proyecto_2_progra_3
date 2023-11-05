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

public class ReporteInstrumento {

    String serie;
    String descripcion;
    String maximo;
    String minimo;
    String tolerancia;
    ArrayInstrumentos listInstrumentos;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public ReporteInstrumento(String serie, String descripcion, String maximo, String minimo, String tolerancia) {
        this.serie = serie;
        this.descripcion = descripcion;
        this.maximo = maximo;
        this.minimo = minimo;
        this.tolerancia = tolerancia;
        documento = new Document();
        titulo = new Paragraph("REPORTE DE INSTRUMENTOS");
    }

    public void crearReporte() throws FileNotFoundException, DocumentException {
        archivo = new FileOutputStream("Instrumento.pdf");
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        titulo.setAlignment(1);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);

        PdfPTable tabla = new PdfPTable(5);
        tabla.setWidthPercentage(100);
        PdfPCell serie = new PdfPCell(new Phrase("Serie"));
        PdfPCell descripcion = new PdfPCell(new Phrase("Descripción"));
        PdfPCell minimo = new PdfPCell(new Phrase("Minimo"));
        PdfPCell maximo = new PdfPCell(new Phrase("Maximo"));
        PdfPCell tolerancia = new PdfPCell(new Phrase("Tolerancia"));

        tabla.addCell(serie);
        tabla.addCell(descripcion);
        tabla.addCell(minimo);
        tabla.addCell(maximo);
        tabla.addCell(tolerancia);

        for (int i = 0; i < listInstrumentos.getCantidad(); i++) {

            tabla.addCell(listInstrumentos.getElemento(i).getSerie());
            tabla.addCell(listInstrumentos.getElemento(i).getDescripcion());
            tabla.addCell(listInstrumentos.getElemento(i).getMinimo());
            tabla.addCell(listInstrumentos.getElemento(i).getMaximo());
            tabla.addCell(listInstrumentos.getElemento(i).getTolerancia());
        }
        documento.add(tabla);
        documento.close();
        JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

    }

}
