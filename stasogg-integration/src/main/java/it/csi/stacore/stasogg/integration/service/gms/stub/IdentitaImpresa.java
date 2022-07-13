/**
 * IdentitaImpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class IdentitaImpresa  extends it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Attivita attivita;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataCostituzione;

    private java.lang.String denominazione;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoCostituzione;

    private it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica;

    private java.lang.String partitaIva;

    private java.util.Vector statoLiquidazione;

    public IdentitaImpresa() {
    }

    public IdentitaImpresa(
           int indentLevel,
           it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscale codiceFiscale,
           java.lang.String codiceFiscaleString,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataValidita,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long idSoggetto,
           java.lang.Long idStorico,
           boolean personaFisica,
           boolean provvisoria,
           it.csi.stacore.stasogg.integration.service.gms.stub.StatoSoggetto statoSoggetto,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento fonteRiferimento,
           it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoOrigine,
           boolean potenzialmenteModificabile,
           it.csi.stacore.stasogg.integration.service.gms.stub.StatoAnagraficoSoggetto statoAnagrafico,
           it.csi.stacore.stasogg.integration.service.gms.stub.Attivita attivita,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataCostituzione,
           java.lang.String denominazione,
           it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoCostituzione,
           it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica,
           java.lang.String partitaIva,
           java.util.Vector statoLiquidazione) {
        super(
            indentLevel,
            codiceFiscale,
            codiceFiscaleString,
            dataValidita,
            fonteProvenienza,
            idSoggetto,
            idStorico,
            personaFisica,
            provvisoria,
            statoSoggetto,
            fonteRiferimento,
            luogoOrigine,
            potenzialmenteModificabile,
            statoAnagrafico);
        this.attivita = attivita;
        this.dataCostituzione = dataCostituzione;
        this.denominazione = denominazione;
        this.luogoCostituzione = luogoCostituzione;
        this.naturaGiuridica = naturaGiuridica;
        this.partitaIva = partitaIva;
        this.statoLiquidazione = statoLiquidazione;
    }


    /**
     * Gets the attivita value for this IdentitaImpresa.
     * 
     * @return attivita
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Attivita getAttivita() {
        return attivita;
    }


    /**
     * Sets the attivita value for this IdentitaImpresa.
     * 
     * @param attivita
     */
    public void setAttivita(it.csi.stacore.stasogg.integration.service.gms.stub.Attivita attivita) {
        this.attivita = attivita;
    }


    /**
     * Gets the dataCostituzione value for this IdentitaImpresa.
     * 
     * @return dataCostituzione
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataCostituzione() {
        return dataCostituzione;
    }


    /**
     * Sets the dataCostituzione value for this IdentitaImpresa.
     * 
     * @param dataCostituzione
     */
    public void setDataCostituzione(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataCostituzione) {
        this.dataCostituzione = dataCostituzione;
    }


    /**
     * Gets the denominazione value for this IdentitaImpresa.
     * 
     * @return denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this IdentitaImpresa.
     * 
     * @param denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the luogoCostituzione value for this IdentitaImpresa.
     * 
     * @return luogoCostituzione
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Luogo getLuogoCostituzione() {
        return luogoCostituzione;
    }


    /**
     * Sets the luogoCostituzione value for this IdentitaImpresa.
     * 
     * @param luogoCostituzione
     */
    public void setLuogoCostituzione(it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoCostituzione) {
        this.luogoCostituzione = luogoCostituzione;
    }


    /**
     * Gets the naturaGiuridica value for this IdentitaImpresa.
     * 
     * @return naturaGiuridica
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica getNaturaGiuridica() {
        return naturaGiuridica;
    }


    /**
     * Sets the naturaGiuridica value for this IdentitaImpresa.
     * 
     * @param naturaGiuridica
     */
    public void setNaturaGiuridica(it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica) {
        this.naturaGiuridica = naturaGiuridica;
    }


    /**
     * Gets the partitaIva value for this IdentitaImpresa.
     * 
     * @return partitaIva
     */
    public java.lang.String getPartitaIva() {
        return partitaIva;
    }


    /**
     * Sets the partitaIva value for this IdentitaImpresa.
     * 
     * @param partitaIva
     */
    public void setPartitaIva(java.lang.String partitaIva) {
        this.partitaIva = partitaIva;
    }


    /**
     * Gets the statoLiquidazione value for this IdentitaImpresa.
     * 
     * @return statoLiquidazione
     */
    public java.util.Vector getStatoLiquidazione() {
        return statoLiquidazione;
    }


    /**
     * Sets the statoLiquidazione value for this IdentitaImpresa.
     * 
     * @param statoLiquidazione
     */
    public void setStatoLiquidazione(java.util.Vector statoLiquidazione) {
        this.statoLiquidazione = statoLiquidazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentitaImpresa)) return false;
        IdentitaImpresa other = (IdentitaImpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attivita==null && other.getAttivita()==null) || 
             (this.attivita!=null &&
              this.attivita.equals(other.getAttivita()))) &&
            ((this.dataCostituzione==null && other.getDataCostituzione()==null) || 
             (this.dataCostituzione!=null &&
              this.dataCostituzione.equals(other.getDataCostituzione()))) &&
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.luogoCostituzione==null && other.getLuogoCostituzione()==null) || 
             (this.luogoCostituzione!=null &&
              this.luogoCostituzione.equals(other.getLuogoCostituzione()))) &&
            ((this.naturaGiuridica==null && other.getNaturaGiuridica()==null) || 
             (this.naturaGiuridica!=null &&
              this.naturaGiuridica.equals(other.getNaturaGiuridica()))) &&
            ((this.partitaIva==null && other.getPartitaIva()==null) || 
             (this.partitaIva!=null &&
              this.partitaIva.equals(other.getPartitaIva()))) &&
            ((this.statoLiquidazione==null && other.getStatoLiquidazione()==null) || 
             (this.statoLiquidazione!=null &&
              this.statoLiquidazione.equals(other.getStatoLiquidazione())));
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
        if (getAttivita() != null) {
            _hashCode += getAttivita().hashCode();
        }
        if (getDataCostituzione() != null) {
            _hashCode += getDataCostituzione().hashCode();
        }
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getLuogoCostituzione() != null) {
            _hashCode += getLuogoCostituzione().hashCode();
        }
        if (getNaturaGiuridica() != null) {
            _hashCode += getNaturaGiuridica().hashCode();
        }
        if (getPartitaIva() != null) {
            _hashCode += getPartitaIva().hashCode();
        }
        if (getStatoLiquidazione() != null) {
            _hashCode += getStatoLiquidazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentitaImpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaImpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attivita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "attivita"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Attivita"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCostituzione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataCostituzione"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "DateGMS"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoCostituzione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "luogoCostituzione"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Luogo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturaGiuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "naturaGiuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "NaturaGiuridica"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitaIva");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "partitaIva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoLiquidazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "statoLiquidazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Vector"));
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
