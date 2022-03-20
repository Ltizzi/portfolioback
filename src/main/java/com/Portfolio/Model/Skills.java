

package com.Portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long skill_id;
    private String skill_nombre;
    private String nivel;
    private String url_icon;
    private String descripcion; 
    
//    @ManyToOne
//    @JoinColumn(name ="persona_id")
//    private Persona persona_id;

    public Skills() {
    }

    public Skills(Long skill_id, String skill_nombre, String nivel, String url_icon, String descripcion) {
        this.skill_id = skill_id;
        this.skill_nombre = skill_nombre;
        this.nivel = nivel;
        this.url_icon = url_icon;
        this.descripcion = descripcion;
    }


    

    

 
    
    
    
    
    
    
}
