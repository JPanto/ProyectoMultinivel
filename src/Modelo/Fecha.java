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
public class Fecha {
    private int dd,mm,aaaa;

    /**
     *  Constructor paramétrico que genera una instancia
     *  a partir de los parametros establecidos requeridos
     * @param dd    dia del mes(int)
     * @param mm    mes del año(int)
     * @param aaaa  año 4 digitos(int)
     */
    public Fecha(int dd, int mm, int aaaa) {
        this.dd = dd;
        this.mm = mm;
        this.aaaa = aaaa;
    }
    
    /**
     *  Constructor básico que genera una instancia e inicializa
     *  los atributos
     */
    public Fecha() {
        Calendar objF= Calendar.getInstance();
        this.dd = objF.get(Calendar.DAY_OF_MONTH);
        this.mm = objF.get(Calendar.MONTH+1);
        this.aaaa = objF.get(Calendar.YEAR);
    }

    /**
     *  Metodo que obtiene el valor del atributo "dd"
     * @return int
     */
    public int getDd() {
        return dd;
    }

    /**
     *  Metodo que establece el valor del atributo "dd"
     * @param dd
     */
    public void setDd(int dd) {
        this.dd = dd;
    }

    /**
     *  Metodo que obtiene el valor del atributo "mm"
     * @return
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
     *  Metodo que obtiene el valor del atributo "aaaa"
     * @return
     */
    public int getAaaa() {
        return aaaa;
    }

    /**
     *  Metodo que establece el valor del atributo "aaaa"
     * @param aaaa
     */
    public void setAaaa(int aaaa) {
        this.aaaa = aaaa;
    }

    /**
     *  Retorna información de la clase de manera ordenada(string)
     * @return String
     */
    @Override
    public String toString() {
        return dd +"/" +mm + "/" + aaaa;
    }
    
    
}
