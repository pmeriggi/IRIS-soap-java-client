//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.06.09 at 11:45:08 AM CEST
//

package it.cineca.util.didmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

// TODO: Auto-generated Javadoc
/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the it.cineca.util.didmodel
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java
 * representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions,
 * element declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

	/** The Constant _Resource_QNAME. */
	private static final QName _Resource_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Resource");

	/** The Constant _Anchor_QNAME. */
	private static final QName _Anchor_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Anchor");

	/** The Constant _Annotation_QNAME. */
	private static final QName _Annotation_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Annotation");

	/** The Constant _Assertion_QNAME. */
	private static final QName _Assertion_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Assertion");

	/** The Constant _Selection_QNAME. */
	private static final QName _Selection_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Selection");

	/** The Constant _Fragment_QNAME. */
	private static final QName _Fragment_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Fragment");

	/** The Constant _Statement_QNAME. */
	private static final QName _Statement_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Statement");

	/** The Constant _Condition_QNAME. */
	private static final QName _Condition_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Condition");

	/** The Constant _Item_QNAME. */
	private static final QName _Item_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Item");

	/** The Constant _Choice_QNAME. */
	private static final QName _Choice_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Choice");

	/** The Constant _Descriptor_QNAME. */
	private static final QName _Descriptor_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Descriptor");

	/** The Constant _Container_QNAME. */
	private static final QName _Container_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Container");

	/** The Constant _Component_QNAME. */
	private static final QName _Component_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", "Component");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.cineca.util.didmodel
	 */
	public ObjectFactory() {}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< resource type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Resource")
	public JAXBElement<ResourceType> createResource(ResourceType value) {
		return new JAXBElement<ResourceType>(_Resource_QNAME, ResourceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AnchorType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< anchor type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Anchor")
	public JAXBElement<AnchorType> createAnchor(AnchorType value) {
		return new JAXBElement<AnchorType>(_Anchor_QNAME, AnchorType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AnnotationType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< annotation type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Annotation")
	public JAXBElement<AnnotationType> createAnnotation(AnnotationType value) {
		return new JAXBElement<AnnotationType>(_Annotation_QNAME, AnnotationType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AssertionType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< assertion type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Assertion")
	public JAXBElement<AssertionType> createAssertion(AssertionType value) {
		return new JAXBElement<AssertionType>(_Assertion_QNAME, AssertionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SelectionType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< selection type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Selection")
	public JAXBElement<SelectionType> createSelection(SelectionType value) {
		return new JAXBElement<SelectionType>(_Selection_QNAME, SelectionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FragmentType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< fragment type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Fragment")
	public JAXBElement<FragmentType> createFragment(FragmentType value) {
		return new JAXBElement<FragmentType>(_Fragment_QNAME, FragmentType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link StatementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< statement type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Statement")
	public JAXBElement<StatementType> createStatement(StatementType value) {
		return new JAXBElement<StatementType>(_Statement_QNAME, StatementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConditionType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< condition type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Condition")
	public JAXBElement<ConditionType> createCondition(ConditionType value) {
		return new JAXBElement<ConditionType>(_Condition_QNAME, ConditionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< item type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Item")
	public JAXBElement<ItemType> createItem(ItemType value) {
		return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ChoiceType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< choice type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Choice")
	public JAXBElement<ChoiceType> createChoice(ChoiceType value) {
		return new JAXBElement<ChoiceType>(_Choice_QNAME, ChoiceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DescriptorType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< descriptor type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Descriptor")
	public JAXBElement<DescriptorType> createDescriptor(DescriptorType value) {
		return new JAXBElement<DescriptorType>(_Descriptor_QNAME, DescriptorType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ContainerType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< container type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Container")
	public JAXBElement<ContainerType> createContainer(ContainerType value) {
		return new JAXBElement<ContainerType>(_Container_QNAME, ContainerType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ComponentType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< component type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", name = "Component")
	public JAXBElement<ComponentType> createComponent(ComponentType value) {
		return new JAXBElement<ComponentType>(_Component_QNAME, ComponentType.class, null, value);
	}

}