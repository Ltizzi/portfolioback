
package com.Portfolio.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Edu {
    
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long edu_id;
    private String titulo;
    private String institucion;
    private String url_institucion;
    private String img_descriptiva;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_finalizado;
    
    private String descripcion; 
    
//     @ManyToOne
//     @JoinColumn(name ="persona_id")
//    private Persona persona_id;

    public Edu() {
    }

    public Edu(Long edu_id, String titulo, String institucion, String url_institucion, String img_descriptiva, Date fecha_inicio, Date fecha_finalizado, String descripcion) {
        this.edu_id = edu_id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.url_institucion = url_institucion;
        this.img_descriptiva = img_descriptiva;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizado = fecha_finalizado;
        this.descripcion = descripcion;
    }





    
  
    
    
    
}
