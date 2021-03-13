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
public class Nave implements Serializable {
    private String nombre,ident;
    private int cant_max,time,Astro_abordo;
    private double time_land,cant_comb,com_res,velocidad,dist_max;
    
    private static final long SerialVersionUID=555;

    public Nave(String nombre, String ident, int cant_max, int time, int Astro_abordo, double time_land, double cant_comb, double com_res, double velocidad, double dist_max) {
        this.nombre = nombre;
        this.ident = ident;
        this.cant_max = cant_max;
        this.time = time;
        this.Astro_abordo = Astro_abordo;
        this.time_land = time_land;
        this.cant_comb = cant_comb;
        this.com_res = com_res;
        this.velocidad = velocidad;
        this.dist_max = dist_max;
    }

   

    public Nave() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public int getCant_max() {
        return cant_max;
    }

    public void setCant_max(int cant_max) {
        this.cant_max = cant_max;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getAstro_abordo() {
        return Astro_abordo;
    }

    public void setAstro_abordo(int Astro_abordo) {
        this.Astro_abordo = Astro_abordo;
    }

    public double getTime_land() {
        return time_land;
    }

    public void setTime_land(double time_land) {
        this.time_land = time_land;
    }

    public double getCant_comb() {
        return cant_comb;
    }

    public void setCant_comb(double cant_comb) {
        this.cant_comb = cant_comb;
    }

    public double getCom_res() {
        return com_res;
    }

    public void setCom_res(double com_res) {
        this.com_res = com_res;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getDist_max() {
        return dist_max;
    }

    public void setDist_max(double dist_max) {
        this.dist_max = dist_max;
    }

    
    
    @Override
    public String toString() {
        return "nombre de la Nave: " + nombre;
    }
    
    
    
}
