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
public class Destino implements Serializable{
    private String nom_dest,superficie;
    private double dist_gap,sat_ox;
    private static final long SerialVersionUID=678L;

    public Destino(String nom_dest, String superficie, double dist_gap, double sat_ox) {
        this.nom_dest = nom_dest;
        this.superficie = superficie;
        this.dist_gap = dist_gap;
        this.sat_ox = sat_ox;
    }

    public Destino() {
    }
    
    

    public String getNom_dest() {
        return nom_dest;
    }

    public void setNom_dest(String nom_dest) {
        this.nom_dest = nom_dest;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public double getDist_gap() {
        return dist_gap;
    }

    public void setDist_gap(double dist_gap) {
        this.dist_gap = dist_gap;
    }

    public double getSat_ox() {
        return sat_ox;
    }

    public void setSat_ox(double sat_ox) {
        this.sat_ox = sat_ox;
    }

    @Override
    public String toString() {
        return  "Destino: " + nom_dest;
    }

   
    
}
