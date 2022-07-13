/**
 * InserimentoImpossibileCsiException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class InserimentoImpossibileCsiException  extends it.csi.stacore.stasogg.integration.service.gms.stub.UserException  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileException inserimentoImpossibileException;

    public InserimentoImpossibileCsiException() {
    }

    public InserimentoImpossibileCsiException(
           java.lang.String nestedExcClassName,
           java.lang.String nestedExcMsg,
           java.lang.String stackTraceMessage,
           it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileException inserimentoImpossibileException) {
        super(
            nestedExcClassName,
            nestedExcMsg,
            stackTraceMessage);
        this.inserimentoImpossibileException = inserimentoImpossibileException;
    }


    /**
     * Gets the inserimentoImpossibileException value for this InserimentoImpossibileCsiException.
     * 
     * @return inserimentoImpossibileException
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileException getInserimentoImpossibileException() {
        return inserimentoImpossibileException;
    }


    /**
     * Sets the inserimentoImpossibileException value for this InserimentoImpossibileCsiException.
     * 
     * @param inserimentoImpossibileException
     */
    public void setInserimentoImpossibileException(it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileException inserimentoImpossibileException) {
        this.inserimentoImpossibileException = inserimentoImpossibileException;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserimentoImpossibileCsiException)) return false;
        InserimentoImpossibileCsiException other = (InserimentoImpossibileCsiException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.inserimentoImpossibileException==null && other.getInserimentoImpossibileException()==null) || 
             (this.inserimentoImpossibileException!=null &&
              this.inserimentoImpossibileException.equals(other.getInserimentoImpossibileException())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getInserimentoImpossibileException() != null) {
            _hashCode += getInserimentoImpossibileException().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InserimentoImpossibileCsiException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileCsiException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inserimentoImpossibileException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserimentoImpossibileException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileException"));
        elemField.setNillable(true);
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
