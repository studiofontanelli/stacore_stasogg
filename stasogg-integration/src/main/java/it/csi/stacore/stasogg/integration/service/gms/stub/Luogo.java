/**
 * Luogo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class Luogo  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private boolean altroLuogo;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Comune comune;

    private java.lang.Long idNazione;

    private boolean luogoNazionale;

    private boolean luogoNonCensito;

    private java.lang.String nazione;

    private java.lang.String siglaNazione;

    public Luogo() {
    }

    public Luogo(
           int indentLevel,
           boolean altroLuogo,
           it.csi.stacore.stasogg.integration.service.gms.stub.Comune comune,
           java.lang.Long idNazione,
           boolean luogoNazionale,
           boolean luogoNonCensito,
           java.lang.String nazione,
           java.lang.String siglaNazione) {
        super(
            indentLevel);
        this.altroLuogo = altroLuogo;
        this.comune = comune;
        this.idNazione = idNazione;
        this.luogoNazionale = luogoNazionale;
        this.luogoNonCensito = luogoNonCensito;
        this.nazione = nazione;
        this.siglaNazione = siglaNazione;
    }


    /**
     * Gets the altroLuogo value for this Luogo.
     * 
     * @return altroLuogo
     */
    public boolean isAltroLuogo() {
        return altroLuogo;
    }


    /**
     * Sets the altroLuogo value for this Luogo.
     * 
     * @param altroLuogo
     */
    public void setAltroLuogo(boolean altroLuogo) {
        this.altroLuogo = altroLuogo;
    }


    /**
     * Gets the comune value for this Luogo.
     * 
     * @return comune
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Comune getComune() {
        return comune;
    }


    /**
     * Sets the comune value for this Luogo.
     * 
     * @param comune
     */
    public void setComune(it.csi.stacore.stasogg.integration.service.gms.stub.Comune comune) {
        this.comune = comune;
    }


    /**
     * Gets the idNazione value for this Luogo.
     * 
     * @return idNazione
     */
    public java.lang.Long getIdNazione() {
        return idNazione;
    }


    /**
     * Sets the idNazione value for this Luogo.
     * 
     * @param idNazione
     */
    public void setIdNazione(java.lang.Long idNazione) {
        this.idNazione = idNazione;
    }


    /**
     * Gets the luogoNazionale value for this Luogo.
     * 
     * @return luogoNazionale
     */
    public boolean isLuogoNazionale() {
        return luogoNazionale;
    }


    /**
     * Sets the luogoNazionale value for this Luogo.
     * 
     * @param luogoNazionale
     */
    public void setLuogoNazionale(boolean luogoNazionale) {
        this.luogoNazionale = luogoNazionale;
    }


    /**
     * Gets the luogoNonCensito value for this Luogo.
     * 
     * @return luogoNonCensito
     */
    public boolean isLuogoNonCensito() {
        return luogoNonCensito;
    }


    /**
     * Sets the luogoNonCensito value for this Luogo.
     * 
     * @param luogoNonCensito
     */
    public void setLuogoNonCensito(boolean luogoNonCensito) {
        this.luogoNonCensito = luogoNonCensito;
    }


    /**
     * Gets the nazione value for this Luogo.
     * 
     * @return nazione
     */
    public java.lang.String getNazione() {
        return nazione;
    }


    /**
     * Sets the nazione value for this Luogo.
     * 
     * @param nazione
     */
    public void setNazione(java.lang.String nazione) {
        this.nazione = nazione;
    }


    /**
     * Gets the siglaNazione value for this Luogo.
     * 
     * @return siglaNazione
     */
    public java.lang.String getSiglaNazione() {
        return siglaNazione;
    }


    /**
     * Sets the siglaNazione value for this Luogo.
     * 
     * @param siglaNazione
     */
    public void setSiglaNazione(java.lang.String siglaNazione) {
        this.siglaNazione = siglaNazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Luogo)) return false;
        Luogo other = (Luogo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.altroLuogo == other.isAltroLuogo() &&
            ((this.comune==null && other.getComune()==null) || 
             (this.comune!=null &&
              this.comune.equals(other.getComune()))) &&
            ((this.idNazione==null && other.getIdNazione()==null) || 
             (this.idNazione!=null &&
              this.idNazione.equals(other.getIdNazione()))) &&
            this.luogoNazionale == other.isLuogoNazionale() &&
            this.luogoNonCensito == other.isLuogoNonCensito() &&
            ((this.nazione==null && other.getNazione()==null) || 
             (this.nazione!=null &&
              this.nazione.equals(other.getNazione()))) &&
            ((this.siglaNazione==null && other.getSiglaNazione()==null) || 
             (this.siglaNazione!=null &&
              this.siglaNazione.equals(other.getSiglaNazione())));
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
        _hashCode += (isAltroLuogo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getComune() != null) {
            _hashCode += getComune().hashCode();
        }
        if (getIdNazione() != null) {
            _hashCode += getIdNazione().hashCode();
        }
        _hashCode += (isLuogoNazionale() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLuogoNonCensito() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNazione() != null) {
            _hashCode += getNazione().hashCode();
        }
        if (getSiglaNazione() != null) {
            _hashCode += getSiglaNazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Luogo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Luogo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altroLuogo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "altroLuogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comune");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "comune"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Comune"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idNazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoNazionale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "luogoNazionale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoNonCensito");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "luogoNonCensito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaNazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "siglaNazione"));
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
