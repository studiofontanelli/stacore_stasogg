/**
 * DateGMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class DateGMS  extends it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject  implements java.io.Serializable {
    private java.lang.String anno;

    private java.lang.String annoString;

    private java.util.Date dateSQLValue;

    private java.util.Calendar dateValue;

    private java.lang.String giorno;

    private java.lang.String giornoString;

    private java.lang.String mese;

    private java.lang.String meseString;

    public DateGMS() {
    }

    public DateGMS(
           int indentLevel,
           java.lang.String anno,
           java.lang.String annoString,
           java.util.Date dateSQLValue,
           java.util.Calendar dateValue,
           java.lang.String giorno,
           java.lang.String giornoString,
           java.lang.String mese,
           java.lang.String meseString) {
        super(
            indentLevel);
        this.anno = anno;
        this.annoString = annoString;
        this.dateSQLValue = dateSQLValue;
        this.dateValue = dateValue;
        this.giorno = giorno;
        this.giornoString = giornoString;
        this.mese = mese;
        this.meseString = meseString;
    }


    /**
     * Gets the anno value for this DateGMS.
     * 
     * @return anno
     */
    public java.lang.String getAnno() {
        return anno;
    }


    /**
     * Sets the anno value for this DateGMS.
     * 
     * @param anno
     */
    public void setAnno(java.lang.String anno) {
        this.anno = anno;
    }


    /**
     * Gets the annoString value for this DateGMS.
     * 
     * @return annoString
     */
    public java.lang.String getAnnoString() {
        return annoString;
    }


    /**
     * Sets the annoString value for this DateGMS.
     * 
     * @param annoString
     */
    public void setAnnoString(java.lang.String annoString) {
        this.annoString = annoString;
    }


    /**
     * Gets the dateSQLValue value for this DateGMS.
     * 
     * @return dateSQLValue
     */
    public java.util.Date getDateSQLValue() {
        return dateSQLValue;
    }


    /**
     * Sets the dateSQLValue value for this DateGMS.
     * 
     * @param dateSQLValue
     */
    public void setDateSQLValue(java.util.Date dateSQLValue) {
        this.dateSQLValue = dateSQLValue;
    }


    /**
     * Gets the dateValue value for this DateGMS.
     * 
     * @return dateValue
     */
    public java.util.Calendar getDateValue() {
        return dateValue;
    }


    /**
     * Sets the dateValue value for this DateGMS.
     * 
     * @param dateValue
     */
    public void setDateValue(java.util.Calendar dateValue) {
        this.dateValue = dateValue;
    }


    /**
     * Gets the giorno value for this DateGMS.
     * 
     * @return giorno
     */
    public java.lang.String getGiorno() {
        return giorno;
    }


    /**
     * Sets the giorno value for this DateGMS.
     * 
     * @param giorno
     */
    public void setGiorno(java.lang.String giorno) {
        this.giorno = giorno;
    }


    /**
     * Gets the giornoString value for this DateGMS.
     * 
     * @return giornoString
     */
    public java.lang.String getGiornoString() {
        return giornoString;
    }


    /**
     * Sets the giornoString value for this DateGMS.
     * 
     * @param giornoString
     */
    public void setGiornoString(java.lang.String giornoString) {
        this.giornoString = giornoString;
    }


    /**
     * Gets the mese value for this DateGMS.
     * 
     * @return mese
     */
    public java.lang.String getMese() {
        return mese;
    }


    /**
     * Sets the mese value for this DateGMS.
     * 
     * @param mese
     */
    public void setMese(java.lang.String mese) {
        this.mese = mese;
    }


    /**
     * Gets the meseString value for this DateGMS.
     * 
     * @return meseString
     */
    public java.lang.String getMeseString() {
        return meseString;
    }


    /**
     * Sets the meseString value for this DateGMS.
     * 
     * @param meseString
     */
    public void setMeseString(java.lang.String meseString) {
        this.meseString = meseString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateGMS)) return false;
        DateGMS other = (DateGMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.anno==null && other.getAnno()==null) || 
             (this.anno!=null &&
              this.anno.equals(other.getAnno()))) &&
            ((this.annoString==null && other.getAnnoString()==null) || 
             (this.annoString!=null &&
              this.annoString.equals(other.getAnnoString()))) &&
            ((this.dateSQLValue==null && other.getDateSQLValue()==null) || 
             (this.dateSQLValue!=null &&
              this.dateSQLValue.equals(other.getDateSQLValue()))) &&
            ((this.dateValue==null && other.getDateValue()==null) || 
             (this.dateValue!=null &&
              this.dateValue.equals(other.getDateValue()))) &&
            ((this.giorno==null && other.getGiorno()==null) || 
             (this.giorno!=null &&
              this.giorno.equals(other.getGiorno()))) &&
            ((this.giornoString==null && other.getGiornoString()==null) || 
             (this.giornoString!=null &&
              this.giornoString.equals(other.getGiornoString()))) &&
            ((this.mese==null && other.getMese()==null) || 
             (this.mese!=null &&
              this.mese.equals(other.getMese()))) &&
            ((this.meseString==null && other.getMeseString()==null) || 
             (this.meseString!=null &&
              this.meseString.equals(other.getMeseString())));
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
        if (getAnno() != null) {
            _hashCode += getAnno().hashCode();
        }
        if (getAnnoString() != null) {
            _hashCode += getAnnoString().hashCode();
        }
        if (getDateSQLValue() != null) {
            _hashCode += getDateSQLValue().hashCode();
        }
        if (getDateValue() != null) {
            _hashCode += getDateValue().hashCode();
        }
        if (getGiorno() != null) {
            _hashCode += getGiorno().hashCode();
        }
        if (getGiornoString() != null) {
            _hashCode += getGiornoString().hashCode();
        }
        if (getMese() != null) {
            _hashCode += getMese().hashCode();
        }
        if (getMeseString() != null) {
            _hashCode += getMeseString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateGMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:gmsregsrv", "DateGMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anno");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "anno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "annoString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSQLValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dateSQLValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "dateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giorno");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "giorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giornoString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "giornoString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mese");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "mese"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meseString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:gmsregsrv", "meseString"));
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
