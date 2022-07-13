/**
 * CodiceFiscale.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class CodiceFiscale  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String codiceFiscale;

    private boolean fittizio;

    private java.lang.Boolean flagCFCertificato;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS validoDal;

    public CodiceFiscale() {
    }

    public CodiceFiscale(
           int indentLevel,
           java.lang.String codiceFiscale,
           boolean fittizio,
           java.lang.Boolean flagCFCertificato,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS validoDal) {
        super(
            indentLevel);
        this.codiceFiscale = codiceFiscale;
        this.fittizio = fittizio;
        this.flagCFCertificato = flagCFCertificato;
        this.validoDal = validoDal;
    }


    /**
     * Gets the codiceFiscale value for this CodiceFiscale.
     * 
     * @return codiceFiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this CodiceFiscale.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the fittizio value for this CodiceFiscale.
     * 
     * @return fittizio
     */
    public boolean isFittizio() {
        return fittizio;
    }


    /**
     * Sets the fittizio value for this CodiceFiscale.
     * 
     * @param fittizio
     */
    public void setFittizio(boolean fittizio) {
        this.fittizio = fittizio;
    }


    /**
     * Gets the flagCFCertificato value for this CodiceFiscale.
     * 
     * @return flagCFCertificato
     */
    public java.lang.Boolean getFlagCFCertificato() {
        return flagCFCertificato;
    }


    /**
     * Sets the flagCFCertificato value for this CodiceFiscale.
     * 
     * @param flagCFCertificato
     */
    public void setFlagCFCertificato(java.lang.Boolean flagCFCertificato) {
        this.flagCFCertificato = flagCFCertificato;
    }


    /**
     * Gets the validoDal value for this CodiceFiscale.
     * 
     * @return validoDal
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getValidoDal() {
        return validoDal;
    }


    /**
     * Sets the validoDal value for this CodiceFiscale.
     * 
     * @param validoDal
     */
    public void setValidoDal(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS validoDal) {
        this.validoDal = validoDal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodiceFiscale)) return false;
        CodiceFiscale other = (CodiceFiscale) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            this.fittizio == other.isFittizio() &&
            ((this.flagCFCertificato==null && other.getFlagCFCertificato()==null) || 
             (this.flagCFCertificato!=null &&
              this.flagCFCertificato.equals(other.getFlagCFCertificato()))) &&
            ((this.validoDal==null && other.getValidoDal()==null) || 
             (this.validoDal!=null &&
              this.validoDal.equals(other.getValidoDal())));
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
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        _hashCode += (isFittizio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFlagCFCertificato() != null) {
            _hashCode += getFlagCFCertificato().hashCode();
        }
        if (getValidoDal() != null) {
            _hashCode += getValidoDal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodiceFiscale.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscale"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fittizio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "fittizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagCFCertificato");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "flagCFCertificato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validoDal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "validoDal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "DateGMS"));
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
