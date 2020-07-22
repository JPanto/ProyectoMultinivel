package Modelo;

/**
 *
 * @author Panto
 */
public class Pesada extends Maquinaria{

    /**
     *  Constructor paramétrico que genera una instancia
     *   a partir de los parametros establecidos requeridos
     * @param id identificación de la maquinaria (String)
     * @param tipo  tipo de maquinaria (String)
     * @param desc  descripción adicional (String)
     * @param cant  cantidad (String)
     */
    public Pesada(String id, String tipo, String desc, int cant) {
        super(id, tipo, desc, cant);
    }

    /**
     *  Constructor básico que genera una instancia e inicializa
     * los atributos 
     */
    public Pesada() {
        super();
        setTipo("Pesada");
    }
    /**
     *  Metodo abstracto que retorna un total teniendo en cuenta el valor
     *  de la maquina(c/u), cantidad y el valor por concepto de mantenimiento preventivo
     * @return double
     */
    @Override
    public double Total() {
        return (getCant()*400000)+Concepto();
    }

    /**
     * Metodo abstracto que retorna el valor por concepto de mantenimiento preventivo
     * teniendo en cuenta el valor de la maquinaria(c/u), la cantidad y el porcentaje respectivo
     * @return double
     */
    @Override
    public double Concepto() {
        return getCant()*400000*0.1;
    }

    @Override
    public String toString() {
        return "Maquinaria ->" + getId() + "\ntipo=" + getTipo() + "\ndesc=" + getDesc() + "\ncant=" + getCant();
    }
    
    
}
