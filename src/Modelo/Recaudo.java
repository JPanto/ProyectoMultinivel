package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Panto
 */
public class Recaudo {
    private ArrayList<Alquiler> ListaA;

    /**
     *  Constructor paramétrico que genera una instancia
     *  a partir de los parametros establecidos requeridos
     * @param ListaA datos alquiler(Alquiler)
     */
    public Recaudo(ArrayList<Alquiler> ListaA) {
        this.ListaA = ListaA;
    }
    
    /**
     * Constructor básico que genera una instancia e inicializa
     * los atributos(arraylist)
     */
    public Recaudo() {
        this.ListaA = new ArrayList<Alquiler>();
    }

    /**
     *  Metodo que obtiene el valor del arraylist "ListaA"
     * @return ArrayList
     */
    public ArrayList<Alquiler> getListaA() {
        return ListaA;
    }

    /**
     *  Metodo que establece el valor del arraylist "ListaA"
     * @param ListaA
     */
    public void setListaA(ArrayList<Alquiler> ListaA) {
        this.ListaA = ListaA;
    }
    
    /**
     * Metodo que retorna el recaudo(sumatoria) del total de todos los alquileres.
     * @return double
     */
    public double Total(){
        double datos=0;
        for (int i = 0; i < ListaA.size(); i++) {
            for (int j = 0;j<ListaA.get(i).getListaM().size(); j++) {
                datos+=ListaA.get(i).getListaM().get(j).Total();
            }
        }
        return datos;
    }
    
    /**
     * Metodo que retorna la cantidad total de maquinaria pesada rentada de todos los
     * alquileres
     * @return int
     */
    public int cantMP(){
        int cont=0;
        for(int i=0;i<ListaA.size();i++){
            for (int j = 0; j < ListaA.get(i).getListaM().size(); j++) {
                if(ListaA.get(i).getListaM().get(j).getTipo().equalsIgnoreCase("Pesada"))
                    cont++;
            }
        }
        return cont;
    }
    
    /**
     * Metodo que retorna la cantidad total de maquinaria general rentada de todos los
     * alquileres
     * @return int
     */
    public int cantEG(){
        int cont=0;
        for(int i=0;i<ListaA.size();i++){
            for (int j = 0; j < ListaA.get(i).getListaM().size(); j++) {
                if(ListaA.get(i).getListaM().get(j).getTipo().equalsIgnoreCase("General"))
                 cont++;
            }
        }
        return cont;
    }
    
    /**
     * Metodo que retorna el recaudo total del valor por concepto
     * de mantenimiento preventivo de todos los alquileres.
     * @return double
     */
    public double total_Concepto(){
        double datos=0;
        for (int i = 0; i < ListaA.size(); i++) {
            for (int j = 0;j<ListaA.get(i).getListaM().size(); j++) {
                datos+=ListaA.get(i).getListaM().get(j).Concepto();
            }
        }
        return datos;
    }
}
