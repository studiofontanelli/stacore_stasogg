/**
 * Cittadinanza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class Cittadinanza  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String cittadinanza;

    private java.lang.Long idCittadinanza;

    private java.lang.String istatNazioneCittadinanza;

    private java.lang.String nazione;

    public Cittadinanza() {
    }

    public Cittadinanza(
           int indentLevel,
           java.lang.String cittadinanza,
           java.lang.Long idCittadinanza,
           java.lang.String istatNazioneCittadinanza,
           java.lang.String nazione) {
        super(
            indentLevel);
        this.cittadinanza = cittadinanza;
        this.idCittadinanza = idCittadinanza;
        this.istatNazioneCittadinanza = istatNazioneCittadinanza;
        this.nazione = nazione;
    }


    /**
     * Gets the cittadinanza value for this Cittadinanza.
     * 
     * @return cittadinanza
     */
    public java.lang.String getCittadinanza() {
        return cittadinanza;
    }


    /**
     * Sets the cittadinanza value for this Cittadinanza.
     * 
     * @param cittadinanza
     */
    public void setCittadinanza(java.lang.String cittadinanza) {
        this.cittadinanza = cittadinanza;
    }


    /**
     * Gets the idCittadinanza value for this Cittadinanza.
     * 
     * @return idCittadinanza
     */
    public java.lang.Long getIdCittadinanza() {
        return idCittadinanza;
    }


    /**
     * Sets the idCittadinanza value for this Cittadinanza.
     * 
     * @param idCittadinanza
     */
    public void setIdCittadinanza(java.lang.Long idCittadinanza) {
        this.idCittadinanza = idCittadinanza;
    }


    /**
     * Gets the istatNazioneCittadinanza value for this Cittadinanza.
     * 
     * @return istatNazioneCittadinanza
     */
    public java.lang.String getIstatNazioneCittadinanza() {
        return istatNazioneCittadinanza;
    }


    /**
     * Sets the istatNazioneCittadinanza value for this Cittadinanza.
     * 
     * @param istatNazioneCittadinanza
     */
    public void setIstatNazioneCittadinanza(java.lang.String istatNazioneCittadinanza) {
        this.istatNazioneCittadinanza = istatNazioneCittadinanza;
    }


    /**
     * Gets the nazione value for this Cittadinanza.
     * 
     * @return nazione
     */
    public java.lang.String getNazione() {
        return nazione;
    }


    /**
     * Sets the nazione value for this Cittadinanza.
     * 
     * @param nazione
     */
    public void setNazione(java.lang.String nazione) {
        this.nazione = nazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cittadinanza)) return false;
        Cittadinanza other = (Cittadinanza) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cittadinanza==null && other.getCittadinanza()==null) || 
             (this.cittadinanza!=null &&
              this.cittadinanza.equals(other.getCittadinanza()))) &&
            ((this.idCittadinanza==null && other.getIdCittadinanza()==null) || 
             (this.idCittadinanza!=null &&
              this.idCittadinanza.equals(other.getIdCittadinanza()))) &&
            ((this.istatNazioneCittadinanza==null && other.getIstatNazioneCittadinanza()==null) || 
             (this.istatNazioneCittadinanza!=null &&
              this.istatNazioneCittadinanza.equals(other.getIstatNazioneCittadinanza()))) &&
            ((this.nazione==null && other.getNazione()==null) || 
             (this.nazione!=null &&
              this.nazione.equals(other.getNazione())));
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
        if (getCittadinanza() != null) {
            _hashCode += getCittadinanza().hashCode();
        }
        if (getIdCittadinanza() != null) {
            _hashCode += getIdCittadinanza().hashCode();
        }
        if (getIstatNazioneCittadinanza() != null) {
            _hashCode += getIstatNazioneCittadinanza().hashCode();
        }
        if (getNazione() != null) {
            _hashCode += getNazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cittadinanza.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Cittadinanza"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cittadinanza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "cittadinanza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCittadinanza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idCittadinanza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istatNazioneCittadinanza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "istatNazioneCittadinanza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nazione"));
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
