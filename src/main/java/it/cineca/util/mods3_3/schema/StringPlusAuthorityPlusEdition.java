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
 * Java class for stringPlusAuthorityPlusEdition complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stringPlusAuthorityPlusEdition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>stringPlusAuthority">
 *       &lt;attribute name="edition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringPlusAuthorityPlusEdition")
@XmlSeeAlso({ ClassificationType.class })
public class StringPlusAuthorityPlusEdition extends StringPlusAuthority {

	/** The edition. */
	@XmlAttribute
	protected String edition;

	/**
	 * Gets the value of the edition property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * Sets the value of the edition property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setEdition(String value) {
		edition = value;
	}

}
