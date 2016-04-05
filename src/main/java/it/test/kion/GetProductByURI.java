/**
 * GetProductByURI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class GetProductByURI  implements java.io.Serializable {
    private java.lang.String productURI;

    private java.lang.String metadataPrefix;

    public GetProductByURI() {
    }

    public GetProductByURI(
           java.lang.String productURI,
           java.lang.String metadataPrefix) {
           this.productURI = productURI;
           this.metadataPrefix = metadataPrefix;
    }


    /**
     * Gets the productURI value for this GetProductByURI.
     * 
     * @return productURI
     */
    public java.lang.String getProductURI() {
        return productURI;
    }


    /**
     * Sets the productURI value for this GetProductByURI.
     * 
     * @param productURI
     */
    public void setProductURI(java.lang.String productURI) {
        this.productURI = productURI;
    }


    /**
     * Gets the metadataPrefix value for this GetProductByURI.
     * 
     * @return metadataPrefix
     */
    public java.lang.String getMetadataPrefix() {
        return metadataPrefix;
    }


    /**
     * Sets the metadataPrefix value for this GetProductByURI.
     * 
     * @param metadataPrefix
     */
    public void setMetadataPrefix(java.lang.String metadataPrefix) {
        this.metadataPrefix = metadataPrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProductByURI)) return false;
        GetProductByURI other = (GetProductByURI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productURI==null && other.getProductURI()==null) || 
             (this.productURI!=null &&
              this.productURI.equals(other.getProductURI()))) &&
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
        if (getProductURI() != null) {
            _hashCode += getProductURI().hashCode();
        }
        if (getMetadataPrefix() != null) {
            _hashCode += getMetadataPrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProductByURI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByURI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productURI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
