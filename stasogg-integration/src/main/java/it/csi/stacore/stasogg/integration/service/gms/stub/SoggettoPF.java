/**
 * SoggettoPF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class SoggettoPF  extends it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva  implements java.io.Serializable {
    private java.lang.String cognome;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita;

    private it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaPersonaFisica identitaPersonaFisica;

    private java.lang.String nome;

    private it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo residenza;

    private java.lang.String sesso;

    public SoggettoPF() {
    }

    public SoggettoPF(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo domicilioFiscale,
           it.csi.stacore.stasogg.integration.service.gms.stub.Identita identita,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo indirizzoPrimario,
           boolean personaFisica,
           boolean provvisoria,
           it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo domicilioFiscaleAsIndirizzoDefinitivo,
           it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva identitaDefinitiva,
           it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo indirizzoPrimarioAsIndirizzoDefinitivo,
           java.lang.String cognome,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita,
           it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaPersonaFisica identitaPersonaFisica,
           java.lang.String nome,
           it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo residenza,
           java.lang.String sesso) {
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
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.identitaPersonaFisica = identitaPersonaFisica;
        this.nome = nome;
        this.residenza = residenza;
        this.sesso = sesso;
    }


    /**
     * Gets the cognome value for this SoggettoPF.
     * 
     * @return cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this SoggettoPF.
     * 
     * @param cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the dataNascita value for this SoggettoPF.
     * 
     * @return dataNascita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataNascita() {
        return dataNascita;
    }


    /**
     * Sets the dataNascita value for this SoggettoPF.
     * 
     * @param dataNascita
     */
    public void setDataNascita(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita) {
        this.dataNascita = dataNascita;
    }


    /**
     * Gets the identitaPersonaFisica value for this SoggettoPF.
     * 
     * @return identitaPersonaFisica
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaPersonaFisica getIdentitaPersonaFisica() {
        return identitaPersonaFisica;
    }


    /**
     * Sets the identitaPersonaFisica value for this SoggettoPF.
     * 
     * @param identitaPersonaFisica
     */
    public void setIdentitaPersonaFisica(it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaPersonaFisica identitaPersonaFisica) {
        this.identitaPersonaFisica = identitaPersonaFisica;
    }


    /**
     * Gets the nome value for this SoggettoPF.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this SoggettoPF.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the residenza value for this SoggettoPF.
     * 
     * @return residenza
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo getResidenza() {
        return residenza;
    }


    /**
     * Sets the residenza value for this SoggettoPF.
     * 
     * @param residenza
     */
    public void setResidenza(it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo residenza) {
        this.residenza = residenza;
    }


    /**
     * Gets the sesso value for this SoggettoPF.
     * 
     * @return sesso
     */
    public java.lang.String getSesso() {
        return sesso;
    }


    /**
     * Sets the sesso value for this SoggettoPF.
     * 
     * @param sesso
     */
    public void setSesso(java.lang.String sesso) {
        this.sesso = sesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoggettoPF)) return false;
        SoggettoPF other = (SoggettoPF) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cognome==null && other.getCognome()==null) || 
             (this.cognome!=null &&
              this.cognome.equals(other.getCognome()))) &&
            ((this.dataNascita==null && other.getDataNascita()==null) || 
             (this.dataNascita!=null &&
              this.dataNascita.equals(other.getDataNascita()))) &&
            ((this.identitaPersonaFisica==null && other.getIdentitaPersonaFisica()==null) || 
             (this.identitaPersonaFisica!=null &&
              this.identitaPersonaFisica.equals(other.getIdentitaPersonaFisica()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.residenza==null && other.getResidenza()==null) || 
             (this.residenza!=null &&
              this.residenza.equals(other.getResidenza()))) &&
            ((this.sesso==null && other.getSesso()==null) || 
             (this.sesso!=null &&
              this.sesso.equals(other.getSesso())));
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
        if (getCognome() != null) {
            _hashCode += getCognome().hashCode();
        }
        if (getDataNascita() != null) {
            _hashCode += getDataNascita().hashCode();
        }
        if (getIdentitaPersonaFisica() != null) {
            _hashCode += getIdentitaPersonaFisica().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getResidenza() != null) {
            _hashCode += getResidenza().hashCode();
        }
        if (getSesso() != null) {
            _hashCode += getSesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoggettoPF.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cognome");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "cognome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataNascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "DateGMS"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identitaPersonaFisica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "identitaPersonaFisica"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaPersonaFisica"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "residenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoDefinitivo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sesso");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "sesso"));
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
