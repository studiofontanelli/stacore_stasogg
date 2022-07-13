/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.stacore.stasogg.api.service;

import it.csi.stacore.stasogg.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.stacore.stasogg.api.dto.ErrorDto;
import it.csi.stacore.stasogg.api.dto.Proprietario;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/soggetto")


@io.swagger.annotations.Api(description = "the soggetto API")

public interface SoggettoApi  {
   
    @GET
    @Path("/{idGms}/{idProprietario}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "ricerca Soggetto dato idGMS e id Proprietario", notes = "Recupera il soggetto dato l'id GMS e id Proprietario", response = Proprietario.class, responseContainer = "List", tags={ "soggetto", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Elenco soggetti trovati", response = Proprietario.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parametro non valorizzato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Soggetto non trovato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response loadById( @PathParam("idGms") Long idGms, @PathParam("idProprietario") Long idProprietario,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{codiceFiscale}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "ricerca Soggetto", notes = "Recupera il soggetto dato il codice fiscale", response = Proprietario.class, responseContainer = "List", tags={ "soggetto", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Elenco soggetti trovati", response = Proprietario.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parametro non valorizzato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Soggetto non trovato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response ricercaSoggetto( @PathParam("codiceFiscale") String codiceFiscale,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/pf")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "ricerca Soggetto Persona Fisica", notes = "Recupera il soggetto persona fisica dato nome e cognome", response = Proprietario.class, responseContainer = "List", tags={ "soggetto", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Elenco soggetti trovati", response = Proprietario.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parametro non valorizzato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Soggetto non trovato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response ricercaSoggettoPF( @NotNull @QueryParam("nome") String nome, @NotNull @QueryParam("cognome") String cognome,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/pg")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "ricerca Soggetto Persona giuridica", notes = "Recupera il soggetto impresa data la denominazione", response = Proprietario.class, responseContainer = "List", tags={ "soggetto", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Elenco soggetti trovati", response = Proprietario.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parametro non valorizzato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Soggetto non trovato", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response ricercaSoggettoPG( @NotNull @QueryParam("denominazione") String denominazione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
