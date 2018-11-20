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
import udesc.projetoDSW.controlador.ArenaControlador;
import udesc.projetoDSW.model.Arena;

/**
 *
 * @author 08205268940
 */

@RestController
@RequestMapping("/arenas")
public class ArenaRepositorio {
    
    @Autowired
    private ArenaControlador arenas;
    @GetMapping("/{id}")
    public Arena buscarId(@PathVariable Long id){
        return arenas.getOne(id);
    }
    
    @GetMapping
    public List<Arena> findAll(){
        return arenas.findAll();
    }
    
    @PostMapping
    public Arena salvar(@RequestBody Arena arena){
        System.out.println("ENtrou");
        return arenas.save(arena);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        arenas.delete(arenas.getOne(id));
    }
}
