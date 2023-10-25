/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;




public class Salle implements Serializable {
 
    private int id;
    private String  nomSalle;

    public Salle() {
    }

    public Salle(String nomSalle) {
      
        this.nomSalle = nomSalle;
    }

    public int getId() {
        return id;
    }

    public Salle(int id, String nomSalle) {
        this.id = id;
        this.nomSalle = nomSalle;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    @Override
    public String toString() {
        return nomSalle ;
    }
    
    
    
    
    
    
    
}
