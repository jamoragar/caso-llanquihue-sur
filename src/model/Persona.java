package model;

/**
 * Representa a una persona relacionada con la agencia Llanquihue Tour.
 *
 * Esta clase utiliza composición, ya que una Persona tiene una Dirección.
 */
public class Persona {

    // Atributos de la persona
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    // Composición: una persona tiene una dirección
    private Direccion direccion;

    /**
     * Constructor de la clase Persona.
     *
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     * @param correo correo electrónico de la persona
     * @param telefono teléfono de contacto
     * @param direccion dirección asociada a la persona
     */
    public Persona(String nombre, String apellido, String correo, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Retorna la información de la persona como texto.
     *
     * @return información formateada
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido
                + "\nCorreo: " + correo
                + "\nTeléfono: " + telefono
                + "\nDirección: " + direccion;
    }

    // Métodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
