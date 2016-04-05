//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.06.09 at 11:45:08 AM CEST
//

package it.cineca.util.didl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for AnnotationType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}AnnotationType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Assertion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Descriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Anchor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:mpeg:mpeg21:2002:02-DIDL-NS}ID_ATTRS"/>
 *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationType", propOrder = { "assertion", "descriptor", "anchor" })
public class AnnotationType extends it.cineca.util.didmodel.AnnotationType {

	/** The assertion. */
	@XmlElementRef(name = "Assertion", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected List<JAXBElement<? extends it.cineca.util.didmodel.AssertionType>> assertion;

	/** The descriptor. */
	@XmlElementRef(name = "Descriptor", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected List<JAXBElement<? extends it.cineca.util.didmodel.DescriptorType>> descriptor;

	/** The anchor. */
	@XmlElementRef(name = "Anchor", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected List<JAXBElement<? extends it.cineca.util.didmodel.AnchorType>> anchor;

	/** The target. */
	@XmlAttribute(required = true)
	@XmlSchemaType(name = "anyURI")
	protected String target;

	/** The id. */
	@XmlAttribute
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;

	/** The other attributes. */
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the assertion property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the assertion property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAssertion().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link it.cineca.util.didl.AssertionType }
	 * 
	 * @return the assertion {@code >} {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.AssertionType }{@code >}
	 */
	public List<JAXBElement<? extends it.cineca.util.didmodel.AssertionType>> getAssertion() {
		if (assertion == null) {
			assertion = new ArrayList<JAXBElement<? extends it.cineca.util.didmodel.AssertionType>>();
		}
		return assertion;
	}

	/**
	 * Gets the value of the descriptor property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the descriptor property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDescriptor().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link it.cineca.util.didl.DescriptorType }
	 * 
	 * @return the descriptor {@code >} {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.DescriptorType }{@code >}
	 */
	public List<JAXBElement<? extends it.cineca.util.didmodel.DescriptorType>> getDescriptor() {
		if (descriptor == null) {
			descriptor = new ArrayList<JAXBElement<? extends it.cineca.util.didmodel.DescriptorType>>();
		}
		return descriptor;
	}

	/**
	 * Gets the value of the anchor property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the anchor property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAnchor().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.AnchorType }
	 * 
	 * @return the anchor {@code >} {@link JAXBElement }{@code <}{@link it.cineca.util.didl.AnchorType }{@code >}
	 */
	public List<JAXBElement<? extends it.cineca.util.didmodel.AnchorType>> getAnchor() {
		if (anchor == null) {
			anchor = new ArrayList<JAXBElement<? extends it.cineca.util.didmodel.AnchorType>>();
		}
		return anchor;
	}

	/**
	 * Gets the value of the target property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Sets the value of the target property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTarget(String value) {
		target = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setId(String value) {
		id = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute. the map returned by this method is
	 * live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
