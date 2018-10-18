package br.com.elderxavier.apivaleria.controller;

import br.com.elderxavier.apivaleria.model.UsuariosAdmin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.elderxavier.apivaleria.repository.UsuariosAdminRepository;

@RestController
@RequestMapping("/usuario")
public class AdminController {   
    
    @Autowired
    UsuariosAdminRepository repository;
    
    @RequestMapping("/index")
    public String index() {                
        return "index";
        
    }    
    
    @RequestMapping("/hello")
    public String hello() {        
        System.out.println("hello");
        return "hello";
        
    }    
    
    @RequestMapping("/listar")
    public List<UsuariosAdmin> usuario() {        
        return repository.findAll();        
    }   
    
    
    /*@RequestMapping("/dist/{resources}")
    public String resources(@PathVariable("resources") String resources) {        
        return "dist/"+ resources;
    }*/
}
