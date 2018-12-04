/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.repositorios;

import java.util.ArrayList;
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
import udesc.projetoDSW.controlador.IntegranteControlador;
import udesc.projetoDSW.model.Integrante;

/**
 *
 * @author 08205268940
 */
@RestController
@RequestMapping("/integrantes")
public class IntegranteRepositorio{
    
    @Autowired
   private IntegranteControlador controler;
    
    @GetMapping("/{id}")
    public Integrante buscarId(@PathVariable Long id){
        return controler.getOne(id);
    }
    
    @GetMapping
    public List<Integrante> findAll(){
        return controler.findAll();
    }
    @CrossOrigin(origins="*",allowedHeaders = "*")
    @PostMapping
    public Integrante salvar(@RequestBody Integrante integrante){
        System.out.println("ENtrou integrante");
        return controler.save(integrante);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        controler.delete(controler.getOne(id));
    }
}
