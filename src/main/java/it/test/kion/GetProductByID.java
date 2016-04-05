/**
 * GetProductByID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class GetProductByID  implements java.io.Serializable {
    private java.lang.Integer productID;

    private java.lang.String metadataPrefix;

    public GetProductByID() {
    }

    public GetProductByID(
           java.lang.Integer productID,
           java.lang.String metadataPrefix) {
           this.productID = productID;
           this.metadataPrefix = metadataPrefix;
    }


    /**
     * Gets the productID value for this GetProductByID.
     * 
     * @return productID
     */
    public java.lang.Integer getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this GetProductByID.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Integer productID) {
        this.productID = productID;
    }


    /**
     * Gets the metadataPrefix value for this GetProductByID.
     * 
     * @return metadataPrefix
     */
    public java.lang.String getMetadataPrefix() {
        return metadataPrefix;
    }


    /**
     * Sets the metadataPrefix value for this GetProductByID.
     * 
     * @param metadataPrefix
     */
    public void setMetadataPrefix(java.lang.String metadataPrefix) {
        this.metadataPrefix = metadataPrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProductByID)) return false;
        GetProductByID other = (GetProductByID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.metadataPrefix==null && other.getMetadataPrefix()==null) || 
             (this.metadataPrefix!=null &&
              this.metadataPrefix.equals(other.getMetadataPrefix())));
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
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getMetadataPrefix() != null) {
            _hashCode += getMetadataPrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProductByID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metadataPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
