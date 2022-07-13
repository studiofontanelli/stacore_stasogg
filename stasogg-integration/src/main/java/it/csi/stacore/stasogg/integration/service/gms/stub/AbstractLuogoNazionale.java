/**
 * AbstractLuogoNazionale.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class AbstractLuogoNazionale  extends it.csi.stacore.stasogg.integration.service.gms.stub.Luogo  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Provincia provincia;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Regione regione;

    public AbstractLuogoNazionale() {
    }

    public AbstractLuogoNazionale(
           int indentLevel,
           boolean altroLuogo,
           it.csi.stacore.stasogg.integration.service.gms.stub.Comune comune,
           java.lang.Long idNazione,
           boolean luogoNazionale,
           boolean luogoNonCensito,
           java.lang.String nazione,
           java.lang.String siglaNazione,
           it.csi.stacore.stasogg.integration.service.gms.stub.Provincia provincia,
           it.csi.stacore.stasogg.integration.service.gms.stub.Regione regione) {
        super(
            indentLevel,
            altroLuogo,
            comune,
            idNazione,
            luogoNazionale,
            luogoNonCensito,
            nazione,
            siglaNazione);
        this.provincia = provincia;
        this.regione = regione;
    }


    /**
     * Gets the provincia value for this AbstractLuogoNazionale.
     * 
     * @return provincia
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Provincia getProvincia() {
        return provincia;
    }


    /**
     * Sets the provincia value for this AbstractLuogoNazionale.
     * 
     * @param provincia
     */
    public void setProvincia(it.csi.stacore.stasogg.integration.service.gms.stub.Provincia provincia) {
        this.provincia = provincia;
    }


    /**
     * Gets the regione value for this AbstractLuogoNazionale.
     * 
     * @return regione
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Regione getRegione() {
        return regione;
    }


    /**
     * Sets the regione value for this AbstractLuogoNazionale.
     * 
     * @param regione
     */
    public void setRegione(it.csi.stacore.stasogg.integration.service.gms.stub.Regione regione) {
        this.regione = regione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractLuogoNazionale)) return false;
        AbstractLuogoNazionale other = (AbstractLuogoNazionale) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.provincia==null && other.getProvincia()==null) || 
             (this.provincia!=null &&
              this.provincia.equals(other.getProvincia()))) &&
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
        if (getProvincia() != null) {
            _hashCode += getProvincia().hashCode();
        }
        if (getRegione() != null) {
            _hashCode += getRegione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractLuogoNazionale.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "AbstractLuogoNazionale"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincia");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "provincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Provincia"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "regione"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Regione"));
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
