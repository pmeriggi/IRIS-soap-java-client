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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for DIDLType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIDLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDL-NS}DIDLInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDL-NS}Declarations" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Container"/>
 *           &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Item"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="DIDLDocumentId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIDLType", propOrder = { "didlInfo", "declarations", "container", "item" })
public class DIDLType {

	/** The didl info. */
	@XmlElement(name = "DIDLInfo")
	protected List<DIDLInfoType> didlInfo;

	/** The declarations. */
	@XmlElement(name = "Declarations")
	protected DeclarationsType declarations;

	/** The container. */
	@XmlElementRef(name = "Container", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected JAXBElement<? extends it.cineca.util.didmodel.ContainerType> container;

	/** The item. */
	@XmlElementRef(name = "Item", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected JAXBElement<? extends it.cineca.util.didmodel.ItemType> item;

	/** The didl document id. */
	@XmlAttribute(name = "DIDLDocumentId")
	@XmlSchemaType(name = "anyURI")
	protected String didlDocumentId;

	/** The other attributes. */
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the didlInfo property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the didlInfo property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDIDLInfo().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link DIDLInfoType }
	 * 
	 * @return the dIDL info
	 */
	public List<DIDLInfoType> getDIDLInfo() {
		if (didlInfo == null) {
			didlInfo = new ArrayList<DIDLInfoType>();
		}
		return didlInfo;
	}

	/**
	 * Gets the value of the declarations property.
	 * 
	 * @return possible object is {@link DeclarationsType }
	 */
	public DeclarationsType getDeclarations() {
		return declarations;
	}

	/**
	 * Sets the value of the declarations property.
	 * 
	 * @param value allowed object is {@link DeclarationsType }
	 */
	public void setDeclarations(DeclarationsType value) {
		declarations = value;
	}

	/**
	 * Gets the value of the container property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.ContainerType }{@code >} {@link JAXBElement }
	 * {@code <}{@link it.cineca.util.didl.ContainerType }{@code >}
	 */
	public JAXBElement<? extends it.cineca.util.didmodel.ContainerType> getContainer() {
		return container;
	}

	/**
	 * Sets the value of the container property.
	 * 
	 * @param value allowed object is {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.ContainerType }{@code >} {@link JAXBElement }
	 * {@code <}{@link it.cineca.util.didl.ContainerType }{@code >}
	 */
	public void setContainer(JAXBElement<? extends it.cineca.util.didmodel.ContainerType> value) {
		container = value;
	}

	/**
	 * Gets the value of the item property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.ItemType }{@code >} {@link JAXBElement }{@code <}
	 * {@link it.cineca.util.didl.ItemType }{@code >}
	 */
	public JAXBElement<? extends it.cineca.util.didmodel.ItemType> getItem() {
		return item;
	}

	/**
	 * Sets the value of the item property.
	 * 
	 * @param value allowed object is {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.ItemType }{@code >} {@link JAXBElement }
	 * {@code <}{@link it.cineca.util.didl.ItemType }{@code >}
	 */
	public void setItem(JAXBElement<? extends it.cineca.util.didmodel.ItemType> value) {
		item = value;
	}

	/**
	 * Gets the value of the didlDocumentId property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDIDLDocumentId() {
		return didlDocumentId;
	}

	/**
	 * Sets the value of the didlDocumentId property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDIDLDocumentId(String value) {
		didlDocumentId = value;
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