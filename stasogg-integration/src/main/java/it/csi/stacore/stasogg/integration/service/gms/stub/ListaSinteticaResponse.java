/**
 * ListaSinteticaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class ListaSinteticaResponse  implements java.io.Serializable {
    private it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] listaSinteticaReturn;

    public ListaSinteticaResponse() {
    }

    public ListaSinteticaResponse(
           it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] listaSinteticaReturn) {
           this.listaSinteticaReturn = listaSinteticaReturn;
    }


    /**
     * Gets the listaSinteticaReturn value for this ListaSinteticaResponse.
     * 
     * @return listaSinteticaReturn
     */
    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] getListaSinteticaReturn() {
        return listaSinteticaReturn;
    }


    /**
     * Sets the listaSinteticaReturn value for this ListaSinteticaResponse.
     * 
     * @param listaSinteticaReturn
     */
    public void setListaSinteticaReturn(it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] listaSinteticaReturn) {
        this.listaSinteticaReturn = listaSinteticaReturn;
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita getListaSinteticaReturn(int i) {
        return this.listaSinteticaReturn[i];
    }

    public void setListaSinteticaReturn(int i, it.csi.stacore.stasogg.integration.service.gms.stub.Identita _value) {
        this.listaSinteticaReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaSinteticaResponse)) return false;
        ListaSinteticaResponse other = (ListaSinteticaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaSinteticaReturn==null && other.getListaSinteticaReturn()==null) || 
             (this.listaSinteticaReturn!=null &&
              java.util.Arrays.equals(this.listaSinteticaReturn, other.getListaSinteticaReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getListaSinteticaReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaSinteticaReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaSinteticaReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaSinteticaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", ">listaSinteticaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaSinteticaReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "listaSinteticaReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "Identita"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
