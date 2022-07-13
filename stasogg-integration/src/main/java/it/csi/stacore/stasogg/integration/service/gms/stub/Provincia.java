/**
 * Provincia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class Provincia  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String descrizione;

    private java.lang.Long idProvincia;

    private java.lang.String istat;

    private java.lang.String sigla;

    public Provincia() {
    }

    public Provincia(
           int indentLevel,
           java.lang.String descrizione,
           java.lang.Long idProvincia,
           java.lang.String istat,
           java.lang.String sigla) {
        super(
            indentLevel);
        this.descrizione = descrizione;
        this.idProvincia = idProvincia;
        this.istat = istat;
        this.sigla = sigla;
    }


    /**
     * Gets the descrizione value for this Provincia.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this Provincia.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the idProvincia value for this Provincia.
     * 
     * @return idProvincia
     */
    public java.lang.Long getIdProvincia() {
        return idProvincia;
    }


    /**
     * Sets the idProvincia value for this Provincia.
     * 
     * @param idProvincia
     */
    public void setIdProvincia(java.lang.Long idProvincia) {
        this.idProvincia = idProvincia;
    }


    /**
     * Gets the istat value for this Provincia.
     * 
     * @return istat
     */
    public java.lang.String getIstat() {
        return istat;
    }


    /**
     * Sets the istat value for this Provincia.
     * 
     * @param istat
     */
    public void setIstat(java.lang.String istat) {
        this.istat = istat;
    }


    /**
     * Gets the sigla value for this Provincia.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this Provincia.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Provincia)) return false;
        Provincia other = (Provincia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.idProvincia==null && other.getIdProvincia()==null) || 
             (this.idProvincia!=null &&
              this.idProvincia.equals(other.getIdProvincia()))) &&
            ((this.istat==null && other.getIstat()==null) || 
             (this.istat!=null &&
              this.istat.equals(other.getIstat()))) &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla())));
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
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getIdProvincia() != null) {
            _hashCode += getIdProvincia().hashCode();
        }
        if (getIstat() != null) {
            _hashCode += getIstat().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Provincia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Provincia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "istat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "sigla"));
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
