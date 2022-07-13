/**
 * ModuloRicercaPF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class ModuloRicercaPF  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String cognome;

    private java.lang.String dataNascita;

    private boolean dataNascitaCompleta;

    private boolean dataNascitaSoloAnno;

    private it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNascitaFiltroRicerca luogoNascita;

    private java.lang.String nome;

    private java.lang.String sesso;

    public ModuloRicercaPF() {
    }

    public ModuloRicercaPF(
           int indentLevel,
           java.lang.String cognome,
           java.lang.String dataNascita,
           boolean dataNascitaCompleta,
           boolean dataNascitaSoloAnno,
           it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNascitaFiltroRicerca luogoNascita,
           java.lang.String nome,
           java.lang.String sesso) {
        super(
            indentLevel);
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.dataNascitaCompleta = dataNascitaCompleta;
        this.dataNascitaSoloAnno = dataNascitaSoloAnno;
        this.luogoNascita = luogoNascita;
        this.nome = nome;
        this.sesso = sesso;
    }


    /**
     * Gets the cognome value for this ModuloRicercaPF.
     * 
     * @return cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this ModuloRicercaPF.
     * 
     * @param cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the dataNascita value for this ModuloRicercaPF.
     * 
     * @return dataNascita
     */
    public java.lang.String getDataNascita() {
        return dataNascita;
    }


    /**
     * Sets the dataNascita value for this ModuloRicercaPF.
     * 
     * @param dataNascita
     */
    public void setDataNascita(java.lang.String dataNascita) {
        this.dataNascita = dataNascita;
    }


    /**
     * Gets the dataNascitaCompleta value for this ModuloRicercaPF.
     * 
     * @return dataNascitaCompleta
     */
    public boolean isDataNascitaCompleta() {
        return dataNascitaCompleta;
    }


    /**
     * Sets the dataNascitaCompleta value for this ModuloRicercaPF.
     * 
     * @param dataNascitaCompleta
     */
    public void setDataNascitaCompleta(boolean dataNascitaCompleta) {
        this.dataNascitaCompleta = dataNascitaCompleta;
    }


    /**
     * Gets the dataNascitaSoloAnno value for this ModuloRicercaPF.
     * 
     * @return dataNascitaSoloAnno
     */
    public boolean isDataNascitaSoloAnno() {
        return dataNascitaSoloAnno;
    }


    /**
     * Sets the dataNascitaSoloAnno value for this ModuloRicercaPF.
     * 
     * @param dataNascitaSoloAnno
     */
    public void setDataNascitaSoloAnno(boolean dataNascitaSoloAnno) {
        this.dataNascitaSoloAnno = dataNascitaSoloAnno;
    }


    /**
     * Gets the luogoNascita value for this ModuloRicercaPF.
     * 
     * @return luogoNascita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNascitaFiltroRicerca getLuogoNascita() {
        return luogoNascita;
    }


    /**
     * Sets the luogoNascita value for this ModuloRicercaPF.
     * 
     * @param luogoNascita
     */
    public void setLuogoNascita(it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNascitaFiltroRicerca luogoNascita) {
        this.luogoNascita = luogoNascita;
    }


    /**
     * Gets the nome value for this ModuloRicercaPF.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ModuloRicercaPF.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the sesso value for this ModuloRicercaPF.
     * 
     * @return sesso
     */
    public java.lang.String getSesso() {
        return sesso;
    }


    /**
     * Sets the sesso value for this ModuloRicercaPF.
     * 
     * @param sesso
     */
    public void setSesso(java.lang.String sesso) {
        this.sesso = sesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuloRicercaPF)) return false;
        ModuloRicercaPF other = (ModuloRicercaPF) obj;
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
            this.dataNascitaCompleta == other.isDataNascitaCompleta() &&
            this.dataNascitaSoloAnno == other.isDataNascitaSoloAnno() &&
            ((this.luogoNascita==null && other.getLuogoNascita()==null) || 
             (this.luogoNascita!=null &&
              this.luogoNascita.equals(other.getLuogoNascita()))) &&
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
        _hashCode += (isDataNascitaCompleta() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDataNascitaSoloAnno() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLuogoNascita() != null) {
            _hashCode += getLuogoNascita().hashCode();
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
        new org.apache.axis.description.TypeDesc(ModuloRicercaPF.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloRicercaPF"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cognome");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "cognome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataNascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascitaCompleta");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataNascitaCompleta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascitaSoloAnno");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataNascitaSoloAnno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoNascita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "luogoNascita"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNascitaFiltroRicerca"));
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
