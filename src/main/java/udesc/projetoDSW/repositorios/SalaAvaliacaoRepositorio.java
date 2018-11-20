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
import udesc.projetoDSW.controlador.SalaAvaliacaoControlador;
import udesc.projetoDSW.model.Integrante;
import udesc.projetoDSW.model.SalaAvaliacao;

/**
 *
 * @author 08205268940
 */
@RestController
@RequestMapping("/salaAvaliacao")
public class SalaAvaliacaoRepositorio {
    
    @Autowired
    private SalaAvaliacaoControlador salasAvaliacao;
    
    @GetMapping("/{id}")
    public SalaAvaliacao buscarId(@PathVariable Long id){
        return salasAvaliacao.getOne(id);
    }
    
    @GetMapping
    public List<SalaAvaliacao> findAll(){
        return salasAvaliacao.findAll();
    }
    
    @PostMapping
    public SalaAvaliacao salvar(@RequestBody SalaAvaliacao salaAvaliacao){
        System.out.println("ENtrou");
        return salasAvaliacao.save(salaAvaliacao);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        salasAvaliacao.delete(salasAvaliacao.getOne(id));
    }
}
