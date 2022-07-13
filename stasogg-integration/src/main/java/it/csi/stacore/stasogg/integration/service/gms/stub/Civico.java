/**
 * Civico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class Civico  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String civicoInStringa;

    private it.csi.stacore.stasogg.integration.service.gms.stub.DettaglioToponomastica dettagliTopo;

    private boolean dettaglioTopoValorizzato;

    private java.lang.String estensioneCivico;

    private java.lang.Long idTopo;

    private java.lang.Integer radice;

    private java.lang.String valoreCompleto;

    public Civico() {
    }

    public Civico(
           int indentLevel,
           java.lang.String civicoInStringa,
           it.csi.stacore.stasogg.integration.service.gms.stub.DettaglioToponomastica dettagliTopo,
           boolean dettaglioTopoValorizzato,
           java.lang.String estensioneCivico,
           java.lang.Long idTopo,
           java.lang.Integer radice,
           java.lang.String valoreCompleto) {
        super(
            indentLevel);
        this.civicoInStringa = civicoInStringa;
        this.dettagliTopo = dettagliTopo;
        this.dettaglioTopoValorizzato = dettaglioTopoValorizzato;
        this.estensioneCivico = estensioneCivico;
        this.idTopo = idTopo;
        this.radice = radice;
        this.valoreCompleto = valoreCompleto;
    }


    /**
     * Gets the civicoInStringa value for this Civico.
     * 
     * @return civicoInStringa
     */
    public java.lang.String getCivicoInStringa() {
        return civicoInStringa;
    }


    /**
     * Sets the civicoInStringa value for this Civico.
     * 
     * @param civicoInStringa
     */
    public void setCivicoInStringa(java.lang.String civicoInStringa) {
        this.civicoInStringa = civicoInStringa;
    }


    /**
     * Gets the dettagliTopo value for this Civico.
     * 
     * @return dettagliTopo
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.DettaglioToponomastica getDettagliTopo() {
        return dettagliTopo;
    }


    /**
     * Sets the dettagliTopo value for this Civico.
     * 
     * @param dettagliTopo
     */
    public void setDettagliTopo(it.csi.stacore.stasogg.integration.service.gms.stub.DettaglioToponomastica dettagliTopo) {
        this.dettagliTopo = dettagliTopo;
    }


    /**
     * Gets the dettaglioTopoValorizzato value for this Civico.
     * 
     * @return dettaglioTopoValorizzato
     */
    public boolean isDettaglioTopoValorizzato() {
        return dettaglioTopoValorizzato;
    }


    /**
     * Sets the dettaglioTopoValorizzato value for this Civico.
     * 
     * @param dettaglioTopoValorizzato
     */
    public void setDettaglioTopoValorizzato(boolean dettaglioTopoValorizzato) {
        this.dettaglioTopoValorizzato = dettaglioTopoValorizzato;
    }


    /**
     * Gets the estensioneCivico value for this Civico.
     * 
     * @return estensioneCivico
     */
    public java.lang.String getEstensioneCivico() {
        return estensioneCivico;
    }


    /**
     * Sets the estensioneCivico value for this Civico.
     * 
     * @param estensioneCivico
     */
    public void setEstensioneCivico(java.lang.String estensioneCivico) {
        this.estensioneCivico = estensioneCivico;
    }


    /**
     * Gets the idTopo value for this Civico.
     * 
     * @return idTopo
     */
    public java.lang.Long getIdTopo() {
        return idTopo;
    }


    /**
     * Sets the idTopo value for this Civico.
     * 
     * @param idTopo
     */
    public void setIdTopo(java.lang.Long idTopo) {
        this.idTopo = idTopo;
    }


    /**
     * Gets the radice value for this Civico.
     * 
     * @return radice
     */
    public java.lang.Integer getRadice() {
        return radice;
    }


    /**
     * Sets the radice value for this Civico.
     * 
     * @param radice
     */
    public void setRadice(java.lang.Integer radice) {
        this.radice = radice;
    }


    /**
     * Gets the valoreCompleto value for this Civico.
     * 
     * @return valoreCompleto
     */
    public java.lang.String getValoreCompleto() {
        return valoreCompleto;
    }


    /**
     * Sets the valoreCompleto value for this Civico.
     * 
     * @param valoreCompleto
     */
    public void setValoreCompleto(java.lang.String valoreCompleto) {
        this.valoreCompleto = valoreCompleto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Civico)) return false;
        Civico other = (Civico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.civicoInStringa==null && other.getCivicoInStringa()==null) || 
             (this.civicoInStringa!=null &&
              this.civicoInStringa.equals(other.getCivicoInStringa()))) &&
            ((this.dettagliTopo==null && other.getDettagliTopo()==null) || 
             (this.dettagliTopo!=null &&
              this.dettagliTopo.equals(other.getDettagliTopo()))) &&
            this.dettaglioTopoValorizzato == other.isDettaglioTopoValorizzato() &&
            ((this.estensioneCivico==null && other.getEstensioneCivico()==null) || 
             (this.estensioneCivico!=null &&
              this.estensioneCivico.equals(other.getEstensioneCivico()))) &&
            ((this.idTopo==null && other.getIdTopo()==null) || 
             (this.idTopo!=null &&
              this.idTopo.equals(other.getIdTopo()))) &&
            ((this.radice==null && other.getRadice()==null) || 
             (this.radice!=null &&
              this.radice.equals(other.getRadice()))) &&
            ((this.valoreCompleto==null && other.getValoreCompleto()==null) || 
             (this.valoreCompleto!=null &&
              this.valoreCompleto.equals(other.getValoreCompleto())));
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
        if (getCivicoInStringa() != null) {
            _hashCode += getCivicoInStringa().hashCode();
        }
        if (getDettagliTopo() != null) {
            _hashCode += getDettagliTopo().hashCode();
        }
        _hashCode += (isDettaglioTopoValorizzato() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEstensioneCivico() != null) {
            _hashCode += getEstensioneCivico().hashCode();
        }
        if (getIdTopo() != null) {
            _hashCode += getIdTopo().hashCode();
        }
        if (getRadice() != null) {
            _hashCode += getRadice().hashCode();
        }
        if (getValoreCompleto() != null) {
            _hashCode += getValoreCompleto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Civico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Civico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("civicoInStringa");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "civicoInStringa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dettagliTopo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dettagliTopo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "DettaglioToponomastica"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dettaglioTopoValorizzato");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dettaglioTopoValorizzato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estensioneCivico");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "estensioneCivico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTopo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "idTopo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "radice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valoreCompleto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "valoreCompleto"));
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
