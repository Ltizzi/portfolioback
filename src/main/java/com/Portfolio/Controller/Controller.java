
package com.Portfolio.Controller;
import com.Portfolio.Model.Edu;
import com.Portfolio.Model.Exp;
import com.Portfolio.Model.Persona;
import com.Portfolio.Model.Skills;

import com.Portfolio.Service.IEduService;
import com.Portfolio.Service.IExpService;
import com.Portfolio.Service.IPersonaService;
import com.Portfolio.Service.ISkillsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {
    
    //autowired services
    
    @Autowired
    private IPersonaService persoServ;
    
    @Autowired
    private IExpService expServ;
    
    @Autowired
    private IEduService eduServ;
    
    @Autowired
    private ISkillsService skillServ;
    
//    @Autowired
//    private ITIpo_trabajoService tipoServ;
      

    
    //Persona
   @CrossOrigin
   @PostMapping ("/persona/new")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @CrossOrigin
    @GetMapping ("/persona/ver")
    @ResponseBody
    public List<Persona> verPersonas() {
      
          return persoServ.verPersonas();
    
    }
     
   @CrossOrigin
    @DeleteMapping ("/persona/delete")
    public void borrarPersona (@RequestParam Long id) {
        persoServ.borrarPersona(id);
    }
     
    @CrossOrigin 
    @GetMapping ("/persona/buscar")
    @ResponseBody
    public Persona buscarPersona(@RequestParam Long id) {
        return persoServ.buscarPersona(id);
    }
     
    @CrossOrigin
    @PatchMapping ("/persona/edit")
    public void editarPersona (@RequestBody Persona pers, @RequestParam Long id) {
        persoServ.editarPersona(pers);
    }
    
    // Exps
     
      @CrossOrigin
     @PostMapping ("/exp/new")
    public void agregarExp (@RequestBody Exp exp) {
        expServ.crearExp(exp);
    }
     
    @CrossOrigin
    @GetMapping ("/exp/ver")
    @ResponseBody
    public List<Exp> verExps() {
      
          return expServ.verExps();
    
    }
     
   @CrossOrigin
    @DeleteMapping ("/exp/delete")
    public void borrarExp (@RequestParam Long id) {
        expServ.borrarExp(id);
    }
     
   @CrossOrigin
    @GetMapping ("/exp/buscar")
    @ResponseBody
    public Exp buscarExp(@RequestParam Long id) {
        return expServ.buscarExp(id);
    }
     
  @CrossOrigin
    @PatchMapping ("/exp/edit")
    public void editarExp (@RequestBody Exp exp, @RequestParam Long id) {
        expServ.editarExp(exp);
    }
    
    //Edu
     
   @CrossOrigin
     @PostMapping ("/edu/new")
    public void agregarEdu (@RequestBody Edu edu) {
        eduServ.crearEdu(edu);
    }
     
   @CrossOrigin
    @GetMapping ("/edu/ver")
    @ResponseBody
    public List<Edu> verEdus() {
      
          return eduServ.verEdus();
    
    }
     
 @CrossOrigin
    @DeleteMapping ("/edu/delete")
    public void borrarEdu (@RequestParam Long id) {
        eduServ.borrarEdu(id);
    }
     
    @CrossOrigin
    @GetMapping ("/edu/buscar")
    @ResponseBody
    public Edu buscarEdu(@RequestParam Long id) {
        return eduServ.buscarEdu(id);
    }
     
   @CrossOrigin
    @PatchMapping ("/edu/edit")
    public void editarEdu (@RequestBody Edu edu, @RequestParam Long id) {
        eduServ.editarEdu(edu);
    }
    
    //Skills
     
    @CrossOrigin
       @PostMapping ("/skill/new")
    public void agregarSkill (@RequestBody Skills skill) {
        skillServ.crearSkill(skill);
    }
     
    @CrossOrigin 
    @GetMapping ("/skill/ver")
    @ResponseBody
    public List<Skills> verSkills() {
      
          return skillServ.verSkills();
    
    }
     
   @CrossOrigin
    @DeleteMapping ("/skill/delete")
    public void borrarSkill (@RequestParam Long id) {
        skillServ.borrarSkill(id);
    }
     
    @CrossOrigin
    @GetMapping ("skill/buscar")
    @ResponseBody
    public Skills buscarSkill(@RequestParam Long id) {
        return skillServ.buscarSkill(id);
    }
     
    @CrossOrigin
    @PatchMapping ("/skill/edit")
    public void editarSkill (@RequestBody Skills skill, @RequestParam Long id) {
        skillServ.editarSkill(skill);
    }
    
    // tipo trabajo
//    
//        @PostMapping ("/new/tipo")
//    public void agregarTipo (@RequestBody Tipo_trabajo tipo) {
//        tipoServ.crearTipo(tipo);
//    }
//    
//    @GetMapping ("/ver/tipos")
//    @ResponseBody
//    public List<Tipo_trabajo> verTipos() {
//      
//          return tipoServ.verSkills();
//    
//    }
//    
//    @DeleteMapping ("/delete/tipo")
//    public void borrarTipo (@RequestParam Long id) {
//        tipoServ.borrarTipo(id);
//    }
//    
//    @GetMapping ("buscar/tipo")
//    @ResponseBody
//    public Tipo_trabajo buscarTipo(@RequestParam Long id) {
//        return tipoServ.buscarTipo(id); 
//    }
//    
//    @PutMapping ("/edit/tipo")
//    public void editarTipo (@RequestBody Tipo_trabajo tipo) {
//     
//          tipoServ.editarTipo(tipo);
//    }
//    
//    
    
    
    // DTOs
    
//    @GetMapping ("/trabajo/{id}")
//    @ResponseBody
//    public ExpDTO getTrabajo(@PathVariable Long id) {
//        
//        Exp exp = expServ.buscarExp(id);
//        Tipo_trabajo tipo = tipoServ.buscarTipo(id);
//     
//        
//    
//        ExpDTO expDTO = new ExpDTO();
//        
//        expDTO.setExp_id(exp.getExp_id());
//        expDTO.setTitulo(exp.getTitulo());
//        expDTO.setEmpresa(exp.getEmpresa());
//        expDTO.setTipo_trabajo(tipo.getTipo_trabajo());
//        
//        return expDTO;
//        
//    }
    
//    @GetMapping ("/persona/skills/{id}")
//    @ResponseBody
//    
//    public SkillsDTO getHabilidades(@PathVariable Long id) {
//        
//        Skills skill = skillServ.buscarSkill(id);
//        Persona per = persoServ.buscarPersona(id);
//        
//        SkillsDTO skDTO = new SkillsDTO();
//        
//        skDTO.setSkill_id(skill.getSkill_id());
//        skDTO.setPersona_id(per.getPersona_id());
//        skDTO.setSkill_nombre(skill.getSkill_nombre());
//        skDTO.setNivel(skill.getNivel());
//        
//        return skDTO;
//    
//    }
//    
//    @GetMapping ("/persona/educacion/{id}")
//    @ResponseBody
//    
//    public EduDTO getEducacion(@PathVariable Long id) {
//        
//        Edu edu = eduServ.buscarEdu(id);
//        Persona per = persoServ.buscarPersona(id);
//        
//        EduDTO eDTO = new EduDTO();
//        
//        eDTO.setEdu_id(edu.getEdu_id());
//        eDTO.setPersona_id(per.getPersona_id());
//        eDTO.setTitulo(edu.getTitulo());
//        eDTO.setInstitucion(edu.getInstitucion());
//    
//    }
    
}
