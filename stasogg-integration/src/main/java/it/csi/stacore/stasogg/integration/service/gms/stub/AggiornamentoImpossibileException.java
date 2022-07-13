/**
 * AggiornamentoImpossibileException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class AggiornamentoImpossibileException  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractException  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileExceptionErrorCode errorCode;

    private java.lang.String nomeOggettoNonAggiornabile;

    private java.lang.Object subErrorCode;

    public AggiornamentoImpossibileException() {
    }

    public AggiornamentoImpossibileException(
           it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileExceptionErrorCode errorCode,
           java.lang.String nomeOggettoNonAggiornabile,
           java.lang.Object subErrorCode) {
        this.errorCode = errorCode;
        this.nomeOggettoNonAggiornabile = nomeOggettoNonAggiornabile;
        this.subErrorCode = subErrorCode;
    }


    /**
     * Gets the errorCode value for this AggiornamentoImpossibileException.
     * 
     * @return errorCode
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileExceptionErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this AggiornamentoImpossibileException.
     * 
     * @param errorCode
     */
    public void setErrorCode(it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileExceptionErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the nomeOggettoNonAggiornabile value for this AggiornamentoImpossibileException.
     * 
     * @return nomeOggettoNonAggiornabile
     */
    public java.lang.String getNomeOggettoNonAggiornabile() {
        return nomeOggettoNonAggiornabile;
    }


    /**
     * Sets the nomeOggettoNonAggiornabile value for this AggiornamentoImpossibileException.
     * 
     * @param nomeOggettoNonAggiornabile
     */
    public void setNomeOggettoNonAggiornabile(java.lang.String nomeOggettoNonAggiornabile) {
        this.nomeOggettoNonAggiornabile = nomeOggettoNonAggiornabile;
    }


    /**
     * Gets the subErrorCode value for this AggiornamentoImpossibileException.
     * 
     * @return subErrorCode
     */
    public java.lang.Object getSubErrorCode() {
        return subErrorCode;
    }


    /**
     * Sets the subErrorCode value for this AggiornamentoImpossibileException.
     * 
     * @param subErrorCode
     */
    public void setSubErrorCode(java.lang.Object subErrorCode) {
        this.subErrorCode = subErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AggiornamentoImpossibileException)) return false;
        AggiornamentoImpossibileException other = (AggiornamentoImpossibileException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.nomeOggettoNonAggiornabile==null && other.getNomeOggettoNonAggiornabile()==null) || 
             (this.nomeOggettoNonAggiornabile!=null &&
              this.nomeOggettoNonAggiornabile.equals(other.getNomeOggettoNonAggiornabile()))) &&
            ((this.subErrorCode==null && other.getSubErrorCode()==null) || 
             (this.subErrorCode!=null &&
              this.subErrorCode.equals(other.getSubErrorCode())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getNomeOggettoNonAggiornabile() != null) {
            _hashCode += getNomeOggettoNonAggiornabile().hashCode();
        }
        if (getSubErrorCode() != null) {
            _hashCode += getSubErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AggiornamentoImpossibileException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileException.ErrorCode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeOggettoNonAggiornabile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nomeOggettoNonAggiornabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "subErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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

}
