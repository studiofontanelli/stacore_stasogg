/**
 * RicercaPersonaFisicaCompletaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaPersonaFisicaCompletaResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisicaCompletaReturn;

    public RicercaPersonaFisicaCompletaResponse() {
    }

    public RicercaPersonaFisicaCompletaResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisicaCompletaReturn) {
           this.ricercaPersonaFisicaCompletaReturn = ricercaPersonaFisicaCompletaReturn;
    }


    /**
     * Gets the ricercaPersonaFisicaCompletaReturn value for this RicercaPersonaFisicaCompletaResponse.
     * 
     * @return ricercaPersonaFisicaCompletaReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] getRicercaPersonaFisicaCompletaReturn() {
        return ricercaPersonaFisicaCompletaReturn;
    }


    /**
     * Sets the ricercaPersonaFisicaCompletaReturn value for this RicercaPersonaFisicaCompletaResponse.
     * 
     * @param ricercaPersonaFisicaCompletaReturn
     */
    public void setRicercaPersonaFisicaCompletaReturn(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisicaCompletaReturn) {
        this.ricercaPersonaFisicaCompletaReturn = ricercaPersonaFisicaCompletaReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF getRicercaPersonaFisicaCompletaReturn(int i) {
        return this.ricercaPersonaFisicaCompletaReturn[i];
    }

    public void setRicercaPersonaFisicaCompletaReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF _value) {
        this.ricercaPersonaFisicaCompletaReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaPersonaFisicaCompletaResponse)) return false;
        RicercaPersonaFisicaCompletaResponse other = (RicercaPersonaFisicaCompletaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ricercaPersonaFisicaCompletaReturn==null && other.getRicercaPersonaFisicaCompletaReturn()==null) || 
             (this.ricercaPersonaFisicaCompletaReturn!=null &&
              java.util.Arrays.equals(this.ricercaPersonaFisicaCompletaReturn, other.getRicercaPersonaFisicaCompletaReturn())));
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
        if (getRicercaPersonaFisicaCompletaReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRicercaPersonaFisicaCompletaReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRicercaPersonaFisicaCompletaReturn(), i);
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
        new org.apache.axis.description.TypeDesc(RicercaPersonaFisicaCompletaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisicaCompletaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaPersonaFisicaCompletaReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaPersonaFisicaCompletaReturn"));
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
