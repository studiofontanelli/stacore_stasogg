/**
 * RicercaStoricaSoggettoCFResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaStoricaSoggettoCFResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaStoricaSoggettoCFReturn;

    public RicercaStoricaSoggettoCFResponse() {
    }

    public RicercaStoricaSoggettoCFResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaStoricaSoggettoCFReturn) {
           this.ricercaStoricaSoggettoCFReturn = ricercaStoricaSoggettoCFReturn;
    }


    /**
     * Gets the ricercaStoricaSoggettoCFReturn value for this RicercaStoricaSoggettoCFResponse.
     * 
     * @return ricercaStoricaSoggettoCFReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] getRicercaStoricaSoggettoCFReturn() {
        return ricercaStoricaSoggettoCFReturn;
    }


    /**
     * Sets the ricercaStoricaSoggettoCFReturn value for this RicercaStoricaSoggettoCFResponse.
     * 
     * @param ricercaStoricaSoggettoCFReturn
     */
    public void setRicercaStoricaSoggettoCFReturn(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaStoricaSoggettoCFReturn) {
        this.ricercaStoricaSoggettoCFReturn = ricercaStoricaSoggettoCFReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica getRicercaStoricaSoggettoCFReturn(int i) {
        return this.ricercaStoricaSoggettoCFReturn[i];
    }

    public void setRicercaStoricaSoggettoCFReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica _value) {
        this.ricercaStoricaSoggettoCFReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaStoricaSoggettoCFResponse)) return false;
        RicercaStoricaSoggettoCFResponse other = (RicercaStoricaSoggettoCFResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaStoricaSoggettoCFReturn==null && other.getRicercaStoricaSoggettoCFReturn()==null) || 
             (this.ricercaStoricaSoggettoCFReturn!=null &&
              java.util.Arrays.equals(this.ricercaStoricaSoggettoCFReturn, other.getRicercaStoricaSoggettoCFReturn())));
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
        if (getRicercaStoricaSoggettoCFReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRicercaStoricaSoggettoCFReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRicercaStoricaSoggettoCFReturn(), i);
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
        new org.apache.axis.description.TypeDesc(RicercaStoricaSoggettoCFResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaStoricaSoggettoCFResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaStoricaSoggettoCFReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaStoricaSoggettoCFReturn"));
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
