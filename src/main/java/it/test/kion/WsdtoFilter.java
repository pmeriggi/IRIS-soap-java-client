/**
 * WsdtoFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class WsdtoFilter  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.Integer from;

    private java.lang.Integer to;

    private java.util.Calendar modifiedFrom;

    private java.util.Calendar modifiedTo;

    private it.test.kion.WsdtoOrderingToken[] orderingToken;

    public WsdtoFilter() {
    }

    public WsdtoFilter(
           java.lang.String type,
           java.lang.Integer from,
           java.lang.Integer to,
           java.util.Calendar modifiedFrom,
           java.util.Calendar modifiedTo,
           it.test.kion.WsdtoOrderingToken[] orderingToken) {
           this.type = type;
           this.from = from;
           this.to = to;
           this.modifiedFrom = modifiedFrom;
           this.modifiedTo = modifiedTo;
           this.orderingToken = orderingToken;
    }


    /**
     * Gets the type value for this WsdtoFilter.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WsdtoFilter.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the from value for this WsdtoFilter.
     * 
     * @return from
     */
    public java.lang.Integer getFrom() {
        return from;
    }


    /**
     * Sets the from value for this WsdtoFilter.
     * 
     * @param from
     */
    public void setFrom(java.lang.Integer from) {
        this.from = from;
    }


    /**
     * Gets the to value for this WsdtoFilter.
     * 
     * @return to
     */
    public java.lang.Integer getTo() {
        return to;
    }


    /**
     * Sets the to value for this WsdtoFilter.
     * 
     * @param to
     */
    public void setTo(java.lang.Integer to) {
        this.to = to;
    }


    /**
     * Gets the modifiedFrom value for this WsdtoFilter.
     * 
     * @return modifiedFrom
     */
    public java.util.Calendar getModifiedFrom() {
        return modifiedFrom;
    }


    /**
     * Sets the modifiedFrom value for this WsdtoFilter.
     * 
     * @param modifiedFrom
     */
    public void setModifiedFrom(java.util.Calendar modifiedFrom) {
        this.modifiedFrom = modifiedFrom;
    }


    /**
     * Gets the modifiedTo value for this WsdtoFilter.
     * 
     * @return modifiedTo
     */
    public java.util.Calendar getModifiedTo() {
        return modifiedTo;
    }


    /**
     * Sets the modifiedTo value for this WsdtoFilter.
     * 
     * @param modifiedTo
     */
    public void setModifiedTo(java.util.Calendar modifiedTo) {
        this.modifiedTo = modifiedTo;
    }


    /**
     * Gets the orderingToken value for this WsdtoFilter.
     * 
     * @return orderingToken
     */
    public it.test.kion.WsdtoOrderingToken[] getOrderingToken() {
        return orderingToken;
    }


    /**
     * Sets the orderingToken value for this WsdtoFilter.
     * 
     * @param orderingToken
     */
    public void setOrderingToken(it.test.kion.WsdtoOrderingToken[] orderingToken) {
        this.orderingToken = orderingToken;
    }

    public it.test.kion.WsdtoOrderingToken getOrderingToken(int i) {
        return this.orderingToken[i];
    }

    public void setOrderingToken(int i, it.test.kion.WsdtoOrderingToken _value) {
        this.orderingToken[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsdtoFilter)) return false;
        WsdtoFilter other = (WsdtoFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.modifiedFrom==null && other.getModifiedFrom()==null) || 
             (this.modifiedFrom!=null &&
              this.modifiedFrom.equals(other.getModifiedFrom()))) &&
            ((this.modifiedTo==null && other.getModifiedTo()==null) || 
             (this.modifiedTo!=null &&
              this.modifiedTo.equals(other.getModifiedTo()))) &&
            ((this.orderingToken==null && other.getOrderingToken()==null) || 
             (this.orderingToken!=null &&
              java.util.Arrays.equals(this.orderingToken, other.getOrderingToken())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getModifiedFrom() != null) {
            _hashCode += getModifiedFrom().hashCode();
        }
        if (getModifiedTo() != null) {
            _hashCode += getModifiedTo().hashCode();
        }
        if (getOrderingToken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderingToken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderingToken(), i);
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
        new org.apache.axis.description.TypeDesc(WsdtoFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderingToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderingToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoOrderingToken"));
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
