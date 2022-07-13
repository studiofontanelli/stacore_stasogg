/**
 * LuogoNascitaFiltroRicerca.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class LuogoNascitaFiltroRicerca  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String descrizioneComune;

    private java.lang.String descrizioneProvinciaOStatoEstero;

    private boolean luogoNazionale;

    public LuogoNascitaFiltroRicerca() {
    }

    public LuogoNascitaFiltroRicerca(
           int indentLevel,
           java.lang.String descrizioneComune,
           java.lang.String descrizioneProvinciaOStatoEstero,
           boolean luogoNazionale) {
        super(
            indentLevel);
        this.descrizioneComune = descrizioneComune;
        this.descrizioneProvinciaOStatoEstero = descrizioneProvinciaOStatoEstero;
        this.luogoNazionale = luogoNazionale;
    }


    /**
     * Gets the descrizioneComune value for this LuogoNascitaFiltroRicerca.
     * 
     * @return descrizioneComune
     */
    public java.lang.String getDescrizioneComune() {
        return descrizioneComune;
    }


    /**
     * Sets the descrizioneComune value for this LuogoNascitaFiltroRicerca.
     * 
     * @param descrizioneComune
     */
    public void setDescrizioneComune(java.lang.String descrizioneComune) {
        this.descrizioneComune = descrizioneComune;
    }


    /**
     * Gets the descrizioneProvinciaOStatoEstero value for this LuogoNascitaFiltroRicerca.
     * 
     * @return descrizioneProvinciaOStatoEstero
     */
    public java.lang.String getDescrizioneProvinciaOStatoEstero() {
        return descrizioneProvinciaOStatoEstero;
    }


    /**
     * Sets the descrizioneProvinciaOStatoEstero value for this LuogoNascitaFiltroRicerca.
     * 
     * @param descrizioneProvinciaOStatoEstero
     */
    public void setDescrizioneProvinciaOStatoEstero(java.lang.String descrizioneProvinciaOStatoEstero) {
        this.descrizioneProvinciaOStatoEstero = descrizioneProvinciaOStatoEstero;
    }


    /**
     * Gets the luogoNazionale value for this LuogoNascitaFiltroRicerca.
     * 
     * @return luogoNazionale
     */
    public boolean isLuogoNazionale() {
        return luogoNazionale;
    }


    /**
     * Sets the luogoNazionale value for this LuogoNascitaFiltroRicerca.
     * 
     * @param luogoNazionale
     */
    public void setLuogoNazionale(boolean luogoNazionale) {
        this.luogoNazionale = luogoNazionale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LuogoNascitaFiltroRicerca)) return false;
        LuogoNascitaFiltroRicerca other = (LuogoNascitaFiltroRicerca) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descrizioneComune==null && other.getDescrizioneComune()==null) || 
             (this.descrizioneComune!=null &&
              this.descrizioneComune.equals(other.getDescrizioneComune()))) &&
            ((this.descrizioneProvinciaOStatoEstero==null && other.getDescrizioneProvinciaOStatoEstero()==null) || 
             (this.descrizioneProvinciaOStatoEstero!=null &&
              this.descrizioneProvinciaOStatoEstero.equals(other.getDescrizioneProvinciaOStatoEstero()))) &&
            this.luogoNazionale == other.isLuogoNazionale();
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
        if (getDescrizioneComune() != null) {
            _hashCode += getDescrizioneComune().hashCode();
        }
        if (getDescrizioneProvinciaOStatoEstero() != null) {
            _hashCode += getDescrizioneProvinciaOStatoEstero().hashCode();
        }
        _hashCode += (isLuogoNazionale() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LuogoNascitaFiltroRicerca.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNascitaFiltroRicerca"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneComune");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrizioneComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneProvinciaOStatoEstero");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrizioneProvinciaOStatoEstero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoNazionale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "luogoNazionale"));
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
