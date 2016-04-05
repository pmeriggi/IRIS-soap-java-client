/**
 * WsdtoProducts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class WsdtoProducts  implements java.io.Serializable {
    private java.lang.Integer pageProductsCount;

    private it.test.kion.WsdtoProduct[] products;

    private java.lang.Long productsCount;

    private java.lang.String query;

    public WsdtoProducts() {
    }

    public WsdtoProducts(
           java.lang.Integer pageProductsCount,
           it.test.kion.WsdtoProduct[] products,
           java.lang.Long productsCount,
           java.lang.String query) {
           this.pageProductsCount = pageProductsCount;
           this.products = products;
           this.productsCount = productsCount;
           this.query = query;
    }


    /**
     * Gets the pageProductsCount value for this WsdtoProducts.
     * 
     * @return pageProductsCount
     */
    public java.lang.Integer getPageProductsCount() {
        return pageProductsCount;
    }


    /**
     * Sets the pageProductsCount value for this WsdtoProducts.
     * 
     * @param pageProductsCount
     */
    public void setPageProductsCount(java.lang.Integer pageProductsCount) {
        this.pageProductsCount = pageProductsCount;
    }


    /**
     * Gets the products value for this WsdtoProducts.
     * 
     * @return products
     */
    public it.test.kion.WsdtoProduct[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this WsdtoProducts.
     * 
     * @param products
     */
    public void setProducts(it.test.kion.WsdtoProduct[] products) {
        this.products = products;
    }

    public it.test.kion.WsdtoProduct getProducts(int i) {
        return this.products[i];
    }

    public void setProducts(int i, it.test.kion.WsdtoProduct _value) {
        this.products[i] = _value;
    }


    /**
     * Gets the productsCount value for this WsdtoProducts.
     * 
     * @return productsCount
     */
    public java.lang.Long getProductsCount() {
        return productsCount;
    }


    /**
     * Sets the productsCount value for this WsdtoProducts.
     * 
     * @param productsCount
     */
    public void setProductsCount(java.lang.Long productsCount) {
        this.productsCount = productsCount;
    }


    /**
     * Gets the query value for this WsdtoProducts.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this WsdtoProducts.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsdtoProducts)) return false;
        WsdtoProducts other = (WsdtoProducts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageProductsCount==null && other.getPageProductsCount()==null) || 
             (this.pageProductsCount!=null &&
              this.pageProductsCount.equals(other.getPageProductsCount()))) &&
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              java.util.Arrays.equals(this.products, other.getProducts()))) &&
            ((this.productsCount==null && other.getProductsCount()==null) || 
             (this.productsCount!=null &&
              this.productsCount.equals(other.getProductsCount()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery())));
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
        if (getPageProductsCount() != null) {
            _hashCode += getPageProductsCount().hashCode();
        }
        if (getProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductsCount() != null) {
            _hashCode += getProductsCount().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsdtoProducts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProducts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageProductsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageProductsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("", "products"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query"));
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
