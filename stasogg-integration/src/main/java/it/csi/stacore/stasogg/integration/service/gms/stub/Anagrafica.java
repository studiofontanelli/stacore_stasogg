/**
 * Anagrafica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class Anagrafica  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo domicilioFiscale;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Identita identita;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo indirizzoPrimario;

    private boolean personaFisica;

    private boolean provvisoria;

    public Anagrafica() {
    }

    public Anagrafica(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo domicilioFiscale,
           it.csi.stacore.stasogg.integration.service.gms.stub.Identita identita,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo indirizzoPrimario,
           boolean personaFisica,
           boolean provvisoria) {
        super(
            indentLevel);
        this.domicilioFiscale = domicilioFiscale;
        this.identita = identita;
        this.indirizzoPrimario = indirizzoPrimario;
        this.personaFisica = personaFisica;
        this.provvisoria = provvisoria;
    }


    /**
     * Gets the domicilioFiscale value for this Anagrafica.
     * 
     * @return domicilioFiscale
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo getDomicilioFiscale() {
        return domicilioFiscale;
    }


    /**
     * Sets the domicilioFiscale value for this Anagrafica.
     * 
     * @param domicilioFiscale
     */
    public void setDomicilioFiscale(it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo domicilioFiscale) {
        this.domicilioFiscale = domicilioFiscale;
    }


    /**
     * Gets the identita value for this Anagrafica.
     * 
     * @return identita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita getIdentita() {
        return identita;
    }


    /**
     * Sets the identita value for this Anagrafica.
     * 
     * @param identita
     */
    public void setIdentita(it.csi.stacore.stasogg.integration.service.gms.stub.Identita identita) {
        this.identita = identita;
    }


    /**
     * Gets the indirizzoPrimario value for this Anagrafica.
     * 
     * @return indirizzoPrimario
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo getIndirizzoPrimario() {
        return indirizzoPrimario;
    }


    /**
     * Sets the indirizzoPrimario value for this Anagrafica.
     * 
     * @param indirizzoPrimario
     */
    public void setIndirizzoPrimario(it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo indirizzoPrimario) {
        this.indirizzoPrimario = indirizzoPrimario;
    }


    /**
     * Gets the personaFisica value for this Anagrafica.
     * 
     * @return personaFisica
     */
    public boolean isPersonaFisica() {
        return personaFisica;
    }


    /**
     * Sets the personaFisica value for this Anagrafica.
     * 
     * @param personaFisica
     */
    public void setPersonaFisica(boolean personaFisica) {
        this.personaFisica = personaFisica;
    }


    /**
     * Gets the provvisoria value for this Anagrafica.
     * 
     * @return provvisoria
     */
    public boolean isProvvisoria() {
        return provvisoria;
    }


    /**
     * Sets the provvisoria value for this Anagrafica.
     * 
     * @param provvisoria
     */
    public void setProvvisoria(boolean provvisoria) {
        this.provvisoria = provvisoria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Anagrafica)) return false;
        Anagrafica other = (Anagrafica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domicilioFiscale==null && other.getDomicilioFiscale()==null) || 
             (this.domicilioFiscale!=null &&
              this.domicilioFiscale.equals(other.getDomicilioFiscale()))) &&
            ((this.identita==null && other.getIdentita()==null) || 
             (this.identita!=null &&
              this.identita.equals(other.getIdentita()))) &&
            ((this.indirizzoPrimario==null && other.getIndirizzoPrimario()==null) || 
             (this.indirizzoPrimario!=null &&
              this.indirizzoPrimario.equals(other.getIndirizzoPrimario()))) &&
            this.personaFisica == other.isPersonaFisica() &&
            this.provvisoria == other.isProvvisoria();
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
        if (getDomicilioFiscale() != null) {
            _hashCode += getDomicilioFiscale().hashCode();
        }
        if (getIdentita() != null) {
            _hashCode += getIdentita().hashCode();
        }
        if (getIndirizzoPrimario() != null) {
            _hashCode += getIndirizzoPrimario().hashCode();
        }
        _hashCode += (isPersonaFisica() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isProvvisoria() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Anagrafica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "domicilioFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "identita"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Identita"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoPrimario");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "indirizzoPrimario"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaFisica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "personaFisica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provvisoria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "provvisoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
