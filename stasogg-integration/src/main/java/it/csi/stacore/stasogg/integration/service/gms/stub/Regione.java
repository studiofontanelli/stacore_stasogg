/**
 * Regione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class Regione  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.Long idRegione;

    private java.lang.String istatRegione;

    private java.lang.String regione;

    public Regione() {
    }

    public Regione(
           int indentLevel,
           java.lang.Long idRegione,
           java.lang.String istatRegione,
           java.lang.String regione) {
        super(
            indentLevel);
        this.idRegione = idRegione;
        this.istatRegione = istatRegione;
        this.regione = regione;
    }


    /**
     * Gets the idRegione value for this Regione.
     * 
     * @return idRegione
     */
    public java.lang.Long getIdRegione() {
        return idRegione;
    }


    /**
     * Sets the idRegione value for this Regione.
     * 
     * @param idRegione
     */
    public void setIdRegione(java.lang.Long idRegione) {
        this.idRegione = idRegione;
    }


    /**
     * Gets the istatRegione value for this Regione.
     * 
     * @return istatRegione
     */
    public java.lang.String getIstatRegione() {
        return istatRegione;
    }


    /**
     * Sets the istatRegione value for this Regione.
     * 
     * @param istatRegione
     */
    public void setIstatRegione(java.lang.String istatRegione) {
        this.istatRegione = istatRegione;
    }


    /**
     * Gets the regione value for this Regione.
     * 
     * @return regione
     */
    public java.lang.String getRegione() {
        return regione;
    }


    /**
     * Sets the regione value for this Regione.
     * 
     * @param regione
     */
    public void setRegione(java.lang.String regione) {
        this.regione = regione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Regione)) return false;
        Regione other = (Regione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.idRegione==null && other.getIdRegione()==null) || 
             (this.idRegione!=null &&
              this.idRegione.equals(other.getIdRegione()))) &&
            ((this.istatRegione==null && other.getIstatRegione()==null) || 
             (this.istatRegione!=null &&
              this.istatRegione.equals(other.getIstatRegione()))) &&
            ((this.regione==null && other.getRegione()==null) || 
             (this.regione!=null &&
              this.regione.equals(other.getRegione())));
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
        if (getIdRegione() != null) {
            _hashCode += getIdRegione().hashCode();
        }
        if (getIstatRegione() != null) {
            _hashCode += getIstatRegione().hashCode();
        }
        if (getRegione() != null) {
            _hashCode += getRegione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Regione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Regione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRegione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idRegione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istatRegione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "istatRegione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "regione"));
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
