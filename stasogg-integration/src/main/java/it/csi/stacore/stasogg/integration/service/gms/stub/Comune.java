/**
 * Comune.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class Comune  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String descrizione;

    private java.lang.String descrizioneGMS;

    private java.lang.Long id;

    private java.lang.String istat;

    public Comune() {
    }

    public Comune(
           int indentLevel,
           java.lang.String descrizione,
           java.lang.String descrizioneGMS,
           java.lang.Long id,
           java.lang.String istat) {
        super(
            indentLevel);
        this.descrizione = descrizione;
        this.descrizioneGMS = descrizioneGMS;
        this.id = id;
        this.istat = istat;
    }


    /**
     * Gets the descrizione value for this Comune.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this Comune.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the descrizioneGMS value for this Comune.
     * 
     * @return descrizioneGMS
     */
    public java.lang.String getDescrizioneGMS() {
        return descrizioneGMS;
    }


    /**
     * Sets the descrizioneGMS value for this Comune.
     * 
     * @param descrizioneGMS
     */
    public void setDescrizioneGMS(java.lang.String descrizioneGMS) {
        this.descrizioneGMS = descrizioneGMS;
    }


    /**
     * Gets the id value for this Comune.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Comune.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the istat value for this Comune.
     * 
     * @return istat
     */
    public java.lang.String getIstat() {
        return istat;
    }


    /**
     * Sets the istat value for this Comune.
     * 
     * @param istat
     */
    public void setIstat(java.lang.String istat) {
        this.istat = istat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Comune)) return false;
        Comune other = (Comune) obj;
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
            ((this.descrizioneGMS==null && other.getDescrizioneGMS()==null) || 
             (this.descrizioneGMS!=null &&
              this.descrizioneGMS.equals(other.getDescrizioneGMS()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.istat==null && other.getIstat()==null) || 
             (this.istat!=null &&
              this.istat.equals(other.getIstat())));
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
        if (getDescrizioneGMS() != null) {
            _hashCode += getDescrizioneGMS().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIstat() != null) {
            _hashCode += getIstat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Comune.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Comune"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneGMS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "descrizioneGMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "istat"));
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
