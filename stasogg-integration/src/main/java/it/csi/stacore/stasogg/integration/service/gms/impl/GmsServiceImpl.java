package it.csi.stacore.stasogg.integration.service.gms.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stasogg.integration.exception.CodiceFiscaleInvalidException;
import it.csi.stacore.stasogg.integration.exception.IntegrationException;
import it.csi.stacore.stasogg.integration.service.ParentIntegrationServiceImpl;
import it.csi.stacore.stasogg.integration.service.gms.GmsService;
import it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica;
import it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException;
import it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTau;
import it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTauServiceLocator;
import it.csi.stacore.stasogg.util.Environment;
import it.csi.stacore.stasogg.util.Tracer;
import it.csi.stacore.stasogg.util.XmlSerializer;

@Service
public class GmsServiceImpl extends ParentIntegrationServiceImpl implements GmsService{

	
	private ServiziTau serviziTau ;
	
	@Autowired
	private Environment environment;

	@PostConstruct
	public void init() {
		final String method = "init";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
			
			
			String endpoint = environment.getGmsEndpoint();
			
			
			Tracer.info(LOG, getClass().getName(), method, "GMS endpoint= " + endpoint);
			
			
			ServiziTauServiceLocator serviceLocator = new ServiziTauServiceLocator();
			serviceLocator.setServiziTauFCDSBEndpointAddress(endpoint);
			
			serviziTau = serviceLocator.getServiziTauFCDSB();
			
			Tracer.info(LOG, getClass().getName(), method, "serviziTau loaded correctly");
			
			

		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
		}
		finally {

		}

	}

	@Override
	public List<Anagrafica> ricercaSoggettoCF(String codiceFiscale) throws IntegrationException {
		final String method = "ricercaSoggettoCF";
		List<Anagrafica> result = null;
		try {
			
			
			Anagrafica [] r = serviziTau.ricercaSoggettoCF(codiceFiscale);
		
			result = Arrays.stream(r).collect(Collectors.toList());
			
			if(LOG.isDebugEnabled()) {
				Tracer.debug(LOG, getClass().getName(), method, "result\n "  +XmlSerializer.objectToXml(result));
			}
		}
		
		catch(CodiceFiscaleNonValidoCsiException e) {
			Tracer.error(LOG, getClass().getName(), method, "CodiceFiscaleNonValidoCsiException "  +e);
			Tracer.error(LOG, getClass().getName(), method, "CodiceFiscaleNonValidoCsiException "  +e.getMessage());
			throw new CodiceFiscaleInvalidException("Codice fiscale on valido ", e);
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
			Tracer.error(LOG, getClass().getName(), method, "Exception message "  +e.getMessage());
			Tracer.error(LOG, getClass().getName(), method, "NAME "  + e.getClass().getName());
			Tracer.error(LOG, getClass().getName(), method, "CAUSE "  + e.getCause());
			
			if(e instanceof CodiceFiscaleNonValidoCsiException) {
				Tracer.error(LOG, getClass().getName(), method, "MINIMMI");
				
			}
			
			throw new IntegrationException("Problemi di accesso a GMS: " + e.getMessage());
		}
		finally {

		}
		return result;
	}

}
