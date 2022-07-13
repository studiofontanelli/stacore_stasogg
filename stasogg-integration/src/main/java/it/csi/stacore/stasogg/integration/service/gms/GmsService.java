package it.csi.stacore.stasogg.integration.service.gms;



import it.csi.stacore.stasogg.integration.exception.IntegrationException;
import it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica;


public interface GmsService {

	/**
	 * 
	 * @param codiceFiscale
	 * @return
	 * @throws IntegrationException
	 */
	public Anagrafica[] ricercaSoggettoCF(String codiceFiscale) throws IntegrationException;


}
