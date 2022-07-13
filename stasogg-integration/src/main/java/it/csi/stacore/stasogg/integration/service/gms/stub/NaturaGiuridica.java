/**
 * NaturaGiuridica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class NaturaGiuridica  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String codiceFormaGiuridica;

    private java.lang.String descrizioneNaturaGiuridica;

    private java.lang.Long pkNaturaGiuridica;

    public NaturaGiuridica() {
    }

    public NaturaGiuridica(
           int indentLevel,
           java.lang.String codiceFormaGiuridica,
           java.lang.String descrizioneNaturaGiuridica,
           java.lang.Long pkNaturaGiuridica) {
        super(
            indentLevel);
        this.codiceFormaGiuridica = codiceFormaGiuridica;
        this.descrizioneNaturaGiuridica = descrizioneNaturaGiuridica;
        this.pkNaturaGiuridica = pkNaturaGiuridica;
    }


    /**
     * Gets the codiceFormaGiuridica value for this NaturaGiuridica.
     * 
     * @return codiceFormaGiuridica
     */
    public java.lang.String getCodiceFormaGiuridica() {
        return codiceFormaGiuridica;
    }


    /**
     * Sets the codiceFormaGiuridica value for this NaturaGiuridica.
     * 
     * @param codiceFormaGiuridica
     */
    public void setCodiceFormaGiuridica(java.lang.String codiceFormaGiuridica) {
        this.codiceFormaGiuridica = codiceFormaGiuridica;
    }


    /**
     * Gets the descrizioneNaturaGiuridica value for this NaturaGiuridica.
     * 
     * @return descrizioneNaturaGiuridica
     */
    public java.lang.String getDescrizioneNaturaGiuridica() {
        return descrizioneNaturaGiuridica;
    }


    /**
     * Sets the descrizioneNaturaGiuridica value for this NaturaGiuridica.
     * 
     * @param descrizioneNaturaGiuridica
     */
    public void setDescrizioneNaturaGiuridica(java.lang.String descrizioneNaturaGiuridica) {
        this.descrizioneNaturaGiuridica = descrizioneNaturaGiuridica;
    }


    /**
     * Gets the pkNaturaGiuridica value for this NaturaGiuridica.
     * 
     * @return pkNaturaGiuridica
     */
    public java.lang.Long getPkNaturaGiuridica() {
        return pkNaturaGiuridica;
    }


    /**
     * Sets the pkNaturaGiuridica value for this NaturaGiuridica.
     * 
     * @param pkNaturaGiuridica
     */
    public void setPkNaturaGiuridica(java.lang.Long pkNaturaGiuridica) {
        this.pkNaturaGiuridica = pkNaturaGiuridica;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NaturaGiuridica)) return false;
        NaturaGiuridica other = (NaturaGiuridica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codiceFormaGiuridica==null && other.getCodiceFormaGiuridica()==null) || 
             (this.codiceFormaGiuridica!=null &&
              this.codiceFormaGiuridica.equals(other.getCodiceFormaGiuridica()))) &&
            ((this.descrizioneNaturaGiuridica==null && other.getDescrizioneNaturaGiuridica()==null) || 
             (this.descrizioneNaturaGiuridica!=null &&
              this.descrizioneNaturaGiuridica.equals(other.getDescrizioneNaturaGiuridica()))) &&
            ((this.pkNaturaGiuridica==null && other.getPkNaturaGiuridica()==null) || 
             (this.pkNaturaGiuridica!=null &&
              this.pkNaturaGiuridica.equals(other.getPkNaturaGiuridica())));
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
        if (getCodiceFormaGiuridica() != null) {
            _hashCode += getCodiceFormaGiuridica().hashCode();
        }
        if (getDescrizioneNaturaGiuridica() != null) {
            _hashCode += getDescrizioneNaturaGiuridica().hashCode();
        }
        if (getPkNaturaGiuridica() != null) {
            _hashCode += getPkNaturaGiuridica().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NaturaGiuridica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "NaturaGiuridica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFormaGiuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceFormaGiuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneNaturaGiuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrizioneNaturaGiuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkNaturaGiuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "pkNaturaGiuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
