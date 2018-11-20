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

/**
 *
 * @author 08205268940
 */
@Entity
public class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_equipe;

    private String nome;
    
    @OneToMany(mappedBy="id_integrante")
    private List <Integrante> integrantes;
    
    @OneToMany(mappedBy="id_competicao")
    private List<Competicao> competicao_p;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public List<Competicao> getCompeticao_p() {
        return competicao_p;
    }

    public void setCompeticao_p(List<Competicao> competicao_p) {
        this.competicao_p = competicao_p;
    }

    
    
    public Long getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(Long id_equipe) {
        this.id_equipe = id_equipe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_equipe != null ? id_equipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_equipe fields are not set
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.id_equipe == null && other.id_equipe != null) || (this.id_equipe != null && !this.id_equipe.equals(other.id_equipe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.Equipe[ id=" + id_equipe + " ]";
    }
    
}
