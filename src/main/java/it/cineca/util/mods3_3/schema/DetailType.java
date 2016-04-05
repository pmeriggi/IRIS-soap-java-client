//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2009.10.27 at 12:34:36 PM CET
//

package it.cineca.util.mods3_3.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for detailType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailType", propOrder = { "numberOrCaptionOrTitle" })
public class DetailType {

	/** The number or caption or title. */
	@XmlElementRefs({ @XmlElementRef(name = "title", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class),
			@XmlElementRef(name = "caption", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class),
			@XmlElementRef(name = "number", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class) })
	protected List<JAXBElement<String>> numberOrCaptionOrTitle;

	/** The type. */
	@XmlAttribute
	protected String type;

	/** The level. */
	@XmlAttribute
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger level;

	/**
	 * Gets the value of the numberOrCaptionOrTitle property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the numberOrCaptionOrTitle property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNumberOrCaptionOrTitle().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }
	 * 
	 * @return the number or caption or title {@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	public List<JAXBElement<String>> getNumberOrCaptionOrTitle() {
		if (numberOrCaptionOrTitle == null) {
			numberOrCaptionOrTitle = new ArrayList<JAXBElement<String>>();
		}
		return numberOrCaptionOrTitle;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setType(String value) {
		type = value;
	}

	/**
	 * Gets the value of the level property.
	 * 
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getLevel() {
		return level;
	}

	/**
	 * Sets the value of the level property.
	 * 
	 * @param value allowed object is {@link BigInteger }
	 */
	public void setLevel(BigInteger value) {
		level = value;
	}

}
