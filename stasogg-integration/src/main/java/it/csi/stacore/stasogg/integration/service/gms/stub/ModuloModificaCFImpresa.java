/**
 * ModuloModificaCFImpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class ModuloModificaCFImpresa  extends it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCF  implements java.io.Serializable {
    private java.lang.String denominazione;

    private it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica;

    public ModuloModificaCFImpresa() {
    }

    public ModuloModificaCFImpresa(
           int indentLevel,
           java.lang.String codFiscaleNuovo,
           java.lang.String codFiscaleVecchio,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataVal,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long idSoggetto,
           boolean moduloPF,
           java.lang.String nota,
           java.lang.String denominazione,
           it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica) {
        super(
            indentLevel,
            codFiscaleNuovo,
            codFiscaleVecchio,
            dataVal,
            fonteProvenienza,
            idSoggetto,
            moduloPF,
            nota);
        this.denominazione = denominazione;
        this.naturaGiuridica = naturaGiuridica;
    }


    /**
     * Gets the denominazione value for this ModuloModificaCFImpresa.
     * 
     * @return denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this ModuloModificaCFImpresa.
     * 
     * @param denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the naturaGiuridica value for this ModuloModificaCFImpresa.
     * 
     * @return naturaGiuridica
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica getNaturaGiuridica() {
        return naturaGiuridica;
    }


    /**
     * Sets the naturaGiuridica value for this ModuloModificaCFImpresa.
     * 
     * @param naturaGiuridica
     */
    public void setNaturaGiuridica(it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica naturaGiuridica) {
        this.naturaGiuridica = naturaGiuridica;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuloModificaCFImpresa)) return false;
        ModuloModificaCFImpresa other = (ModuloModificaCFImpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.naturaGiuridica==null && other.getNaturaGiuridica()==null) || 
             (this.naturaGiuridica!=null &&
              this.naturaGiuridica.equals(other.getNaturaGiuridica())));
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
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getNaturaGiuridica() != null) {
            _hashCode += getNaturaGiuridica().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModuloModificaCFImpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCFImpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturaGiuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "naturaGiuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "NaturaGiuridica"));
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
