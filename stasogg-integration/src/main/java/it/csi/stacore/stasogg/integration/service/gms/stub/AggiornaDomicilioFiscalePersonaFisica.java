/**
 * AggiornaDomicilioFiscalePersonaFisica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class AggiornaDomicilioFiscalePersonaFisica  implements java.io.Serializable {
    private java.lang.Long in0;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo in1;

    private java.lang.String in2;

    public AggiornaDomicilioFiscalePersonaFisica() {
    }

    public AggiornaDomicilioFiscalePersonaFisica(
           java.lang.Long in0,
           it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo in1,
           java.lang.String in2) {
           this.in0 = in0;
           this.in1 = in1;
           this.in2 = in2;
    }


    /**
     * Gets the in0 value for this AggiornaDomicilioFiscalePersonaFisica.
     * 
     * @return in0
     */
    public java.lang.Long getIn0() {
        return in0;
    }


    /**
     * Sets the in0 value for this AggiornaDomicilioFiscalePersonaFisica.
     * 
     * @param in0
     */
    public void setIn0(java.lang.Long in0) {
        this.in0 = in0;
    }


    /**
     * Gets the in1 value for this AggiornaDomicilioFiscalePersonaFisica.
     * 
     * @return in1
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo getIn1() {
        return in1;
    }


    /**
     * Sets the in1 value for this AggiornaDomicilioFiscalePersonaFisica.
     * 
     * @param in1
     */
    public void setIn1(it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo in1) {
        this.in1 = in1;
    }


    /**
     * Gets the in2 value for this AggiornaDomicilioFiscalePersonaFisica.
     * 
     * @return in2
     */
    public java.lang.String getIn2() {
        return in2;
    }


    /**
     * Sets the in2 value for this AggiornaDomicilioFiscalePersonaFisica.
     * 
     * @param in2
     */
    public void setIn2(java.lang.String in2) {
        this.in2 = in2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AggiornaDomicilioFiscalePersonaFisica)) return false;
        AggiornaDomicilioFiscalePersonaFisica other = (AggiornaDomicilioFiscalePersonaFisica) obj;
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
              this.in1.equals(other.getIn1()))) &&
            ((this.in2==null && other.getIn2()==null) || 
             (this.in2!=null &&
              this.in2.equals(other.getIn2())));
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
        if (getIn2() != null) {
            _hashCode += getIn2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AggiornaDomicilioFiscalePersonaFisica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaDomicilioFiscalePersonaFisica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"));
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
