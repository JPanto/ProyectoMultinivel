/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Panto
 */
public class Hora {
    private int hh,mm,ss;

    /**
     *  Constructor paramétrico que genera una instancia
     *  a partir de los parametros establecidos requeridos
     * @param hh hora del dia (int)
     * @param mm minuto de la hora  (int)
     * @param ss segundo del minuto (int)
     */
    public Hora(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }
    
    /**
     *  Constructor básico que genera una instancia e inicializa
     *  los atributos
     */
    public Hora() {
        Calendar objF= Calendar.getInstance();
        this.hh = objF.get(Calendar.HOUR);
        this.mm = objF.get(Calendar.MINUTE);
        this.ss = objF.get(Calendar.SECOND);
    }

    /**
     *  Metodo que obtiene el valor del atributo "hh"
     * @return int
     */
    public int getHh() {
        return hh;
    }

    /**
     *  Metodo que establece el valor del atributo "hh"
     * @param hh
     */
    public void setHh(int hh) {
        this.hh = hh;
    }

    /**
     *  Metodo que obtiene el valor del atributo "mm"
     * @return int 
     */
    public int getMm() {
        return mm;
    }

    /**
     *  Metodo que establece el valor del atributo "mm"
     * @param mm
     */
    public void setMm(int mm) {
        this.mm = mm;
    }

    /**
     *  Metodo que obtiene el valor del atributo "ss"
     * @return int
     */
    public int getSs() {
        return ss;
    }

    /**
     *  Metodo que establece el valor del atributo "ss"
     * @param ss
     */
    public void setSs(int ss) {
        this.ss = ss;
    }
    
    /**
     *  Retorna información de la clase de manera ordenada(string)
     * @return String
     */
    @Override
    public String toString() {
        return hh +"/" +mm + "/" + ss;
    } 
}
