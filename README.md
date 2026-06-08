# Llanquihue Tour

Sistema Java orientado a objetos para representar personas vinculadas a la agencia de turismo Llanquihue Tour.

## Propósito

El proyecto modela una base inicial para administrar información de clientes y empleados de la agencia, aplicando encapsulamiento, composición, herencia y sobrescritura del método `toString()`.

## Estructura del Proyecto

```text
src/
  app/
    Main.java
  model/
    Direccion.java
    Persona.java
    Empleado.java
```

## Clases Implementadas

`Direccion`: representa la dirección física de una persona.

`Persona`: clase base que almacena datos generales y utiliza composición con `Direccion`.

`Empleado`: clase hija que hereda de `Persona` y agrega cargo y años de experiencia.

`Main`: clase principal que crea objetos y muestra sus datos por consola.

## Conceptos Aplicados

Encapsulamiento mediante atributos `private` y métodos `get`/`set`.

Composición mediante la relación entre `Persona` y `Direccion`.

Herencia mediante la relación entre `Empleado` y `Persona`.

Sobrescritura de `toString()` con `@Override`.

## Compilar y Ejecutar

Desde consola, compilar usando solo Java:

```bash
javac -encoding UTF-8 -d build/classes -sourcepath src src/app/Main.java
```

Luego ejecutar la clase principal:

```bash
java "-Dfile.encoding=UTF-8" -cp build/classes app.Main
```
