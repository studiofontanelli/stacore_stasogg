/**
 * IndirizzoProvvisorio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class IndirizzoProvvisorio  extends it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo  implements java.io.Serializable {
    private java.lang.String cap;

    private java.lang.String civico;

    public IndirizzoProvvisorio() {
    }

    public IndirizzoProvvisorio(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long id,
           boolean indirizzoProvvisorio,
           it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoIndirizzo,
           it.csi.stacore.stasogg.integration.service.gms.stub.TipoIndirizzo tipo,
           java.lang.String valoreStringa,
           java.lang.String cap,
           java.lang.String civico) {
        super(
            indentLevel,
            dataValidita,
            fonteProvenienza,
            id,
            indirizzoProvvisorio,
            luogoIndirizzo,
            tipo,
            valoreStringa);
        this.cap = cap;
        this.civico = civico;
    }


    /**
     * Gets the cap value for this IndirizzoProvvisorio.
     * 
     * @return cap
     */
    public java.lang.String getCap() {
        return cap;
    }


    /**
     * Sets the cap value for this IndirizzoProvvisorio.
     * 
     * @param cap
     */
    public void setCap(java.lang.String cap) {
        this.cap = cap;
    }


    /**
     * Gets the civico value for this IndirizzoProvvisorio.
     * 
     * @return civico
     */
    public java.lang.String getCivico() {
        return civico;
    }


    /**
     * Sets the civico value for this IndirizzoProvvisorio.
     * 
     * @param civico
     */
    public void setCivico(java.lang.String civico) {
        this.civico = civico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndirizzoProvvisorio)) return false;
        IndirizzoProvvisorio other = (IndirizzoProvvisorio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cap==null && other.getCap()==null) || 
             (this.cap!=null &&
              this.cap.equals(other.getCap()))) &&
            ((this.civico==null && other.getCivico()==null) || 
             (this.civico!=null &&
              this.civico.equals(other.getCivico())));
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
        if (getCap() != null) {
            _hashCode += getCap().hashCode();
        }
        if (getCivico() != null) {
            _hashCode += getCivico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndirizzoProvvisorio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoProvvisorio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "cap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("civico");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "civico"));
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
