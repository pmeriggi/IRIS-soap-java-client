/**
 * WsdtoSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class WsdtoSummary  implements java.io.Serializable {
    private java.lang.Integer authorID;

    private java.lang.String authorName;

    private java.lang.String authorSurname;

    private java.lang.String authorURI;

    private java.lang.Long productsCount;

    private it.test.kion.WsdtoType[] type;

    public WsdtoSummary() {
    }

    public WsdtoSummary(
           java.lang.Integer authorID,
           java.lang.String authorName,
           java.lang.String authorSurname,
           java.lang.String authorURI,
           java.lang.Long productsCount,
           it.test.kion.WsdtoType[] type) {
           this.authorID = authorID;
           this.authorName = authorName;
           this.authorSurname = authorSurname;
           this.authorURI = authorURI;
           this.productsCount = productsCount;
           this.type = type;
    }


    /**
     * Gets the authorID value for this WsdtoSummary.
     * 
     * @return authorID
     */
    public java.lang.Integer getAuthorID() {
        return authorID;
    }


    /**
     * Sets the authorID value for this WsdtoSummary.
     * 
     * @param authorID
     */
    public void setAuthorID(java.lang.Integer authorID) {
        this.authorID = authorID;
    }


    /**
     * Gets the authorName value for this WsdtoSummary.
     * 
     * @return authorName
     */
    public java.lang.String getAuthorName() {
        return authorName;
    }


    /**
     * Sets the authorName value for this WsdtoSummary.
     * 
     * @param authorName
     */
    public void setAuthorName(java.lang.String authorName) {
        this.authorName = authorName;
    }


    /**
     * Gets the authorSurname value for this WsdtoSummary.
     * 
     * @return authorSurname
     */
    public java.lang.String getAuthorSurname() {
        return authorSurname;
    }


    /**
     * Sets the authorSurname value for this WsdtoSummary.
     * 
     * @param authorSurname
     */
    public void setAuthorSurname(java.lang.String authorSurname) {
        this.authorSurname = authorSurname;
    }


    /**
     * Gets the authorURI value for this WsdtoSummary.
     * 
     * @return authorURI
     */
    public java.lang.String getAuthorURI() {
        return authorURI;
    }


    /**
     * Sets the authorURI value for this WsdtoSummary.
     * 
     * @param authorURI
     */
    public void setAuthorURI(java.lang.String authorURI) {
        this.authorURI = authorURI;
    }


    /**
     * Gets the productsCount value for this WsdtoSummary.
     * 
     * @return productsCount
     */
    public java.lang.Long getProductsCount() {
        return productsCount;
    }


    /**
     * Sets the productsCount value for this WsdtoSummary.
     * 
     * @param productsCount
     */
    public void setProductsCount(java.lang.Long productsCount) {
        this.productsCount = productsCount;
    }


    /**
     * Gets the type value for this WsdtoSummary.
     * 
     * @return type
     */
    public it.test.kion.WsdtoType[] getType() {
        return type;
    }


    /**
     * Sets the type value for this WsdtoSummary.
     * 
     * @param type
     */
    public void setType(it.test.kion.WsdtoType[] type) {
        this.type = type;
    }

    public it.test.kion.WsdtoType getType(int i) {
        return this.type[i];
    }

    public void setType(int i, it.test.kion.WsdtoType _value) {
        this.type[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsdtoSummary)) return false;
        WsdtoSummary other = (WsdtoSummary) obj;
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
            ((this.productsCount==null && other.getProductsCount()==null) || 
             (this.productsCount!=null &&
              this.productsCount.equals(other.getProductsCount()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType())));
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
        if (getProductsCount() != null) {
            _hashCode += getProductsCount().hashCode();
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
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
        new org.apache.axis.description.TypeDesc(WsdtoSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoSummary"));
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
        elemField.setFieldName("productsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
