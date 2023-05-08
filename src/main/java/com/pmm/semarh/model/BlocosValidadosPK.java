/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ajuliano
 */
@Embeddable
public class BlocosValidadosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_blocos")
    private int idBlocos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "cod_cpf")
    private String codCpf;

    public BlocosValidadosPK() {
    }

    public BlocosValidadosPK(int idBlocos, String codCpf) {
        this.idBlocos = idBlocos;
        this.codCpf = codCpf;
    }

    public int getIdBlocos() {
        return idBlocos;
    }

    public void setIdBlocos(int idBlocos) {
        this.idBlocos = idBlocos;
    }

    public String getCodCpf() {
        return codCpf;
    }

    public void setCodCpf(String codCpf) {
        this.codCpf = codCpf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idBlocos;
        hash += (codCpf != null ? codCpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BlocosValidadosPK)) {
            return false;
        }
        BlocosValidadosPK other = (BlocosValidadosPK) object;
        if (this.idBlocos != other.idBlocos) {
            return false;
        }
        if ((this.codCpf == null && other.codCpf != null) || (this.codCpf != null && !this.codCpf.equals(other.codCpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pmm.semarh.model.BlocosValidadosPK[ idBlocos=" + idBlocos + ", codCpf=" + codCpf + " ]";
    }
    
}
