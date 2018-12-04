/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.repositorios;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
import udesc.projetoDSW.controlador.CompeticaoControlador;
import udesc.projetoDSW.model.Competicao;

/**
 *
 * @author 08205268940
 */
@RestController
@RequestMapping("/competicoes")
public class CompeticaoRepositorio {
    
    @Autowired
    private CompeticaoControlador competicoes;
    
    @GetMapping("/{id}")
    public Competicao buscarId(@PathVariable Long id){
        return competicoes.getOne(id);
    }
    
    @JsonIgnore
    @CrossOrigin(origins="*",allowedHeaders = "*")
    @GetMapping
    public List<Competicao> findAll(){
        return competicoes.findAll();
    }
    @CrossOrigin(origins="*",allowedHeaders = "*")
    @PostMapping
    public Competicao salvar(@RequestBody Competicao competicao){
        System.out.println("ENtrou");
        return competicoes.save(competicao);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        competicoes.delete(competicoes.getOne(id));
    }
}
