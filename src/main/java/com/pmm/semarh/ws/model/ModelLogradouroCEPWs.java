/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.ws.model;

import com.pmm.semarh.model.Logradouro;

/**
 *
 * @author ajuliano
 */
public class ModelLogradouroCEPWs {
    
    private String logradouro;
    private String bairro; 
    private Integer idBairro;
    private String cidade;
    private Integer idCidade;
    private String estado;
    private String uf;
    private Integer idEstado;
    
    public ModelLogradouroCEPWs(){
    }

    public ModelLogradouroCEPWs(Logradouro l) {
        this.logradouro = l.getNome();
        this.bairro = l.getBairros().getNome();
        this.cidade = l.getBairros().getIdCidade().getNome();
        this.estado = l.getBairros().getIdCidade().getIdEstado().getNome();
        this.uf = l.getBairros().getIdCidade().getIdEstado().getUf();
                //Setando os ids
        this.idBairro = l.getBairros().getId();
        this.idCidade = l.getBairros().getIdCidade().getId();
        this.idEstado = l.getBairros().getIdCidade().getIdEstado().getId();
        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(Integer idBairro) {
        this.idBairro = idBairro;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    

}
