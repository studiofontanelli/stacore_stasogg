package it.csi.stacore.stasogg.api.service.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.stasogg.api.dto.GenericResponse;
import it.csi.stacore.stasogg.api.dto.Proprietario;
import it.csi.stacore.stasogg.api.service.SoggettoApi;
import it.csi.stacore.stasogg.api.service.TestApi;
import it.csi.stacore.stasogg.business.helper.SoggettoHelper;
import it.csi.stacore.stasogg.business.helper.TestResourceHelper;



@Component("soggettoApi")
public class SoggettoApiImpl implements SoggettoApi {

	@Autowired
	private TestResourceHelper testResourceHelper;
	
	
	@Autowired
	private SoggettoHelper soggettoHelper;

	public Response testResources(SecurityContext securityContext, HttpHeaders httpHeaders ) {
		GenericResponse response = new GenericResponse();
		boolean testResource = testResourceHelper.testResources();
		if(testResource)
			response.setMessage("TUTTO OK");
		else
			response.setMessage("TEST RESOURCE KO");

		return Response.ok().entity(response).build();
	}

	

	@Override
	public Response loadById(Long idGms, Long idProprietario, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response ricercaSoggettoPF(@NotNull String nome, @NotNull String cognome, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response ricercaSoggettoPG(@NotNull String denominazione, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Response ricercaSoggetto(String codiceFiscale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		Proprietario [ ] response = soggettoHelper.ricercaSoggetto(codiceFiscale).stream().toArray(Proprietario[]::new);  
		return Response.ok().entity(response).build();
	}

}
