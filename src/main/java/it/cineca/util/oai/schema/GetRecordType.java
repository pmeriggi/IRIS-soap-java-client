//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.05.09 at 04:56:30 PM CEST
//

package it.cineca.util.oai.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for GetRecordType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record" type="{http://www.openarchives.org/OAI/2.0/}recordType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRecordType", propOrder = { "record" })
public class GetRecordType {

	/** The record. */
	@XmlElement(required = true)
	protected RecordType record;

	/**
	 * Gets the value of the record property.
	 * 
	 * @return possible object is {@link RecordType }
	 */
	public RecordType getRecord() {
		return record;
	}

	/**
	 * Sets the value of the record property.
	 * 
	 * @param value allowed object is {@link RecordType }
	 */
	public void setRecord(RecordType value) {
		record = value;
	}

}
