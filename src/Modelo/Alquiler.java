/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Panto
 */
public class Alquiler {
    private int no_recibo, dias;
    private Fecha fecha_e, fecha_s;
    private Hora hora;
    private Persona cliente;
    private ArrayList<Maquinaria> ListaM;

    /**
     *  Constructor paramétrico que genera una instancia
     *  a partir de los parametros establecidos requeridos
     * @param no_recibo número de recibo(int)
     * @param dias  días de alquiler(int)
     * @param fecha_e fecha de entrega alquiler(Fecha)
     * @param fecha_s fecha de salida alquiler (Fecha)
     * @param hora  hora de alquiler(Hora)
     * @param cliente   datos cliente(Persona)
     * @param ListaM    datos maquinaria(Maquinaria)
     */
    public Alquiler(int no_recibo, int dias, Fecha fecha_e, Fecha fecha_s, Hora hora, Persona cliente, ArrayList<Maquinaria> ListaM) {
        this.no_recibo = no_recibo;
        this.dias = dias;
        this.fecha_e = fecha_e;
        this.fecha_s = fecha_s;
        this.hora = hora;
        this.cliente = cliente;
        this.ListaM = ListaM;
    }

    /**
     * Constructor básico que genera una instancia e inicializa
     * los atributos
     */
    public Alquiler() {
        this.no_recibo = 0;
        this.dias = 0;
        this.fecha_e = new Fecha();
        this.fecha_s = new Fecha();
        this.hora = new Hora();
        this.cliente = new Persona();
        this.ListaM = new ArrayList<Maquinaria>();
    }
    
    public double Total(){
        double datos=0;
        for (int i = 0; i < ListaM.size(); i++) {
            ListaM.get(i).Total();
        }
        return datos*getDias();
    }

    /**
     *  Metodo que obtiene el valor del atributo "no_recibo"
     * @return int
     */
    public int getNo_recibo() {
        return no_recibo;
    }

    /**
     *  Metodo que establece el valor del atributo "no_recibo"
     * @param no_recibo
     */
    public void setNo_recibo(int no_recibo) {
        this.no_recibo = no_recibo;
    }

    /**
     *  Metodo que obtiene el valor del atributo "dias"
     * @return int
     */
    public int getDias() {
        return dias;
    }

    /**
     *  Metodo que establece el valor del atributo "dias"
     * @param dias
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     *  Metodo que obtiene el valor del atributo "fecha_e"
     * @return Fecha
     */
    public Fecha getFecha_e() {    
        return fecha_e;
    }

    /**
     *  Metodo que establece el valor del atributo "fecha_e"
     * @param fecha_e
     */
    public void setFecha_e(Fecha fecha_e) {    
        this.fecha_e = fecha_e;
    }
    
        /**
     *  Metodo que obtiene el valor del atributo "fecha_s"
     * @return Fecha
     */
    public Fecha getFecha_s() {    
        return fecha_s;
    }

    /**
     *  Metodo que establece el valor del atributo "fecha_s"
     * @param fecha_s
     */
    public void setFecha_s(Fecha fecha_s) {    
        this.fecha_e = fecha_s;
    }

    /**
     *  Metodo que obtiene el valor del atributo "hora"
     * @return Hora
     */
    public Hora getHora() {
        return hora;
    }

    /**
     *  Metodo que establece el valor del atributo "hora"
     * @param hora
     */
    public void setHora(Hora hora) {
        this.hora = hora;
    }

    /**
     *  Metodo que obtiene el valor del atributo "cliente"
     * @return Cliente
     */
    public Persona getCliente() {
        return cliente;
    }

    /**
     *  Metodo que establece el valor del atributo "cliente"
     * @param cliente
     */
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    /**
     *  Metodo que obtiene el valor del arraylist "ListaM"
     * @return Maquinaria
     */
    public ArrayList<Maquinaria> getListaM() {
        return ListaM;
    }

    /**
     *  Metodo que establece el valor del arraylist "ListaM"
     * @param ListaM
     */
    public void setListaM(ArrayList<Maquinaria> ListaM) {
        this.ListaM = ListaM;
    }

    @Override
    public String toString() {
        return no_recibo + ";" + dias + ";" + fecha_e + ";" + fecha_s + ";" + hora + ";" + cliente + ";" + ListaM;
    }

    /**
     *  Retorna información de la clase de manera ordenada(string)
     * @return String
     */
    
    
    
    
    
}
