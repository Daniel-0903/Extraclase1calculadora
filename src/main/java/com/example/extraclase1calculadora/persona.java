package com.example.extraclase1calculadora;
//Crea la clase persona

/**
 * Se crea la clase persona, sus atributos son nombre, edad  y provincia.
   Se le  añade un constructor para permitir crear las instancias y los metodos set y get.
 */
public class persona {
    private String nombre;
    private int edad;
    private String provincia;

    public persona(String nombre, int edad, String provincia) {
        this.nombre = nombre;
        this.edad = edad;
        this.provincia = provincia;
    }
//Constructor de la clase persona
    public persona() {

    }
//setters y getters de persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProvinvia() {
        return provincia;
    }

    public void setProvincia(String nombre) {
        this.provincia = provincia;
    }


}
