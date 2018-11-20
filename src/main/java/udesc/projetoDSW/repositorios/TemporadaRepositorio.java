/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.repositorios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udesc.projetoDSW.controlador.TemporadaControlador;
import udesc.projetoDSW.model.Temporada;

/**
 *
 * @author 08205268940
 */
@RestController
@RequestMapping("/temporadas")
public class TemporadaRepositorio {    
    @Autowired
    private TemporadaControlador temporadas;
    
    @GetMapping("/{id}")
    public Temporada buscarId(@PathVariable Long id){
        return temporadas.getOne(id);
    }
    
    @GetMapping
    public List<Temporada> findAll(){
        return temporadas.findAll();
    }
    
    @PostMapping
    public Temporada salvar(@RequestBody Temporada temporada){
        System.out.println("ENtrou");
        return temporadas.save(temporada);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        temporadas.delete(temporadas.getOne(id));
    }
    
}
