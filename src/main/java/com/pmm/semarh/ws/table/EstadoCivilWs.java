/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmm.semarh.ws.table;
import com.pmm.semarh.dao.EstadoCivilDao;
import com.pmm.semarh.model.EstadoCivil;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author acg
 */
/*
Para acessar o caminho é: http://localhost:8080/SpvWs/rest/webservice/******
 */
@Named
@Path("estadocivilws")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstadoCivilWs {

    @EJB
    EstadoCivilDao daoEstadoCivil;
    

    @GET
    @Path("getListaEstadoCivil")
    public List<EstadoCivil> getListaEstadoCivil(@Context HttpHeaders headers, @Context HttpServletRequest request) {

        try {
        //    Integer idUserMenu = 1;
       //     daoUserLog.criarLog("Lista de Sexos", "Listar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return daoEstadoCivil.getListaEstadoCivil();
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }


    
   /* @GET
    @Path("getListaCargoGeral")
    public List<CargoGeral> getListaCargoGeral(@Context HttpHeaders headers, @Context HttpServletRequest request) {

        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("Lista de Cargos", "Listar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return daoCargoGeral.getCargosGeral();
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }
    
    @GET
    @Path("getListaModelCargoGeral")
    public List<ModelCargoGeralWs> getListaModelCargoGeral(@Context HttpHeaders headers, @Context HttpServletRequest request) {

        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("Lista de Cargos", "Listar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return daoCargoGeral.getListaModelCargoGeral();
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }
    
    @GET
    @Path("getListaCargoGeralPorNome/{nome: [^/]*?}")
    public List<CargoGeral> getListaCargoGeralPorNome(@PathParam("nome") String nome, @Context HttpHeaders headers, @Context HttpServletRequest request) {

        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("getListaCargoGeralPorNome", "Listar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return daoCargoGeral.getListaCargoGeralPorNome(nome);
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }
    
    @GET
    @Path("getListaModelCargoGeralPorNome/{nome: [^/]*?}")
    public List<ModelCargoGeralWs> getListaModelCargoGeralPorNome(@PathParam("nome") String nome, @Context HttpHeaders headers, @Context HttpServletRequest request) {

        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("getListaCargoGeralPorNome", "Listar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return daoCargoGeral.getListaModelCargoGeralPorNome(nome);
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }
    
    @GET
    @Path("getListAtribuicoesCargoPorIdCargoGeral/{id: [^/]*?}")
    public List<ModelAtribuicoesCargoWs> getListAtribuicoesCargoPorIdCargoGeral(@PathParam("id") String id, @Context HttpHeaders headers, @Context HttpServletRequest request) {

        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("getListAtribuicoesCargoPorIdCargoGeral", "Listar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return ModelAtribuicoesCargoWs.toModelAtribuicoesCargoWs1(daoAtribuicoesCargoDao.getListAtribuicoesCargoPorIdCargoGeral(id));
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }
    
    
    @GET
    @Path("getListaCargoGeralUsuario")
    public List<CargoGeral> getListaLotacaoUsuario(@Context HttpHeaders headers, @Context HttpServletRequest request) {
        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("ListaCargoGeralUsuario", "Listar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return daoCargoGeral.getListCargosGeralUsuario(headers.getRequestHeader("chave").get(0));
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }  

    @GET
    @Path("getListaCargoMult/{nome: [^/]*?}/{horaSemanal: [^/]*?}")
    public List<Cargo> getListaCargoMult(@PathParam("nome") String nome, @PathParam("horaSemanal") Integer horaSemanal, @Context HttpHeaders headers, @Context HttpServletRequest request) {
        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("Lista de Cargos Multi", "Listar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return daoCargo.getListaCargoMult(nome, horaSemanal);
        } catch (Exception exception) {
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build());
        }
    }

    @POST
    @Path("postIncluirCargo")
    public Response postIncluirCargo(Cargo cargo, @Context HttpHeaders headers, @Context HttpServletRequest request) {
        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("Incluir Cargo", "Incluir", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            daoCargo.incluir(cargo);
            return Response.ok().build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
        }
    }

    @POST
    @Path("postAlterarCargo")
    public Response postAlterarCargo(Cargo cargo, @PathParam("nome") String nome, @Context HttpHeaders headers, @Context HttpServletRequest request) {
        try {
            String param = "";
            if (!(nome == null)) {
                param += nome;
            }
            Integer idUserMenu = 1;
            daoCargo.alterar(cargo);
            daoUserLog.criarLog("Alterar Cargo", "Alterar", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return Response.ok().build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
        }
    }

    @POST
    @Path("postRemoverCargo")
    public Response postRemoverCargo(Cargo cargo, @Context HttpHeaders headers, @Context HttpServletRequest request) {
        try {
            Integer idUserMenu = 1;
            daoCargo.remover(cargo);
            daoUserLog.criarLog("Remover Cargo", "Remover", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            return Response.ok().build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
        }
    }
    
    @POST
    @Path("postIncluirAtribuicoesCargo")
    public Response postIncluirAtribuicoesCargo(@Context HttpHeaders headers, List<ModelAtribuicoesCargoWs> lmac, @Context HttpServletRequest request) {
        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("postIncluirAtribuicoesCargo", "Remover", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            daoAtribuicoesCargoDao.postIncluirAtribuicoesCargo(headers.getRequestHeader("chave").get(0), lmac);
            return Response.ok().build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
        }
    }
    
    @POST
    @Path("postRemoverAtribuicoesCargo")
    public Response postRemoverAtribuicoesCargo(@Context HttpHeaders headers, List<ModelAtribuicoesCargoWs> lmac, @Context HttpServletRequest request) {
        try {
            Integer idUserMenu = 1;
            daoUserLog.criarLog("postIncluirAtribuicoesCargo", "Remover", headers.getRequestHeader("chave").get(0), request.getPathInfo(), headers.getRequestHeader("appv").get(0),"SDGC", request.getRemoteAddr());
            daoAtribuicoesCargoDao.postRemoverAtribuicoesCargo(headers.getRequestHeader("chave").get(0), lmac);
            return Response.ok().build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
        }
    }*/

}
