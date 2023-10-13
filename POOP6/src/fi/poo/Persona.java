/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author tania
 * Clase que contiene los metodos de lo que hace una persona
 */
public class Persona {
    private String nombre, direccion;
    private int edad;

    /**
     * Constructor vacio de persona
     */
    public Persona() {
    }

    /**
     * constructor lleno de persona
     * @param nombre nombre de la persona en string
     * @param direccion direccion de la persona en string
     * @param edad edad de persona en primitivo entero
     */
    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    /**
     * Metodo get nombre
     * @return Regresa el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Metodo que sirve para que la persona hable
     * @param var Lo que la persona esta diciendo
     */
    public void hablar(String var){
        System.out.println(var);
    }

    /**
     * Metodo to string que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
}
