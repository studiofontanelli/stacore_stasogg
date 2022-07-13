/**
 * RicercaStoricaSoggettoIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaStoricaSoggettoIDResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaStoricaSoggettoIDReturn;

    public RicercaStoricaSoggettoIDResponse() {
    }

    public RicercaStoricaSoggettoIDResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaStoricaSoggettoIDReturn) {
           this.ricercaStoricaSoggettoIDReturn = ricercaStoricaSoggettoIDReturn;
    }


    /**
     * Gets the ricercaStoricaSoggettoIDReturn value for this RicercaStoricaSoggettoIDResponse.
     * 
     * @return ricercaStoricaSoggettoIDReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica getRicercaStoricaSoggettoIDReturn() {
        return ricercaStoricaSoggettoIDReturn;
    }


    /**
     * Sets the ricercaStoricaSoggettoIDReturn value for this RicercaStoricaSoggettoIDResponse.
     * 
     * @param ricercaStoricaSoggettoIDReturn
     */
    public void setRicercaStoricaSoggettoIDReturn(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaStoricaSoggettoIDReturn) {
        this.ricercaStoricaSoggettoIDReturn = ricercaStoricaSoggettoIDReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaStoricaSoggettoIDResponse)) return false;
        RicercaStoricaSoggettoIDResponse other = (RicercaStoricaSoggettoIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaStoricaSoggettoIDReturn==null && other.getRicercaStoricaSoggettoIDReturn()==null) || 
             (this.ricercaStoricaSoggettoIDReturn!=null &&
              this.ricercaStoricaSoggettoIDReturn.equals(other.getRicercaStoricaSoggettoIDReturn())));
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
        if (getRicercaStoricaSoggettoIDReturn() != null) {
            _hashCode += getRicercaStoricaSoggettoIDReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RicercaStoricaSoggettoIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaStoricaSoggettoIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaStoricaSoggettoIDReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaStoricaSoggettoIDReturn"));
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
