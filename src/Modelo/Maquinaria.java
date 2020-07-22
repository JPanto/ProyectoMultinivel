/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Panto
 */
public abstract class Maquinaria {
    private String id,tipo,desc;
    private int cant;

    /**
     *  Metodo abstracto que retorna un total teniendo en cuenta el valor
     *  de la maquina(c/u), cantidad y el valor por concepto de mantenimiento preventivo
     * @return double
     */
    public abstract double Total();

    /**
     * Metodo abstracto que retorna el valor por concepto de mantenimiento preventivo
     * teniendo en cuenta el valor de la maquinaria(c/u), la cantidad y el porcentaje respectivo
     * @return double
     */
    public abstract double Concepto();

    /**
     *  Constructor paramétrico que genera una instancia
     *   a partir de los parametros establecidos requeridos
     * @param id identificación de la maquinaria (String)
     * @param tipo  tipo de maquinaria (String)
     * @param desc  descripción adicional (String)
     * @param cant  cantidad (String)
     */
    public Maquinaria(String id, String tipo, String desc, int cant) {
        this.id = id;
        this.tipo = tipo;
        this.desc = desc;
        this.cant = cant;
    }
    
    /**
     *  Constructor básico que genera una instancia e inicializa
     * los atributos
     */
    public Maquinaria() {
        this.id = "";
        this.tipo = "";
        this.desc = "";
        this.cant = 0;
    }

    /**
     *  Metodo que obtiene el valor del atributo "id"
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     *  Metodo que establece el valor del atributo "id"
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *  Metodo que obtiene el valor del atributo "tipo"
     * @return String
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *  Metodo que establece el valor del atributo "tipo"
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *  Metodo que obtiene el valor del atributo "desc"
     * @return String
     */
    public String getDesc() {
        return desc;
    }

    /**
     *  Metodo que establece el valor del atributo "desc"
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     *  Metodo que obtiene el valor del atributo "cant"
     * @return int
     */
    public int getCant() {
        return cant;
    }

    /**
     *  Metodo que establece el valor del atributo "cant"
     * @param cant
     */
    public void setCant(int cant) {
        this.cant = cant;
    }

    /**
     *  Retorna información de la clase de manera ordenada(string)
     * @return String
     */
    @Override
    public String toString() {
        return id + ";" + tipo + ";" + desc + ";" + cant;
    }
    
    
    
    
}
