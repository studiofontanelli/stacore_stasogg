/**
 * RicercaCFDaIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaCFDaIDResponse  implements java.io.Serializable {
    private java.lang.String ricercaCFDaIDReturn;

    public RicercaCFDaIDResponse() {
    }

    public RicercaCFDaIDResponse(
           java.lang.String ricercaCFDaIDReturn) {
           this.ricercaCFDaIDReturn = ricercaCFDaIDReturn;
    }


    /**
     * Gets the ricercaCFDaIDReturn value for this RicercaCFDaIDResponse.
     * 
     * @return ricercaCFDaIDReturn
     */
    public java.lang.String getRicercaCFDaIDReturn() {
        return ricercaCFDaIDReturn;
    }


    /**
     * Sets the ricercaCFDaIDReturn value for this RicercaCFDaIDResponse.
     * 
     * @param ricercaCFDaIDReturn
     */
    public void setRicercaCFDaIDReturn(java.lang.String ricercaCFDaIDReturn) {
        this.ricercaCFDaIDReturn = ricercaCFDaIDReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaCFDaIDResponse)) return false;
        RicercaCFDaIDResponse other = (RicercaCFDaIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaCFDaIDReturn==null && other.getRicercaCFDaIDReturn()==null) || 
             (this.ricercaCFDaIDReturn!=null &&
              this.ricercaCFDaIDReturn.equals(other.getRicercaCFDaIDReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRicercaCFDaIDReturn() != null) {
            _hashCode += getRicercaCFDaIDReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RicercaCFDaIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaCFDaIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaCFDaIDReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaCFDaIDReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
