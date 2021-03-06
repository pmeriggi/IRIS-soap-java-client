//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.06.30 at 11:51:43 AM CEST
//

package it.cineca.util.dc;

import it.cineca.util.dc.terms.Box;
import it.cineca.util.dc.terms.DCMIType;
import it.cineca.util.dc.terms.DDC;
import it.cineca.util.dc.terms.IMT;
import it.cineca.util.dc.terms.ISO3166;
import it.cineca.util.dc.terms.ISO6392;
import it.cineca.util.dc.terms.ISO6393;
import it.cineca.util.dc.terms.LCC;
import it.cineca.util.dc.terms.LCSH;
import it.cineca.util.dc.terms.MESH;
import it.cineca.util.dc.terms.Period;
import it.cineca.util.dc.terms.Point;
import it.cineca.util.dc.terms.RFC1766;
import it.cineca.util.dc.terms.RFC3066;
import it.cineca.util.dc.terms.RFC4646;
import it.cineca.util.dc.terms.TGN;
import it.cineca.util.dc.terms.UDC;
import it.cineca.util.dc.terms.URI;
import it.cineca.util.dc.terms.W3CDTF;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

// TODO: Auto-generated Javadoc
/**
 * This is the default type for all of the DC elements. It permits text content only with optional xml:lang attribute. Text is allowed
 * because mixed="true", but sub-elements are disallowed because minOccurs="0" and maxOccurs="0" are on the xs:any tag. This complexType
 * allows for restriction or extension permitting child elements.
 * <p>
 * Java class for SimpleLiteral complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleLiteral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleLiteral", propOrder = { "content" })
@XmlSeeAlso({ RFC3066.class, Period.class, DDC.class, TGN.class, ISO3166.class, MESH.class, Box.class, IMT.class, W3CDTF.class, LCC.class,
		RFC4646.class, ISO6392.class, ISO6393.class, LCSH.class, UDC.class, RFC1766.class, Point.class, DCMIType.class, URI.class })
public class SimpleLiteral {

	/** The content. */
	@XmlMixed
	protected List<String> content;

	/** The lang. */
	@XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "language")
	protected String lang;

	/**
	 * This is the default type for all of the DC elements. It permits text content only with optional xml:lang attribute. Text is allowed
	 * because mixed="true", but sub-elements are disallowed because minOccurs="0" and maxOccurs="0" are on the xs:any tag. This complexType
	 * allows for restriction or extension permitting child elements. Gets the value of the content property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the content property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getContent().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * @return the content
	 */
	public List<String> getContent() {
		if (content == null) {
			content = new ArrayList<String>();
		}
		return content;
	}

	/**
	 * Gets the value of the lang property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLang(String value) {
		lang = value;
	}

}
