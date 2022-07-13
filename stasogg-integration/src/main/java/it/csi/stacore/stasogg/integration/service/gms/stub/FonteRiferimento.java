/**
 * FonteRiferimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class FonteRiferimento  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.Long codiceFonteRiferimento;

    private java.lang.String descrFonteRiferimento;

    public FonteRiferimento() {
    }

    public FonteRiferimento(
           int indentLevel,
           java.lang.Long codiceFonteRiferimento,
           java.lang.String descrFonteRiferimento) {
        super(
            indentLevel);
        this.codiceFonteRiferimento = codiceFonteRiferimento;
        this.descrFonteRiferimento = descrFonteRiferimento;
    }


    /**
     * Gets the codiceFonteRiferimento value for this FonteRiferimento.
     * 
     * @return codiceFonteRiferimento
     */
    public java.lang.Long getCodiceFonteRiferimento() {
        return codiceFonteRiferimento;
    }


    /**
     * Sets the codiceFonteRiferimento value for this FonteRiferimento.
     * 
     * @param codiceFonteRiferimento
     */
    public void setCodiceFonteRiferimento(java.lang.Long codiceFonteRiferimento) {
        this.codiceFonteRiferimento = codiceFonteRiferimento;
    }


    /**
     * Gets the descrFonteRiferimento value for this FonteRiferimento.
     * 
     * @return descrFonteRiferimento
     */
    public java.lang.String getDescrFonteRiferimento() {
        return descrFonteRiferimento;
    }


    /**
     * Sets the descrFonteRiferimento value for this FonteRiferimento.
     * 
     * @param descrFonteRiferimento
     */
    public void setDescrFonteRiferimento(java.lang.String descrFonteRiferimento) {
        this.descrFonteRiferimento = descrFonteRiferimento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FonteRiferimento)) return false;
        FonteRiferimento other = (FonteRiferimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codiceFonteRiferimento==null && other.getCodiceFonteRiferimento()==null) || 
             (this.codiceFonteRiferimento!=null &&
              this.codiceFonteRiferimento.equals(other.getCodiceFonteRiferimento()))) &&
            ((this.descrFonteRiferimento==null && other.getDescrFonteRiferimento()==null) || 
             (this.descrFonteRiferimento!=null &&
              this.descrFonteRiferimento.equals(other.getDescrFonteRiferimento())));
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
        if (getCodiceFonteRiferimento() != null) {
            _hashCode += getCodiceFonteRiferimento().hashCode();
        }
        if (getDescrFonteRiferimento() != null) {
            _hashCode += getDescrFonteRiferimento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FonteRiferimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "FonteRiferimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFonteRiferimento");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceFonteRiferimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrFonteRiferimento");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrFonteRiferimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
