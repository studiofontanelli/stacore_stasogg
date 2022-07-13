/**
 * IdentitaProvvisoriaImpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class IdentitaProvvisoriaImpresa  extends it.csi.stacore.stasogg.integration.service.gms.stub.Identita  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataCostituzione;

    private java.lang.String denominazione;

    private it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica;

    private java.lang.String numeroPratica;

    private java.lang.String partitaIva;

    public IdentitaProvvisoriaImpresa() {
    }

    public IdentitaProvvisoriaImpresa(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscale codiceFiscale,
           java.lang.String codiceFiscaleString,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long idSoggetto,
           java.lang.Long idStorico,
           boolean personaFisica,
           boolean provvisoria,
           it.csi.stacore.stasogg.integration.service.gms.stub.StatoSoggetto statoSoggetto,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataCostituzione,
           java.lang.String denominazione,
           it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica,
           java.lang.String numeroPratica,
           java.lang.String partitaIva) {
        super(
            indentLevel,
            codiceFiscale,
            codiceFiscaleString,
            dataValidita,
            fonteProvenienza,
            idSoggetto,
            idStorico,
            personaFisica,
            provvisoria,
            statoSoggetto);
        this.dataCostituzione = dataCostituzione;
        this.denominazione = denominazione;
        this.naturaGiuridica = naturaGiuridica;
        this.numeroPratica = numeroPratica;
        this.partitaIva = partitaIva;
    }


    /**
     * Gets the dataCostituzione value for this IdentitaProvvisoriaImpresa.
     * 
     * @return dataCostituzione
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataCostituzione() {
        return dataCostituzione;
    }


    /**
     * Sets the dataCostituzione value for this IdentitaProvvisoriaImpresa.
     * 
     * @param dataCostituzione
     */
    public void setDataCostituzione(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataCostituzione) {
        this.dataCostituzione = dataCostituzione;
    }


    /**
     * Gets the denominazione value for this IdentitaProvvisoriaImpresa.
     * 
     * @return denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this IdentitaProvvisoriaImpresa.
     * 
     * @param denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the naturaGiuridica value for this IdentitaProvvisoriaImpresa.
     * 
     * @return naturaGiuridica
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica getNaturaGiuridica() {
        return naturaGiuridica;
    }


    /**
     * Sets the naturaGiuridica value for this IdentitaProvvisoriaImpresa.
     * 
     * @param naturaGiuridica
     */
    public void setNaturaGiuridica(it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica) {
        this.naturaGiuridica = naturaGiuridica;
    }


    /**
     * Gets the numeroPratica value for this IdentitaProvvisoriaImpresa.
     * 
     * @return numeroPratica
     */
    public java.lang.String getNumeroPratica() {
        return numeroPratica;
    }


    /**
     * Sets the numeroPratica value for this IdentitaProvvisoriaImpresa.
     * 
     * @param numeroPratica
     */
    public void setNumeroPratica(java.lang.String numeroPratica) {
        this.numeroPratica = numeroPratica;
    }


    /**
     * Gets the partitaIva value for this IdentitaProvvisoriaImpresa.
     * 
     * @return partitaIva
     */
    public java.lang.String getPartitaIva() {
        return partitaIva;
    }


    /**
     * Sets the partitaIva value for this IdentitaProvvisoriaImpresa.
     * 
     * @param partitaIva
     */
    public void setPartitaIva(java.lang.String partitaIva) {
        this.partitaIva = partitaIva;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentitaProvvisoriaImpresa)) return false;
        IdentitaProvvisoriaImpresa other = (IdentitaProvvisoriaImpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataCostituzione==null && other.getDataCostituzione()==null) || 
             (this.dataCostituzione!=null &&
              this.dataCostituzione.equals(other.getDataCostituzione()))) &&
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.naturaGiuridica==null && other.getNaturaGiuridica()==null) || 
             (this.naturaGiuridica!=null &&
              this.naturaGiuridica.equals(other.getNaturaGiuridica()))) &&
            ((this.numeroPratica==null && other.getNumeroPratica()==null) || 
             (this.numeroPratica!=null &&
              this.numeroPratica.equals(other.getNumeroPratica()))) &&
            ((this.partitaIva==null && other.getPartitaIva()==null) || 
             (this.partitaIva!=null &&
              this.partitaIva.equals(other.getPartitaIva())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDataCostituzione() != null) {
            _hashCode += getDataCostituzione().hashCode();
        }
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getNaturaGiuridica() != null) {
            _hashCode += getNaturaGiuridica().hashCode();
        }
        if (getNumeroPratica() != null) {
            _hashCode += getNumeroPratica().hashCode();
        }
        if (getPartitaIva() != null) {
            _hashCode += getPartitaIva().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentitaProvvisoriaImpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaProvvisoriaImpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCostituzione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataCostituzione"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "DateGMS"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturaGiuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "naturaGiuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "NaturaGiuridica"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPratica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "numeroPratica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitaIva");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "partitaIva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
