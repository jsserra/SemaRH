/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.dao;

import com.pmm.semarh.model.Logradouro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ajuliano
 */
@Stateless
public class LogradouroDao {

    @PersistenceContext
    EntityManager em;

    public List<Logradouro> getLogradouro() {
        Query q = em.createQuery("select l from Logradouro l");
        //return q.getResultList();
        return q.setMaxResults(10).getResultList();
    }
    
    public List<Logradouro> getLogradouroPorCEP (String cep) {
        Query q = em.createQuery("select l from Logradouro l where l.cep like :cep");
        q.setParameter("cep", cep);
        return q.getResultList();
    }          
    
}
