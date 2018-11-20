/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author 08205268940
 */
@Entity
public class Competicao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_competicao;

    private String cidade;
    private String estado;
    private Date data;
    private String responsavel;
    private String tipo;//Nacional or Regional
   
    @OneToMany(mappedBy="id_arena", targetEntity = Arena.class)
    private List<Arena> arenas;
    
    @OneToMany(mappedBy="id_salaAvaliacao")
    private List<SalaAvaliacao> salas_avalicao;
    
    @ManyToOne
    private Temporada temporada_p;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Arena> getArenas() {
        return arenas;
    }

    public void setArenas(List<Arena> arenas) {
        this.arenas = arenas;
    }

    public List<SalaAvaliacao> getSalas_avalicao() {
        return salas_avalicao;
    }

    public void setSalas_avalicao(List<SalaAvaliacao> salas_avalicao) {
        this.salas_avalicao = salas_avalicao;
    }

    public Temporada getTemporada_p() {
        return temporada_p;
    }

    public void setTemporada_p(Temporada temporada_p) {
        this.temporada_p = temporada_p;
    }

    
    
    public Long getId_competicao() {
        return id_competicao;
    }

    public void setId_competicao(Long id_competicao) {
        this.id_competicao = id_competicao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_competicao != null ? id_competicao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_competicao fields are not set
        if (!(object instanceof Competicao)) {
            return false;
        }
        Competicao other = (Competicao) object;
        if ((this.id_competicao == null && other.id_competicao != null) || (this.id_competicao != null && !this.id_competicao.equals(other.id_competicao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.Competicao[ id=" + id_competicao + " ]";
    }
    
}
