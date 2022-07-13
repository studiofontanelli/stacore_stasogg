/**
 * IndirizzoDefinitivo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class IndirizzoDefinitivo  extends it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo  implements java.io.Serializable {
    private java.lang.String cognomePresso;

    private java.lang.String denominazionePresso;

    private it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento fonteRiferimento;

    private boolean indirizzoNazionale;

    private java.lang.String nomePresso;

    private boolean potenzialmenteModificabile;

    private java.lang.String priorita;

    private it.csi.stacore.stasogg.integration.service.gms.stub.StatoIndirizzo statoIndirizzo;

    public IndirizzoDefinitivo() {
    }

    public IndirizzoDefinitivo(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long id,
           boolean indirizzoProvvisorio,
           it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoIndirizzo,
           it.csi.stacore.stasogg.integration.service.gms.stub.TipoIndirizzo tipo,
           java.lang.String valoreStringa,
           java.lang.String cognomePresso,
           java.lang.String denominazionePresso,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento fonteRiferimento,
           boolean indirizzoNazionale,
           java.lang.String nomePresso,
           boolean potenzialmenteModificabile,
           java.lang.String priorita,
           it.csi.stacore.stasogg.integration.service.gms.stub.StatoIndirizzo statoIndirizzo) {
        super(
            indentLevel,
            dataValidita,
            fonteProvenienza,
            id,
            indirizzoProvvisorio,
            luogoIndirizzo,
            tipo,
            valoreStringa);
        this.cognomePresso = cognomePresso;
        this.denominazionePresso = denominazionePresso;
        this.fonteRiferimento = fonteRiferimento;
        this.indirizzoNazionale = indirizzoNazionale;
        this.nomePresso = nomePresso;
        this.potenzialmenteModificabile = potenzialmenteModificabile;
        this.priorita = priorita;
        this.statoIndirizzo = statoIndirizzo;
    }


    /**
     * Gets the cognomePresso value for this IndirizzoDefinitivo.
     * 
     * @return cognomePresso
     */
    public java.lang.String getCognomePresso() {
        return cognomePresso;
    }


    /**
     * Sets the cognomePresso value for this IndirizzoDefinitivo.
     * 
     * @param cognomePresso
     */
    public void setCognomePresso(java.lang.String cognomePresso) {
        this.cognomePresso = cognomePresso;
    }


    /**
     * Gets the denominazionePresso value for this IndirizzoDefinitivo.
     * 
     * @return denominazionePresso
     */
    public java.lang.String getDenominazionePresso() {
        return denominazionePresso;
    }


    /**
     * Sets the denominazionePresso value for this IndirizzoDefinitivo.
     * 
     * @param denominazionePresso
     */
    public void setDenominazionePresso(java.lang.String denominazionePresso) {
        this.denominazionePresso = denominazionePresso;
    }


    /**
     * Gets the fonteRiferimento value for this IndirizzoDefinitivo.
     * 
     * @return fonteRiferimento
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento getFonteRiferimento() {
        return fonteRiferimento;
    }


    /**
     * Sets the fonteRiferimento value for this IndirizzoDefinitivo.
     * 
     * @param fonteRiferimento
     */
    public void setFonteRiferimento(it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento fonteRiferimento) {
        this.fonteRiferimento = fonteRiferimento;
    }


    /**
     * Gets the indirizzoNazionale value for this IndirizzoDefinitivo.
     * 
     * @return indirizzoNazionale
     */
    public boolean isIndirizzoNazionale() {
        return indirizzoNazionale;
    }


    /**
     * Sets the indirizzoNazionale value for this IndirizzoDefinitivo.
     * 
     * @param indirizzoNazionale
     */
    public void setIndirizzoNazionale(boolean indirizzoNazionale) {
        this.indirizzoNazionale = indirizzoNazionale;
    }


    /**
     * Gets the nomePresso value for this IndirizzoDefinitivo.
     * 
     * @return nomePresso
     */
    public java.lang.String getNomePresso() {
        return nomePresso;
    }


    /**
     * Sets the nomePresso value for this IndirizzoDefinitivo.
     * 
     * @param nomePresso
     */
    public void setNomePresso(java.lang.String nomePresso) {
        this.nomePresso = nomePresso;
    }


    /**
     * Gets the potenzialmenteModificabile value for this IndirizzoDefinitivo.
     * 
     * @return potenzialmenteModificabile
     */
    public boolean isPotenzialmenteModificabile() {
        return potenzialmenteModificabile;
    }


    /**
     * Sets the potenzialmenteModificabile value for this IndirizzoDefinitivo.
     * 
     * @param potenzialmenteModificabile
     */
    public void setPotenzialmenteModificabile(boolean potenzialmenteModificabile) {
        this.potenzialmenteModificabile = potenzialmenteModificabile;
    }


    /**
     * Gets the priorita value for this IndirizzoDefinitivo.
     * 
     * @return priorita
     */
    public java.lang.String getPriorita() {
        return priorita;
    }


    /**
     * Sets the priorita value for this IndirizzoDefinitivo.
     * 
     * @param priorita
     */
    public void setPriorita(java.lang.String priorita) {
        this.priorita = priorita;
    }


    /**
     * Gets the statoIndirizzo value for this IndirizzoDefinitivo.
     * 
     * @return statoIndirizzo
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.StatoIndirizzo getStatoIndirizzo() {
        return statoIndirizzo;
    }


    /**
     * Sets the statoIndirizzo value for this IndirizzoDefinitivo.
     * 
     * @param statoIndirizzo
     */
    public void setStatoIndirizzo(it.csi.stacore.stasogg.integration.service.gms.stub.StatoIndirizzo statoIndirizzo) {
        this.statoIndirizzo = statoIndirizzo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndirizzoDefinitivo)) return false;
        IndirizzoDefinitivo other = (IndirizzoDefinitivo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cognomePresso==null && other.getCognomePresso()==null) || 
             (this.cognomePresso!=null &&
              this.cognomePresso.equals(other.getCognomePresso()))) &&
            ((this.denominazionePresso==null && other.getDenominazionePresso()==null) || 
             (this.denominazionePresso!=null &&
              this.denominazionePresso.equals(other.getDenominazionePresso()))) &&
            ((this.fonteRiferimento==null && other.getFonteRiferimento()==null) || 
             (this.fonteRiferimento!=null &&
              this.fonteRiferimento.equals(other.getFonteRiferimento()))) &&
            this.indirizzoNazionale == other.isIndirizzoNazionale() &&
            ((this.nomePresso==null && other.getNomePresso()==null) || 
             (this.nomePresso!=null &&
              this.nomePresso.equals(other.getNomePresso()))) &&
            this.potenzialmenteModificabile == other.isPotenzialmenteModificabile() &&
            ((this.priorita==null && other.getPriorita()==null) || 
             (this.priorita!=null &&
              this.priorita.equals(other.getPriorita()))) &&
            ((this.statoIndirizzo==null && other.getStatoIndirizzo()==null) || 
             (this.statoIndirizzo!=null &&
              this.statoIndirizzo.equals(other.getStatoIndirizzo())));
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
        if (getCognomePresso() != null) {
            _hashCode += getCognomePresso().hashCode();
        }
        if (getDenominazionePresso() != null) {
            _hashCode += getDenominazionePresso().hashCode();
        }
        if (getFonteRiferimento() != null) {
            _hashCode += getFonteRiferimento().hashCode();
        }
        _hashCode += (isIndirizzoNazionale() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNomePresso() != null) {
            _hashCode += getNomePresso().hashCode();
        }
        _hashCode += (isPotenzialmenteModificabile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPriorita() != null) {
            _hashCode += getPriorita().hashCode();
        }
        if (getStatoIndirizzo() != null) {
            _hashCode += getStatoIndirizzo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndirizzoDefinitivo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoDefinitivo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cognomePresso");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "cognomePresso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazionePresso");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "denominazionePresso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fonteRiferimento");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "fonteRiferimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "FonteRiferimento"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoNazionale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "indirizzoNazionale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePresso");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nomePresso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenzialmenteModificabile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "potenzialmenteModificabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "priorita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoIndirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "statoIndirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "StatoIndirizzo"));
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
