package it.csi.stacore.stasogg.integration.service.gms;



import java.util.List;

import it.csi.stacore.stasogg.integration.exception.IntegrationException;
import it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica;


public interface GmsService {

	/**
	 * 
	 * @param codiceFiscale
	 * @return
	 * @throws IntegrationException
	 */
	public List<Anagrafica> ricercaSoggettoCF(String codiceFiscale) throws IntegrationException;


}
