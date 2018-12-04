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
import udesc.projetoDSW.controlador.AlternativaControlador;
import udesc.projetoDSW.model.Alternativa;

/**
 *
 * @author 08205268940
 */
@RestController
@RequestMapping("/alternativas")
public class AlternativaRepositorio {
    
    @Autowired
    private AlternativaControlador alternativas;
    
    @GetMapping("/{id}")
    public Alternativa buscarId(@PathVariable Long id){
        return alternativas.getOne(id);
    }
    
    @GetMapping
    public List<Alternativa> findAll(){
        return alternativas.findAll();
    }
    @CrossOrigin(origins="*",allowedHeaders = "*")
    @PostMapping
    public Alternativa salvar(@RequestBody Alternativa alternativa){
        System.out.println("Entrou alterntivas");
        return alternativas.save(alternativa);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        alternativas.delete(alternativas.getOne(id));
    }
}
