
package com.Portfolio.DTO;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EduDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long persona_id;
    private Long edu_id;
    private String titulo;
    private String institucion;
    
    
}
