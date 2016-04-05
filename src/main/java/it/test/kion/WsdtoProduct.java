/**
 * WsdtoProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class WsdtoProduct  implements java.io.Serializable {
    private it.test.kion.WsdtoMetadataFormat metadataFormat;

    private java.lang.Integer productID;

    private org.w3c.dom.Element productMetadata;

    private java.lang.String productURI;

    public WsdtoProduct() {
    }

    public WsdtoProduct(
           it.test.kion.WsdtoMetadataFormat metadataFormat,
           java.lang.Integer productID,
           org.w3c.dom.Element productMetadata,
           java.lang.String productURI) {
           this.metadataFormat = metadataFormat;
           this.productID = productID;
           this.productMetadata = productMetadata;
           this.productURI = productURI;
    }


    /**
     * Gets the metadataFormat value for this WsdtoProduct.
     * 
     * @return metadataFormat
     */
    public it.test.kion.WsdtoMetadataFormat getMetadataFormat() {
        return metadataFormat;
    }


    /**
     * Sets the metadataFormat value for this WsdtoProduct.
     * 
     * @param metadataFormat
     */
    public void setMetadataFormat(it.test.kion.WsdtoMetadataFormat metadataFormat) {
        this.metadataFormat = metadataFormat;
    }


    /**
     * Gets the productID value for this WsdtoProduct.
     * 
     * @return productID
     */
    public java.lang.Integer getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this WsdtoProduct.
     * 
     * @param productID
     */
    public void setProductID(java.lang.Integer productID) {
        this.productID = productID;
    }


    /**
     * Gets the productMetadata value for this WsdtoProduct.
     * 
     * @return productMetadata
     */
    public org.w3c.dom.Element getProductMetadata() {
        return productMetadata;
    }


    /**
     * Sets the productMetadata value for this WsdtoProduct.
     * 
     * @param productMetadata
     */
    public void setProductMetadata(org.w3c.dom.Element productMetadata) {
        this.productMetadata = productMetadata;
    }


    /**
     * Gets the productURI value for this WsdtoProduct.
     * 
     * @return productURI
     */
    public java.lang.String getProductURI() {
        return productURI;
    }


    /**
     * Sets the productURI value for this WsdtoProduct.
     * 
     * @param productURI
     */
    public void setProductURI(java.lang.String productURI) {
        this.productURI = productURI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsdtoProduct)) return false;
        WsdtoProduct other = (WsdtoProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metadataFormat==null && other.getMetadataFormat()==null) || 
             (this.metadataFormat!=null &&
              this.metadataFormat.equals(other.getMetadataFormat()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.productMetadata==null && other.getProductMetadata()==null) || 
             (this.productMetadata!=null &&
              this.productMetadata.equals(other.getProductMetadata()))) &&
            ((this.productURI==null && other.getProductURI()==null) || 
             (this.productURI!=null &&
              this.productURI.equals(other.getProductURI())));
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
        if (getMetadataFormat() != null) {
            _hashCode += getMetadataFormat().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getProductMetadata() != null) {
            _hashCode += getProductMetadata().hashCode();
        }
        if (getProductURI() != null) {
            _hashCode += getProductURI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsdtoProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metadataFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoMetadataFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productURI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productURI"));
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
