package model;

/**
 * Representa a un empleado de la agencia Llanquihue Tour.
 *
 * Esta clase hereda de Persona para reutilizar sus atributos y comportamiento.
 */
public class Empleado extends Persona {

    // Atributos propios del empleado
    private String cargo;
    private int aniosExperiencia;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param correo correo electrónico del empleado
     * @param telefono teléfono de contacto
     * @param direccion dirección asociada al empleado
     * @param cargo cargo que cumple en la agencia
     * @param aniosExperiencia cantidad de años de experiencia
     */
    public Empleado(String nombre, String apellido, String correo, String telefono,
            Direccion direccion, String cargo, int aniosExperiencia) {
        super(nombre, apellido, correo, telefono, direccion);
        this.cargo = cargo;
        this.aniosExperiencia = aniosExperiencia;
    }

    /**
     * Retorna la información del empleado como texto.
     *
     * @return información formateada
     */
    @Override
    public String toString() {
        return super.toString()
                + "\nCargo: " + cargo
                + "\nAños de experiencia: " + aniosExperiencia;
    }

    // Métodos get y set

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
