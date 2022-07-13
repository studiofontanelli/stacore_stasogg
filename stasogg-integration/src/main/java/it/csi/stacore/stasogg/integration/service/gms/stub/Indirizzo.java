/**
 * Indirizzo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class Indirizzo  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita;

    private it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza;

    private java.lang.Long id;

    private boolean indirizzoProvvisorio;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoIndirizzo;

    private it.csi.stacore.stasogg.integration.service.gms.stub.TipoIndirizzo tipo;

    private java.lang.String valoreStringa;

    public Indirizzo() {
    }

    public Indirizzo(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long id,
           boolean indirizzoProvvisorio,
           it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoIndirizzo,
           it.csi.stacore.stasogg.integration.service.gms.stub.TipoIndirizzo tipo,
           java.lang.String valoreStringa) {
        super(
            indentLevel);
        this.dataValidita = dataValidita;
        this.fonteProvenienza = fonteProvenienza;
        this.id = id;
        this.indirizzoProvvisorio = indirizzoProvvisorio;
        this.luogoIndirizzo = luogoIndirizzo;
        this.tipo = tipo;
        this.valoreStringa = valoreStringa;
    }


    /**
     * Gets the dataValidita value for this Indirizzo.
     * 
     * @return dataValidita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataValidita() {
        return dataValidita;
    }


    /**
     * Sets the dataValidita value for this Indirizzo.
     * 
     * @param dataValidita
     */
    public void setDataValidita(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita) {
        this.dataValidita = dataValidita;
    }


    /**
     * Gets the fonteProvenienza value for this Indirizzo.
     * 
     * @return fonteProvenienza
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza getFonteProvenienza() {
        return fonteProvenienza;
    }


    /**
     * Sets the fonteProvenienza value for this Indirizzo.
     * 
     * @param fonteProvenienza
     */
    public void setFonteProvenienza(it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza) {
        this.fonteProvenienza = fonteProvenienza;
    }


    /**
     * Gets the id value for this Indirizzo.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Indirizzo.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the indirizzoProvvisorio value for this Indirizzo.
     * 
     * @return indirizzoProvvisorio
     */
    public boolean isIndirizzoProvvisorio() {
        return indirizzoProvvisorio;
    }


    /**
     * Sets the indirizzoProvvisorio value for this Indirizzo.
     * 
     * @param indirizzoProvvisorio
     */
    public void setIndirizzoProvvisorio(boolean indirizzoProvvisorio) {
        this.indirizzoProvvisorio = indirizzoProvvisorio;
    }


    /**
     * Gets the luogoIndirizzo value for this Indirizzo.
     * 
     * @return luogoIndirizzo
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Luogo getLuogoIndirizzo() {
        return luogoIndirizzo;
    }


    /**
     * Sets the luogoIndirizzo value for this Indirizzo.
     * 
     * @param luogoIndirizzo
     */
    public void setLuogoIndirizzo(it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoIndirizzo) {
        this.luogoIndirizzo = luogoIndirizzo;
    }


    /**
     * Gets the tipo value for this Indirizzo.
     * 
     * @return tipo
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.TipoIndirizzo getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Indirizzo.
     * 
     * @param tipo
     */
    public void setTipo(it.csi.stacore.stasogg.integration.service.gms.stub.TipoIndirizzo tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the valoreStringa value for this Indirizzo.
     * 
     * @return valoreStringa
     */
    public java.lang.String getValoreStringa() {
        return valoreStringa;
    }


    /**
     * Sets the valoreStringa value for this Indirizzo.
     * 
     * @param valoreStringa
     */
    public void setValoreStringa(java.lang.String valoreStringa) {
        this.valoreStringa = valoreStringa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Indirizzo)) return false;
        Indirizzo other = (Indirizzo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataValidita==null && other.getDataValidita()==null) || 
             (this.dataValidita!=null &&
              this.dataValidita.equals(other.getDataValidita()))) &&
            ((this.fonteProvenienza==null && other.getFonteProvenienza()==null) || 
             (this.fonteProvenienza!=null &&
              this.fonteProvenienza.equals(other.getFonteProvenienza()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.indirizzoProvvisorio == other.isIndirizzoProvvisorio() &&
            ((this.luogoIndirizzo==null && other.getLuogoIndirizzo()==null) || 
             (this.luogoIndirizzo!=null &&
              this.luogoIndirizzo.equals(other.getLuogoIndirizzo()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.valoreStringa==null && other.getValoreStringa()==null) || 
             (this.valoreStringa!=null &&
              this.valoreStringa.equals(other.getValoreStringa())));
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
        if (getDataValidita() != null) {
            _hashCode += getDataValidita().hashCode();
        }
        if (getFonteProvenienza() != null) {
            _hashCode += getFonteProvenienza().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isIndirizzoProvvisorio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLuogoIndirizzo() != null) {
            _hashCode += getLuogoIndirizzo().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getValoreStringa() != null) {
            _hashCode += getValoreStringa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Indirizzo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValidita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataValidita"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "DateGMS"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fonteProvenienza");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "fonteProvenienza"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "FonteProvenienza"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoProvvisorio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "indirizzoProvvisorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoIndirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "luogoIndirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Luogo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "TipoIndirizzo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valoreStringa");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "valoreStringa"));
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
