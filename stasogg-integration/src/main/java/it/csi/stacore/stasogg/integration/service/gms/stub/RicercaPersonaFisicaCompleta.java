/**
 * RicercaPersonaFisicaCompleta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class RicercaPersonaFisicaCompleta  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.ModuloRicercaPF in0;

    private java.lang.String in1;

    public RicercaPersonaFisicaCompleta() {
    }

    public RicercaPersonaFisicaCompleta(
           it.csi.stacore.stasogg.integration.service.gms.stub.ModuloRicercaPF in0,
           java.lang.String in1) {
           this.in0 = in0;
           this.in1 = in1;
    }


    /**
     * Gets the in0 value for this RicercaPersonaFisicaCompleta.
     * 
     * @return in0
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.ModuloRicercaPF getIn0() {
        return in0;
    }


    /**
     * Sets the in0 value for this RicercaPersonaFisicaCompleta.
     * 
     * @param in0
     */
    public void setIn0(it.csi.stacore.stasogg.integration.service.gms.stub.ModuloRicercaPF in0) {
        this.in0 = in0;
    }


    /**
     * Gets the in1 value for this RicercaPersonaFisicaCompleta.
     * 
     * @return in1
     */
    public java.lang.String getIn1() {
        return in1;
    }


    /**
     * Sets the in1 value for this RicercaPersonaFisicaCompleta.
     * 
     * @param in1
     */
    public void setIn1(java.lang.String in1) {
        this.in1 = in1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaPersonaFisicaCompleta)) return false;
        RicercaPersonaFisicaCompleta other = (RicercaPersonaFisicaCompleta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.in0==null && other.getIn0()==null) || 
             (this.in0!=null &&
              this.in0.equals(other.getIn0()))) &&
            ((this.in1==null && other.getIn1()==null) || 
             (this.in1!=null &&
              this.in1.equals(other.getIn1())));
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
        if (getIn0() != null) {
            _hashCode += getIn0().hashCode();
        }
        if (getIn1() != null) {
            _hashCode += getIn1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RicercaPersonaFisicaCompleta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisicaCompleta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloRicercaPF"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
