package br.com.elderxavier.apivaleria.controller;

import br.com.elderxavier.apivaleria.model.ProdutoTipo;
import br.com.elderxavier.apivaleria.repository.ProdutoTipoRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto_tipo")
public class ProdutoTipoController {
    
    @Autowired
    ProdutoTipoRepository produtoTipoRepository;
    
    @GetMapping("")
    public String index(){
        return "Api produto_tipo";
    }    
    
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
    public List<ProdutoTipo> listar(@RequestParam String token){
        List<ProdutoTipo> retlist = produtoTipoRepository.findAll();          
        for(ProdutoTipo p : retlist){
            if(p.getDeletado() == 1){
                retlist.remove(p);
            }
        }
        return retlist;
    }    
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
    public ProdutoTipo getItem(@PathVariable(value = "id") Long id, @RequestParam String token){    
        ProdutoTipo produtotipo = null;
        if(token.equals("123") ){
             produtotipo = produtoTipoRepository.findById(id).orElse(null);             
             //produtoTipoRepository.
                     
        }
        if( produtotipo == null || produtotipo.getDeletado() == 1){
            produtotipo = new ProdutoTipo();
        } 
        return produtotipo;
    }    
    
    @RequestMapping(value = "", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
    public ProdutoTipo addItem(@Valid @RequestBody ProdutoTipo produtotipo, @RequestParam String token){     
        ProdutoTipo produtotiporet = produtoTipoRepository.save(produtotipo);        
        return produtotiporet;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
    public ProdutoTipo updateItem(@PathVariable(value = "id") Long id, @Valid @RequestBody ProdutoTipo produtotipo, @RequestParam String token){        
        ProdutoTipo produtotiporet = produtoTipoRepository.findById(id).orElse(null);        
        if( produtotiporet == null){
            produtotipo = new ProdutoTipo();
        }else{
            produtotiporet.setDescricao( produtotipo.getDescricao());
            produtotiporet.setId_produto_tipo_pai( produtotipo.getId_produto_tipo_pai() );
            produtotiporet.setVisivel( produtotipo.getVisivel() );            
            produtotiporet = produtoTipoRepository.save(produtotipo);
        }
        return produtotipo;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
    public ProdutoTipo deleteItem(@PathVariable(value = "id") Long id, @RequestParam String token){        
        ProdutoTipo produtotiporet = produtoTipoRepository.findById(id).orElse(null);        
        produtotiporet.setDeletado(1);
        produtoTipoRepository.save(produtotiporet);
        return produtotiporet;
    }
}
