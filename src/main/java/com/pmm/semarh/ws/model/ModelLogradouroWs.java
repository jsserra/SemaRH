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
public class ModelLogradouroWs {
    
    private String nome;
    
    public ModelLogradouroWs(){
    }

    public ModelLogradouroWs(Logradouro logradouro) {
        this.nome = logradouro.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
    
    
