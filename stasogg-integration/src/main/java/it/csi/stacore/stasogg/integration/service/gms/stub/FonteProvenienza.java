/**
 * FonteProvenienza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class FonteProvenienza  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String categUtente;

    private java.lang.Long codiceCategUtente;

    private java.lang.Long codiceProvenienza;

    private java.lang.String provenienza;

    public FonteProvenienza() {
    }

    public FonteProvenienza(
           int indentLevel,
           java.lang.String categUtente,
           java.lang.Long codiceCategUtente,
           java.lang.Long codiceProvenienza,
           java.lang.String provenienza) {
        super(
            indentLevel);
        this.categUtente = categUtente;
        this.codiceCategUtente = codiceCategUtente;
        this.codiceProvenienza = codiceProvenienza;
        this.provenienza = provenienza;
    }


    /**
     * Gets the categUtente value for this FonteProvenienza.
     * 
     * @return categUtente
     */
    public java.lang.String getCategUtente() {
        return categUtente;
    }


    /**
     * Sets the categUtente value for this FonteProvenienza.
     * 
     * @param categUtente
     */
    public void setCategUtente(java.lang.String categUtente) {
        this.categUtente = categUtente;
    }


    /**
     * Gets the codiceCategUtente value for this FonteProvenienza.
     * 
     * @return codiceCategUtente
     */
    public java.lang.Long getCodiceCategUtente() {
        return codiceCategUtente;
    }


    /**
     * Sets the codiceCategUtente value for this FonteProvenienza.
     * 
     * @param codiceCategUtente
     */
    public void setCodiceCategUtente(java.lang.Long codiceCategUtente) {
        this.codiceCategUtente = codiceCategUtente;
    }


    /**
     * Gets the codiceProvenienza value for this FonteProvenienza.
     * 
     * @return codiceProvenienza
     */
    public java.lang.Long getCodiceProvenienza() {
        return codiceProvenienza;
    }


    /**
     * Sets the codiceProvenienza value for this FonteProvenienza.
     * 
     * @param codiceProvenienza
     */
    public void setCodiceProvenienza(java.lang.Long codiceProvenienza) {
        this.codiceProvenienza = codiceProvenienza;
    }


    /**
     * Gets the provenienza value for this FonteProvenienza.
     * 
     * @return provenienza
     */
    public java.lang.String getProvenienza() {
        return provenienza;
    }


    /**
     * Sets the provenienza value for this FonteProvenienza.
     * 
     * @param provenienza
     */
    public void setProvenienza(java.lang.String provenienza) {
        this.provenienza = provenienza;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FonteProvenienza)) return false;
        FonteProvenienza other = (FonteProvenienza) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.categUtente==null && other.getCategUtente()==null) || 
             (this.categUtente!=null &&
              this.categUtente.equals(other.getCategUtente()))) &&
            ((this.codiceCategUtente==null && other.getCodiceCategUtente()==null) || 
             (this.codiceCategUtente!=null &&
              this.codiceCategUtente.equals(other.getCodiceCategUtente()))) &&
            ((this.codiceProvenienza==null && other.getCodiceProvenienza()==null) || 
             (this.codiceProvenienza!=null &&
              this.codiceProvenienza.equals(other.getCodiceProvenienza()))) &&
            ((this.provenienza==null && other.getProvenienza()==null) || 
             (this.provenienza!=null &&
              this.provenienza.equals(other.getProvenienza())));
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
        if (getCategUtente() != null) {
            _hashCode += getCategUtente().hashCode();
        }
        if (getCodiceCategUtente() != null) {
            _hashCode += getCodiceCategUtente().hashCode();
        }
        if (getCodiceProvenienza() != null) {
            _hashCode += getCodiceProvenienza().hashCode();
        }
        if (getProvenienza() != null) {
            _hashCode += getProvenienza().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FonteProvenienza.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "FonteProvenienza"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "categUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceCategUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceCategUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceProvenienza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceProvenienza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provenienza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "provenienza"));
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
