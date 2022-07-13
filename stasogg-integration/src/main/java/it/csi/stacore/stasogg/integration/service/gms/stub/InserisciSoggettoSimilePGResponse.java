/**
 * InserisciSoggettoSimilePGResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class InserisciSoggettoSimilePGResponse  implements java.io.Serializable {
    private java.lang.Long inserisciSoggettoSimilePGReturn;

    public InserisciSoggettoSimilePGResponse() {
    }

    public InserisciSoggettoSimilePGResponse(
           java.lang.Long inserisciSoggettoSimilePGReturn) {
           this.inserisciSoggettoSimilePGReturn = inserisciSoggettoSimilePGReturn;
    }


    /**
     * Gets the inserisciSoggettoSimilePGReturn value for this InserisciSoggettoSimilePGResponse.
     * 
     * @return inserisciSoggettoSimilePGReturn
     */
    public java.lang.Long getInserisciSoggettoSimilePGReturn() {
        return inserisciSoggettoSimilePGReturn;
    }


    /**
     * Sets the inserisciSoggettoSimilePGReturn value for this InserisciSoggettoSimilePGResponse.
     * 
     * @param inserisciSoggettoSimilePGReturn
     */
    public void setInserisciSoggettoSimilePGReturn(java.lang.Long inserisciSoggettoSimilePGReturn) {
        this.inserisciSoggettoSimilePGReturn = inserisciSoggettoSimilePGReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserisciSoggettoSimilePGResponse)) return false;
        InserisciSoggettoSimilePGResponse other = (InserisciSoggettoSimilePGResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inserisciSoggettoSimilePGReturn==null && other.getInserisciSoggettoSimilePGReturn()==null) || 
             (this.inserisciSoggettoSimilePGReturn!=null &&
              this.inserisciSoggettoSimilePGReturn.equals(other.getInserisciSoggettoSimilePGReturn())));
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
        if (getInserisciSoggettoSimilePGReturn() != null) {
            _hashCode += getInserisciSoggettoSimilePGReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InserisciSoggettoSimilePGResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciSoggettoSimilePGResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inserisciSoggettoSimilePGReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciSoggettoSimilePGReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
