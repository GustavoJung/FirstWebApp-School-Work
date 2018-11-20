/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import static net.bytebuddy.matcher.ElementMatchers.any;

/**
 *
 * @author 08205268940
 */
@Entity
public class Temporada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_temporada;
    private String nome;
    private String descricao;

    @OneToMany(mappedBy="id_competicao")
    private List<Competicao>competicoes;

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

    public List<Competicao> getCompeticoes() {
        return competicoes;
    }

    public void setCompeticoes(List<Competicao> competicoes) {
        this.competicoes = competicoes;
    }
    
    
    
    public Long getId_temporada() {
        return id_temporada;
    }

    public void setId_temporada(Long id_temporada) {
        this.id_temporada = id_temporada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_temporada != null ? id_temporada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_temporada fields are not set
        if (!(object instanceof Temporada)) {
            return false;
        }
        Temporada other = (Temporada) object;
        if ((this.id_temporada == null && other.id_temporada != null) || (this.id_temporada != null && !this.id_temporada.equals(other.id_temporada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.Temporada[ id=" + id_temporada + " ]";
    }
    
}
