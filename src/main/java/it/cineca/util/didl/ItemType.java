//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.06.09 at 11:45:08 AM CEST
//

package it.cineca.util.didl;

import it.cineca.util.didmodel.DIDBaseType;

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
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for ItemType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}ItemType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Condition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Descriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Item"/>
 *           &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Component"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:mpeg:mpeg21:2002:02-DIDL-NS}ID_ATTRS"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = { "condition", "descriptor", "choice", "itemOrComponent", "annotation" })
public class ItemType extends it.cineca.util.didmodel.ItemType {

	/** The condition. */
	@XmlElementRef(name = "Condition", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected List<JAXBElement<? extends it.cineca.util.didmodel.ConditionType>> condition;

	/** The descriptor. */
	@XmlElementRef(name = "Descriptor", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected List<JAXBElement<? extends it.cineca.util.didmodel.DescriptorType>> descriptor;

	/** The choice. */
	@XmlElementRef(name = "Choice", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected List<JAXBElement<? extends it.cineca.util.didmodel.ChoiceType>> choice;

	/** The item or component. */
	@XmlElementRefs({ @XmlElementRef(name = "Item", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class),
			@XmlElementRef(name = "Component", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class) })
	protected List<JAXBElement<? extends DIDBaseType>> itemOrComponent;

	/** The annotation. */
	@XmlElementRef(name = "Annotation", namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", type = JAXBElement.class)
	protected List<JAXBElement<? extends it.cineca.util.didmodel.AnnotationType>> annotation;

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
	 * Gets the value of the condition property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the condition property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCondition().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link it.cineca.util.didl.ConditionType }
	 * 
	 * @return the condition {@code >} {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.ConditionType }{@code >}
	 */
	public List<JAXBElement<? extends it.cineca.util.didmodel.ConditionType>> getCondition() {
		if (condition == null) {
			condition = new ArrayList<JAXBElement<? extends it.cineca.util.didmodel.ConditionType>>();
		}
		return condition;
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
	 * Gets the value of the choice property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the choice property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChoice().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link it.cineca.util.didl.ChoiceType }{@code >}
	 * 
	 * @return the choice {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.ChoiceType }{@code >}
	 */
	public List<JAXBElement<? extends it.cineca.util.didmodel.ChoiceType>> getChoice() {
		if (choice == null) {
			choice = new ArrayList<JAXBElement<? extends it.cineca.util.didmodel.ChoiceType>>();
		}
		return choice;
	}

	/**
	 * Gets the value of the itemOrComponent property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the itemOrComponent property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getItemOrComponent().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link it.cineca.util.didl.ComponentType }
	 * 
	 * @return the item or component {@code >} {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.ComponentType }{@code >}
	 * {@link JAXBElement }{@code <} {@link ItemType }{@code >} {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.ItemType }{@code >}
	 */
	public List<JAXBElement<? extends DIDBaseType>> getItemOrComponent() {
		if (itemOrComponent == null) {
			itemOrComponent = new ArrayList<JAXBElement<? extends DIDBaseType>>();
		}
		return itemOrComponent;
	}

	/**
	 * Gets the value of the annotation property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the annotation property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAnnotation().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link it.cineca.util.didmodel.AnnotationType }
	 * 
	 * @return the annotation {@code >} {@link JAXBElement }{@code <}{@link it.cineca.util.didl.AnnotationType }{@code >}
	 */
	public List<JAXBElement<? extends it.cineca.util.didmodel.AnnotationType>> getAnnotation() {
		if (annotation == null) {
			annotation = new ArrayList<JAXBElement<? extends it.cineca.util.didmodel.AnnotationType>>();
		}
		return annotation;
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