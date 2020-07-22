package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Panto
 */
public class Control implements ActionListener {

    General objG;
    Pesada objP;
    Recaudo objR;
    Persona objC;
    Alquiler objA;
    
    Conexion conexion = new Conexion();
    
    ArrayList<General> ListaG;
    ArrayList<Pesada> ListaP;
    ArrayList<Persona> ListaC;
    ArrayList<Maquinaria> ListaM;
    
    Form_Principal formP;
    Form_Cliente formC;
    Form_Maquinaria formM;
    Form_Recaudo formR;
    Form_Alquiler formA;

    public Control() {
        this.objG = new General();
        this.objP = new Pesada();
        this.objR = new Recaudo();
        this.objC = new Persona();
        this.ListaC = new ArrayList<Persona>();
        this.ListaG = new ArrayList<General>();
        this.ListaP = new ArrayList<Pesada>();
        this.ListaM = new ArrayList<Maquinaria>();

        this.formP = new Form_Principal();
        formP.getMnu_cliente().addActionListener(this);
        formP.getMnu_maquinaria().addActionListener(this);
        formP.getMnu_alquiler().addActionListener(this);
        formP.getMnu_recaudo().addActionListener(this);
        formP.getMnu_salir().addActionListener(this);
        initPrincipalFrame();

        this.formC = new Form_Cliente();
        this.formC.getBtn_registrar().addActionListener(this);

        this.formM = new Form_Maquinaria();
        this.formM.getBtn_registrar().addActionListener(this);

        this.formR = new Form_Recaudo();
        this.formR.getBtn_salir().addActionListener(this);

        this.formA = new Form_Alquiler();
        formA.getBtn_registrar().setEnabled(true);
        this.formA.getCmb_cliente().addActionListener(this);
        this.formA.getCmb_maquinaria().addActionListener(this);
        this.formA.getRdb_general().addActionListener(this);
        this.formA.getRdb_pesada().addActionListener(this);
        this.formA.getBtn_agregar().addActionListener(this);
        this.formA.getBtn_registrar().addActionListener(this);
    }
    
    private void initPrincipalFrame(){
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.formP.setSize(screenSize.width, screenSize.height);
    }

    public void iniciar() {
        this.formP.setTitle("Alquiler de Maquinaria");
        mostrarVentana(formP);
    }

    /**
     * Se registra el cliente
     */
    private void registrarCliente(){
        objC.setId(formC.getTxt_id().getText());
            objC.setNom(formC.getTxt_nom().getText());
            objC.setTel(formC.getTxt_tel().getText());
            if (formC.getTxt_id().getText().isEmpty()
                    || formC.getTxt_nom().getText().isEmpty()
                    || formC.getTxt_tel().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Se debe ingresar numero de Identificacion, Nombre y telefono por favor verifique nuevamente");
       
            } else {
                ListaC.add(objC);
                formC.getTextArea().append(objC.toString()+"\n\n");
                objC = new Persona();
                formC.getTxt_id().setText("");
                formC.getTxt_nom().setText("");
                formC.getTxt_tel().setText("");
            }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) { 
        if (formC.getBtn_registrar() == ae.getSource()) {
            registrarCliente();
        }
       
        if (formM.getBtn_registrar() == ae.getSource()) {
            if (formM.getCmb_tipo().getSelectedIndex() == 0) {
                objP.setId(formM.getTxt_cod().getText());
                objP.setTipo(formM.getCmb_tipo().getSelectedItem().toString());
                objP.setCant(Integer.parseInt(formM.getTxt_cant().getText()));
                objP.setDesc(formM.getTxt_desc().getText());
            }
            if (formM.getCmb_tipo().getSelectedIndex() == 1) {
                objG.setId(formM.getTxt_cod().getText());
                objG.setTipo(formM.getCmb_tipo().getSelectedItem().toString());
                objG.setCant(Integer.parseInt(formM.getTxt_cant().getText()));
                objG.setDesc(formM.getTxt_desc().getText());
            }
            if (formM.getTxt_cant().getText().isEmpty()||
                    formM.getTxt_cod().getText().isEmpty()||
                    formM.getTxt_desc().getText().isEmpty()||
                    formM.getCmb_tipo().getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Se deben ingresar o seleccionar todos los campos, por favor verifique nuevamente");
            }
            else{
                if(formM.getCmb_tipo().getSelectedIndex() == 0){
                    ListaP.add(objP);
                    formM.getTextArea().append(objP.toString()+"\n\n");
                    objP = new Pesada();
                }
                else if(formM.getCmb_tipo().getSelectedIndex() == 1){
                    ListaG.add(objG);
                    formM.getTextArea().append(objG.toString()+"\n\n");
                    objG = new General();
                }
                formM.getTxt_cod().setText("");
                formM.getTxt_cant().setText("");
                formM.getTxt_desc().setText("");
            }
        }
        
        if (formA.getBtn_registrar()==ae.getSource()){
            Fecha entrada = new Fecha();
            Fecha salida = new Fecha();
            Hora hora = new Hora();
            entrada.setDd(formA.getjDateChooser1().getCalendar().get(Calendar.DAY_OF_MONTH));
            entrada.setMm(formA.getjDateChooser1().getCalendar().get(Calendar.MONTH+1));
            entrada.setAaaa(formA.getjDateChooser1().getCalendar().get(Calendar.YEAR));
            
            salida.setDd(formA.getjDateChooser1().getCalendar().get(Calendar.DAY_OF_MONTH+(Integer.parseInt(formA.getTxt_dias().getText()))));
            salida.setMm(formA.getjDateChooser1().getCalendar().get(Calendar.MONTH+1));
            salida.setAaaa(formA.getjDateChooser1().getCalendar().get(Calendar.YEAR));
            
            hora.setHh(formA.getSpin_hour().getValue());
            hora.setMm(formA.getSpin_min().getValue());
            hora.setSs(formA.getSpin_seg().getValue());
            
            objA= new Alquiler();
            objA.setNo_recibo(Integer.parseInt(formA.getTxt_no().getText()));
            objA.setDias(Integer.parseInt(formA.getTxt_dias().getText()));
            objA.setFecha_e(entrada);
            objA.setFecha_s(salida);
            objA.setHora(hora);
            objA.setCliente(ListaC.get(formA.getCmb_cliente().getSelectedIndex()));
            objA.setListaM(ListaM);
        }
        
        if (formA.getBtn_agregar()==ae.getSource()){
            if(formA.getRdb_general().isSelected()){
                ListaM.add(ListaG.get(formA.getCmb_maquinaria().getSelectedIndex()));
            }
            else if(formA.getRdb_pesada().isSelected()){
                ListaM.add(ListaP.get(formA.getCmb_maquinaria().getSelectedIndex()));
            }
            
        }

        if (formP.getMnu_alquiler() == ae.getSource()) {
            formA.setTitle("Registro Alquiler");
            formP.getDpn_escritorio().add(formA);
            formA.setVisible(true);
             formC.dispose();
             formM.dispose();
            for (int i = 0; i < ListaC.size(); i++) {
                formA.getCmb_cliente().addItem(ListaC.get(i).getId());
            }
            if(formA.getRdb_general().isSelected()){
                for (int i = 0; i < ListaG.size(); i++) {
                    formA.getCmb_maquinaria().addItem(ListaG.get(i).getId());
                }
            }
            else if(formA.getRdb_pesada().isSelected()){
                for (int i = 0; i < ListaP.size(); i++) {
                    formA.getCmb_maquinaria().addItem(ListaP.get(i).getId());
                }
            }
            //iniciarAlquiler();
        }
        
        if (formP.getMnu_cliente() == ae.getSource()) {
            formC.setTitle("Registro Cliente");
            formP.getDpn_escritorio().add(formC);
            formC.setVisible(true);
            formM.dispose();
            formA.dispose();
        }
        
        if (formP.getMnu_maquinaria() == ae.getSource()) {
            formM.setTitle("Registro Maquinaria");
            formP.getDpn_escritorio().add(formM);
           
            formC.dispose();
            formA.dispose();
            formM.setVisible(true);
        }

        if (formA.getCmb_cliente() == ae.getSource()) {

            formA.getLB_IDENTIFICACION().setVisible(true);
            formA.getLB_NOMBRE().setVisible(true);
            formA.getLB_TELEFONO().setVisible(true);
            formA.getLb_id().setVisible(true);
            formA.getLb_nom().setVisible(true);
            formA.getLb_tel().setVisible(true);

            formA.getLb_nom().setText(ListaC.get(formA.getCmb_cliente().getSelectedIndex()).getNom());
            formA.getLb_id().setText(ListaC.get(formA.getCmb_cliente().getSelectedIndex()).getId());
            formA.getLb_tel().setText(ListaC.get(formA.getCmb_cliente().getSelectedIndex()).getTel());
        }
        
        if (formA.getCmb_maquinaria() == ae.getSource()){

            formA.getLB_TIPO().setVisible(true);
            formA.getLB_CANTIDAD().setVisible(true);
            formA.getLB_DESCRIPCION().setVisible(true);
            formA.getLb_cant().setVisible(true);
            formA.getLb_tip().setVisible(true);
            formA.getLb_cant().setVisible(true);
            
            if(formA.getRdb_general().isSelected()){
                Maquinaria temp = ListaG.get(formA.getCmb_maquinaria().getSelectedIndex());
                formA.getLb_tip().setText(temp.getTipo());
                formA.getLb_cant().setText(Integer.toString(ListaG.get(formA.getCmb_maquinaria().getSelectedIndex()).getCant()));
                formA.getLb_desc().setText(ListaG.get(formA.getCmb_maquinaria().getSelectedIndex()).getDesc());
            }
            
            else if(formA.getRdb_pesada().isSelected()){
                formA.getLb_tip().setText(ListaP.get(formA.getCmb_maquinaria().getSelectedIndex()).getTipo());
                formA.getLb_cant().setText(Integer.toString(ListaP.get(formA.getCmb_maquinaria().getSelectedIndex()).getCant()));
                formA.getLb_desc().setText(ListaP.get(formA.getCmb_maquinaria().getSelectedIndex()).getDesc());
            }
        }
        
        if(formA.getRdb_general()==ae.getSource()){
                formA.getCmb_maquinaria().removeAllItems();
                for (int i = 0; i < ListaG.size(); i++) {
                formA.getCmb_maquinaria().addItem(ListaG.get(i).getId());
                }
        }
        
        if(formA.getRdb_pesada()==ae.getSource()){
                formA.getCmb_maquinaria().removeAllItems();
                for (int i = 0; i < ListaP.size(); i++) {
                formA.getCmb_maquinaria().addItem(ListaP.get(i).getId());
                }
        }

        if (formP.getMnu_salir() == ae.getSource()) {
            int resp = JOptionPane.showConfirmDialog(formP, "Está seguro que desea salir?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                formP.dispose();
            }
        }
    }

    public void mostrarVentana(JFrame ventana) {
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
    public void iniciarAlquiler(){
        formA.getLB_CANTIDAD().setVisible(false);
        formA.getLB_DESCRIPCION().setVisible(false);
        formA.getLB_IDENTIFICACION().setVisible(false);
        formA.getLB_NOMBRE().setVisible(false);
        formA.getLB_TELEFONO().setVisible(false);
        formA.getLB_TIPO().setVisible(false);
        formA.getLb_cant().setVisible(false);
        formA.getLb_desc().setVisible(false);
        formA.getLb_id().setVisible(false);
        formA.getLb_nom().setVisible(false);
        formA.getLb_tel().setVisible(false);
        formA.getLb_tip().setVisible(false);
    }
}
