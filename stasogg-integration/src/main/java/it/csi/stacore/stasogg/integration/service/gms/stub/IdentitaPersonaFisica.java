/**
 * IdentitaPersonaFisica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class IdentitaPersonaFisica  extends it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Cittadinanza cittadinanza;

    private java.lang.String cognome;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita;

    private java.lang.String dataNascitaIncompleta;

    private java.lang.String dataNascitaString;

    private boolean fromNaoMaNonResidente;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoNascita;

    private java.lang.String nome;

    private java.lang.String nomeCompleto;

    private java.lang.String numeroIndividuale;

    private java.lang.String sesso;

    public IdentitaPersonaFisica() {
    }

    public IdentitaPersonaFisica(
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
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento fonteRiferimento,
           it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoOrigine,
           boolean potenzialmenteModificabile,
           it.csi.stacore.stasogg.integration.service.gms.stub.StatoAnagraficoSoggetto statoAnagrafico,
           it.csi.stacore.stasogg.integration.service.gms.stub.Cittadinanza cittadinanza,
           java.lang.String cognome,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita,
           java.lang.String dataNascitaIncompleta,
           java.lang.String dataNascitaString,
           boolean fromNaoMaNonResidente,
           it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoNascita,
           java.lang.String nome,
           java.lang.String nomeCompleto,
           java.lang.String numeroIndividuale,
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
            statoSoggetto,
            fonteRiferimento,
            luogoOrigine,
            potenzialmenteModificabile,
            statoAnagrafico);
        this.cittadinanza = cittadinanza;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.dataNascitaIncompleta = dataNascitaIncompleta;
        this.dataNascitaString = dataNascitaString;
        this.fromNaoMaNonResidente = fromNaoMaNonResidente;
        this.luogoNascita = luogoNascita;
        this.nome = nome;
        this.nomeCompleto = nomeCompleto;
        this.numeroIndividuale = numeroIndividuale;
        this.sesso = sesso;
    }


    /**
     * Gets the cittadinanza value for this IdentitaPersonaFisica.
     * 
     * @return cittadinanza
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Cittadinanza getCittadinanza() {
        return cittadinanza;
    }


    /**
     * Sets the cittadinanza value for this IdentitaPersonaFisica.
     * 
     * @param cittadinanza
     */
    public void setCittadinanza(it.csi.stacore.stasogg.integration.service.gms.stub.Cittadinanza cittadinanza) {
        this.cittadinanza = cittadinanza;
    }


    /**
     * Gets the cognome value for this IdentitaPersonaFisica.
     * 
     * @return cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this IdentitaPersonaFisica.
     * 
     * @param cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the dataNascita value for this IdentitaPersonaFisica.
     * 
     * @return dataNascita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataNascita() {
        return dataNascita;
    }


    /**
     * Sets the dataNascita value for this IdentitaPersonaFisica.
     * 
     * @param dataNascita
     */
    public void setDataNascita(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita) {
        this.dataNascita = dataNascita;
    }


    /**
     * Gets the dataNascitaIncompleta value for this IdentitaPersonaFisica.
     * 
     * @return dataNascitaIncompleta
     */
    public java.lang.String getDataNascitaIncompleta() {
        return dataNascitaIncompleta;
    }


    /**
     * Sets the dataNascitaIncompleta value for this IdentitaPersonaFisica.
     * 
     * @param dataNascitaIncompleta
     */
    public void setDataNascitaIncompleta(java.lang.String dataNascitaIncompleta) {
        this.dataNascitaIncompleta = dataNascitaIncompleta;
    }


    /**
     * Gets the dataNascitaString value for this IdentitaPersonaFisica.
     * 
     * @return dataNascitaString
     */
    public java.lang.String getDataNascitaString() {
        return dataNascitaString;
    }


    /**
     * Sets the dataNascitaString value for this IdentitaPersonaFisica.
     * 
     * @param dataNascitaString
     */
    public void setDataNascitaString(java.lang.String dataNascitaString) {
        this.dataNascitaString = dataNascitaString;
    }


    /**
     * Gets the fromNaoMaNonResidente value for this IdentitaPersonaFisica.
     * 
     * @return fromNaoMaNonResidente
     */
    public boolean isFromNaoMaNonResidente() {
        return fromNaoMaNonResidente;
    }


    /**
     * Sets the fromNaoMaNonResidente value for this IdentitaPersonaFisica.
     * 
     * @param fromNaoMaNonResidente
     */
    public void setFromNaoMaNonResidente(boolean fromNaoMaNonResidente) {
        this.fromNaoMaNonResidente = fromNaoMaNonResidente;
    }


    /**
     * Gets the luogoNascita value for this IdentitaPersonaFisica.
     * 
     * @return luogoNascita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Luogo getLuogoNascita() {
        return luogoNascita;
    }


    /**
     * Sets the luogoNascita value for this IdentitaPersonaFisica.
     * 
     * @param luogoNascita
     */
    public void setLuogoNascita(it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoNascita) {
        this.luogoNascita = luogoNascita;
    }


    /**
     * Gets the nome value for this IdentitaPersonaFisica.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this IdentitaPersonaFisica.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the nomeCompleto value for this IdentitaPersonaFisica.
     * 
     * @return nomeCompleto
     */
    public java.lang.String getNomeCompleto() {
        return nomeCompleto;
    }


    /**
     * Sets the nomeCompleto value for this IdentitaPersonaFisica.
     * 
     * @param nomeCompleto
     */
    public void setNomeCompleto(java.lang.String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    /**
     * Gets the numeroIndividuale value for this IdentitaPersonaFisica.
     * 
     * @return numeroIndividuale
     */
    public java.lang.String getNumeroIndividuale() {
        return numeroIndividuale;
    }


    /**
     * Sets the numeroIndividuale value for this IdentitaPersonaFisica.
     * 
     * @param numeroIndividuale
     */
    public void setNumeroIndividuale(java.lang.String numeroIndividuale) {
        this.numeroIndividuale = numeroIndividuale;
    }


    /**
     * Gets the sesso value for this IdentitaPersonaFisica.
     * 
     * @return sesso
     */
    public java.lang.String getSesso() {
        return sesso;
    }


    /**
     * Sets the sesso value for this IdentitaPersonaFisica.
     * 
     * @param sesso
     */
    public void setSesso(java.lang.String sesso) {
        this.sesso = sesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentitaPersonaFisica)) return false;
        IdentitaPersonaFisica other = (IdentitaPersonaFisica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cittadinanza==null && other.getCittadinanza()==null) || 
             (this.cittadinanza!=null &&
              this.cittadinanza.equals(other.getCittadinanza()))) &&
            ((this.cognome==null && other.getCognome()==null) || 
             (this.cognome!=null &&
              this.cognome.equals(other.getCognome()))) &&
            ((this.dataNascita==null && other.getDataNascita()==null) || 
             (this.dataNascita!=null &&
              this.dataNascita.equals(other.getDataNascita()))) &&
            ((this.dataNascitaIncompleta==null && other.getDataNascitaIncompleta()==null) || 
             (this.dataNascitaIncompleta!=null &&
              this.dataNascitaIncompleta.equals(other.getDataNascitaIncompleta()))) &&
            ((this.dataNascitaString==null && other.getDataNascitaString()==null) || 
             (this.dataNascitaString!=null &&
              this.dataNascitaString.equals(other.getDataNascitaString()))) &&
            this.fromNaoMaNonResidente == other.isFromNaoMaNonResidente() &&
            ((this.luogoNascita==null && other.getLuogoNascita()==null) || 
             (this.luogoNascita!=null &&
              this.luogoNascita.equals(other.getLuogoNascita()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.nomeCompleto==null && other.getNomeCompleto()==null) || 
             (this.nomeCompleto!=null &&
              this.nomeCompleto.equals(other.getNomeCompleto()))) &&
            ((this.numeroIndividuale==null && other.getNumeroIndividuale()==null) || 
             (this.numeroIndividuale!=null &&
              this.numeroIndividuale.equals(other.getNumeroIndividuale()))) &&
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
        if (getCittadinanza() != null) {
            _hashCode += getCittadinanza().hashCode();
        }
        if (getCognome() != null) {
            _hashCode += getCognome().hashCode();
        }
        if (getDataNascita() != null) {
            _hashCode += getDataNascita().hashCode();
        }
        if (getDataNascitaIncompleta() != null) {
            _hashCode += getDataNascitaIncompleta().hashCode();
        }
        if (getDataNascitaString() != null) {
            _hashCode += getDataNascitaString().hashCode();
        }
        _hashCode += (isFromNaoMaNonResidente() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLuogoNascita() != null) {
            _hashCode += getLuogoNascita().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getNomeCompleto() != null) {
            _hashCode += getNomeCompleto().hashCode();
        }
        if (getNumeroIndividuale() != null) {
            _hashCode += getNumeroIndividuale().hashCode();
        }
        if (getSesso() != null) {
            _hashCode += getSesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentitaPersonaFisica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaPersonaFisica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cittadinanza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "cittadinanza"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Cittadinanza"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("dataNascitaIncompleta");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataNascitaIncompleta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascitaString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataNascitaString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromNaoMaNonResidente");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "fromNaoMaNonResidente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
        elemField.setFieldName("nomeCompleto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nomeCompleto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIndividuale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "numeroIndividuale"));
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
