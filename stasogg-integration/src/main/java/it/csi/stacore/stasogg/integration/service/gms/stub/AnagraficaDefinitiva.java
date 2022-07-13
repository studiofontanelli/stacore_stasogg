/**
 * AnagraficaDefinitiva.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class AnagraficaDefinitiva  extends it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo domicilioFiscaleAsIndirizzoDefinitivo;

    private it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva identitaDefinitiva;

    private it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo indirizzoPrimarioAsIndirizzoDefinitivo;

    public AnagraficaDefinitiva() {
    }

    public AnagraficaDefinitiva(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo domicilioFiscale,
           it.csi.stacore.stasogg.integration.service.gms.stub.Identita identita,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo indirizzoPrimario,
           boolean personaFisica,
           boolean provvisoria,
           it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo domicilioFiscaleAsIndirizzoDefinitivo,
           it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva identitaDefinitiva,
           it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo indirizzoPrimarioAsIndirizzoDefinitivo) {
        super(
            indentLevel,
            domicilioFiscale,
            identita,
            indirizzoPrimario,
            personaFisica,
            provvisoria);
        this.domicilioFiscaleAsIndirizzoDefinitivo = domicilioFiscaleAsIndirizzoDefinitivo;
        this.identitaDefinitiva = identitaDefinitiva;
        this.indirizzoPrimarioAsIndirizzoDefinitivo = indirizzoPrimarioAsIndirizzoDefinitivo;
    }


    /**
     * Gets the domicilioFiscaleAsIndirizzoDefinitivo value for this AnagraficaDefinitiva.
     * 
     * @return domicilioFiscaleAsIndirizzoDefinitivo
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo getDomicilioFiscaleAsIndirizzoDefinitivo() {
        return domicilioFiscaleAsIndirizzoDefinitivo;
    }


    /**
     * Sets the domicilioFiscaleAsIndirizzoDefinitivo value for this AnagraficaDefinitiva.
     * 
     * @param domicilioFiscaleAsIndirizzoDefinitivo
     */
    public void setDomicilioFiscaleAsIndirizzoDefinitivo(it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo domicilioFiscaleAsIndirizzoDefinitivo) {
        this.domicilioFiscaleAsIndirizzoDefinitivo = domicilioFiscaleAsIndirizzoDefinitivo;
    }


    /**
     * Gets the identitaDefinitiva value for this AnagraficaDefinitiva.
     * 
     * @return identitaDefinitiva
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva getIdentitaDefinitiva() {
        return identitaDefinitiva;
    }


    /**
     * Sets the identitaDefinitiva value for this AnagraficaDefinitiva.
     * 
     * @param identitaDefinitiva
     */
    public void setIdentitaDefinitiva(it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva identitaDefinitiva) {
        this.identitaDefinitiva = identitaDefinitiva;
    }


    /**
     * Gets the indirizzoPrimarioAsIndirizzoDefinitivo value for this AnagraficaDefinitiva.
     * 
     * @return indirizzoPrimarioAsIndirizzoDefinitivo
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo getIndirizzoPrimarioAsIndirizzoDefinitivo() {
        return indirizzoPrimarioAsIndirizzoDefinitivo;
    }


    /**
     * Sets the indirizzoPrimarioAsIndirizzoDefinitivo value for this AnagraficaDefinitiva.
     * 
     * @param indirizzoPrimarioAsIndirizzoDefinitivo
     */
    public void setIndirizzoPrimarioAsIndirizzoDefinitivo(it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo indirizzoPrimarioAsIndirizzoDefinitivo) {
        this.indirizzoPrimarioAsIndirizzoDefinitivo = indirizzoPrimarioAsIndirizzoDefinitivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnagraficaDefinitiva)) return false;
        AnagraficaDefinitiva other = (AnagraficaDefinitiva) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domicilioFiscaleAsIndirizzoDefinitivo==null && other.getDomicilioFiscaleAsIndirizzoDefinitivo()==null) || 
             (this.domicilioFiscaleAsIndirizzoDefinitivo!=null &&
              this.domicilioFiscaleAsIndirizzoDefinitivo.equals(other.getDomicilioFiscaleAsIndirizzoDefinitivo()))) &&
            ((this.identitaDefinitiva==null && other.getIdentitaDefinitiva()==null) || 
             (this.identitaDefinitiva!=null &&
              this.identitaDefinitiva.equals(other.getIdentitaDefinitiva()))) &&
            ((this.indirizzoPrimarioAsIndirizzoDefinitivo==null && other.getIndirizzoPrimarioAsIndirizzoDefinitivo()==null) || 
             (this.indirizzoPrimarioAsIndirizzoDefinitivo!=null &&
              this.indirizzoPrimarioAsIndirizzoDefinitivo.equals(other.getIndirizzoPrimarioAsIndirizzoDefinitivo())));
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
        if (getDomicilioFiscaleAsIndirizzoDefinitivo() != null) {
            _hashCode += getDomicilioFiscaleAsIndirizzoDefinitivo().hashCode();
        }
        if (getIdentitaDefinitiva() != null) {
            _hashCode += getIdentitaDefinitiva().hashCode();
        }
        if (getIndirizzoPrimarioAsIndirizzoDefinitivo() != null) {
            _hashCode += getIndirizzoPrimarioAsIndirizzoDefinitivo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnagraficaDefinitiva.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "AnagraficaDefinitiva"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioFiscaleAsIndirizzoDefinitivo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "domicilioFiscaleAsIndirizzoDefinitivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoDefinitivo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identitaDefinitiva");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "identitaDefinitiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaDefinitiva"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoPrimarioAsIndirizzoDefinitivo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "indirizzoPrimarioAsIndirizzoDefinitivo"));
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
