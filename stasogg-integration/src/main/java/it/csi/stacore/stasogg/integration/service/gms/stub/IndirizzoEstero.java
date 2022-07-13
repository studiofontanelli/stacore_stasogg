/**
 * IndirizzoEstero.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class IndirizzoEstero  extends it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo  implements java.io.Serializable {
    public IndirizzoEstero() {
    }

    public IndirizzoEstero(
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
            valoreStringa,
            cognomePresso,
            denominazionePresso,
            fonteRiferimento,
            indirizzoNazionale,
            nomePresso,
            potenzialmenteModificabile,
            priorita,
            statoIndirizzo);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndirizzoEstero)) return false;
        IndirizzoEstero other = (IndirizzoEstero) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndirizzoEstero.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoEstero"));
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
