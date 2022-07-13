/**
 * RicercaPersonaFisicaWithAuthenticationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaPersonaFisicaWithAuthenticationResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisicaWithAuthenticationReturn;

    public RicercaPersonaFisicaWithAuthenticationResponse() {
    }

    public RicercaPersonaFisicaWithAuthenticationResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisicaWithAuthenticationReturn) {
           this.ricercaPersonaFisicaWithAuthenticationReturn = ricercaPersonaFisicaWithAuthenticationReturn;
    }


    /**
     * Gets the ricercaPersonaFisicaWithAuthenticationReturn value for this RicercaPersonaFisicaWithAuthenticationResponse.
     * 
     * @return ricercaPersonaFisicaWithAuthenticationReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] getRicercaPersonaFisicaWithAuthenticationReturn() {
        return ricercaPersonaFisicaWithAuthenticationReturn;
    }


    /**
     * Sets the ricercaPersonaFisicaWithAuthenticationReturn value for this RicercaPersonaFisicaWithAuthenticationResponse.
     * 
     * @param ricercaPersonaFisicaWithAuthenticationReturn
     */
    public void setRicercaPersonaFisicaWithAuthenticationReturn(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisicaWithAuthenticationReturn) {
        this.ricercaPersonaFisicaWithAuthenticationReturn = ricercaPersonaFisicaWithAuthenticationReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF getRicercaPersonaFisicaWithAuthenticationReturn(int i) {
        return this.ricercaPersonaFisicaWithAuthenticationReturn[i];
    }

    public void setRicercaPersonaFisicaWithAuthenticationReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF _value) {
        this.ricercaPersonaFisicaWithAuthenticationReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaPersonaFisicaWithAuthenticationResponse)) return false;
        RicercaPersonaFisicaWithAuthenticationResponse other = (RicercaPersonaFisicaWithAuthenticationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaPersonaFisicaWithAuthenticationReturn==null && other.getRicercaPersonaFisicaWithAuthenticationReturn()==null) || 
             (this.ricercaPersonaFisicaWithAuthenticationReturn!=null &&
              java.util.Arrays.equals(this.ricercaPersonaFisicaWithAuthenticationReturn, other.getRicercaPersonaFisicaWithAuthenticationReturn())));
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
        if (getRicercaPersonaFisicaWithAuthenticationReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRicercaPersonaFisicaWithAuthenticationReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRicercaPersonaFisicaWithAuthenticationReturn(), i);
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
        new org.apache.axis.description.TypeDesc(RicercaPersonaFisicaWithAuthenticationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisicaWithAuthenticationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaPersonaFisicaWithAuthenticationReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaPersonaFisicaWithAuthenticationReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF"));
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
