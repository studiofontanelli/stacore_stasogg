/**
 * IdentitaDefinitiva.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class IdentitaDefinitiva  extends it.csi.stacore.stasogg.integration.service.gms.stub.Identita  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento fonteRiferimento;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoOrigine;

    private boolean potenzialmenteModificabile;

    private it.csi.stacore.stasogg.integration.service.gms.stub.StatoAnagraficoSoggetto statoAnagrafico;

    public IdentitaDefinitiva() {
    }

    public IdentitaDefinitiva(
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
           it.csi.stacore.stasogg.integration.service.gms.stub.StatoAnagraficoSoggetto statoAnagrafico) {
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
            statoSoggetto);
        this.fonteRiferimento = fonteRiferimento;
        this.luogoOrigine = luogoOrigine;
        this.potenzialmenteModificabile = potenzialmenteModificabile;
        this.statoAnagrafico = statoAnagrafico;
    }


    /**
     * Gets the fonteRiferimento value for this IdentitaDefinitiva.
     * 
     * @return fonteRiferimento
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento getFonteRiferimento() {
        return fonteRiferimento;
    }


    /**
     * Sets the fonteRiferimento value for this IdentitaDefinitiva.
     * 
     * @param fonteRiferimento
     */
    public void setFonteRiferimento(it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento fonteRiferimento) {
        this.fonteRiferimento = fonteRiferimento;
    }


    /**
     * Gets the luogoOrigine value for this IdentitaDefinitiva.
     * 
     * @return luogoOrigine
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Luogo getLuogoOrigine() {
        return luogoOrigine;
    }


    /**
     * Sets the luogoOrigine value for this IdentitaDefinitiva.
     * 
     * @param luogoOrigine
     */
    public void setLuogoOrigine(it.csi.stacore.stasogg.integration.service.gms.stub.Luogo luogoOrigine) {
        this.luogoOrigine = luogoOrigine;
    }


    /**
     * Gets the potenzialmenteModificabile value for this IdentitaDefinitiva.
     * 
     * @return potenzialmenteModificabile
     */
    public boolean isPotenzialmenteModificabile() {
        return potenzialmenteModificabile;
    }


    /**
     * Sets the potenzialmenteModificabile value for this IdentitaDefinitiva.
     * 
     * @param potenzialmenteModificabile
     */
    public void setPotenzialmenteModificabile(boolean potenzialmenteModificabile) {
        this.potenzialmenteModificabile = potenzialmenteModificabile;
    }


    /**
     * Gets the statoAnagrafico value for this IdentitaDefinitiva.
     * 
     * @return statoAnagrafico
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.StatoAnagraficoSoggetto getStatoAnagrafico() {
        return statoAnagrafico;
    }


    /**
     * Sets the statoAnagrafico value for this IdentitaDefinitiva.
     * 
     * @param statoAnagrafico
     */
    public void setStatoAnagrafico(it.csi.stacore.stasogg.integration.service.gms.stub.StatoAnagraficoSoggetto statoAnagrafico) {
        this.statoAnagrafico = statoAnagrafico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentitaDefinitiva)) return false;
        IdentitaDefinitiva other = (IdentitaDefinitiva) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fonteRiferimento==null && other.getFonteRiferimento()==null) || 
             (this.fonteRiferimento!=null &&
              this.fonteRiferimento.equals(other.getFonteRiferimento()))) &&
            ((this.luogoOrigine==null && other.getLuogoOrigine()==null) || 
             (this.luogoOrigine!=null &&
              this.luogoOrigine.equals(other.getLuogoOrigine()))) &&
            this.potenzialmenteModificabile == other.isPotenzialmenteModificabile() &&
            ((this.statoAnagrafico==null && other.getStatoAnagrafico()==null) || 
             (this.statoAnagrafico!=null &&
              this.statoAnagrafico.equals(other.getStatoAnagrafico())));
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
        if (getFonteRiferimento() != null) {
            _hashCode += getFonteRiferimento().hashCode();
        }
        if (getLuogoOrigine() != null) {
            _hashCode += getLuogoOrigine().hashCode();
        }
        _hashCode += (isPotenzialmenteModificabile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatoAnagrafico() != null) {
            _hashCode += getStatoAnagrafico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentitaDefinitiva.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaDefinitiva"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fonteRiferimento");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "fonteRiferimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "FonteRiferimento"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luogoOrigine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "luogoOrigine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Luogo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenzialmenteModificabile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "potenzialmenteModificabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoAnagrafico");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "statoAnagrafico"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "StatoAnagraficoSoggetto"));
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
