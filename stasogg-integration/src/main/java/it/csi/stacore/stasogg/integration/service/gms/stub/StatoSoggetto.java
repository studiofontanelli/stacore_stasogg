/**
 * StatoSoggetto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class StatoSoggetto  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.Long codiceStatoSoggetto;

    private java.lang.String descrStatoSoggetto;

    public StatoSoggetto() {
    }

    public StatoSoggetto(
           int indentLevel,
           java.lang.Long codiceStatoSoggetto,
           java.lang.String descrStatoSoggetto) {
        super(
            indentLevel);
        this.codiceStatoSoggetto = codiceStatoSoggetto;
        this.descrStatoSoggetto = descrStatoSoggetto;
    }


    /**
     * Gets the codiceStatoSoggetto value for this StatoSoggetto.
     * 
     * @return codiceStatoSoggetto
     */
    public java.lang.Long getCodiceStatoSoggetto() {
        return codiceStatoSoggetto;
    }


    /**
     * Sets the codiceStatoSoggetto value for this StatoSoggetto.
     * 
     * @param codiceStatoSoggetto
     */
    public void setCodiceStatoSoggetto(java.lang.Long codiceStatoSoggetto) {
        this.codiceStatoSoggetto = codiceStatoSoggetto;
    }


    /**
     * Gets the descrStatoSoggetto value for this StatoSoggetto.
     * 
     * @return descrStatoSoggetto
     */
    public java.lang.String getDescrStatoSoggetto() {
        return descrStatoSoggetto;
    }


    /**
     * Sets the descrStatoSoggetto value for this StatoSoggetto.
     * 
     * @param descrStatoSoggetto
     */
    public void setDescrStatoSoggetto(java.lang.String descrStatoSoggetto) {
        this.descrStatoSoggetto = descrStatoSoggetto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatoSoggetto)) return false;
        StatoSoggetto other = (StatoSoggetto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codiceStatoSoggetto==null && other.getCodiceStatoSoggetto()==null) || 
             (this.codiceStatoSoggetto!=null &&
              this.codiceStatoSoggetto.equals(other.getCodiceStatoSoggetto()))) &&
            ((this.descrStatoSoggetto==null && other.getDescrStatoSoggetto()==null) || 
             (this.descrStatoSoggetto!=null &&
              this.descrStatoSoggetto.equals(other.getDescrStatoSoggetto())));
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
        if (getCodiceStatoSoggetto() != null) {
            _hashCode += getCodiceStatoSoggetto().hashCode();
        }
        if (getDescrStatoSoggetto() != null) {
            _hashCode += getDescrStatoSoggetto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatoSoggetto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "StatoSoggetto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceStatoSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceStatoSoggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrStatoSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrStatoSoggetto"));
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
