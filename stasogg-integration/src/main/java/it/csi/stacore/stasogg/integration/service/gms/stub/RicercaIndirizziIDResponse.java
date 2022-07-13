/**
 * RicercaIndirizziIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaIndirizziIDResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[] ricercaIndirizziIDReturn;

    public RicercaIndirizziIDResponse() {
    }

    public RicercaIndirizziIDResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[] ricercaIndirizziIDReturn) {
           this.ricercaIndirizziIDReturn = ricercaIndirizziIDReturn;
    }


    /**
     * Gets the ricercaIndirizziIDReturn value for this RicercaIndirizziIDResponse.
     * 
     * @return ricercaIndirizziIDReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[] getRicercaIndirizziIDReturn() {
        return ricercaIndirizziIDReturn;
    }


    /**
     * Sets the ricercaIndirizziIDReturn value for this RicercaIndirizziIDResponse.
     * 
     * @param ricercaIndirizziIDReturn
     */
    public void setRicercaIndirizziIDReturn(it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[] ricercaIndirizziIDReturn) {
        this.ricercaIndirizziIDReturn = ricercaIndirizziIDReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo getRicercaIndirizziIDReturn(int i) {
        return this.ricercaIndirizziIDReturn[i];
    }

    public void setRicercaIndirizziIDReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo _value) {
        this.ricercaIndirizziIDReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaIndirizziIDResponse)) return false;
        RicercaIndirizziIDResponse other = (RicercaIndirizziIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaIndirizziIDReturn==null && other.getRicercaIndirizziIDReturn()==null) || 
             (this.ricercaIndirizziIDReturn!=null &&
              java.util.Arrays.equals(this.ricercaIndirizziIDReturn, other.getRicercaIndirizziIDReturn())));
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
        if (getRicercaIndirizziIDReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRicercaIndirizziIDReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRicercaIndirizziIDReturn(), i);
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
        new org.apache.axis.description.TypeDesc(RicercaIndirizziIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIndirizziIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaIndirizziIDReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIndirizziIDReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"));
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
