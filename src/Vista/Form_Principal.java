package Vista;

import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Form_Principal extends javax.swing.JFrame {

    public Form_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        dpn_escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnu_cliente = new javax.swing.JMenuItem();
        mnu_maquinaria = new javax.swing.JMenuItem();
        mnu_alquiler = new javax.swing.JMenuItem();
        mnu_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnu_recaudo = new javax.swing.JMenu();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema De Alquiler de Maquinaria");
        setSize(new java.awt.Dimension(500, 500));

        dpn_escritorio.setBackground(new java.awt.Color(0, 153, 153));
        dpn_escritorio.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout dpn_escritorioLayout = new javax.swing.GroupLayout(dpn_escritorio);
        dpn_escritorio.setLayout(dpn_escritorioLayout);
        dpn_escritorioLayout.setHorizontalGroup(
            dpn_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        dpn_escritorioLayout.setVerticalGroup(
            dpn_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        jMenu1.setText("Registro");

        jMenu3.setText("Registro");

        mnu_cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnu_cliente.setText("Cliente");
        jMenu3.add(mnu_cliente);

        mnu_maquinaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnu_maquinaria.setText("Maquinaria");
        jMenu3.add(mnu_maquinaria);

        mnu_alquiler.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnu_alquiler.setText("Alquiler");
        mnu_alquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_alquilerActionPerformed(evt);
            }
        });
        jMenu3.add(mnu_alquiler);

        jMenu1.add(jMenu3);

        mnu_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnu_salir.setText("Salir");
        mnu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_salirActionPerformed(evt);
            }
        });
        jMenu1.add(mnu_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        mnu_recaudo.setText("Recaudo");
        jMenu2.add(mnu_recaudo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpn_escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpn_escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_salirActionPerformed

    private void mnu_alquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_alquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_alquilerActionPerformed

    public JDesktopPane getDpn_escritorio() {
        return dpn_escritorio;
    }

    public void setDpn_escritorio(JDesktopPane dpn_escritorio) {
        this.dpn_escritorio = dpn_escritorio;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public void setjMenu2(JMenu jMenu2) {
        this.jMenu2 = jMenu2;
    }

    public JMenu getjMenu3() {
        return jMenu3;
    }

    public void setjMenu3(JMenu jMenu3) {
        this.jMenu3 = jMenu3;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenuItem getMnu_cliente() {
        return mnu_cliente;
    }

    public void setMnu_cliente(JMenuItem mnu_cliente) {
        this.mnu_cliente = mnu_cliente;
    }

    public JMenuItem getMnu_alquiler() {
        return mnu_alquiler;
    }

    public void setMnu_alquiler(JMenuItem mnu_alquiler) {
        this.mnu_alquiler = mnu_alquiler;
    }

    public JMenuItem getMnu_salir() {
        return mnu_salir;
    }

    public void setMnu_salir(JMenuItem mnu_salir) {
        this.mnu_salir = mnu_salir;
    }

    public JMenu getjMenu4() {
        return jMenu4;
    }

    public void setjMenu4(JMenu jMenu4) {
        this.jMenu4 = jMenu4;
    }

    public JMenu getjMenu5() {
        return jMenu5;
    }

    public void setjMenu5(JMenu jMenu5) {
        this.jMenu5 = jMenu5;
    }

    public JMenuBar getjMenuBar2() {
        return jMenuBar2;
    }

    public void setjMenuBar2(JMenuBar jMenuBar2) {
        this.jMenuBar2 = jMenuBar2;
    }

    public JMenu getMnu_recaudo() {
        return mnu_recaudo;
    }

    public void setMnu_recaudo(JMenu mnu_recaudo) {
        this.mnu_recaudo = mnu_recaudo;
    }

    public JMenuItem getMnu_maquinaria() {
        return mnu_maquinaria;
    }

    public void setMnu_maquinaria(JMenuItem mnu_maquinaria) {
        this.mnu_maquinaria = mnu_maquinaria;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpn_escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mnu_alquiler;
    private javax.swing.JMenuItem mnu_cliente;
    private javax.swing.JMenuItem mnu_maquinaria;
    private javax.swing.JMenu mnu_recaudo;
    private javax.swing.JMenuItem mnu_salir;
    // End of variables declaration//GEN-END:variables

}
