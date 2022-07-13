/**
 * SoggettoNonTrovatoException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class SoggettoNonTrovatoException  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractException  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoExceptionErrorCode errorCode;

    private java.lang.String message;

    public SoggettoNonTrovatoException() {
    }

    public SoggettoNonTrovatoException(
           it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoExceptionErrorCode errorCode,
           java.lang.String message) {
        this.errorCode = errorCode;
        this.message = message;
    }


    /**
     * Gets the errorCode value for this SoggettoNonTrovatoException.
     * 
     * @return errorCode
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoExceptionErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this SoggettoNonTrovatoException.
     * 
     * @param errorCode
     */
    public void setErrorCode(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoExceptionErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the message value for this SoggettoNonTrovatoException.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SoggettoNonTrovatoException.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoggettoNonTrovatoException)) return false;
        SoggettoNonTrovatoException other = (SoggettoNonTrovatoException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoggettoNonTrovatoException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoException.ErrorCode"));
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
