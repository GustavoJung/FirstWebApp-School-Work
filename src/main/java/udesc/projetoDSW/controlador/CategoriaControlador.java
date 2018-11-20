/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.controlador;

import org.springframework.data.jpa.repository.JpaRepository;
import udesc.projetoDSW.model.Categoria;

/**
 *
 * @author 08205268940
 */
public interface CategoriaControlador extends JpaRepository<Categoria,Long> {
    
}
