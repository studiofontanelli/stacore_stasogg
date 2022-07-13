package it.csi.stacore.stasogg.integration.service.gms.impl;

import javax.annotation.PostConstruct;
import javax.wsdl.OperationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.stasogg.integration.exception.IntegrationException;
import it.csi.stacore.stasogg.integration.service.ParentIntegrationServiceImpl;
import it.csi.stacore.stasogg.integration.service.gms.GmsService;
import it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica;
import it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTau;
import it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTauServiceLocator;
import it.csi.stacore.stasogg.util.Environment;
import it.csi.stacore.stasogg.util.Tracer;
import it.csi.stacore.stasogg.util.XmlSerializer;

@Service
public class GmsServiceImpl extends ParentIntegrationServiceImpl implements GmsService{

	//@Resource
	//@Qualifier("serviziTauITF")
	
	
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
	public Anagrafica[] ricercaSoggettoCF(String codiceFiscale) throws IntegrationException {
		final String method = "ricercaSoggettoCF";
		Anagrafica[] result = null;
		try {
			result = serviziTau.ricercaSoggettoCF(codiceFiscale);
			
			if(LOG.isDebugEnabled()) {
				Tracer.debug(LOG, getClass().getName(), method, "result\n "  +XmlSerializer.objectToXml(result));
			}
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
			throw new IntegrationException("Problemi di accesso a GMS: " + e.getMessage());
		}
		finally {

		}
		return result;
	}

}
