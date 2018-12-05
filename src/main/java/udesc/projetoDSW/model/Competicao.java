package udesc.projetoDSW.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author gustavo
 */
@Entity
public class Competicao implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cidade;
    private String estado;
    private Date data;
    private String Responsavel;
    private String tipo;
    //vincula a temporada com a competicao
    @ManyToOne
    @JoinColumn(name = "Temporada_id")
    private Temporada temporada;
    //vincula a arena com a competição
    @OneToMany(mappedBy = "competicao", cascade = CascadeType.ALL)
    private Set<Arena> Arenas;
    //vincula a equipe com a competição
    @OneToMany(mappedBy = "competicao", cascade = CascadeType.ALL)
    private Set<Equipe> Equipes;
    //vincula a sala com a competição
    @OneToMany(mappedBy = "competicao", cascade = CascadeType.ALL)
    private Set<Sala> Salas;
    //vincula as rodadas com a competição
    @OneToMany(mappedBy = "competicao", cascade = CascadeType.ALL)
    private Set<Rodada> Rodadas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }
    
    public Set<Arena> getArenas() {
        return Arenas;
    }

    public void setArenas(Set<Arena> Arenas) {
        this.Arenas = Arenas;
    }
    
    public Set<Equipe> getEquipes() {
        return Equipes;
    }

    public void setEquipes(Set<Equipe> Equipes) {
        this.Equipes = Equipes;
    }
    
    public Set<Sala> getSalas() {
        return Salas;
    }

    public void setSalas(Set<Sala> Salas) {
        this.Salas = Salas;
    }
    
    
    public Set<Rodada> getRodadas() {
        return Rodadas;
    }

    public void setRodadas(Set<Rodada> Rodadas) {
        this.Rodadas = Rodadas;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Competicao)) {
            return false;
        }
        Competicao other = (Competicao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.CompeticaoRobotica.CompeticaoRobotica.models.Competicao[ id=" + id + " ]";
    }
    
}
