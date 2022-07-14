package it.csi.stacore.stasogg.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.stasogg.api.dto.Proprietario;
import it.csi.stacore.stasogg.business.adapter.AnagraficaProprietarioAdapter;
import it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica;
import it.csi.stacore.stasogg.util.Tracer;
import it.csi.stacore.stasogg.util.adapter.CommonDtoAdapter;
import it.csi.stacore.stasogg.util.adapter.exception.DtoConversionException;



@Component
public class AnagraficaProprietarioAdapterImpl extends CommonDtoAdapter<Anagrafica, Proprietario> implements AnagraficaProprietarioAdapter {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	
	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}


	@Override
	public Proprietario convertTo(Anagrafica t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			Proprietario proprietario =  super.convertTo(t);
			
			//AF: TO BE IMPLEMENTED
			
			return proprietario;
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}

	

	

}
