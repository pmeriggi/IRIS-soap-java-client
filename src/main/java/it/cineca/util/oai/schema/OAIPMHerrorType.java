//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.05.09 at 04:56:30 PM CEST
//

package it.cineca.util.oai.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for OAI-PMHerrorType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OAI-PMHerrorType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="code" use="required" type="{http://www.openarchives.org/OAI/2.0/}OAI-PMHerrorcodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAI-PMHerrorType", propOrder = { "value" })
public class OAIPMHerrorType {

	/** The value. */
	@XmlValue
	protected String value;

	/** The code. */
	@XmlAttribute(required = true)
	protected OAIPMHerrorcodeType code;

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
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link OAIPMHerrorcodeType }
	 */
	public OAIPMHerrorcodeType getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value allowed object is {@link OAIPMHerrorcodeType }
	 */
	public void setCode(OAIPMHerrorcodeType value) {
		code = value;
	}

}
