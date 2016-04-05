/**
 * ApplicationExceptionI18NParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class ApplicationExceptionI18NParams  implements java.io.Serializable {
    private it.test.kion.ApplicationExceptionI18NParamsEntry[] entry;

    public ApplicationExceptionI18NParams() {
    }

    public ApplicationExceptionI18NParams(
           it.test.kion.ApplicationExceptionI18NParamsEntry[] entry) {
           this.entry = entry;
    }


    /**
     * Gets the entry value for this ApplicationExceptionI18NParams.
     * 
     * @return entry
     */
    public it.test.kion.ApplicationExceptionI18NParamsEntry[] getEntry() {
        return entry;
    }


    /**
     * Sets the entry value for this ApplicationExceptionI18NParams.
     * 
     * @param entry
     */
    public void setEntry(it.test.kion.ApplicationExceptionI18NParamsEntry[] entry) {
        this.entry = entry;
    }

    public it.test.kion.ApplicationExceptionI18NParamsEntry getEntry(int i) {
        return this.entry[i];
    }

    public void setEntry(int i, it.test.kion.ApplicationExceptionI18NParamsEntry _value) {
        this.entry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationExceptionI18NParams)) return false;
        ApplicationExceptionI18NParams other = (ApplicationExceptionI18NParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entry==null && other.getEntry()==null) || 
             (this.entry!=null &&
              java.util.Arrays.equals(this.entry, other.getEntry())));
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
        if (getEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntry(), i);
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
        new org.apache.axis.description.TypeDesc(ApplicationExceptionI18NParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", ">ApplicationException>i18NParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", ">>ApplicationException>i18NParams>entry"));
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
