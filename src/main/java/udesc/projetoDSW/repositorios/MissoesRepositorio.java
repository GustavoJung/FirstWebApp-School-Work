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
import udesc.projetoDSW.controlador.MissoesControlador;
import udesc.projetoDSW.model.Missoes;

/**
 *
 * @author 08205268940
 */
@RestController
@RequestMapping("/missoes")
public class MissoesRepositorio {
    
    @Autowired
    private MissoesControlador missoes;
    
    @GetMapping("/{id}")
    public Missoes buscarId(@PathVariable Long id){
        return missoes.getOne(id);
    }
    
    @GetMapping
    public List<Missoes> findAll(){
        return missoes.findAll();
    }
    @CrossOrigin(origins="*",allowedHeaders = "*")
    @PostMapping
    public Missoes salvar(@RequestBody Missoes missao){
        System.out.println("ENtrou");
        return missoes.save(missao);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        missoes.delete(missoes.getOne(id));
    }
}
