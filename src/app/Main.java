package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

import java.io.UnsupportedEncodingException;


/**
 * Clase principal del sistema Llanquihue Tour.
 *
 * En esta clase se crean objetos y se prueban los conceptos de:
 * - Encapsulamiento
 * - Composición
 * - Herencia
 */
public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // Configuración para soportar tildes y caracteres especiales en los System.out.println().
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

        System.out.println("===== SISTEMA LLANQUIHUE TOUR =====\n");

        Direccion direccionCliente = new Direccion(
                "Avenida Costanera",
                1250,
                "Llanquihue",
                "Los Lagos"
        );

        Direccion direccionGuia = new Direccion(
                "Los Arrayanes",
                340,
                "Puerto Varas",
                "Los Lagos"
        );

        Direccion direccionOperador = new Direccion(
                "Ruta 5 Sur",
                900,
                "Frutillar",
                "Los Lagos"
        );

        Persona cliente = new Persona(
                "Camila",
                "Soto",
                "camila.soto@correo.cl",
                "+56912345678",
                direccionCliente
        );

        Empleado guia = new Empleado(
                "Joaquin",
                "Mansilla",
                "joaquin.mansilla@llanquihuetour.cl",
                "+56987654321",
                direccionGuia,
                "Guía turístico",
                5
        );

        Empleado operador = new Empleado(
                "Valentina",
                "Rojas",
                "valentina.rojas@llanquihuetour.cl",
                "+56911223344",
                direccionOperador,
                "Operadora de reservas",
                3
        );

        System.out.println("===== CLIENTE =====");
        System.out.println(cliente + "\n");

        System.out.println("===== GUÍA TURÍSTICO =====");
        System.out.println(guia + "\n");

        System.out.println("===== OPERADOR =====");
        System.out.println(operador);
    }
}
