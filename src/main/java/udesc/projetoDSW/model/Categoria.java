package udesc.projetoDSW.model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gustavo
 */
@Entity
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    
    //vincula o juíz com a categoria
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private Set<Juiz> Juizes;
    //vincula a missão a categoria
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private Set<Missoes> missoes;
    //vincula a sala com a categoria
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private Set<Sala> Salas;

   
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
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Set<Juiz> getJuiz() {
        return Juizes;
    }

    public void setJuiz(Set<Juiz> Juizes) {
        this.Juizes = Juizes;
    }
    
    public Set<Missoes> getMissoes() {
        return missoes;
    }

    public void setMissoes(Set<Missoes> missoes) {
        this.missoes = missoes;
    }
    
    public Set<Sala> getSala() {
        return Salas;
    }

    public void setSala(Set<Sala> Salas) {
        this.Salas = Salas;
    }
    
}
