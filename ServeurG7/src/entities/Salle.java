/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

/**
 *
 * @author Utilisateur
 */
@Entity
@NamedQuery(name = "findAllS", query = "from Salle ") //HQL
@NamedNativeQuery(name = "findAllSNative", query = "select * from salle", resultClass = Salle.class) 
public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getNomSalle() {
        return nomSalle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Salle(int id, String nomSalle) {
        this.id = id;
        this.nomSalle = nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    @Override
    public String toString() {
        return "Salle{" + "nomSalle=" + nomSalle + '}';
    }
    
    
    
    
    
    
    
}
