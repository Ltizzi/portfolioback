
package com.Portfolio.DTO;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SkillsDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private Long persona_id;
    private Long skill_id;
    private String skill_nombre;
    private String nivel;
    
    
    
}
