package udesc.projetoDSW.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class Missoes implements Serializable {

    private static final long serialVersionUID = 1L;
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    
    //vincula a categoria a missão
    @ManyToOne
    @JoinColumn(name = "Categoria_id")
    private Categoria categoria;
    
    @OneToMany(mappedBy = "missoes", cascade = CascadeType.ALL)
    private Set<Alternativa> Alternativas;

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
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Set<Alternativa> getAlternativas() {
        return Alternativas;
    }

    public void setAlternativas(Set<Alternativa> Alternativas) {
        this.Alternativas = Alternativas;
    }

}
