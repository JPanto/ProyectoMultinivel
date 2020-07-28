package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Form_Recaudo extends javax.swing.JInternalFrame {

    public Form_Recaudo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dgw_datos = new javax.swing.JTable();
        lbl_resultado6 = new javax.swing.JLabel();
        lbl_resultado7 = new javax.swing.JLabel();
        lbl_resultado8 = new javax.swing.JLabel();
        txt_cantm = new javax.swing.JTextField();
        txt_cante = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btn_salir = new javax.swing.JButton();

        setClosable(true);

        dgw_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Alquiler", "Fecha_E", "Fecha_S", "Días", "Id. Cliente", "N. Cliente", "Tel. Cliente", "Id. Maquinaria", "Tipo", "Cantidad", "Descripción M.", "Descripción A."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dgw_datos);

        lbl_resultado6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbl_resultado6.setText("Cantidad maquinaria pesada");

        lbl_resultado7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbl_resultado7.setText("Cantidad maquinaria general");

        lbl_resultado8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbl_resultado8.setText("Total recaudado alquiler");

        jToolBar1.setRollover(true);

        btn_salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Panto\\Desktop\\Multinivel\\Proyectos\\ProyMaquinas\\letterx_83737.png")); // NOI18N
        btn_salir.setFocusable(false);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_salir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_resultado6)
                            .addComponent(lbl_resultado8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_resultado7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_cantm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(txt_cante, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_total))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resultado6)
                    .addComponent(txt_cantm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resultado7)
                    .addComponent(txt_cante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resultado8)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed


    public JTable getDgw_datos() {
        return dgw_datos;
    }

    public void setDgw_datos(JTable dgw_datos) {
        this.dgw_datos = dgw_datos;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLbl_resultado6() {
        return lbl_resultado6;
    }

    public void setLbl_resultado6(JLabel lbl_resultado6) {
        this.lbl_resultado6 = lbl_resultado6;
    }

    public JLabel getLbl_resultado7() {
        return lbl_resultado7;
    }

    public void setLbl_resultado7(JLabel lbl_resultado7) {
        this.lbl_resultado7 = lbl_resultado7;
    }

    public JLabel getLbl_resultado8() {
        return lbl_resultado8;
    }

    public void setLbl_resultado8(JLabel lbl_resultado8) {
        this.lbl_resultado8 = lbl_resultado8;
    }

    public JTextField getTxt_cante() {
        return txt_cante;
    }

    public void setTxt_cante(JTextField txt_cante) {
        this.txt_cante = txt_cante;
    }

    public JTextField getTxt_cantm() {
        return txt_cantm;
    }

    public void setTxt_cantm(JTextField txt_cantm) {
        this.txt_cantm = txt_cantm;
    }

    public JTextField getTxt_total() {
        return txt_total;
    }

    public void setTxt_total(JTextField txt_total) {
        this.txt_total = txt_total;
    }

    public JButton getBtn_salir() {
        return btn_salir;
    }

    public void setBtn_salir(JButton btn_salir) {
        this.btn_salir = btn_salir;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }
    
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JTable dgw_datos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbl_resultado6;
    private javax.swing.JLabel lbl_resultado7;
    private javax.swing.JLabel lbl_resultado8;
    private javax.swing.JTextField txt_cante;
    private javax.swing.JTextField txt_cantm;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
