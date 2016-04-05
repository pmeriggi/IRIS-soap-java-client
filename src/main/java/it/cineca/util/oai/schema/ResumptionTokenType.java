//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.05.09 at 04:56:30 PM CEST
//

package it.cineca.util.oai.schema;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;

// TODO: Auto-generated Javadoc
/**
 * A resumptionToken may have 3 optional attributes and can be used in ListSets, ListIdentifiers, ListRecords responses.
 * <p>
 * Java class for resumptionTokenType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resumptionTokenType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="completeListSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="cursor" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resumptionTokenType", propOrder = { "value" })
public class ResumptionTokenType {

	/** The value. */
	@XmlValue
	protected String value;

	/** The complete list size. */
	@XmlAttribute
	protected BigInteger completeListSize;

	/** The cursor. */
	@XmlAttribute
	protected BigInteger cursor;

	/** The expiration date. */
	@XmlAttribute
	protected XMLGregorianCalendar expirationDate;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the completeListSize property.
	 * 
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getCompleteListSize() {
		return completeListSize;
	}

	/**
	 * Sets the value of the completeListSize property.
	 * 
	 * @param value allowed object is {@link BigInteger }
	 */
	public void setCompleteListSize(BigInteger value) {
		completeListSize = value;
	}

	/**
	 * Gets the value of the cursor property.
	 * 
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getCursor() {
		return cursor;
	}

	/**
	 * Sets the value of the cursor property.
	 * 
	 * @param value allowed object is {@link BigInteger }
	 */
	public void setCursor(BigInteger value) {
		cursor = value;
	}

	/**
	 * Gets the value of the expirationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getExpirationDate() {
		return expirationDate;
	}

	/**
	 * Sets the value of the expirationDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setExpirationDate(XMLGregorianCalendar value) {
		expirationDate = value;
	}

}
