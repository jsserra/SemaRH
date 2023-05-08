/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.model;

import com.pmm.semarh.converter.LocalDateTimeAttributeConverter;
import com.pmm.semarh.converter.LocalTimeConverter;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ajuliano
 */
@Entity
@Table(name = "autorizacoes")
public class Autorizacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "validacao")
    private String validacao;
    
    @Column(name = "dtregistro")
    private LocalDateTime dtregistro;

    @Column(name = "ip")
    private String ip;
    
    @Column(name = "referencia")
    private String referencia;
    
    @Column(name = "dataHora")
    private LocalDateTime dataHora;

    public Autorizacoes() {
    }

    public Autorizacoes(Integer id) {
        this.id = id;
    }

    public Autorizacoes(Integer id, String cpf, String validacao, LocalDateTime dtregistro, String ip, String referencia, LocalDateTime dataHora) {
        this.id = id;
        this.cpf = cpf;
        this.validacao = validacao;
        this.dtregistro = dtregistro;
        this.ip = ip;
        this.referencia = referencia;
        this.dataHora = dataHora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getValidacao() {
        return validacao;
    }

    public void setValidacao(String validacao) {
        this.validacao = validacao;
    }

    public LocalDateTime getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(LocalDateTime dtregistro) {
        this.dtregistro = dtregistro;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
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
        if (!(object instanceof Autorizacoes)) {
            return false;
        }
        Autorizacoes other = (Autorizacoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pmm.semarh.model.Autorizacoes[ id=" + id + " ]";
    }
    
}
