/**
 * GetAuthorProductsByURI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class GetAuthorProductsByURI  implements java.io.Serializable {
    private java.lang.String authorURI;

    private java.lang.String metadataPrefix;

    private it.test.kion.WsdtoFilter filter;

    public GetAuthorProductsByURI() {
    }

    public GetAuthorProductsByURI(
           java.lang.String authorURI,
           java.lang.String metadataPrefix,
           it.test.kion.WsdtoFilter filter) {
           this.authorURI = authorURI;
           this.metadataPrefix = metadataPrefix;
           this.filter = filter;
    }


    /**
     * Gets the authorURI value for this GetAuthorProductsByURI.
     * 
     * @return authorURI
     */
    public java.lang.String getAuthorURI() {
        return authorURI;
    }


    /**
     * Sets the authorURI value for this GetAuthorProductsByURI.
     * 
     * @param authorURI
     */
    public void setAuthorURI(java.lang.String authorURI) {
        this.authorURI = authorURI;
    }


    /**
     * Gets the metadataPrefix value for this GetAuthorProductsByURI.
     * 
     * @return metadataPrefix
     */
    public java.lang.String getMetadataPrefix() {
        return metadataPrefix;
    }


    /**
     * Sets the metadataPrefix value for this GetAuthorProductsByURI.
     * 
     * @param metadataPrefix
     */
    public void setMetadataPrefix(java.lang.String metadataPrefix) {
        this.metadataPrefix = metadataPrefix;
    }


    /**
     * Gets the filter value for this GetAuthorProductsByURI.
     * 
     * @return filter
     */
    public it.test.kion.WsdtoFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this GetAuthorProductsByURI.
     * 
     * @param filter
     */
    public void setFilter(it.test.kion.WsdtoFilter filter) {
        this.filter = filter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAuthorProductsByURI)) return false;
        GetAuthorProductsByURI other = (GetAuthorProductsByURI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorURI==null && other.getAuthorURI()==null) || 
             (this.authorURI!=null &&
              this.authorURI.equals(other.getAuthorURI()))) &&
            ((this.metadataPrefix==null && other.getMetadataPrefix()==null) || 
             (this.metadataPrefix!=null &&
              this.metadataPrefix.equals(other.getMetadataPrefix()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter())));
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
        if (getAuthorURI() != null) {
            _hashCode += getAuthorURI().hashCode();
        }
        if (getMetadataPrefix() != null) {
            _hashCode += getMetadataPrefix().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAuthorProductsByURI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByURI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorURI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorURI"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoFilter"));
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
