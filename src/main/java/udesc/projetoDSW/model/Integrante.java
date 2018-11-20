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
public class Integrante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_integrante;
    private String nome;
    private String rg;
    private String cpf;
    private Date data_nascimento;
    private String nome_pai;//opcional
    private String nome_mae;//obrigatório
    private boolean autorizacao_entregue;

    @ManyToOne
    private Equipe id_equipe;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public boolean isAutorizacao_entregue() {
        return autorizacao_entregue;
    }

    public void setAutorizacao_entregue(boolean autorizacao_entregue) {
        this.autorizacao_entregue = autorizacao_entregue;
    }

    public Equipe getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(Equipe id_equipe) {
        this.id_equipe = id_equipe;
    }

    
    public Long getId_integrante() {
        return id_integrante;
    }

    public void setId_integrante(Long id_integrante) {
        this.id_integrante = id_integrante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_integrante != null ? id_integrante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_integrante fields are not set
        if (!(object instanceof Integrante)) {
            return false;
        }
        Integrante other = (Integrante) object;
        if ((this.id_integrante == null && other.id_integrante != null) || (this.id_integrante != null && !this.id_integrante.equals(other.id_integrante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udesc.projetoDSW.model.Integrante[ id=" + id_integrante + " ]";
    }
    
}
