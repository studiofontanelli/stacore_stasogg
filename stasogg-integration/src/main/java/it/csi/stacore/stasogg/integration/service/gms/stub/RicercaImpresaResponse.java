/**
 * RicercaImpresaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaImpresaResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[] ricercaImpresaReturn;

    public RicercaImpresaResponse() {
    }

    public RicercaImpresaResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[] ricercaImpresaReturn) {
           this.ricercaImpresaReturn = ricercaImpresaReturn;
    }


    /**
     * Gets the ricercaImpresaReturn value for this RicercaImpresaResponse.
     * 
     * @return ricercaImpresaReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[] getRicercaImpresaReturn() {
        return ricercaImpresaReturn;
    }


    /**
     * Sets the ricercaImpresaReturn value for this RicercaImpresaResponse.
     * 
     * @param ricercaImpresaReturn
     */
    public void setRicercaImpresaReturn(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[] ricercaImpresaReturn) {
        this.ricercaImpresaReturn = ricercaImpresaReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa getRicercaImpresaReturn(int i) {
        return this.ricercaImpresaReturn[i];
    }

    public void setRicercaImpresaReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa _value) {
        this.ricercaImpresaReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaImpresaResponse)) return false;
        RicercaImpresaResponse other = (RicercaImpresaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaImpresaReturn==null && other.getRicercaImpresaReturn()==null) || 
             (this.ricercaImpresaReturn!=null &&
              java.util.Arrays.equals(this.ricercaImpresaReturn, other.getRicercaImpresaReturn())));
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
        if (getRicercaImpresaReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRicercaImpresaReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRicercaImpresaReturn(), i);
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
        new org.apache.axis.description.TypeDesc(RicercaImpresaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaImpresaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaImpresaReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaImpresaReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoImpresa"));
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
