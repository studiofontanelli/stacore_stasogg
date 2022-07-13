/**
 * RicercaSoggettoCFWithAuthenticationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaSoggettoCFWithAuthenticationResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaSoggettoCFWithAuthenticationReturn;

    public RicercaSoggettoCFWithAuthenticationResponse() {
    }

    public RicercaSoggettoCFWithAuthenticationResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaSoggettoCFWithAuthenticationReturn) {
           this.ricercaSoggettoCFWithAuthenticationReturn = ricercaSoggettoCFWithAuthenticationReturn;
    }


    /**
     * Gets the ricercaSoggettoCFWithAuthenticationReturn value for this RicercaSoggettoCFWithAuthenticationResponse.
     * 
     * @return ricercaSoggettoCFWithAuthenticationReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] getRicercaSoggettoCFWithAuthenticationReturn() {
        return ricercaSoggettoCFWithAuthenticationReturn;
    }


    /**
     * Sets the ricercaSoggettoCFWithAuthenticationReturn value for this RicercaSoggettoCFWithAuthenticationResponse.
     * 
     * @param ricercaSoggettoCFWithAuthenticationReturn
     */
    public void setRicercaSoggettoCFWithAuthenticationReturn(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaSoggettoCFWithAuthenticationReturn) {
        this.ricercaSoggettoCFWithAuthenticationReturn = ricercaSoggettoCFWithAuthenticationReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica getRicercaSoggettoCFWithAuthenticationReturn(int i) {
        return this.ricercaSoggettoCFWithAuthenticationReturn[i];
    }

    public void setRicercaSoggettoCFWithAuthenticationReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica _value) {
        this.ricercaSoggettoCFWithAuthenticationReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaSoggettoCFWithAuthenticationResponse)) return false;
        RicercaSoggettoCFWithAuthenticationResponse other = (RicercaSoggettoCFWithAuthenticationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaSoggettoCFWithAuthenticationReturn==null && other.getRicercaSoggettoCFWithAuthenticationReturn()==null) || 
             (this.ricercaSoggettoCFWithAuthenticationReturn!=null &&
              java.util.Arrays.equals(this.ricercaSoggettoCFWithAuthenticationReturn, other.getRicercaSoggettoCFWithAuthenticationReturn())));
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
        if (getRicercaSoggettoCFWithAuthenticationReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRicercaSoggettoCFWithAuthenticationReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRicercaSoggettoCFWithAuthenticationReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RicercaSoggettoCFWithAuthenticationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoCFWithAuthenticationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaSoggettoCFWithAuthenticationReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoCFWithAuthenticationReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
