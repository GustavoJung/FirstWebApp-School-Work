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
public class RodadaEquipe implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private Long idRodada;
    private int idem;
    private Long alternativa;
    
    @ManyToOne
    @JoinColumn(name = "Equipe_id")
    private Equipe equipe;
    
    @ManyToOne
    @JoinColumn(name = "Arena_id")
    private Arena arena;
    
    @ManyToOne
    @JoinColumn(name = "Sala_id")
    private Sala sala;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdRodada() {
        return idRodada;
    }

    public void setIdRodada(Long idRodada) {
        this.idRodada = idRodada;
    }

    public int getIdem() {
        return idem;
    }

    public void setIdem(int idem) {
        this.idem = idem;
    }

    public Long getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(Long alternativa) {
        this.alternativa = alternativa;
    }
    
    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }
    
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
}
