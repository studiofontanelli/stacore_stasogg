/**
 * CodiceFiscaleNonCensitoException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class CodiceFiscaleNonCensitoException  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractException  implements java.io.Serializable {
    private java.lang.String codiceFiscaleNonCensito;

    private java.lang.String message;

    public CodiceFiscaleNonCensitoException() {
    }

    public CodiceFiscaleNonCensitoException(
           java.lang.String codiceFiscaleNonCensito,
           java.lang.String message) {
        this.codiceFiscaleNonCensito = codiceFiscaleNonCensito;
        this.message = message;
    }


    /**
     * Gets the codiceFiscaleNonCensito value for this CodiceFiscaleNonCensitoException.
     * 
     * @return codiceFiscaleNonCensito
     */
    public java.lang.String getCodiceFiscaleNonCensito() {
        return codiceFiscaleNonCensito;
    }


    /**
     * Sets the codiceFiscaleNonCensito value for this CodiceFiscaleNonCensitoException.
     * 
     * @param codiceFiscaleNonCensito
     */
    public void setCodiceFiscaleNonCensito(java.lang.String codiceFiscaleNonCensito) {
        this.codiceFiscaleNonCensito = codiceFiscaleNonCensito;
    }


    /**
     * Gets the message value for this CodiceFiscaleNonCensitoException.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CodiceFiscaleNonCensitoException.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodiceFiscaleNonCensitoException)) return false;
        CodiceFiscaleNonCensitoException other = (CodiceFiscaleNonCensitoException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codiceFiscaleNonCensito==null && other.getCodiceFiscaleNonCensito()==null) || 
             (this.codiceFiscaleNonCensito!=null &&
              this.codiceFiscaleNonCensito.equals(other.getCodiceFiscaleNonCensito()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getCodiceFiscaleNonCensito() != null) {
            _hashCode += getCodiceFiscaleNonCensito().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodiceFiscaleNonCensitoException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonCensitoException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscaleNonCensito");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceFiscaleNonCensito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "message"));
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
