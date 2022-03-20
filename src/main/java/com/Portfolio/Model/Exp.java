

package com.Portfolio.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Exp {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long exp_id;
    private String titulo;
    private String empresa;
    private String about;
    
     @Temporal(TemporalType.DATE)
 //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date fecha_inicio;
    @Temporal(TemporalType.DATE)
    private Date fecha_finalizado;
    private String tipo_trabajo;

    private String url_img;
    
//    @ManyToOne
//    @JoinColumn(name ="persona_id")
//    private Persona persona_id;
//    @OneToOne
//    @JoinColumn(name ="tipo_id")
//    private Tipo_trabajo tipo_id;

    public Exp() {
    }

    public Exp(Long exp_id, String titulo, String empresa, String about, Date fecha_inicio, Date fecha_finalizado, String tipo_trabajo, String url_img) {
        this.exp_id = exp_id;
        this.titulo = titulo;
        this.empresa = empresa;
        this.about = about;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizado = fecha_finalizado;
        this.tipo_trabajo = tipo_trabajo;
        this.url_img = url_img;
    }

    

  

    

   

    
    
    
}
