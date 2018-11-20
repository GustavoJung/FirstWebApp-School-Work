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
import javax.persistence.OneToOne;

/**
 *
 * @author 08205268940
 */
@Entity
public class Missoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_missoes;
    private String nome;
    private String descricao;
   
    
     
    @ManyToOne
    private Categoria id_categoria;
    
    @OneToOne
    private Alternativa id_alternativas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria_p() {
        return id_categoria;
    }

    public void setCategoria_p(Categoria categoria_p) {
        this.id_categoria = categoria_p;
    }

    public Alternativa getAlternativas() {
        return id_alternativas;
    }

    public void setAlternativas(Alternativa alternativas) {
        this.id_alternativas = alternativas;
    }

    public Long getId_missoes() {
        return id_missoes;
    }

    public void setId_missoes(Long id_missoes) {
        this.id_missoes = id_missoes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_missoes != null ? id_missoes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_missoes fields are not set
        if (!(object instanceof Missoes)) {
            return false;
        }
        Missoes other = (Missoes) object;
        if ((this.id_missoes == null && other.id_missoes != null) || (this.id_missoes != null && !this.id_missoes.equals(other.id_missoes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.Missoes[ id=" + id_missoes + " ]";
    }
    
}
