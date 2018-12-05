package udesc.projetoDSW.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author gustavo
 */
@Entity
public class Temporada implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String Descricao;
    
    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Competicao> Competicaos;
    
    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL)
    private Set<Rodada> Rodadas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    public Set<Competicao> getCompeticao() {
        return Competicaos;
    }

    public void setCompeticao(Set<Competicao> Competicaos) {
        this.Competicaos = Competicaos;
    }
    
    public Set<Rodada> getRodadas() {
        return Rodadas;
    }

    public void setRodadas(Set<Rodada> Rodadas) {
        this.Rodadas = Rodadas;
    }

    
}
