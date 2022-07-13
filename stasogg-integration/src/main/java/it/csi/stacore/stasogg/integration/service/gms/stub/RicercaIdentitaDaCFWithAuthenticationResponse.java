/**
 * RicercaIdentitaDaCFWithAuthenticationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaIdentitaDaCFWithAuthenticationResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] ricercaIdentitaDaCFWithAuthenticationReturn;

    public RicercaIdentitaDaCFWithAuthenticationResponse() {
    }

    public RicercaIdentitaDaCFWithAuthenticationResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] ricercaIdentitaDaCFWithAuthenticationReturn) {
           this.ricercaIdentitaDaCFWithAuthenticationReturn = ricercaIdentitaDaCFWithAuthenticationReturn;
    }


    /**
     * Gets the ricercaIdentitaDaCFWithAuthenticationReturn value for this RicercaIdentitaDaCFWithAuthenticationResponse.
     * 
     * @return ricercaIdentitaDaCFWithAuthenticationReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] getRicercaIdentitaDaCFWithAuthenticationReturn() {
        return ricercaIdentitaDaCFWithAuthenticationReturn;
    }


    /**
     * Sets the ricercaIdentitaDaCFWithAuthenticationReturn value for this RicercaIdentitaDaCFWithAuthenticationResponse.
     * 
     * @param ricercaIdentitaDaCFWithAuthenticationReturn
     */
    public void setRicercaIdentitaDaCFWithAuthenticationReturn(it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] ricercaIdentitaDaCFWithAuthenticationReturn) {
        this.ricercaIdentitaDaCFWithAuthenticationReturn = ricercaIdentitaDaCFWithAuthenticationReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita getRicercaIdentitaDaCFWithAuthenticationReturn(int i) {
        return this.ricercaIdentitaDaCFWithAuthenticationReturn[i];
    }

    public void setRicercaIdentitaDaCFWithAuthenticationReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.Identita _value) {
        this.ricercaIdentitaDaCFWithAuthenticationReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaIdentitaDaCFWithAuthenticationResponse)) return false;
        RicercaIdentitaDaCFWithAuthenticationResponse other = (RicercaIdentitaDaCFWithAuthenticationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaIdentitaDaCFWithAuthenticationReturn==null && other.getRicercaIdentitaDaCFWithAuthenticationReturn()==null) || 
             (this.ricercaIdentitaDaCFWithAuthenticationReturn!=null &&
              java.util.Arrays.equals(this.ricercaIdentitaDaCFWithAuthenticationReturn, other.getRicercaIdentitaDaCFWithAuthenticationReturn())));
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
        if (getRicercaIdentitaDaCFWithAuthenticationReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRicercaIdentitaDaCFWithAuthenticationReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRicercaIdentitaDaCFWithAuthenticationReturn(), i);
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
        new org.apache.axis.description.TypeDesc(RicercaIdentitaDaCFWithAuthenticationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIdentitaDaCFWithAuthenticationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaIdentitaDaCFWithAuthenticationReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIdentitaDaCFWithAuthenticationReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Identita"));
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
