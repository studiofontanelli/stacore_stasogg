/**
 * Via.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class Via  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.Long idViaSitad;

    private java.lang.Long idViaTopo;

    private java.lang.String nomeVia;

    private java.lang.String sedime;

    private java.lang.String valoreCompleto;

    private java.lang.String viaStringa;

    public Via() {
    }

    public Via(
           int indentLevel,
           java.lang.Long idViaSitad,
           java.lang.Long idViaTopo,
           java.lang.String nomeVia,
           java.lang.String sedime,
           java.lang.String valoreCompleto,
           java.lang.String viaStringa) {
        super(
            indentLevel);
        this.idViaSitad = idViaSitad;
        this.idViaTopo = idViaTopo;
        this.nomeVia = nomeVia;
        this.sedime = sedime;
        this.valoreCompleto = valoreCompleto;
        this.viaStringa = viaStringa;
    }


    /**
     * Gets the idViaSitad value for this Via.
     * 
     * @return idViaSitad
     */
    public java.lang.Long getIdViaSitad() {
        return idViaSitad;
    }


    /**
     * Sets the idViaSitad value for this Via.
     * 
     * @param idViaSitad
     */
    public void setIdViaSitad(java.lang.Long idViaSitad) {
        this.idViaSitad = idViaSitad;
    }


    /**
     * Gets the idViaTopo value for this Via.
     * 
     * @return idViaTopo
     */
    public java.lang.Long getIdViaTopo() {
        return idViaTopo;
    }


    /**
     * Sets the idViaTopo value for this Via.
     * 
     * @param idViaTopo
     */
    public void setIdViaTopo(java.lang.Long idViaTopo) {
        this.idViaTopo = idViaTopo;
    }


    /**
     * Gets the nomeVia value for this Via.
     * 
     * @return nomeVia
     */
    public java.lang.String getNomeVia() {
        return nomeVia;
    }


    /**
     * Sets the nomeVia value for this Via.
     * 
     * @param nomeVia
     */
    public void setNomeVia(java.lang.String nomeVia) {
        this.nomeVia = nomeVia;
    }


    /**
     * Gets the sedime value for this Via.
     * 
     * @return sedime
     */
    public java.lang.String getSedime() {
        return sedime;
    }


    /**
     * Sets the sedime value for this Via.
     * 
     * @param sedime
     */
    public void setSedime(java.lang.String sedime) {
        this.sedime = sedime;
    }


    /**
     * Gets the valoreCompleto value for this Via.
     * 
     * @return valoreCompleto
     */
    public java.lang.String getValoreCompleto() {
        return valoreCompleto;
    }


    /**
     * Sets the valoreCompleto value for this Via.
     * 
     * @param valoreCompleto
     */
    public void setValoreCompleto(java.lang.String valoreCompleto) {
        this.valoreCompleto = valoreCompleto;
    }


    /**
     * Gets the viaStringa value for this Via.
     * 
     * @return viaStringa
     */
    public java.lang.String getViaStringa() {
        return viaStringa;
    }


    /**
     * Sets the viaStringa value for this Via.
     * 
     * @param viaStringa
     */
    public void setViaStringa(java.lang.String viaStringa) {
        this.viaStringa = viaStringa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Via)) return false;
        Via other = (Via) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.idViaSitad==null && other.getIdViaSitad()==null) || 
             (this.idViaSitad!=null &&
              this.idViaSitad.equals(other.getIdViaSitad()))) &&
            ((this.idViaTopo==null && other.getIdViaTopo()==null) || 
             (this.idViaTopo!=null &&
              this.idViaTopo.equals(other.getIdViaTopo()))) &&
            ((this.nomeVia==null && other.getNomeVia()==null) || 
             (this.nomeVia!=null &&
              this.nomeVia.equals(other.getNomeVia()))) &&
            ((this.sedime==null && other.getSedime()==null) || 
             (this.sedime!=null &&
              this.sedime.equals(other.getSedime()))) &&
            ((this.valoreCompleto==null && other.getValoreCompleto()==null) || 
             (this.valoreCompleto!=null &&
              this.valoreCompleto.equals(other.getValoreCompleto()))) &&
            ((this.viaStringa==null && other.getViaStringa()==null) || 
             (this.viaStringa!=null &&
              this.viaStringa.equals(other.getViaStringa())));
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
        if (getIdViaSitad() != null) {
            _hashCode += getIdViaSitad().hashCode();
        }
        if (getIdViaTopo() != null) {
            _hashCode += getIdViaTopo().hashCode();
        }
        if (getNomeVia() != null) {
            _hashCode += getNomeVia().hashCode();
        }
        if (getSedime() != null) {
            _hashCode += getSedime().hashCode();
        }
        if (getValoreCompleto() != null) {
            _hashCode += getValoreCompleto().hashCode();
        }
        if (getViaStringa() != null) {
            _hashCode += getViaStringa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Via.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Via"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idViaSitad");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idViaSitad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idViaTopo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idViaTopo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeVia");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nomeVia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sedime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "sedime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valoreCompleto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "valoreCompleto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viaStringa");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "viaStringa"));
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
