/**
 * ModuloModificaCFPersonaFisica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class ModuloModificaCFPersonaFisica  extends it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCF  implements java.io.Serializable {
    private java.lang.String cognome;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita;

    private java.lang.Long idComuneNascita;

    private java.lang.String nome;

    private java.lang.String sesso;

    public ModuloModificaCFPersonaFisica() {
    }

    public ModuloModificaCFPersonaFisica(
           int indentLevel,
           java.lang.String codFiscaleNuovo,
           java.lang.String codFiscaleVecchio,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataVal,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long idSoggetto,
           boolean moduloPF,
           java.lang.String nota,
           java.lang.String cognome,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita,
           java.lang.Long idComuneNascita,
           java.lang.String nome,
           java.lang.String sesso) {
        super(
            indentLevel,
            codFiscaleNuovo,
            codFiscaleVecchio,
            dataVal,
            fonteProvenienza,
            idSoggetto,
            moduloPF,
            nota);
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.idComuneNascita = idComuneNascita;
        this.nome = nome;
        this.sesso = sesso;
    }


    /**
     * Gets the cognome value for this ModuloModificaCFPersonaFisica.
     * 
     * @return cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this ModuloModificaCFPersonaFisica.
     * 
     * @param cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the dataNascita value for this ModuloModificaCFPersonaFisica.
     * 
     * @return dataNascita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataNascita() {
        return dataNascita;
    }


    /**
     * Sets the dataNascita value for this ModuloModificaCFPersonaFisica.
     * 
     * @param dataNascita
     */
    public void setDataNascita(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataNascita) {
        this.dataNascita = dataNascita;
    }


    /**
     * Gets the idComuneNascita value for this ModuloModificaCFPersonaFisica.
     * 
     * @return idComuneNascita
     */
    public java.lang.Long getIdComuneNascita() {
        return idComuneNascita;
    }


    /**
     * Sets the idComuneNascita value for this ModuloModificaCFPersonaFisica.
     * 
     * @param idComuneNascita
     */
    public void setIdComuneNascita(java.lang.Long idComuneNascita) {
        this.idComuneNascita = idComuneNascita;
    }


    /**
     * Gets the nome value for this ModuloModificaCFPersonaFisica.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ModuloModificaCFPersonaFisica.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the sesso value for this ModuloModificaCFPersonaFisica.
     * 
     * @return sesso
     */
    public java.lang.String getSesso() {
        return sesso;
    }


    /**
     * Sets the sesso value for this ModuloModificaCFPersonaFisica.
     * 
     * @param sesso
     */
    public void setSesso(java.lang.String sesso) {
        this.sesso = sesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuloModificaCFPersonaFisica)) return false;
        ModuloModificaCFPersonaFisica other = (ModuloModificaCFPersonaFisica) obj;
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
            ((this.idComuneNascita==null && other.getIdComuneNascita()==null) || 
             (this.idComuneNascita!=null &&
              this.idComuneNascita.equals(other.getIdComuneNascita()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
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
        if (getIdComuneNascita() != null) {
            _hashCode += getIdComuneNascita().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getSesso() != null) {
            _hashCode += getSesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModuloModificaCFPersonaFisica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCFPersonaFisica"));
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
        elemField.setFieldName("idComuneNascita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idComuneNascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nome"));
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
