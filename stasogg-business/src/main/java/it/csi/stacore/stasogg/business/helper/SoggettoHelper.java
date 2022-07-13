package it.csi.stacore.stasogg.business.helper;

import java.util.List;

import it.csi.stacore.stasogg.api.dto.Proprietario;
import it.csi.stacore.stasogg.business.exception.HelperException;

public interface SoggettoHelper {

	
	public List<Proprietario> ricercaSoggetto(String codiceFiscale) throws HelperException;
	
}
