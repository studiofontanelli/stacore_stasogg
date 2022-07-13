/**
 * Attivita.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class Attivita  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String codiceAteco;

    private java.lang.String descrizioneAttivita;

    public Attivita() {
    }

    public Attivita(
           int indentLevel,
           java.lang.String codiceAteco,
           java.lang.String descrizioneAttivita) {
        super(
            indentLevel);
        this.codiceAteco = codiceAteco;
        this.descrizioneAttivita = descrizioneAttivita;
    }


    /**
     * Gets the codiceAteco value for this Attivita.
     * 
     * @return codiceAteco
     */
    public java.lang.String getCodiceAteco() {
        return codiceAteco;
    }


    /**
     * Sets the codiceAteco value for this Attivita.
     * 
     * @param codiceAteco
     */
    public void setCodiceAteco(java.lang.String codiceAteco) {
        this.codiceAteco = codiceAteco;
    }


    /**
     * Gets the descrizioneAttivita value for this Attivita.
     * 
     * @return descrizioneAttivita
     */
    public java.lang.String getDescrizioneAttivita() {
        return descrizioneAttivita;
    }


    /**
     * Sets the descrizioneAttivita value for this Attivita.
     * 
     * @param descrizioneAttivita
     */
    public void setDescrizioneAttivita(java.lang.String descrizioneAttivita) {
        this.descrizioneAttivita = descrizioneAttivita;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Attivita)) return false;
        Attivita other = (Attivita) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codiceAteco==null && other.getCodiceAteco()==null) || 
             (this.codiceAteco!=null &&
              this.codiceAteco.equals(other.getCodiceAteco()))) &&
            ((this.descrizioneAttivita==null && other.getDescrizioneAttivita()==null) || 
             (this.descrizioneAttivita!=null &&
              this.descrizioneAttivita.equals(other.getDescrizioneAttivita())));
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
        if (getCodiceAteco() != null) {
            _hashCode += getCodiceAteco().hashCode();
        }
        if (getDescrizioneAttivita() != null) {
            _hashCode += getDescrizioneAttivita().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Attivita.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Attivita"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceAteco");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceAteco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneAttivita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrizioneAttivita"));
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
