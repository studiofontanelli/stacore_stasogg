/**
 * RicercaIdentitaDaCFResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaIdentitaDaCFResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] ricercaIdentitaDaCFReturn;

    public RicercaIdentitaDaCFResponse() {
    }

    public RicercaIdentitaDaCFResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] ricercaIdentitaDaCFReturn) {
           this.ricercaIdentitaDaCFReturn = ricercaIdentitaDaCFReturn;
    }


    /**
     * Gets the ricercaIdentitaDaCFReturn value for this RicercaIdentitaDaCFResponse.
     * 
     * @return ricercaIdentitaDaCFReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] getRicercaIdentitaDaCFReturn() {
        return ricercaIdentitaDaCFReturn;
    }


    /**
     * Sets the ricercaIdentitaDaCFReturn value for this RicercaIdentitaDaCFResponse.
     * 
     * @param ricercaIdentitaDaCFReturn
     */
    public void setRicercaIdentitaDaCFReturn(it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] ricercaIdentitaDaCFReturn) {
        this.ricercaIdentitaDaCFReturn = ricercaIdentitaDaCFReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita getRicercaIdentitaDaCFReturn(int i) {
        return this.ricercaIdentitaDaCFReturn[i];
    }

    public void setRicercaIdentitaDaCFReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.Identita _value) {
        this.ricercaIdentitaDaCFReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaIdentitaDaCFResponse)) return false;
        RicercaIdentitaDaCFResponse other = (RicercaIdentitaDaCFResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaIdentitaDaCFReturn==null && other.getRicercaIdentitaDaCFReturn()==null) || 
             (this.ricercaIdentitaDaCFReturn!=null &&
              java.util.Arrays.equals(this.ricercaIdentitaDaCFReturn, other.getRicercaIdentitaDaCFReturn())));
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
        if (getRicercaIdentitaDaCFReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRicercaIdentitaDaCFReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRicercaIdentitaDaCFReturn(), i);
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
        new org.apache.axis.description.TypeDesc(RicercaIdentitaDaCFResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIdentitaDaCFResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaIdentitaDaCFReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIdentitaDaCFReturn"));
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
