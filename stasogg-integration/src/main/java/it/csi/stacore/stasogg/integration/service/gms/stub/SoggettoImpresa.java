/**
 * SoggettoImpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class SoggettoImpresa  extends it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva  implements java.io.Serializable {
    private java.lang.String denominazione;

    private it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaImpresa identitaImpresa;

    private it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo sedeLegale;

    public SoggettoImpresa() {
    }

    public SoggettoImpresa(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo domicilioFiscale,
           it.csi.stacore.stasogg.integration.service.gms.stub.Identita identita,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo indirizzoPrimario,
           boolean personaFisica,
           boolean provvisoria,
           it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo domicilioFiscaleAsIndirizzoDefinitivo,
           it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva identitaDefinitiva,
           it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo indirizzoPrimarioAsIndirizzoDefinitivo,
           java.lang.String denominazione,
           it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaImpresa identitaImpresa,
           it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo sedeLegale) {
        super(
            indentLevel,
            domicilioFiscale,
            identita,
            indirizzoPrimario,
            personaFisica,
            provvisoria,
            domicilioFiscaleAsIndirizzoDefinitivo,
            identitaDefinitiva,
            indirizzoPrimarioAsIndirizzoDefinitivo);
        this.denominazione = denominazione;
        this.identitaImpresa = identitaImpresa;
        this.sedeLegale = sedeLegale;
    }


    /**
     * Gets the denominazione value for this SoggettoImpresa.
     * 
     * @return denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this SoggettoImpresa.
     * 
     * @param denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the identitaImpresa value for this SoggettoImpresa.
     * 
     * @return identitaImpresa
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaImpresa getIdentitaImpresa() {
        return identitaImpresa;
    }


    /**
     * Sets the identitaImpresa value for this SoggettoImpresa.
     * 
     * @param identitaImpresa
     */
    public void setIdentitaImpresa(it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaImpresa identitaImpresa) {
        this.identitaImpresa = identitaImpresa;
    }


    /**
     * Gets the sedeLegale value for this SoggettoImpresa.
     * 
     * @return sedeLegale
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo getSedeLegale() {
        return sedeLegale;
    }


    /**
     * Sets the sedeLegale value for this SoggettoImpresa.
     * 
     * @param sedeLegale
     */
    public void setSedeLegale(it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo sedeLegale) {
        this.sedeLegale = sedeLegale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoggettoImpresa)) return false;
        SoggettoImpresa other = (SoggettoImpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.identitaImpresa==null && other.getIdentitaImpresa()==null) || 
             (this.identitaImpresa!=null &&
              this.identitaImpresa.equals(other.getIdentitaImpresa()))) &&
            ((this.sedeLegale==null && other.getSedeLegale()==null) || 
             (this.sedeLegale!=null &&
              this.sedeLegale.equals(other.getSedeLegale())));
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
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getIdentitaImpresa() != null) {
            _hashCode += getIdentitaImpresa().hashCode();
        }
        if (getSedeLegale() != null) {
            _hashCode += getSedeLegale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoggettoImpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoImpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identitaImpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "identitaImpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaImpresa"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sedeLegale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "sedeLegale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoDefinitivo"));
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
