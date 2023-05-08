/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.dao;

import com.pmm.semarh.model.TipoCNH;
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
public class TipoCNHDao {
    
    @PersistenceContext(name= "com.pmm_semarh_war_0.1PU")
    EntityManager em;
    
    
    public List<TipoCNH> getListaTipoCNH(){
        Query q = em.createQuery("from TipoCNH");
        return q.getResultList();
    }
}
