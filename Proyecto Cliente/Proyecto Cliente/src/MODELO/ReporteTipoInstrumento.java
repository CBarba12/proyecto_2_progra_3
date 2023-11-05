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

public class ReporteTipoInstrumento {

    String codigoInstrumento;
    String nombreInstrumento;
    String unidadInstrumento;
    ArrayTipoInstrumento listaTipoInstrumentos;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public ReporteTipoInstrumento(String codigoInstrumento, String nombreInstrumento, String unidadInstrumento) {
        this.codigoInstrumento = codigoInstrumento;
        this.nombreInstrumento = nombreInstrumento;
        this.unidadInstrumento = unidadInstrumento;
        

        documento = new Document();
        titulo = new Paragraph("REPORTE TIPO INSTRUMENTO");
    }

    public void crearReporte() throws FileNotFoundException, DocumentException {
        archivo = new FileOutputStream("TipoInstrumento.pdf");
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        titulo.setAlignment(1);
        documento.add(titulo);
        //documento.add(new Paragraph("Reporte Tipo Instrumento"));
        documento.add(Chunk.NEWLINE);

        PdfPTable tabla = new PdfPTable(3);
        tabla.setWidthPercentage(100);
        PdfPCell cod = new PdfPCell(new Phrase("Codigo"));
        PdfPCell name = new PdfPCell(new Phrase("Nombre"));
        PdfPCell unidad = new PdfPCell(new Phrase("Unidad"));

        tabla.addCell(cod);
        tabla.addCell(name);
        tabla.addCell(unidad);

        for (int i = 0; i < listaTipoInstrumentos.getCantidad(); i++) {

            tabla.addCell(listaTipoInstrumentos.getElemento(i).getCodigoInstrumento());
            tabla.addCell(listaTipoInstrumentos.getElemento(i).getNombreInstrumento());
            tabla.addCell(listaTipoInstrumentos.getElemento(i).getUnidadInstrumento());
        }
        documento.add(tabla);
        documento.close();
        JOptionPane.showMessageDialog(null, "Archivo creado correctamente");

    }

}
