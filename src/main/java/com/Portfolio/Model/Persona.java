
package com.Portfolio.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long persona_id;
    
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date birth_date;
    private String mail;
    private String ciudad;
    private String pais;
    private String about;
    private String profile_pic;
    private String github;
    private String facebook;
    private String twitter;
    private String linkedin;
    
    

    public Persona() {
    }

    public Persona(Long persona_id, String nombre, String apellido, Date birth_date, String mail, String ciudad, String pais, String about, String profile_pic, String github, String facebook, String twitter, String linkedin) {
        this.persona_id = persona_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.birth_date = birth_date;
        this.mail = mail;
        this.ciudad = ciudad;
        this.pais = pais;
        this.about = about;
        this.profile_pic = profile_pic;
        this.github = github;
        this.facebook = facebook;
        this.twitter = twitter;
        this.linkedin = linkedin;
    }

    

    
    
    
    
}
