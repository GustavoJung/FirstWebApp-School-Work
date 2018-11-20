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
import javax.persistence.OneToOne;

/**
 *
 * @author 08205268940
 */
@Entity
public class Alternativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_alternativa;

    private int valor;
    @OneToOne
    private Missoes id_missoes;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Missoes getId_missoes() {
        return id_missoes;
    }

    public void setId_missoes(Missoes id_missoes) {
        this.id_missoes = id_missoes;
    }
    
    
    
    public Long getId_alternativa() {
        return id_alternativa;
    }

    public void setId_alternativa(Long id_alternativa) {
        this.id_alternativa = id_alternativa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_alternativa != null ? id_alternativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_alternativa fields are not set
        if (!(object instanceof Alternativa)) {
            return false;
        }
        Alternativa other = (Alternativa) object;
        if ((this.id_alternativa == null && other.id_alternativa != null) || (this.id_alternativa != null && !this.id_alternativa.equals(other.id_alternativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.Alternativa[ id=" + id_alternativa + " ]";
    }
    
}
