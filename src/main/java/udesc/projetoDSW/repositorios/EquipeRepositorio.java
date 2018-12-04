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
import udesc.projetoDSW.controlador.EquipeControlador;
import udesc.projetoDSW.model.Equipe;

/**
 *
 * @author mrcar
 */
@RestController
@RequestMapping("/equipes")
public class EquipeRepositorio {    
    @Autowired
    private EquipeControlador equipes;
    
    @GetMapping("/{id}")
    public Equipe buscarId(@PathVariable Long id){
        return equipes.getOne(id);
    }
    
@CrossOrigin(origins="*",allowedHeaders = "*")    
    @GetMapping
    public List<Equipe> findAll(){
        return equipes.findAll();
    }
    
    @CrossOrigin(origins="*",allowedHeaders = "*")
    @PostMapping
    public Equipe salvar(@RequestBody Equipe equipe){
        System.out.println("ENtrou");
        return equipes.save(equipe);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        equipes.delete(equipes.getOne(id));
    }}
