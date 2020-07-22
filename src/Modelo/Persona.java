package Modelo;

/**
 *  Clase de tipo persona
 * @author Panto
 */
public class Persona {
    private String id,nom,tel;

    /**
     * Constructor paramétrico que genera una instancia
     * a partir de los parametros establecidos requeridos
     * @param id identificación (string)
     * @param nom nombre (string)
     * @param tel telefono (string)
     */
    public Persona(String id, String nom, String tel) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
    }
    
    /**
     *Constructor básico que genera una instancia e inicializa
     * los atributos
     */
    public Persona() {
        this.id = "";
        this.nom = "";
        this.tel = "";
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
     *  Metodo que obtiene el valor del atributo "nom"
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     *  Metodo que establece el valor del atributo "nom"
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *  Metodo que obtiene el valor del atributo "tel"
     * @return
     */
    public String getTel() {
        return tel;
    }

    /**
     *  Metodo que establece el valor del atributo "tel"
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     *  Retorna información de la clase de manera ordenada(string)
     * @return String
     */
    @Override
    public String toString() {
        return id + ";" + nom + ";" + tel;
    }
        
}
