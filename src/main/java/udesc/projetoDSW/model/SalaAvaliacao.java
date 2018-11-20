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
public class SalaAvaliacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_salaAvaliacao;
    private String nome;

    @ManyToOne
    private Competicao id_competicao;
    @ManyToOne
    private Categoria id_categoria;

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

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    public Long getId_salaAvaliacao() {
        return id_salaAvaliacao;
    }

    public void setId_salaAvaliacao(Long id_salaAvaliacao) {
        this.id_salaAvaliacao = id_salaAvaliacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_salaAvaliacao != null ? id_salaAvaliacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_salaAvaliacao fields are not set
        if (!(object instanceof SalaAvaliacao)) {
            return false;
        }
        SalaAvaliacao other = (SalaAvaliacao) object;
        if ((this.id_salaAvaliacao == null && other.id_salaAvaliacao != null) || (this.id_salaAvaliacao != null && !this.id_salaAvaliacao.equals(other.id_salaAvaliacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.SalaAvaliacao[ id=" + id_salaAvaliacao + " ]";
    }
    
}
