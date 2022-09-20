package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestañas = new javax.swing.JTabbedPane();
        panel_agregar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_agregar_marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spinner_agregar_tamaño_rin = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cb_agregar_velocidad_maxima = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        spinner_agregar_perfil_carga = new javax.swing.JSpinner();
        spinner_agregar_ancho_nominal = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        panel_ordenamientos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cb_metodo_ordenamiento = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cb_ordenamiento = new javax.swing.JComboBox<>();
        btn_ordenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_inventario = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        panel_busquedas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spinner_busquedas_perfil_carga = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        cb_metodo_busqueda = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_resultado_busqueda = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_agregar.setBackground(new java.awt.Color(255, 255, 255));
        panel_agregar.setForeground(new java.awt.Color(0, 0, 0));
        panel_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Agregar neumático");
        panel_agregar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 25));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Marca:");
        panel_agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 25));

        txt_agregar_marca.setBackground(new java.awt.Color(255, 255, 255));
        txt_agregar_marca.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txt_agregar_marca.setForeground(new java.awt.Color(0, 0, 0));
        panel_agregar.add(txt_agregar_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, 25));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tamaño del rin:");
        panel_agregar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 25));

        spinner_agregar_tamaño_rin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        spinner_agregar_tamaño_rin.setModel(new javax.swing.SpinnerNumberModel(10, null, null, 1));
        panel_agregar.add(spinner_agregar_tamaño_rin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 120, 25));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Velocidad maxima:");
        panel_agregar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 25));

        cb_agregar_velocidad_maxima.setBackground(new java.awt.Color(255, 255, 255));
        cb_agregar_velocidad_maxima.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cb_agregar_velocidad_maxima.setForeground(new java.awt.Color(0, 0, 0));
        cb_agregar_velocidad_maxima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "T", "X", "V", "W", "Y", "Z" }));
        panel_agregar.add(cb_agregar_velocidad_maxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 120, 25));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Perfil de carga");
        panel_agregar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, 25));

        spinner_agregar_perfil_carga.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        spinner_agregar_perfil_carga.setModel(new javax.swing.SpinnerNumberModel(80, 80, 114, 1));
        panel_agregar.add(spinner_agregar_perfil_carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, 25));

        spinner_agregar_ancho_nominal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        spinner_agregar_ancho_nominal.setModel(new javax.swing.SpinnerNumberModel(200, 200, 300, 1));
        panel_agregar.add(spinner_agregar_ancho_nominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, 25));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ancho nominal:");
        panel_agregar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, 25));

        btn_agregar.setBackground(new java.awt.Color(0, 0, 0));
        btn_agregar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        panel_agregar.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 25));

        pestañas.addTab("Agregar", panel_agregar);

        panel_ordenamientos.setBackground(new java.awt.Color(255, 255, 255));
        panel_ordenamientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ordenar neumáticos");
        panel_ordenamientos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 360, 25));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Por:");
        panel_ordenamientos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 40, 25));

        cb_metodo_ordenamiento.setBackground(new java.awt.Color(255, 255, 255));
        cb_metodo_ordenamiento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cb_metodo_ordenamiento.setForeground(new java.awt.Color(0, 0, 0));
        cb_metodo_ordenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione->" }));
        panel_ordenamientos.add(cb_metodo_ordenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 130, 25));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Metodo:");
        panel_ordenamientos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 60, 25));

        cb_ordenamiento.setBackground(new java.awt.Color(255, 255, 255));
        cb_ordenamiento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cb_ordenamiento.setForeground(new java.awt.Color(0, 0, 0));
        cb_ordenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione->", "Ancho nominal", "Marca" }));
        cb_ordenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ordenamientoActionPerformed(evt);
            }
        });
        panel_ordenamientos.add(cb_ordenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 130, 25));

        btn_ordenar.setBackground(new java.awt.Color(0, 0, 0));
        btn_ordenar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_ordenar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ordenar.setText("Ordenar");
        panel_ordenamientos.add(btn_ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 100, 25));

        txt_inventario.setEditable(false);
        txt_inventario.setBackground(new java.awt.Color(255, 255, 255));
        txt_inventario.setColumns(20);
        txt_inventario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txt_inventario.setRows(5);
        txt_inventario.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane2.setViewportView(txt_inventario);

        panel_ordenamientos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 510, 230));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Inventario");
        panel_ordenamientos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 25));

        pestañas.addTab("Ordenamientos", panel_ordenamientos);

        panel_busquedas.setBackground(new java.awt.Color(255, 255, 255));
        panel_busquedas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Resultado");
        panel_busquedas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 25));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Metodo:");
        panel_busquedas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, 25));

        spinner_busquedas_perfil_carga.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        spinner_busquedas_perfil_carga.setModel(new javax.swing.SpinnerNumberModel(80, 80, 114, 1));
        panel_busquedas.add(spinner_busquedas_perfil_carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 90, 25));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Perfil de carga:");
        panel_busquedas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 25));

        cb_metodo_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        cb_metodo_busqueda.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cb_metodo_busqueda.setForeground(new java.awt.Color(0, 0, 0));
        cb_metodo_busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione->", "Lineal", "Binaria" }));
        panel_busquedas.add(cb_metodo_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, 25));

        btn_buscar.setBackground(new java.awt.Color(0, 0, 0));
        btn_buscar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        panel_busquedas.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 90, 25));

        txt_resultado_busqueda.setEditable(false);
        txt_resultado_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        txt_resultado_busqueda.setColumns(20);
        txt_resultado_busqueda.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txt_resultado_busqueda.setRows(5);
        txt_resultado_busqueda.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(txt_resultado_busqueda);

        panel_busquedas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 510, 230));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Buscar neumático por perfil de carga");
        panel_busquedas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 360, 25));

        pestañas.addTab("Busquedas", panel_busquedas);

        getContentPane().add(pestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_ordenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ordenamientoActionPerformed
        if (cb_ordenamiento.getSelectedItem().toString().equals("Seleccione->")) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un filtro antes");
        }

        if (cb_ordenamiento.getSelectedItem().toString().equals("Ancho nominal")) {
            cb_metodo_ordenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Seleccione->", "Burbuja", "Intercambio", "Quicksort"}));
        }

        if (cb_ordenamiento.getSelectedItem().toString().equals("Marca")) {
            cb_metodo_ordenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Seleccione->", "Comparator", "Comparable"}));
        }

    }//GEN-LAST:event_cb_ordenamientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JComboBox<String> cb_agregar_velocidad_maxima;
    private javax.swing.JComboBox<String> cb_metodo_busqueda;
    private javax.swing.JComboBox<String> cb_metodo_ordenamiento;
    private javax.swing.JComboBox<String> cb_ordenamiento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_agregar;
    private javax.swing.JPanel panel_busquedas;
    private javax.swing.JPanel panel_ordenamientos;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JSpinner spinner_agregar_ancho_nominal;
    private javax.swing.JSpinner spinner_agregar_perfil_carga;
    private javax.swing.JSpinner spinner_agregar_tamaño_rin;
    private javax.swing.JSpinner spinner_busquedas_perfil_carga;
    private javax.swing.JTextField txt_agregar_marca;
    private javax.swing.JTextArea txt_inventario;
    private javax.swing.JTextArea txt_resultado_busqueda;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_agregar() {
        return btn_agregar;
    }

    public void setBtn_agregar(JButton btn_agregar) {
        this.btn_agregar = btn_agregar;
    }

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public void setBtn_buscar(JButton btn_buscar) {
        this.btn_buscar = btn_buscar;
    }

    public JButton getBtn_ordenar() {
        return btn_ordenar;
    }

    public void setBtn_ordenar(JButton btn_ordenar) {
        this.btn_ordenar = btn_ordenar;
    }

    public JComboBox<String> getCb_agregar_velocidad_maxima() {
        return cb_agregar_velocidad_maxima;
    }

    public void setCb_agregar_velocidad_maxima(JComboBox<String> cb_agregar_velocidad_maxima) {
        this.cb_agregar_velocidad_maxima = cb_agregar_velocidad_maxima;
    }

    public JComboBox<String> getCb_metodo_busqueda() {
        return cb_metodo_busqueda;
    }

    public void setCb_metodo_busqueda(JComboBox<String> cb_metodo_busqueda) {
        this.cb_metodo_busqueda = cb_metodo_busqueda;
    }

    public JComboBox<String> getCb_metodo_ordenamiento() {
        return cb_metodo_ordenamiento;
    }

    public void setCb_metodo_ordenamiento(JComboBox<String> cb_metodo_ordenamiento) {
        this.cb_metodo_ordenamiento = cb_metodo_ordenamiento;
    }

    public JComboBox<String> getCb_ordenamiento() {
        return cb_ordenamiento;
    }

    public void setCb_ordenamiento(JComboBox<String> cb_ordenamiento) {
        this.cb_ordenamiento = cb_ordenamiento;
    }

    public JSpinner getSpinner_agregar_ancho_nominal() {
        return spinner_agregar_ancho_nominal;
    }

    public void setSpinner_agregar_ancho_nominal(JSpinner spinner_agregar_ancho_nominal) {
        this.spinner_agregar_ancho_nominal = spinner_agregar_ancho_nominal;
    }

    public JSpinner getSpinner_agregar_perfil_carga() {
        return spinner_agregar_perfil_carga;
    }

    public void setSpinner_agregar_perfil_carga(JSpinner spinner_agregar_perfil_carga) {
        this.spinner_agregar_perfil_carga = spinner_agregar_perfil_carga;
    }

    public JSpinner getSpinner_agregar_tamaño_rin() {
        return spinner_agregar_tamaño_rin;
    }

    public void setSpinner_agregar_tamaño_rin(JSpinner spinner_agregar_tamaño_rin) {
        this.spinner_agregar_tamaño_rin = spinner_agregar_tamaño_rin;
    }

    public JSpinner getSpinner_busquedas_perfil_carga() {
        return spinner_busquedas_perfil_carga;
    }

    public void setSpinner_busquedas_perfil_carga(JSpinner spinner_busquedas_perfil_carga) {
        this.spinner_busquedas_perfil_carga = spinner_busquedas_perfil_carga;
    }

    public JTextField getTxt_agregar_marca() {
        return txt_agregar_marca;
    }

    public void setTxt_agregar_marca(JTextField txt_agregar_marca) {
        this.txt_agregar_marca = txt_agregar_marca;
    }

    public JTextArea getTxt_inventario() {
        return txt_inventario;
    }

    public void setTxt_inventario(JTextArea txt_inventario) {
        this.txt_inventario = txt_inventario;
    }

    public JTextArea getTxt_resultado_busqueda() {
        return txt_resultado_busqueda;
    }

    public void setTxt_resultado_busqueda(JTextArea txt_resultado_busqueda) {
        this.txt_resultado_busqueda = txt_resultado_busqueda;
    }

}
