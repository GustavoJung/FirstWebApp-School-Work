/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.repositorios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udesc.projetoDSW.controlador.JuizControlador;
import udesc.projetoDSW.model.Juiz;

/**
 *
 * @author 08205268940
 */
@RestController
@RequestMapping("/juizes")
public class JuizRepositorio {
    
    @Autowired
    private JuizControlador juizes;
    
    @GetMapping("/{id}")
    public Juiz buscarId(@PathVariable Long id){
        return  juizes.getOne(id);
    }
    
    @GetMapping
    public List<Juiz> findAll(){
        return juizes.findAll();
    }
    @CrossOrigin(origins="*",allowedHeaders = "*")
    @PostMapping
    public Juiz salvar(@RequestBody Juiz juiz){
        System.out.println("ENtrou");
        return juizes.save(juiz);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        juizes.delete(juizes.getOne(id));
    }
}
