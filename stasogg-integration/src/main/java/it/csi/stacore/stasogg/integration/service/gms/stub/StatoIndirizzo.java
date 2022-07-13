/**
 * StatoIndirizzo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class StatoIndirizzo  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.Long codiceStatoIndirizzo;

    private java.lang.String descrStatoIndirizzo;

    public StatoIndirizzo() {
    }

    public StatoIndirizzo(
           int indentLevel,
           java.lang.Long codiceStatoIndirizzo,
           java.lang.String descrStatoIndirizzo) {
        super(
            indentLevel);
        this.codiceStatoIndirizzo = codiceStatoIndirizzo;
        this.descrStatoIndirizzo = descrStatoIndirizzo;
    }


    /**
     * Gets the codiceStatoIndirizzo value for this StatoIndirizzo.
     * 
     * @return codiceStatoIndirizzo
     */
    public java.lang.Long getCodiceStatoIndirizzo() {
        return codiceStatoIndirizzo;
    }


    /**
     * Sets the codiceStatoIndirizzo value for this StatoIndirizzo.
     * 
     * @param codiceStatoIndirizzo
     */
    public void setCodiceStatoIndirizzo(java.lang.Long codiceStatoIndirizzo) {
        this.codiceStatoIndirizzo = codiceStatoIndirizzo;
    }


    /**
     * Gets the descrStatoIndirizzo value for this StatoIndirizzo.
     * 
     * @return descrStatoIndirizzo
     */
    public java.lang.String getDescrStatoIndirizzo() {
        return descrStatoIndirizzo;
    }


    /**
     * Sets the descrStatoIndirizzo value for this StatoIndirizzo.
     * 
     * @param descrStatoIndirizzo
     */
    public void setDescrStatoIndirizzo(java.lang.String descrStatoIndirizzo) {
        this.descrStatoIndirizzo = descrStatoIndirizzo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatoIndirizzo)) return false;
        StatoIndirizzo other = (StatoIndirizzo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codiceStatoIndirizzo==null && other.getCodiceStatoIndirizzo()==null) || 
             (this.codiceStatoIndirizzo!=null &&
              this.codiceStatoIndirizzo.equals(other.getCodiceStatoIndirizzo()))) &&
            ((this.descrStatoIndirizzo==null && other.getDescrStatoIndirizzo()==null) || 
             (this.descrStatoIndirizzo!=null &&
              this.descrStatoIndirizzo.equals(other.getDescrStatoIndirizzo())));
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
        if (getCodiceStatoIndirizzo() != null) {
            _hashCode += getCodiceStatoIndirizzo().hashCode();
        }
        if (getDescrStatoIndirizzo() != null) {
            _hashCode += getDescrStatoIndirizzo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatoIndirizzo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "StatoIndirizzo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceStatoIndirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceStatoIndirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrStatoIndirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrStatoIndirizzo"));
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
