package model;

/**
 * Representa la dirección física de una persona vinculada a Llanquihue Tour.
 *
 * Esta clase se utiliza como parte de la composición dentro de la clase Persona.
 */
public class Direccion {

    // Atributos de la dirección
    private String calle;
    private int numero;
    private String ciudad;
    private String region;

    /**
     * Constructor de la clase Direccion.
     *
     * @param calle nombre de la calle
     * @param numero número de la dirección
     * @param ciudad ciudad de la dirección
     * @param region región de la dirección
     */
    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * Retorna la dirección completa como texto.
     *
     * @return dirección formateada
     */
    @Override
    public String toString() {
        return calle + " #" + numero + ", " + ciudad + ", Región de " + region;
    }

    // Métodos get y set

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
