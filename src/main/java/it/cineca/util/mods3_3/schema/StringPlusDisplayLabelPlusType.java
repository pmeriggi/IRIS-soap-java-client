//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2009.10.27 at 12:34:36 PM CET
//

package it.cineca.util.mods3_3.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for stringPlusDisplayLabelPlusType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stringPlusDisplayLabelPlusType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>stringPlusDisplayLabel">
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringPlusDisplayLabelPlusType")
@XmlSeeAlso({ UnstructuredText.class })
public class StringPlusDisplayLabelPlusType extends StringPlusDisplayLabel {

	/** The display label type. */
	@XmlAttribute(name = "type")
	protected String displayLabelType;

	/**
	 * Gets the value of the displayLabelType property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDisplayLabelType() {
		return displayLabelType;
	}

	/**
	 * Sets the value of the displayLabelType property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDisplayLabelType(String value) {
		displayLabelType = value;
	}

}
