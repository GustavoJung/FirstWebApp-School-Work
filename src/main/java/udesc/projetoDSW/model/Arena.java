/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author 08205268940
 */
@Entity
public class Arena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_arena;

    private String nome;
    
    @ManyToOne
    private Competicao id_competicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Competicao getId_competicao() {
        return id_competicao;
    }

    public void setId_competicao(Competicao id_competicao) {
        this.id_competicao = id_competicao;
    }
    
    
    
    public Long getId_arena() {
        return id_arena;
    }

    public void setId_arena(Long id_arena) {
        this.id_arena = id_arena;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_arena != null ? id_arena.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_arena fields are not set
        if (!(object instanceof Arena)) {
            return false;
        }
        Arena other = (Arena) object;
        if ((this.id_arena == null && other.id_arena != null) || (this.id_arena != null && !this.id_arena.equals(other.id_arena))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.Arena[ id=" + id_arena + " ]";
    }
    
}
