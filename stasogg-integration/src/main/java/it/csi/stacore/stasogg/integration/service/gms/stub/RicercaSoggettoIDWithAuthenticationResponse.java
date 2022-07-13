/**
 * RicercaSoggettoIDWithAuthenticationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaSoggettoIDWithAuthenticationResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaSoggettoIDWithAuthenticationReturn;

    public RicercaSoggettoIDWithAuthenticationResponse() {
    }

    public RicercaSoggettoIDWithAuthenticationResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaSoggettoIDWithAuthenticationReturn) {
           this.ricercaSoggettoIDWithAuthenticationReturn = ricercaSoggettoIDWithAuthenticationReturn;
    }


    /**
     * Gets the ricercaSoggettoIDWithAuthenticationReturn value for this RicercaSoggettoIDWithAuthenticationResponse.
     * 
     * @return ricercaSoggettoIDWithAuthenticationReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica getRicercaSoggettoIDWithAuthenticationReturn() {
        return ricercaSoggettoIDWithAuthenticationReturn;
    }


    /**
     * Sets the ricercaSoggettoIDWithAuthenticationReturn value for this RicercaSoggettoIDWithAuthenticationResponse.
     * 
     * @param ricercaSoggettoIDWithAuthenticationReturn
     */
    public void setRicercaSoggettoIDWithAuthenticationReturn(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaSoggettoIDWithAuthenticationReturn) {
        this.ricercaSoggettoIDWithAuthenticationReturn = ricercaSoggettoIDWithAuthenticationReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaSoggettoIDWithAuthenticationResponse)) return false;
        RicercaSoggettoIDWithAuthenticationResponse other = (RicercaSoggettoIDWithAuthenticationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaSoggettoIDWithAuthenticationReturn==null && other.getRicercaSoggettoIDWithAuthenticationReturn()==null) || 
             (this.ricercaSoggettoIDWithAuthenticationReturn!=null &&
              this.ricercaSoggettoIDWithAuthenticationReturn.equals(other.getRicercaSoggettoIDWithAuthenticationReturn())));
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
        if (getRicercaSoggettoIDWithAuthenticationReturn() != null) {
            _hashCode += getRicercaSoggettoIDWithAuthenticationReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RicercaSoggettoIDWithAuthenticationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoIDWithAuthenticationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaSoggettoIDWithAuthenticationReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoIDWithAuthenticationReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
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
