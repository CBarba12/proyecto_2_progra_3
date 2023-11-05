
package VISTA;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class INTERFAZ extends javax.swing.JFrame {
    public INTERFAZ() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        SUBPANEL = new javax.swing.JTabbedPane();
        jPanelTipoInstrumentos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlblCodigo = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jlblUnidad = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtUnidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jlblBusquedaNombre = new javax.swing.JLabel();
        jtxtBusquedaNombre = new javax.swing.JTextField();
        btnReporteTI = new javax.swing.JButton();
        btnBuscarTI = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnGuardarTI = new javax.swing.JButton();
        btnLimpiarTI = new javax.swing.JButton();
        btnBorrarTI = new javax.swing.JButton();
        jPanelInstrumentos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlblNumSerie = new javax.swing.JLabel();
        jlblMinimo = new javax.swing.JLabel();
        jlblTolerancia = new javax.swing.JLabel();
        jtxtNumSerie = new javax.swing.JTextField();
        jtxtMinimo = new javax.swing.JTextField();
        jtxtTolerancia = new javax.swing.JTextField();
        jlblDescripcion = new javax.swing.JLabel();
        jlblMaximo = new javax.swing.JLabel();
        jlblTipo = new javax.swing.JLabel();
        jtxtDescripcion = new javax.swing.JTextField();
        jtxtMaximo = new javax.swing.JTextField();
        jCBTipoInstrumentos = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jlblDescripInstrumentos = new javax.swing.JLabel();
        jtxtBusq_DescripcionInstrumentos = new javax.swing.JTextField();
        btnBuscarInstrumentos = new javax.swing.JButton();
        btnReporteInstrumentos = new javax.swing.JButton();
        btnGuardarInstrumentos = new javax.swing.JButton();
        btnlimpiarInstrumentos = new javax.swing.JButton();
        btnBorrarInstrumentos = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2Instrumentos = new javax.swing.JTable();
        jPanelCalibraciones = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jlblInfoInstrumento = new javax.swing.JLabel();
        jlblInfoInstrumento_2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlblNumeroCalibracion = new javax.swing.JLabel();
        jlblMedicionesCalibracion = new javax.swing.JLabel();
        jtxtNumCalibracion = new javax.swing.JTextField();
        jtxtMedicionesCalibracion = new javax.swing.JTextField();
        jlblFecha = new javax.swing.JLabel();
        jtxtFecha = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jlblNumBusqCalibracion = new javax.swing.JLabel();
        jtxtNumBusqCalib = new javax.swing.JTextField();
        btnReporteCalibracion = new javax.swing.JButton();
        btnBuscarCalibracion = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla3Calibraciones = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla4Mediciones = new javax.swing.JTable();
        btnGuardarCalibracion = new javax.swing.JButton();
        btnLimpiarCalibracion = new javax.swing.JButton();
        btnBorrarCalibracion = new javax.swing.JButton();
        jPanelAcercade = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Silab:Sistema de Laboratorio Industrial");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Instrumento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jlblCodigo.setText("Codigo");

        jlblNombre.setText("Nombre");

        jlblUnidad.setText("Unidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCodigo)
                    .addComponent(jlblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jtxtCodigo))
                .addGap(63, 63, 63)
                .addComponent(jlblUnidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCodigo)
                    .addComponent(jlblUnidad)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNombre)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jlblBusquedaNombre.setText("Nombre");

        btnReporteTI.setText("Reporte");
        btnReporteTI.setPreferredSize(new java.awt.Dimension(72, 24));

        btnBuscarTI.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblBusquedaNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtBusquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReporteTI, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarTI)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnReporteTI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblBusquedaNombre)
                        .addComponent(jtxtBusquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarTI)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabla1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tabla1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnGuardarTI.setText("Guardar");

        btnLimpiarTI.setText("Limpiar");

        btnBorrarTI.setText("Borrar");
        btnBorrarTI.setEnabled(false);

        javax.swing.GroupLayout jPanelTipoInstrumentosLayout = new javax.swing.GroupLayout(jPanelTipoInstrumentos);
        jPanelTipoInstrumentos.setLayout(jPanelTipoInstrumentosLayout);
        jPanelTipoInstrumentosLayout.setHorizontalGroup(
            jPanelTipoInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoInstrumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTipoInstrumentosLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTipoInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTipoInstrumentosLayout.createSequentialGroup()
                                .addComponent(btnGuardarTI)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiarTI))
                            .addComponent(btnBorrarTI))
                        .addGap(0, 493, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelTipoInstrumentosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelTipoInstrumentosLayout.setVerticalGroup(
            jPanelTipoInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoInstrumentosLayout.createSequentialGroup()
                .addGroup(jPanelTipoInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipoInstrumentosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTipoInstrumentosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanelTipoInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarTI)
                            .addComponent(btnLimpiarTI))
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarTI)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        SUBPANEL.addTab("Tipo de Instrumentos", jPanelTipoInstrumentos);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instrumento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jlblNumSerie.setText("Serie");

        jlblMinimo.setText("Minimo");

        jlblTolerancia.setText("Tolerancia");

        jlblDescripcion.setText("Descripcion");

        jlblMaximo.setText("Máximo");

        jlblTipo.setText("Tipo");

        jCBTipoInstrumentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTolerancia)
                    .addComponent(jlblNumSerie)
                    .addComponent(jlblMinimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtTolerancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtNumSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(jtxtMinimo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlblMaximo)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBTipoInstrumentos, 0, 119, Short.MAX_VALUE)
                            .addComponent(jtxtMaximo)))
                    .addComponent(jlblTipo))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblNumSerie)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblDescripcion)
                        .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblMinimo)
                    .addComponent(jtxtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblMaximo)
                    .addComponent(jtxtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTolerancia)
                    .addComponent(jtxtTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTipo)
                    .addComponent(jCBTipoInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jlblDescripInstrumentos.setText("Descripción");

        btnBuscarInstrumentos.setText("Buscar");

        btnReporteInstrumentos.setText("Reporte");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblDescripInstrumentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtBusq_DescripcionInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(btnBuscarInstrumentos)
                .addGap(18, 18, 18)
                .addComponent(btnReporteInstrumentos)
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblDescripInstrumentos)
                    .addComponent(jtxtBusq_DescripcionInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarInstrumentos)
                    .addComponent(btnReporteInstrumentos))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnGuardarInstrumentos.setText("Guardar");

        btnlimpiarInstrumentos.setText("Limpiar");

        btnBorrarInstrumentos.setText("Borrar");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        tabla2Instrumentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla2Instrumentos);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelInstrumentosLayout = new javax.swing.GroupLayout(jPanelInstrumentos);
        jPanelInstrumentos.setLayout(jPanelInstrumentosLayout);
        jPanelInstrumentosLayout.setHorizontalGroup(
            jPanelInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstrumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInstrumentosLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanelInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInstrumentosLayout.createSequentialGroup()
                                .addComponent(btnGuardarInstrumentos)
                                .addGap(18, 18, 18)
                                .addComponent(btnlimpiarInstrumentos))
                            .addComponent(btnBorrarInstrumentos)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanelInstrumentosLayout.setVerticalGroup(
            jPanelInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstrumentosLayout.createSequentialGroup()
                .addGroup(jPanelInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInstrumentosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInstrumentosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelInstrumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarInstrumentos)
                            .addComponent(btnlimpiarInstrumentos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarInstrumentos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SUBPANEL.addTab("Instrumentos", jPanelInstrumentos);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instrumento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jlblInfoInstrumento.setForeground(new java.awt.Color(204, 0, 51));

        jlblInfoInstrumento_2.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jlblInfoInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblInfoInstrumento_2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblInfoInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblInfoInstrumento_2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calibración", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jlblNumeroCalibracion.setText("Número");

        jlblMedicionesCalibracion.setText("Mediciones");

        jtxtNumCalibracion.setEnabled(false);

        jlblFecha.setText("Fecha");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jlblNumeroCalibracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtNumCalibracion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jlblMedicionesCalibracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtMedicionesCalibracion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNumeroCalibracion)
                    .addComponent(jtxtNumCalibracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblFecha)
                    .addComponent(jtxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblMedicionesCalibracion)
                    .addComponent(jtxtMedicionesCalibracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jlblNumBusqCalibracion.setText("Número");

        btnReporteCalibracion.setText("Reporte");

        btnBuscarCalibracion.setText("Buscar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblNumBusqCalibracion)
                .addGap(29, 29, 29)
                .addComponent(jtxtNumBusqCalib, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 716, Short.MAX_VALUE)
                .addComponent(btnReporteCalibracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCalibracion)
                .addGap(15, 15, 15))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNumBusqCalibracion)
                    .addComponent(jtxtNumBusqCalib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCalibracion)
                    .addComponent(btnBuscarCalibracion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        tabla3Calibraciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane4.setViewportView(tabla3Calibraciones);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mediciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        tabla4Mediciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabla4Mediciones.setEnabled(false);
        jScrollPane3.setViewportView(tabla4Mediciones);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        btnGuardarCalibracion.setText("Guardar");

        btnLimpiarCalibracion.setText("Limpiar");

        btnBorrarCalibracion.setText("Borrar");

        javax.swing.GroupLayout jPanelCalibracionesLayout = new javax.swing.GroupLayout(jPanelCalibraciones);
        jPanelCalibraciones.setLayout(jPanelCalibracionesLayout);
        jPanelCalibracionesLayout.setHorizontalGroup(
            jPanelCalibracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalibracionesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelCalibracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCalibracionesLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanelCalibracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCalibracionesLayout.createSequentialGroup()
                                .addComponent(btnGuardarCalibracion)
                                .addGap(2, 2, 2)
                                .addComponent(btnLimpiarCalibracion))
                            .addComponent(btnBorrarCalibracion)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCalibracionesLayout.setVerticalGroup(
            jPanelCalibracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalibracionesLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelCalibracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCalibracionesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelCalibracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarCalibracion)
                            .addComponent(btnLimpiarCalibracion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarCalibracion))
                    .addGroup(jPanelCalibracionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCalibracionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        SUBPANEL.addTab("Calibraciones", jPanelCalibraciones);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Proyecto l");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Programación lll");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Integrantes:");

        jLabel4.setText("Cesar Barba Andrades");

        jLabel5.setText("Raquel Hernández Campos");

        jLabel6.setText("Gabriel Vega Fernández");

        javax.swing.GroupLayout jPanelAcercadeLayout = new javax.swing.GroupLayout(jPanelAcercade);
        jPanelAcercade.setLayout(jPanelAcercadeLayout);
        jPanelAcercadeLayout.setHorizontalGroup(
            jPanelAcercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcercadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAcercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanelAcercadeLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanelAcercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel3))
                .addContainerGap(878, Short.MAX_VALUE))
        );
        jPanelAcercadeLayout.setVerticalGroup(
            jPanelAcercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcercadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        SUBPANEL.addTab("Acerca de..", jPanelAcercade);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SUBPANEL)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(SUBPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getPanelPrincipal() {
        return PanelPrincipal;
    }

    public void setPanelPrincipal(JPanel PanelPrincipal) {
        this.PanelPrincipal = PanelPrincipal;
    }

    public JTabbedPane getSUBPANEL() {
        return SUBPANEL;
    }

    public void setSUBPANEL(JTabbedPane SUBPANEL) {
        this.SUBPANEL = SUBPANEL;
    }

    public JButton getBtnBorrarTI() {
        return btnBorrarTI;
    }

    public void setBtnBorrarTI(JButton btnBorrar) {
        this.btnBorrarTI = btnBorrar;
    }

    public JButton getBtnBorrarInstrumentos() {
        return btnBorrarInstrumentos;
    }

    public void setBtnBorrarInstrumentos(JButton btnBorrarInstrumentos) {
        this.btnBorrarInstrumentos = btnBorrarInstrumentos;
    }

    public JButton getBtnBuscarTI() {
        return btnBuscarTI;
    }

    public void setBtnBuscarTI(JButton btnBuscar) {
        this.btnBuscarTI = btnBuscar;
    }

    public JButton getBtnBuscarInstrumentos() {
        return btnBuscarInstrumentos;
    }

    public void setBtnBuscarInstrumentos(JButton btnBuscarInstrumentos) {
        this.btnBuscarInstrumentos = btnBuscarInstrumentos;
    }

    public JButton getBtnGuardarTI() {
        return btnGuardarTI;
    }

    public void setBtnGuardarTI(JButton btnGuardar) {
        this.btnGuardarTI = btnGuardar;
    }

    public JButton getBtnGuardarInstrumentos() {
        return btnGuardarInstrumentos;
    }

    public void setBtnGuardarInstrumentos(JButton btnGuardarInstrumentos) {
        this.btnGuardarInstrumentos = btnGuardarInstrumentos;
    }

    public JButton getBtnLimpiarTI() {
        return btnLimpiarTI;
    }

    public void setBtnLimpiarTI(JButton btnLimpiar) {
        this.btnLimpiarTI = btnLimpiar;
    }

    public JButton getBtnReporteTI() {
        return btnReporteTI;
    }

    public void setBtnReporteTI(JButton btnReporte) {
        this.btnReporteTI = btnReporte;
    }

    public JButton getBtnReporteInstrumentos() {
        return btnReporteInstrumentos;
    }

    public void setBtnReporteInstrumentos(JButton btnReporteInstrumentos) {
        this.btnReporteInstrumentos = btnReporteInstrumentos;
    }

    public JButton getBtnlimpiarInstrumentos() {
        return btnlimpiarInstrumentos;
    }

    public void setBtnlimpiarInstrumentos(JButton btnlimpiarInstrumentos) {
        this.btnlimpiarInstrumentos = btnlimpiarInstrumentos;
    }

    public JComboBox<String> getjCBTipoInstrumentos() {
        return jCBTipoInstrumentos;
    }

    public void setjCBTipoInstrumentos(JComboBox<String> jCBTipoInstrumentos) {
        this.jCBTipoInstrumentos = jCBTipoInstrumentos;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JPanel getjPanelAcercade() {
        return jPanelAcercade;
    }

    public void setjPanelAcercade(JPanel jPanelAcercade) {
        this.jPanelAcercade = jPanelAcercade;
    }

    public JPanel getjPanelCalibraciones() {
        return jPanelCalibraciones;
    }

    public void setjPanelCalibraciones(JPanel jPanelCalibraciones) {
        this.jPanelCalibraciones = jPanelCalibraciones;
    }

    public JPanel getjPanelInstrumentos() {
        return jPanelInstrumentos;
    }

    public void setjPanelInstrumentos(JPanel jPanelInstrumentos) {
        this.jPanelInstrumentos = jPanelInstrumentos;
    }

    public JPanel getjPanelTipoInstrumentos() {
        return jPanelTipoInstrumentos;
    }

    public void setjPanelTipoInstrumentos(JPanel jPanelTipoInstrumentos) {
        this.jPanelTipoInstrumentos = jPanelTipoInstrumentos;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JLabel getJlblBusquedaNombre() {
        return jlblBusquedaNombre;
    }

    public void setJlblBusquedaNombre(JLabel jlblBusquedaNombre) {
        this.jlblBusquedaNombre = jlblBusquedaNombre;
    }

    public JLabel getJlblCodigo() {
        return jlblCodigo;
    }

    public void setJlblCodigo(JLabel jlblCodigo) {
        this.jlblCodigo = jlblCodigo;
    }

    public JLabel getJlblDescripInstrumentos() {
        return jlblDescripInstrumentos;
    }

    public void setJlblDescripInstrumentos(JLabel jlblDescripInstrumentos) {
        this.jlblDescripInstrumentos = jlblDescripInstrumentos;
    }

    public JLabel getJlblDescripcion() {
        return jlblDescripcion;
    }

    public void setJlblDescripcion(JLabel jlblDescripcion) {
        this.jlblDescripcion = jlblDescripcion;
    }

    public JLabel getJlblMaximo() {
        return jlblMaximo;
    }

    public void setJlblMaximo(JLabel jlblMaximo) {
        this.jlblMaximo = jlblMaximo;
    }

    public JLabel getJlblMinimo() {
        return jlblMinimo;
    }

    public void setJlblMinimo(JLabel jlblMinimo) {
        this.jlblMinimo = jlblMinimo;
    }

    public JLabel getJlblNombre() {
        return jlblNombre;
    }

    public void setJlblNombre(JLabel jlblNombre) {
        this.jlblNombre = jlblNombre;
    }

    public JLabel getJlblNumSerie() {
        return jlblNumSerie;
    }

    public void setJlblNumSerie(JLabel jlblNumSerie) {
        this.jlblNumSerie = jlblNumSerie;
    }

    public JLabel getJlblTipo() {
        return jlblTipo;
    }

    public void setJlblTipo(JLabel jlblTipo) {
        this.jlblTipo = jlblTipo;
    }

    public JLabel getJlblTolerancia() {
        return jlblTolerancia;
    }

    public void setJlblTolerancia(JLabel jlblTolerancia) {
        this.jlblTolerancia = jlblTolerancia;
    }

    public JLabel getJlblUnidad() {
        return jlblUnidad;
    }

    public void setJlblUnidad(JLabel jlblUnidad) {
        this.jlblUnidad = jlblUnidad;
    }

    public JTextField getJtxtBusq_DescripcionInstrumentos() {
        return jtxtBusq_DescripcionInstrumentos;
    }

    public void setJtxtBusq_DescripcionInstrumentos(JTextField jtxtBusq_DescripcionInstrumentos) {
        this.jtxtBusq_DescripcionInstrumentos = jtxtBusq_DescripcionInstrumentos;
    }

    public JTextField getJtxtBusquedaNombre() {
        return jtxtBusquedaNombre;
    }

    public void setJtxtBusquedaNombre(JTextField jtxtBusquedaNombre) {
        this.jtxtBusquedaNombre = jtxtBusquedaNombre;
    }

    public JTextField getJtxtCodigo() {
        return jtxtCodigo;
    }

    public void setJtxtCodigo(JTextField jtxtCodigo) {
        this.jtxtCodigo = jtxtCodigo;
    }

    public JTextField getJtxtDescripcion() {
        return jtxtDescripcion;
    }

    public void setJtxtDescripcion(JTextField jtxtDescripcion) {
        this.jtxtDescripcion = jtxtDescripcion;
    }

    public JTextField getJtxtMaximo() {
        return jtxtMaximo;
    }

    public void setJtxtMaximo(JTextField jtxtMaximo) {
        this.jtxtMaximo = jtxtMaximo;
    }

    public JTextField getJtxtMinimo() {
        return jtxtMinimo;
    }

    public void setJtxtMinimo(JTextField jtxtMinimo) {
        this.jtxtMinimo = jtxtMinimo;
    }

    public JTextField getJtxtNombre() {
        return jtxtNombre;
    }

    public void setJtxtNombre(JTextField jtxtNombre) {
        this.jtxtNombre = jtxtNombre;
    }

    public JTextField getJtxtNumSerie() {
        return jtxtNumSerie;
    }

    public void setJtxtNumSerie(JTextField jtxtNumSerie) {
        this.jtxtNumSerie = jtxtNumSerie;
    }

    public JTextField getJtxtTolerancia() {
        return jtxtTolerancia;
    }

    public void setJtxtTolerancia(JTextField jtxtTolerancia) {
        this.jtxtTolerancia = jtxtTolerancia;
    }

    public JTextField getJtxtUnidad() {
        return jtxtUnidad;
    }

    public void setJtxtUnidad(JTextField jtxtUnidad) {
        this.jtxtUnidad = jtxtUnidad;
    }

    public JTable getTabla1() {
        return tabla1;
    }

    public void setTabla1(JTable tabla1) {
        this.tabla1 = tabla1;
    }

    public JTable getTabla2Instrumentos() {
        return tabla2Instrumentos;
    }

    public void setTabla2Instrumentos(JTable tabla2Instrumentos) {
        this.tabla2Instrumentos = tabla2Instrumentos;
    }

    public JButton getBtnBorrarCalibracion() {
        return btnBorrarCalibracion;
    }

    public void setBtnBorrarCalibracion(JButton btnBorrarCalibracion) {
        this.btnBorrarCalibracion = btnBorrarCalibracion;
    }

    public JButton getBtnBuscarCalibracion() {
        return btnBuscarCalibracion;
    }

    public void setBtnBuscarCalibracion(JButton btnBuscarCalibracion) {
        this.btnBuscarCalibracion = btnBuscarCalibracion;
    }

    public JButton getBtnGuardarCalibracion() {
        return btnGuardarCalibracion;
    }

    public void setBtnGuardarCalibracion(JButton btnGuardarCalibracion) {
        this.btnGuardarCalibracion = btnGuardarCalibracion;
    }

    public JButton getBtnLimpiarCalibracion() {
        return btnLimpiarCalibracion;
    }

    public void setBtnLimpiarCalibracion(JButton btnLimpiarCalibracion) {
        this.btnLimpiarCalibracion = btnLimpiarCalibracion;
    }

    public JButton getBtnReporteCalibracion() {
        return btnReporteCalibracion;
    }

    public void setBtnReporteCalibracion(JButton btnReporteCalibracion) {
        this.btnReporteCalibracion = btnReporteCalibracion;
    }

    public JPanel getjPanel10() {
        return jPanel10;
    }

    public void setjPanel10(JPanel jPanel10) {
        this.jPanel10 = jPanel10;
    }

    public JPanel getjPanel11() {
        return jPanel11;
    }

    public void setjPanel11(JPanel jPanel11) {
        this.jPanel11 = jPanel11;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JTable getjTable1() {
        return tabla4Mediciones;
    }

    public void setjTable1(JTable jTable1) {
        this.tabla4Mediciones = jTable1;
    }

    public JTable getjTable2() {
        return tabla3Calibraciones;
    }

    public void setjTable2(JTable jTable2) {
        this.tabla3Calibraciones = jTable2;
    }

    public JLabel getJlblFecha() {
        return jlblFecha;
    }

    public void setJlblFecha(JLabel jlblFecha) {
        this.jlblFecha = jlblFecha;
    }

    public JLabel getJlblInfoInstrumento() {
        return jlblInfoInstrumento;
    }

    public void setJlblInfoInstrumento(JLabel jlblInfoInstrumento) {
        this.jlblInfoInstrumento = jlblInfoInstrumento;
    }

    public JLabel getJlblMedicionesCalibracion() {
        return jlblMedicionesCalibracion;
    }

    public void setJlblMedicionesCalibracion(JLabel jlblMedicionesCalibracion) {
        this.jlblMedicionesCalibracion = jlblMedicionesCalibracion;
    }

    public JLabel getJlblNumBusqCalibracion() {
        return jlblNumBusqCalibracion;
    }

    public void setJlblNumBusqCalibracion(JLabel jlblNumBusqCalibracion) {
        this.jlblNumBusqCalibracion = jlblNumBusqCalibracion;
    }

    public JLabel getJlblNumeroCalibracion() {
        return jlblNumeroCalibracion;
    }

    public void setJlblNumeroCalibracion(JLabel jlblNumeroCalibracion) {
        this.jlblNumeroCalibracion = jlblNumeroCalibracion;
    }

    public JTextField getJtxtFecha() {
        return jtxtFecha;
    }

    public void setJtxtFecha(JTextField jtxtFecha) {
        this.jtxtFecha = jtxtFecha;
    }

    public JTextField getJtxtMedicionesCalibracion() {
        return jtxtMedicionesCalibracion;
    }

    public void setJtxtMedicionesCalibracion(JTextField jtxtMedicionesCalibracion) {
        this.jtxtMedicionesCalibracion = jtxtMedicionesCalibracion;
    }

    public JTextField getJtxtNumBusqCalib() {
        return jtxtNumBusqCalib;
    }

    public void setJtxtNumBusqCalib(JTextField jtxtNumBusqCalib) {
        this.jtxtNumBusqCalib = jtxtNumBusqCalib;
    }

    public JTextField getJtxtNumCalibracion() {
        return jtxtNumCalibracion;
    }

    public void setJtxtNumCalibracion(JTextField jtxtNumCalibracion) {
        this.jtxtNumCalibracion = jtxtNumCalibracion;
    }

    public JTable getTabla3Calibraciones() {
        return tabla3Calibraciones;
    }

    public void setTabla3Calibraciones(JTable tabla3Calibraciones) {
        this.tabla3Calibraciones = tabla3Calibraciones;
    }

    public JTable getTabla4Mediciones() {
        return tabla4Mediciones;
    }

    public void setTabla4Mediciones(JTable tabla4Mediciones) {
        this.tabla4Mediciones = tabla4Mediciones;
    }

    public JLabel getJlblInfoInstrumento_2() {
        return jlblInfoInstrumento_2;
    }

    public void setJlblInfoInstrumento_2(JLabel jlblInfoInstrumento_2) {
        this.jlblInfoInstrumento_2 = jlblInfoInstrumento_2;
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTabbedPane SUBPANEL;
    private javax.swing.JButton btnBorrarCalibracion;
    private javax.swing.JButton btnBorrarInstrumentos;
    private javax.swing.JButton btnBorrarTI;
    private javax.swing.JButton btnBuscarCalibracion;
    private javax.swing.JButton btnBuscarInstrumentos;
    private javax.swing.JButton btnBuscarTI;
    private javax.swing.JButton btnGuardarCalibracion;
    private javax.swing.JButton btnGuardarInstrumentos;
    private javax.swing.JButton btnGuardarTI;
    private javax.swing.JButton btnLimpiarCalibracion;
    private javax.swing.JButton btnLimpiarTI;
    private javax.swing.JButton btnReporteCalibracion;
    private javax.swing.JButton btnReporteInstrumentos;
    private javax.swing.JButton btnReporteTI;
    private javax.swing.JButton btnlimpiarInstrumentos;
    private javax.swing.JComboBox<String> jCBTipoInstrumentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAcercade;
    private javax.swing.JPanel jPanelCalibraciones;
    private javax.swing.JPanel jPanelInstrumentos;
    private javax.swing.JPanel jPanelTipoInstrumentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jlblBusquedaNombre;
    private javax.swing.JLabel jlblCodigo;
    private javax.swing.JLabel jlblDescripInstrumentos;
    private javax.swing.JLabel jlblDescripcion;
    private javax.swing.JLabel jlblFecha;
    private javax.swing.JLabel jlblInfoInstrumento;
    private javax.swing.JLabel jlblInfoInstrumento_2;
    private javax.swing.JLabel jlblMaximo;
    private javax.swing.JLabel jlblMedicionesCalibracion;
    private javax.swing.JLabel jlblMinimo;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblNumBusqCalibracion;
    private javax.swing.JLabel jlblNumSerie;
    private javax.swing.JLabel jlblNumeroCalibracion;
    private javax.swing.JLabel jlblTipo;
    private javax.swing.JLabel jlblTolerancia;
    private javax.swing.JLabel jlblUnidad;
    private javax.swing.JTextField jtxtBusq_DescripcionInstrumentos;
    private javax.swing.JTextField jtxtBusquedaNombre;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtFecha;
    private javax.swing.JTextField jtxtMaximo;
    private javax.swing.JTextField jtxtMedicionesCalibracion;
    private javax.swing.JTextField jtxtMinimo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNumBusqCalib;
    private javax.swing.JTextField jtxtNumCalibracion;
    private javax.swing.JTextField jtxtNumSerie;
    private javax.swing.JTextField jtxtTolerancia;
    private javax.swing.JTextField jtxtUnidad;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2Instrumentos;
    private javax.swing.JTable tabla3Calibraciones;
    private javax.swing.JTable tabla4Mediciones;
    // End of variables declaration//GEN-END:variables
}
