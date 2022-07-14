package it.csi.stacore.stasogg.business.helper.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stasogg.api.dto.Proprietario;
import it.csi.stacore.stasogg.business.adapter.AnagraficaProprietarioAdapter;
import it.csi.stacore.stasogg.business.dto.ErrorDetailDto;
import it.csi.stacore.stasogg.business.exception.HelperException;
import it.csi.stacore.stasogg.business.exception.ValidationException;
import it.csi.stacore.stasogg.business.helper.SoggettoHelper;
import it.csi.stacore.stasogg.integration.exception.CodiceFiscaleInvalidException;
import it.csi.stacore.stasogg.integration.exception.IntegrationException;
import it.csi.stacore.stasogg.integration.service.gms.GmsService;
import it.csi.stacore.stasogg.util.Tracer;

@Service("soggettoHelper")
public class SoggettoHelperImpl extends CommonHelperImpl implements SoggettoHelper {
	
	@Autowired
	private GmsService gmsService;
	
	@Autowired
	private AnagraficaProprietarioAdapter anagraficaProprietarioAdapter;
	
	@PostConstruct
	public void init() {
		final String method = "init";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
			
			
			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
		}
		finally {
			
		}
		
	}

	//@Override
	public boolean testResources() throws HelperException {
		final String method = "testResources";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
			return true;
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new HelperException(e.getMessage());
		}
		finally {
			
		}
		
	}

	@Override
	public List<Proprietario> ricercaSoggetto(String codiceFiscale) throws HelperException {
		final String method = "getUtente";
		List<Proprietario>  result = new ArrayList<Proprietario>();
		try {

			List<ErrorDetailDto> errors = new ArrayList<>();
			if (StringUtils.isBlank(codiceFiscale)) {
				errors.add(new ErrorDetailDto("codiceFiscale", "Codice Fiscale non valorizzato non valorizzata"));

			}
			if (!errors.isEmpty()) {
				throw new ValidationException("Campi richiesti non valorizzati!", errors);
			}
			
			if(1==2) {
				throw new IntegrationException("MINIMMI");
			}
			
			
			gmsService.ricercaSoggettoCF(codiceFiscale);
			
			
			anagraficaProprietarioAdapter.convertTo(gmsService.ricercaSoggettoCF(codiceFiscale));
			
		} catch (CodiceFiscaleInvalidException e) {
			Tracer.error(LOG, getClass().getName(), method, "CodiceFiscaleInvalidException " + e);
			throw new ValidationException("Codice fiscale non valido");
		} catch (IntegrationException e) {
			Tracer.error(LOG, getClass().getName(), method, "IntegrationException " + e);
			throw new HelperException(e.getMessage());
		}
		catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new HelperException(e.getMessage());
		}
		finally {

		}
		return result;
	}

	

}
