/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_victorcruz;

import java.io.Serializable;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Astronautas implements Serializable {
    private String nombre,apellido,nacionalidad,titulo,contextura;
    private int peso_kg,cant_misiones;
    private static final long SerialVersionUID=777L;

    public Astronautas(String nombre, String apellido, String nacionalidad, String titulo, String contextura, int peso_kg, int cant_misiones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.contextura = contextura;
        this.peso_kg = peso_kg;
        this.cant_misiones = cant_misiones;
    }

    

    public Astronautas() {
    }

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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public int getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(int peso_kg) {
        this.peso_kg = peso_kg;
    }

    public int getCant_misiones() {
        return cant_misiones;
    }

    public void setCant_misiones(int cant_misiones) {
        this.cant_misiones = cant_misiones;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + ", Apellido: " + apellido +", Titulo: " + titulo;
    }
    
    
    
}
