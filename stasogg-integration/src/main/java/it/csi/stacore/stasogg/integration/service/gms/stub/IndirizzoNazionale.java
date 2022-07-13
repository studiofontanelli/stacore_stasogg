/**
 * IndirizzoNazionale.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class IndirizzoNazionale  extends it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo  implements java.io.Serializable {
    private java.lang.String cap;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Civico civico;

    private java.lang.String frazione;

    private java.lang.String localita;

    private it.csi.stacore.stasogg.integration.service.gms.stub.Via via;

    public IndirizzoNazionale() {
    }

    public IndirizzoNazionale(
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
           it.csi.stacore.stasogg.integration.service.gms.stub.StatoIndirizzo statoIndirizzo,
           java.lang.String cap,
           it.csi.stacore.stasogg.integration.service.gms.stub.Civico civico,
           java.lang.String frazione,
           java.lang.String localita,
           it.csi.stacore.stasogg.integration.service.gms.stub.Via via) {
        super(
            indentLevel,
            dataValidita,
            fonteProvenienza,
            id,
            indirizzoProvvisorio,
            luogoIndirizzo,
            tipo,
            valoreStringa,
            cognomePresso,
            denominazionePresso,
            fonteRiferimento,
            indirizzoNazionale,
            nomePresso,
            potenzialmenteModificabile,
            priorita,
            statoIndirizzo);
        this.cap = cap;
        this.civico = civico;
        this.frazione = frazione;
        this.localita = localita;
        this.via = via;
    }


    /**
     * Gets the cap value for this IndirizzoNazionale.
     * 
     * @return cap
     */
    public java.lang.String getCap() {
        return cap;
    }


    /**
     * Sets the cap value for this IndirizzoNazionale.
     * 
     * @param cap
     */
    public void setCap(java.lang.String cap) {
        this.cap = cap;
    }


    /**
     * Gets the civico value for this IndirizzoNazionale.
     * 
     * @return civico
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Civico getCivico() {
        return civico;
    }


    /**
     * Sets the civico value for this IndirizzoNazionale.
     * 
     * @param civico
     */
    public void setCivico(it.csi.stacore.stasogg.integration.service.gms.stub.Civico civico) {
        this.civico = civico;
    }


    /**
     * Gets the frazione value for this IndirizzoNazionale.
     * 
     * @return frazione
     */
    public java.lang.String getFrazione() {
        return frazione;
    }


    /**
     * Sets the frazione value for this IndirizzoNazionale.
     * 
     * @param frazione
     */
    public void setFrazione(java.lang.String frazione) {
        this.frazione = frazione;
    }


    /**
     * Gets the localita value for this IndirizzoNazionale.
     * 
     * @return localita
     */
    public java.lang.String getLocalita() {
        return localita;
    }


    /**
     * Sets the localita value for this IndirizzoNazionale.
     * 
     * @param localita
     */
    public void setLocalita(java.lang.String localita) {
        this.localita = localita;
    }


    /**
     * Gets the via value for this IndirizzoNazionale.
     * 
     * @return via
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Via getVia() {
        return via;
    }


    /**
     * Sets the via value for this IndirizzoNazionale.
     * 
     * @param via
     */
    public void setVia(it.csi.stacore.stasogg.integration.service.gms.stub.Via via) {
        this.via = via;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndirizzoNazionale)) return false;
        IndirizzoNazionale other = (IndirizzoNazionale) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cap==null && other.getCap()==null) || 
             (this.cap!=null &&
              this.cap.equals(other.getCap()))) &&
            ((this.civico==null && other.getCivico()==null) || 
             (this.civico!=null &&
              this.civico.equals(other.getCivico()))) &&
            ((this.frazione==null && other.getFrazione()==null) || 
             (this.frazione!=null &&
              this.frazione.equals(other.getFrazione()))) &&
            ((this.localita==null && other.getLocalita()==null) || 
             (this.localita!=null &&
              this.localita.equals(other.getLocalita()))) &&
            ((this.via==null && other.getVia()==null) || 
             (this.via!=null &&
              this.via.equals(other.getVia())));
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
        if (getCap() != null) {
            _hashCode += getCap().hashCode();
        }
        if (getCivico() != null) {
            _hashCode += getCivico().hashCode();
        }
        if (getFrazione() != null) {
            _hashCode += getFrazione().hashCode();
        }
        if (getLocalita() != null) {
            _hashCode += getLocalita().hashCode();
        }
        if (getVia() != null) {
            _hashCode += getVia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndirizzoNazionale.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoNazionale"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "cap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("civico");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "civico"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Civico"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frazione");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "frazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localita");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "localita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("via");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "via"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Via"));
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
