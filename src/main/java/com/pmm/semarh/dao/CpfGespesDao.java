/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.dao;

import com.pmm.semarh.model.CpfGespes;
import com.pmm.semarh.model.Sexo;
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
public class CpfGespesDao {
    
    @PersistenceContext(name= "com.pmm_semarh_war_0.1PU")
    EntityManager em;
    
    public List<CpfGespes> getListaCpfGespes(){
        Query q = em.createQuery("from CpfGespes");
        return q.getResultList().subList(0, 10);
    }
}
