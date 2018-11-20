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
import udesc.projetoDSW.controlador.CategoriaControlador;
import udesc.projetoDSW.model.Categoria;

/**
 *
 * @author 08205268940
 */

@RestController
@RequestMapping("/categorias")
public class CategoriaRepositorio {
    
    @Autowired
    private CategoriaControlador categorias;
    
    @GetMapping("/{id}")
    public Categoria buscarId(@PathVariable Long id){
        return categorias.getOne(id);
    }
    
    @GetMapping
    public List<Categoria> findAll(){
        return categorias.findAll();
    }
    
    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria){
        System.out.println(categoria.toString());
        return categorias.save(categoria);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        categorias.delete(categorias.getOne(id));
    }
}
