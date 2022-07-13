/**
 * ModuloModificaCF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public abstract class ModuloModificaCF  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String codFiscaleNuovo;

    private java.lang.String codFiscaleVecchio;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataVal;

    private it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza;

    private java.lang.Long idSoggetto;

    private boolean moduloPF;

    private java.lang.String nota;

    public ModuloModificaCF() {
    }

    public ModuloModificaCF(
           int indentLevel,
           java.lang.String codFiscaleNuovo,
           java.lang.String codFiscaleVecchio,
           it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataVal,
           it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza,
           java.lang.Long idSoggetto,
           boolean moduloPF,
           java.lang.String nota) {
        super(
            indentLevel);
        this.codFiscaleNuovo = codFiscaleNuovo;
        this.codFiscaleVecchio = codFiscaleVecchio;
        this.dataVal = dataVal;
        this.fonteProvenienza = fonteProvenienza;
        this.idSoggetto = idSoggetto;
        this.moduloPF = moduloPF;
        this.nota = nota;
    }


    /**
     * Gets the codFiscaleNuovo value for this ModuloModificaCF.
     * 
     * @return codFiscaleNuovo
     */
    public java.lang.String getCodFiscaleNuovo() {
        return codFiscaleNuovo;
    }


    /**
     * Sets the codFiscaleNuovo value for this ModuloModificaCF.
     * 
     * @param codFiscaleNuovo
     */
    public void setCodFiscaleNuovo(java.lang.String codFiscaleNuovo) {
        this.codFiscaleNuovo = codFiscaleNuovo;
    }


    /**
     * Gets the codFiscaleVecchio value for this ModuloModificaCF.
     * 
     * @return codFiscaleVecchio
     */
    public java.lang.String getCodFiscaleVecchio() {
        return codFiscaleVecchio;
    }


    /**
     * Sets the codFiscaleVecchio value for this ModuloModificaCF.
     * 
     * @param codFiscaleVecchio
     */
    public void setCodFiscaleVecchio(java.lang.String codFiscaleVecchio) {
        this.codFiscaleVecchio = codFiscaleVecchio;
    }


    /**
     * Gets the dataVal value for this ModuloModificaCF.
     * 
     * @return dataVal
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS getDataVal() {
        return dataVal;
    }


    /**
     * Sets the dataVal value for this ModuloModificaCF.
     * 
     * @param dataVal
     */
    public void setDataVal(it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS dataVal) {
        this.dataVal = dataVal;
    }


    /**
     * Gets the fonteProvenienza value for this ModuloModificaCF.
     * 
     * @return fonteProvenienza
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza getFonteProvenienza() {
        return fonteProvenienza;
    }


    /**
     * Sets the fonteProvenienza value for this ModuloModificaCF.
     * 
     * @param fonteProvenienza
     */
    public void setFonteProvenienza(it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza fonteProvenienza) {
        this.fonteProvenienza = fonteProvenienza;
    }


    /**
     * Gets the idSoggetto value for this ModuloModificaCF.
     * 
     * @return idSoggetto
     */
    public java.lang.Long getIdSoggetto() {
        return idSoggetto;
    }


    /**
     * Sets the idSoggetto value for this ModuloModificaCF.
     * 
     * @param idSoggetto
     */
    public void setIdSoggetto(java.lang.Long idSoggetto) {
        this.idSoggetto = idSoggetto;
    }


    /**
     * Gets the moduloPF value for this ModuloModificaCF.
     * 
     * @return moduloPF
     */
    public boolean isModuloPF() {
        return moduloPF;
    }


    /**
     * Sets the moduloPF value for this ModuloModificaCF.
     * 
     * @param moduloPF
     */
    public void setModuloPF(boolean moduloPF) {
        this.moduloPF = moduloPF;
    }


    /**
     * Gets the nota value for this ModuloModificaCF.
     * 
     * @return nota
     */
    public java.lang.String getNota() {
        return nota;
    }


    /**
     * Sets the nota value for this ModuloModificaCF.
     * 
     * @param nota
     */
    public void setNota(java.lang.String nota) {
        this.nota = nota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuloModificaCF)) return false;
        ModuloModificaCF other = (ModuloModificaCF) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codFiscaleNuovo==null && other.getCodFiscaleNuovo()==null) || 
             (this.codFiscaleNuovo!=null &&
              this.codFiscaleNuovo.equals(other.getCodFiscaleNuovo()))) &&
            ((this.codFiscaleVecchio==null && other.getCodFiscaleVecchio()==null) || 
             (this.codFiscaleVecchio!=null &&
              this.codFiscaleVecchio.equals(other.getCodFiscaleVecchio()))) &&
            ((this.dataVal==null && other.getDataVal()==null) || 
             (this.dataVal!=null &&
              this.dataVal.equals(other.getDataVal()))) &&
            ((this.fonteProvenienza==null && other.getFonteProvenienza()==null) || 
             (this.fonteProvenienza!=null &&
              this.fonteProvenienza.equals(other.getFonteProvenienza()))) &&
            ((this.idSoggetto==null && other.getIdSoggetto()==null) || 
             (this.idSoggetto!=null &&
              this.idSoggetto.equals(other.getIdSoggetto()))) &&
            this.moduloPF == other.isModuloPF() &&
            ((this.nota==null && other.getNota()==null) || 
             (this.nota!=null &&
              this.nota.equals(other.getNota())));
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
        if (getCodFiscaleNuovo() != null) {
            _hashCode += getCodFiscaleNuovo().hashCode();
        }
        if (getCodFiscaleVecchio() != null) {
            _hashCode += getCodFiscaleVecchio().hashCode();
        }
        if (getDataVal() != null) {
            _hashCode += getDataVal().hashCode();
        }
        if (getFonteProvenienza() != null) {
            _hashCode += getFonteProvenienza().hashCode();
        }
        if (getIdSoggetto() != null) {
            _hashCode += getIdSoggetto().hashCode();
        }
        _hashCode += (isModuloPF() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNota() != null) {
            _hashCode += getNota().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModuloModificaCF.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCF"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFiscaleNuovo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codFiscaleNuovo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFiscaleVecchio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "codFiscaleVecchio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dataVal"));
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
        elemField.setFieldName("idSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idSoggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduloPF");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "moduloPF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nota");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "nota"));
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
