/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.projetoDSW.model;

import java.io.Serializable;
import java.util.Date;
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
public class Juiz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_juiz;
    private String nome;
    private String cpf;
    private String rg;
    private Date data_nascimento;
    
    @ManyToOne
    private Categoria id_categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Categoria getCategoria_p() {
        return id_categoria;
    }

    public void setCategoria_p(Categoria categoria_p) {
        this.id_categoria = categoria_p;
    }
    
    
    public Long getId_juiz() {
        return id_juiz;
    }

    public void setId_juiz(Long id_juiz) {
        this.id_juiz = id_juiz;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_juiz != null ? id_juiz.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_juiz fields are not set
        if (!(object instanceof Juiz)) {
            return false;
        }
        Juiz other = (Juiz) object;
        if ((this.id_juiz == null && other.id_juiz != null) || (this.id_juiz != null && !this.id_juiz.equals(other.id_juiz))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.Juiz[ id=" + id_juiz + " ]";
    }
    
}
