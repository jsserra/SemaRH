/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ajuliano
 */
@Entity
@Table(name = "blocosValidados")
@NamedQueries({
    @NamedQuery(name = "BlocosValidados.findAll", query = "SELECT b FROM BlocosValidados b"),
    @NamedQuery(name = "BlocosValidados.findByIdBlocos", query = "SELECT b FROM BlocosValidados b WHERE b.blocosValidadosPK.idBlocos = :idBlocos"),
    @NamedQuery(name = "BlocosValidados.findByCodCpf", query = "SELECT b FROM BlocosValidados b WHERE b.blocosValidadosPK.codCpf = :codCpf"),
    @NamedQuery(name = "BlocosValidados.findByDataHora", query = "SELECT b FROM BlocosValidados b WHERE b.dataHora = :dataHora")})
public class BlocosValidados implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BlocosValidadosPK blocosValidadosPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @JoinColumn(name = "id_blocos", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Blocos blocos;
    @JoinColumn(name = "cod_cpf", referencedColumnName = "COD_CPF", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CpfGespes cpfGespes;

    public BlocosValidados() {
    }

    public BlocosValidados(BlocosValidadosPK blocosValidadosPK) {
        this.blocosValidadosPK = blocosValidadosPK;
    }

    public BlocosValidados(BlocosValidadosPK blocosValidadosPK, Date dataHora) {
        this.blocosValidadosPK = blocosValidadosPK;
        this.dataHora = dataHora;
    }

    public BlocosValidados(int idBlocos, String codCpf) {
        this.blocosValidadosPK = new BlocosValidadosPK(idBlocos, codCpf);
    }

    public BlocosValidadosPK getBlocosValidadosPK() {
        return blocosValidadosPK;
    }

    public void setBlocosValidadosPK(BlocosValidadosPK blocosValidadosPK) {
        this.blocosValidadosPK = blocosValidadosPK;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Blocos getBlocos() {
        return blocos;
    }

    public void setBlocos(Blocos blocos) {
        this.blocos = blocos;
    }

    public CpfGespes getCpfGespes() {
        return cpfGespes;
    }

    public void setCpfGespes(CpfGespes cpfGespes) {
        this.cpfGespes = cpfGespes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blocosValidadosPK != null ? blocosValidadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BlocosValidados)) {
            return false;
        }
        BlocosValidados other = (BlocosValidados) object;
        if ((this.blocosValidadosPK == null && other.blocosValidadosPK != null) || (this.blocosValidadosPK != null && !this.blocosValidadosPK.equals(other.blocosValidadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pmm.semarh.model.BlocosValidados[ blocosValidadosPK=" + blocosValidadosPK + " ]";
    }
    
}
