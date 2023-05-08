/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmm.semarh.ws.table;

import com.pmm.semarh.dao.LogradouroDao;
import com.pmm.semarh.model.Logradouro;
import com.pmm.semarh.ws.model.ModelLogradouroCEPWs;
import com.pmm.semarh.ws.model.ModelLogradouroWs;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ajuliano
 */
@Named
@Path("logradouro")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LogradouroWs {

    @EJB
    LogradouroDao daoLogradouro;
    

    @GET
    @Path("getListaLogradouro")
    public List<Logradouro> getListaLogradouro() {
        try {
            return daoLogradouro.getLogradouro();
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }

    @GET
    @Path("getListaLogradouroWs")
    public List<ModelLogradouroWs> getListaLogradouroWs() {
        try {
            List<Logradouro> list = daoLogradouro.getLogradouro();
            List<ModelLogradouroWs> mlw = list.stream().map(x -> new ModelLogradouroWs(x)).collect(Collectors.toList());
            return mlw;        //instrução lambda apartir java 8, 
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }
    
    @GET
    @Path("getListaLogradouroPorCEP/{cep}")
    public List<ModelLogradouroCEPWs> getListaLogradouroPorCEP(@PathParam("cep") String cep) {
        try {
            List<Logradouro> list = daoLogradouro.getLogradouroPorCEP(cep);
            List<ModelLogradouroCEPWs> mlw = list.stream().map(x -> new ModelLogradouroCEPWs(x)).collect(Collectors.toList());
            return mlw;        //instrução lambda apartir java 8, 
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }

 
    }
