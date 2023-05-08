/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ajuliano
 */
@Entity
@Table(name = "blocos")
@NamedQueries({
    @NamedQuery(name = "Blocos.findAll", query = "SELECT b FROM Blocos b"),
    @NamedQuery(name = "Blocos.findById", query = "SELECT b FROM Blocos b WHERE b.id = :id"),
    @NamedQuery(name = "Blocos.findByNome", query = "SELECT b FROM Blocos b WHERE b.nome = :nome"),
    @NamedQuery(name = "Blocos.findByDataHora", query = "SELECT b FROM Blocos b WHERE b.dataHora = :dataHora"),
    @NamedQuery(name = "Blocos.findByAtivo", query = "SELECT b FROM Blocos b WHERE b.ativo = :ativo")})
public class Blocos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ativo")
    private boolean ativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "blocos")
    private Collection<BlocosValidados> blocosValidadosCollection;

    public Blocos() {
    }

    public Blocos(Integer id) {
        this.id = id;
    }

    public Blocos(Integer id, String nome, Date dataHora, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.dataHora = dataHora;
        this.ativo = ativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Collection<BlocosValidados> getBlocosValidadosCollection() {
        return blocosValidadosCollection;
    }

    public void setBlocosValidadosCollection(Collection<BlocosValidados> blocosValidadosCollection) {
        this.blocosValidadosCollection = blocosValidadosCollection;
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
        if (!(object instanceof Blocos)) {
            return false;
        }
        Blocos other = (Blocos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pmm.semarh.model.Blocos[ id=" + id + " ]";
    }
    
}
