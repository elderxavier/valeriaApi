package br.com.elderxavier.apivaleria.controller;

import br.com.elderxavier.apivaleria.dao.UsuariosAdminDao;
import br.com.elderxavier.apivaleria.model.UsuariosAdmin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {   
    
    @Autowired
    UsuariosAdminDao repository;
    
    @RequestMapping("/index")
    public String index() {                
        return "index";
        
    }    
    
    @RequestMapping("/hello")
    public String hello() {        
        System.out.println("hello");
        return "hello";
        
    }    
    
    @RequestMapping("/usuarios")
    public List<UsuariosAdmin> usuario() {        
        return repository.findAll();
        
    }   
    
    
    /*@RequestMapping("/dist/{resources}")
    public String resources(@PathVariable("resources") String resources) {        
        return "dist/"+ resources;
    }*/
}
