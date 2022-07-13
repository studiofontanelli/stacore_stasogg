/**
 * Identita.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class Identita  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscale codiceFiscale;

    private java.lang.String codiceFiscaleString;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita;

    private it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza;

    private java.lang.Long idSoggetto;

    private java.lang.Long idStorico;

    private boolean personaFisica;

    private boolean provvisoria;

    private it.csi.stacore.stasogg.integration.service.gms.stub.StatoSoggetto statoSoggetto;

    public Identita() {
    }

    public Identita(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscale codiceFiscale,
           java.lang.String codiceFiscaleString,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long idSoggetto,
           java.lang.Long idStorico,
           boolean personaFisica,
           boolean provvisoria,
           it.csi.stacore.stasogg.integration.service.gms.stub.StatoSoggetto statoSoggetto) {
        super(
            indentLevel);
        this.codiceFiscale = codiceFiscale;
        this.codiceFiscaleString = codiceFiscaleString;
        this.dataValidita = dataValidita;
        this.fonteProvenienza = fonteProvenienza;
        this.idSoggetto = idSoggetto;
        this.idStorico = idStorico;
        this.personaFisica = personaFisica;
        this.provvisoria = provvisoria;
        this.statoSoggetto = statoSoggetto;
    }


    /**
     * Gets the codiceFiscale value for this Identita.
     * 
     * @return codiceFiscale
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscale getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this Identita.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscale codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the codiceFiscaleString value for this Identita.
     * 
     * @return codiceFiscaleString
     */
    public java.lang.String getCodiceFiscaleString() {
        return codiceFiscaleString;
    }


    /**
     * Sets the codiceFiscaleString value for this Identita.
     * 
     * @param codiceFiscaleString
     */
    public void setCodiceFiscaleString(java.lang.String codiceFiscaleString) {
        this.codiceFiscaleString = codiceFiscaleString;
    }


    /**
     * Gets the dataValidita value for this Identita.
     * 
     * @return dataValidita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataValidita() {
        return dataValidita;
    }


    /**
     * Sets the dataValidita value for this Identita.
     * 
     * @param dataValidita
     */
    public void setDataValidita(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita) {
        this.dataValidita = dataValidita;
    }


    /**
     * Gets the fonteProvenienza value for this Identita.
     * 
     * @return fonteProvenienza
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza getFonteProvenienza() {
        return fonteProvenienza;
    }


    /**
     * Sets the fonteProvenienza value for this Identita.
     * 
     * @param fonteProvenienza
     */
    public void setFonteProvenienza(it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza) {
        this.fonteProvenienza = fonteProvenienza;
    }


    /**
     * Gets the idSoggetto value for this Identita.
     * 
     * @return idSoggetto
     */
    public java.lang.Long getIdSoggetto() {
        return idSoggetto;
    }


    /**
     * Sets the idSoggetto value for this Identita.
     * 
     * @param idSoggetto
     */
    public void setIdSoggetto(java.lang.Long idSoggetto) {
        this.idSoggetto = idSoggetto;
    }


    /**
     * Gets the idStorico value for this Identita.
     * 
     * @return idStorico
     */
    public java.lang.Long getIdStorico() {
        return idStorico;
    }


    /**
     * Sets the idStorico value for this Identita.
     * 
     * @param idStorico
     */
    public void setIdStorico(java.lang.Long idStorico) {
        this.idStorico = idStorico;
    }


    /**
     * Gets the personaFisica value for this Identita.
     * 
     * @return personaFisica
     */
    public boolean isPersonaFisica() {
        return personaFisica;
    }


    /**
     * Sets the personaFisica value for this Identita.
     * 
     * @param personaFisica
     */
    public void setPersonaFisica(boolean personaFisica) {
        this.personaFisica = personaFisica;
    }


    /**
     * Gets the provvisoria value for this Identita.
     * 
     * @return provvisoria
     */
    public boolean isProvvisoria() {
        return provvisoria;
    }


    /**
     * Sets the provvisoria value for this Identita.
     * 
     * @param provvisoria
     */
    public void setProvvisoria(boolean provvisoria) {
        this.provvisoria = provvisoria;
    }


    /**
     * Gets the statoSoggetto value for this Identita.
     * 
     * @return statoSoggetto
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.StatoSoggetto getStatoSoggetto() {
        return statoSoggetto;
    }


    /**
     * Sets the statoSoggetto value for this Identita.
     * 
     * @param statoSoggetto
     */
    public void setStatoSoggetto(it.csi.stacore.stasogg.integration.service.gms.stub.StatoSoggetto statoSoggetto) {
        this.statoSoggetto = statoSoggetto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Identita)) return false;
        Identita other = (Identita) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.codiceFiscaleString==null && other.getCodiceFiscaleString()==null) || 
             (this.codiceFiscaleString!=null &&
              this.codiceFiscaleString.equals(other.getCodiceFiscaleString()))) &&
            ((this.dataValidita==null && other.getDataValidita()==null) || 
             (this.dataValidita!=null &&
              this.dataValidita.equals(other.getDataValidita()))) &&
            ((this.fonteProvenienza==null && other.getFonteProvenienza()==null) || 
             (this.fonteProvenienza!=null &&
              this.fonteProvenienza.equals(other.getFonteProvenienza()))) &&
            ((this.idSoggetto==null && other.getIdSoggetto()==null) || 
             (this.idSoggetto!=null &&
              this.idSoggetto.equals(other.getIdSoggetto()))) &&
            ((this.idStorico==null && other.getIdStorico()==null) || 
             (this.idStorico!=null &&
              this.idStorico.equals(other.getIdStorico()))) &&
            this.personaFisica == other.isPersonaFisica() &&
            this.provvisoria == other.isProvvisoria() &&
            ((this.statoSoggetto==null && other.getStatoSoggetto()==null) || 
             (this.statoSoggetto!=null &&
              this.statoSoggetto.equals(other.getStatoSoggetto())));
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
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getCodiceFiscaleString() != null) {
            _hashCode += getCodiceFiscaleString().hashCode();
        }
        if (getDataValidita() != null) {
            _hashCode += getDataValidita().hashCode();
        }
        if (getFonteProvenienza() != null) {
            _hashCode += getFonteProvenienza().hashCode();
        }
        if (getIdSoggetto() != null) {
            _hashCode += getIdSoggetto().hashCode();
        }
        if (getIdStorico() != null) {
            _hashCode += getIdStorico().hashCode();
        }
        _hashCode += (isPersonaFisica() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isProvvisoria() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatoSoggetto() != null) {
            _hashCode += getStatoSoggetto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Identita.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Identita"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscale"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscaleString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceFiscaleString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValidita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataValidita"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "DateGMS"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fonteProvenienza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "fonteProvenienza"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "FonteProvenienza"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idSoggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStorico");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idStorico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "statoSoggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "StatoSoggetto"));
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
