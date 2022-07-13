/**
 * IdentitaProvvisoriaPersonaFisica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class IdentitaProvvisoriaPersonaFisica  extends it.csi.stacore.stasogg.integration.service.gms.stub.Identita  implements java.io.Serializable {
    private java.lang.String cognome;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita;

    private java.lang.String istatProvinciaNascita;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoNascita;

    private java.lang.String nome;

    private java.lang.String numeroPratica;

    private java.lang.String sesso;

    public IdentitaProvvisoriaPersonaFisica() {
    }

    public IdentitaProvvisoriaPersonaFisica(
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
           java.lang.String cognome,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita,
           java.lang.String istatProvinciaNascita,
           it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoNascita,
           java.lang.String nome,
           java.lang.String numeroPratica,
           java.lang.String sesso) {
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
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.istatProvinciaNascita = istatProvinciaNascita;
        this.luogoNascita = luogoNascita;
        this.nome = nome;
        this.numeroPratica = numeroPratica;
        this.sesso = sesso;
    }


    /**
     * Gets the cognome value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @return cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @param cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the dataNascita value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @return dataNascita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataNascita() {
        return dataNascita;
    }


    /**
     * Sets the dataNascita value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @param dataNascita
     */
    public void setDataNascita(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita) {
        this.dataNascita = dataNascita;
    }


    /**
     * Gets the istatProvinciaNascita value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @return istatProvinciaNascita
     */
    public java.lang.String getIstatProvinciaNascita() {
        return istatProvinciaNascita;
    }


    /**
     * Sets the istatProvinciaNascita value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @param istatProvinciaNascita
     */
    public void setIstatProvinciaNascita(java.lang.String istatProvinciaNascita) {
        this.istatProvinciaNascita = istatProvinciaNascita;
    }


    /**
     * Gets the luogoNascita value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @return luogoNascita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Luogo getLuogoNascita() {
        return luogoNascita;
    }


    /**
     * Sets the luogoNascita value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @param luogoNascita
     */
    public void setLuogoNascita(it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoNascita) {
        this.luogoNascita = luogoNascita;
    }


    /**
     * Gets the nome value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the numeroPratica value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @return numeroPratica
     */
    public java.lang.String getNumeroPratica() {
        return numeroPratica;
    }


    /**
     * Sets the numeroPratica value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @param numeroPratica
     */
    public void setNumeroPratica(java.lang.String numeroPratica) {
        this.numeroPratica = numeroPratica;
    }


    /**
     * Gets the sesso value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @return sesso
     */
    public java.lang.String getSesso() {
        return sesso;
    }


    /**
     * Sets the sesso value for this IdentitaProvvisoriaPersonaFisica.
     * 
     * @param sesso
     */
    public void setSesso(java.lang.String sesso) {
        this.sesso = sesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentitaProvvisoriaPersonaFisica)) return false;
        IdentitaProvvisoriaPersonaFisica other = (IdentitaProvvisoriaPersonaFisica) obj;
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
            ((this.istatProvinciaNascita==null && other.getIstatProvinciaNascita()==null) || 
             (this.istatProvinciaNascita!=null &&
              this.istatProvinciaNascita.equals(other.getIstatProvinciaNascita()))) &&
            ((this.luogoNascita==null && other.getLuogoNascita()==null) || 
             (this.luogoNascita!=null &&
              this.luogoNascita.equals(other.getLuogoNascita()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.numeroPratica==null && other.getNumeroPratica()==null) || 
             (this.numeroPratica!=null &&
              this.numeroPratica.equals(other.getNumeroPratica()))) &&
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
        if (getIstatProvinciaNascita() != null) {
            _hashCode += getIstatProvinciaNascita().hashCode();
        }
        if (getLuogoNascita() != null) {
            _hashCode += getLuogoNascita().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getNumeroPratica() != null) {
            _hashCode += getNumeroPratica().hashCode();
        }
        if (getSesso() != null) {
            _hashCode += getSesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentitaProvvisoriaPersonaFisica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaProvvisoriaPersonaFisica"));
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
        elemField.setFieldName("istatProvinciaNascita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "istatProvinciaNascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoNascita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "luogoNascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Luogo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPratica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "numeroPratica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
