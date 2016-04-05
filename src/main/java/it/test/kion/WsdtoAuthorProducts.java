/**
 * WsdtoAuthorProducts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class WsdtoAuthorProducts  implements java.io.Serializable {
    private java.lang.Integer authorID;

    private java.lang.String authorName;

    private java.lang.String authorSurname;

    private java.lang.String authorURI;

    private java.lang.Integer pageProductsCount;

    private it.test.kion.WsdtoProduct[] products;

    private java.lang.Long productsCount;

    public WsdtoAuthorProducts() {
    }

    public WsdtoAuthorProducts(
           java.lang.Integer authorID,
           java.lang.String authorName,
           java.lang.String authorSurname,
           java.lang.String authorURI,
           java.lang.Integer pageProductsCount,
           it.test.kion.WsdtoProduct[] products,
           java.lang.Long productsCount) {
           this.authorID = authorID;
           this.authorName = authorName;
           this.authorSurname = authorSurname;
           this.authorURI = authorURI;
           this.pageProductsCount = pageProductsCount;
           this.products = products;
           this.productsCount = productsCount;
    }


    /**
     * Gets the authorID value for this WsdtoAuthorProducts.
     * 
     * @return authorID
     */
    public java.lang.Integer getAuthorID() {
        return authorID;
    }


    /**
     * Sets the authorID value for this WsdtoAuthorProducts.
     * 
     * @param authorID
     */
    public void setAuthorID(java.lang.Integer authorID) {
        this.authorID = authorID;
    }


    /**
     * Gets the authorName value for this WsdtoAuthorProducts.
     * 
     * @return authorName
     */
    public java.lang.String getAuthorName() {
        return authorName;
    }


    /**
     * Sets the authorName value for this WsdtoAuthorProducts.
     * 
     * @param authorName
     */
    public void setAuthorName(java.lang.String authorName) {
        this.authorName = authorName;
    }


    /**
     * Gets the authorSurname value for this WsdtoAuthorProducts.
     * 
     * @return authorSurname
     */
    public java.lang.String getAuthorSurname() {
        return authorSurname;
    }


    /**
     * Sets the authorSurname value for this WsdtoAuthorProducts.
     * 
     * @param authorSurname
     */
    public void setAuthorSurname(java.lang.String authorSurname) {
        this.authorSurname = authorSurname;
    }


    /**
     * Gets the authorURI value for this WsdtoAuthorProducts.
     * 
     * @return authorURI
     */
    public java.lang.String getAuthorURI() {
        return authorURI;
    }


    /**
     * Sets the authorURI value for this WsdtoAuthorProducts.
     * 
     * @param authorURI
     */
    public void setAuthorURI(java.lang.String authorURI) {
        this.authorURI = authorURI;
    }


    /**
     * Gets the pageProductsCount value for this WsdtoAuthorProducts.
     * 
     * @return pageProductsCount
     */
    public java.lang.Integer getPageProductsCount() {
        return pageProductsCount;
    }


    /**
     * Sets the pageProductsCount value for this WsdtoAuthorProducts.
     * 
     * @param pageProductsCount
     */
    public void setPageProductsCount(java.lang.Integer pageProductsCount) {
        this.pageProductsCount = pageProductsCount;
    }


    /**
     * Gets the products value for this WsdtoAuthorProducts.
     * 
     * @return products
     */
    public it.test.kion.WsdtoProduct[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this WsdtoAuthorProducts.
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
     * Gets the productsCount value for this WsdtoAuthorProducts.
     * 
     * @return productsCount
     */
    public java.lang.Long getProductsCount() {
        return productsCount;
    }


    /**
     * Sets the productsCount value for this WsdtoAuthorProducts.
     * 
     * @param productsCount
     */
    public void setProductsCount(java.lang.Long productsCount) {
        this.productsCount = productsCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsdtoAuthorProducts)) return false;
        WsdtoAuthorProducts other = (WsdtoAuthorProducts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorID==null && other.getAuthorID()==null) || 
             (this.authorID!=null &&
              this.authorID.equals(other.getAuthorID()))) &&
            ((this.authorName==null && other.getAuthorName()==null) || 
             (this.authorName!=null &&
              this.authorName.equals(other.getAuthorName()))) &&
            ((this.authorSurname==null && other.getAuthorSurname()==null) || 
             (this.authorSurname!=null &&
              this.authorSurname.equals(other.getAuthorSurname()))) &&
            ((this.authorURI==null && other.getAuthorURI()==null) || 
             (this.authorURI!=null &&
              this.authorURI.equals(other.getAuthorURI()))) &&
            ((this.pageProductsCount==null && other.getPageProductsCount()==null) || 
             (this.pageProductsCount!=null &&
              this.pageProductsCount.equals(other.getPageProductsCount()))) &&
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              java.util.Arrays.equals(this.products, other.getProducts()))) &&
            ((this.productsCount==null && other.getProductsCount()==null) || 
             (this.productsCount!=null &&
              this.productsCount.equals(other.getProductsCount())));
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
        if (getAuthorID() != null) {
            _hashCode += getAuthorID().hashCode();
        }
        if (getAuthorName() != null) {
            _hashCode += getAuthorName().hashCode();
        }
        if (getAuthorSurname() != null) {
            _hashCode += getAuthorSurname().hashCode();
        }
        if (getAuthorURI() != null) {
            _hashCode += getAuthorURI().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsdtoAuthorProducts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoAuthorProducts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorSurname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorSurname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorURI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
