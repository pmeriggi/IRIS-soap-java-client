//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.06.09 at 11:45:08 AM CEST
//

package it.cineca.util.didl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

// TODO: Auto-generated Javadoc
/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the it.cineca.util.didl
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java
 * representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions,
 * element declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

	/** The Constant _Item_QNAME. */
	private static final QName _Item_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Item");

	/** The Constant _Descriptor_QNAME. */
	private static final QName _Descriptor_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Descriptor");

	/** The Constant _Choice_QNAME. */
	private static final QName _Choice_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Choice");

	/** The Constant _DIDL_QNAME. */
	private static final QName _DIDL_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "DIDL");

	/** The Constant _DIDLInfo_QNAME. */
	private static final QName _DIDLInfo_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "DIDLInfo");

	/** The Constant _Container_QNAME. */
	private static final QName _Container_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Container");

	/** The Constant _Component_QNAME. */
	private static final QName _Component_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Component");

	/** The Constant _Statement_QNAME. */
	private static final QName _Statement_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Statement");

	/** The Constant _Condition_QNAME. */
	private static final QName _Condition_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Condition");

	/** The Constant _Annotation_QNAME. */
	private static final QName _Annotation_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Annotation");

	/** The Constant _Anchor_QNAME. */
	private static final QName _Anchor_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Anchor");

	/** The Constant _Assertion_QNAME. */
	private static final QName _Assertion_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Assertion");

	/** The Constant _Selection_QNAME. */
	private static final QName _Selection_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Selection");

	/** The Constant _Fragment_QNAME. */
	private static final QName _Fragment_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Fragment");

	/** The Constant _Resource_QNAME. */
	private static final QName _Resource_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Resource");

	/** The Constant _Declarations_QNAME. */
	private static final QName _Declarations_QNAME = new QName("urn:mpeg:mpeg21:2002:02-DIDL-NS", "Declarations");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.cineca.util.didl
	 */
	public ObjectFactory() {}

	/**
	 * Create an instance of {@link ConditionType }.
	 * 
	 * @return the condition type
	 */
	public ConditionType createConditionType() {
		return new ConditionType();
	}

	/**
	 * Create an instance of {@link FragmentType }.
	 * 
	 * @return the fragment type
	 */
	public FragmentType createFragmentType() {
		return new FragmentType();
	}

	/**
	 * Create an instance of {@link AssertionType }.
	 * 
	 * @return the assertion type
	 */
	public AssertionType createAssertionType() {
		return new AssertionType();
	}

	/**
	 * Create an instance of {@link DeclarationsType }.
	 * 
	 * @return the declarations type
	 */
	public DeclarationsType createDeclarationsType() {
		return new DeclarationsType();
	}

	/**
	 * Create an instance of {@link SelectionType }.
	 * 
	 * @return the selection type
	 */
	public SelectionType createSelectionType() {
		return new SelectionType();
	}

	/**
	 * Create an instance of {@link StatementType }.
	 * 
	 * @return the statement type
	 */
	public StatementType createStatementType() {
		return new StatementType();
	}

	/**
	 * Create an instance of {@link ChoiceType }.
	 * 
	 * @return the choice type
	 */
	public ChoiceType createChoiceType() {
		return new ChoiceType();
	}

	/**
	 * Create an instance of {@link ResourceType }.
	 * 
	 * @return the resource type
	 */
	public ResourceType createResourceType() {
		return new ResourceType();
	}

	/**
	 * Create an instance of {@link DIDLType }.
	 * 
	 * @return the DIDL type
	 */
	public DIDLType createDIDLType() {
		return new DIDLType();
	}

	/**
	 * Create an instance of {@link ContainerType }.
	 * 
	 * @return the container type
	 */
	public ContainerType createContainerType() {
		return new ContainerType();
	}

	/**
	 * Create an instance of {@link AnnotationType }.
	 * 
	 * @return the annotation type
	 */
	public AnnotationType createAnnotationType() {
		return new AnnotationType();
	}

	/**
	 * Create an instance of {@link ItemType }.
	 * 
	 * @return the item type
	 */
	public ItemType createItemType() {
		return new ItemType();
	}

	/**
	 * Create an instance of {@link DescriptorType }.
	 * 
	 * @return the descriptor type
	 */
	public DescriptorType createDescriptorType() {
		return new DescriptorType();
	}

	/**
	 * Create an instance of {@link DIDLInfoType }.
	 * 
	 * @return the DIDL info type
	 */
	public DIDLInfoType createDIDLInfoType() {
		return new DIDLInfoType();
	}

	/**
	 * Create an instance of {@link ComponentType }.
	 * 
	 * @return the component type
	 */
	public ComponentType createComponentType() {
		return new ComponentType();
	}

	/**
	 * Create an instance of {@link AnchorType }.
	 * 
	 * @return the anchor type
	 */
	public AnchorType createAnchorType() {
		return new AnchorType();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< item type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Item", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Item")
	public JAXBElement<ItemType> createItem(ItemType value) {
		return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DescriptorType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< descriptor type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Descriptor", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Descriptor")
	public JAXBElement<DescriptorType> createDescriptor(DescriptorType value) {
		return new JAXBElement<DescriptorType>(_Descriptor_QNAME, DescriptorType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ChoiceType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< choice type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Choice", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Choice")
	public JAXBElement<ChoiceType> createChoice(ChoiceType value) {
		return new JAXBElement<ChoiceType>(_Choice_QNAME, ChoiceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DIDLType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< didl type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "DIDL")
	public JAXBElement<DIDLType> createDIDL(DIDLType value) {
		return new JAXBElement<DIDLType>(_DIDL_QNAME, DIDLType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DIDLInfoType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< didl info type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "DIDLInfo")
	public JAXBElement<DIDLInfoType> createDIDLInfo(DIDLInfoType value) {
		return new JAXBElement<DIDLInfoType>(_DIDLInfo_QNAME, DIDLInfoType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ContainerType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< container type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Container", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Container")
	public JAXBElement<ContainerType> createContainer(ContainerType value) {
		return new JAXBElement<ContainerType>(_Container_QNAME, ContainerType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ComponentType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< component type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Component", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Component")
	public JAXBElement<ComponentType> createComponent(ComponentType value) {
		return new JAXBElement<ComponentType>(_Component_QNAME, ComponentType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link StatementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< statement type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Statement", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Statement")
	public JAXBElement<StatementType> createStatement(StatementType value) {
		return new JAXBElement<StatementType>(_Statement_QNAME, StatementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConditionType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< condition type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Condition", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Condition")
	public JAXBElement<ConditionType> createCondition(ConditionType value) {
		return new JAXBElement<ConditionType>(_Condition_QNAME, ConditionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AnnotationType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< annotation type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Annotation", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Annotation")
	public JAXBElement<AnnotationType> createAnnotation(AnnotationType value) {
		return new JAXBElement<AnnotationType>(_Annotation_QNAME, AnnotationType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AnchorType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< anchor type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Anchor", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Anchor")
	public JAXBElement<AnchorType> createAnchor(AnchorType value) {
		return new JAXBElement<AnchorType>(_Anchor_QNAME, AnchorType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AssertionType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< assertion type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Assertion", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Assertion")
	public JAXBElement<AssertionType> createAssertion(AssertionType value) {
		return new JAXBElement<AssertionType>(_Assertion_QNAME, AssertionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SelectionType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< selection type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Selection", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Selection")
	public JAXBElement<SelectionType> createSelection(SelectionType value) {
		return new JAXBElement<SelectionType>(_Selection_QNAME, SelectionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FragmentType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< fragment type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Fragment", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Fragment")
	public JAXBElement<FragmentType> createFragment(FragmentType value) {
		return new JAXBElement<FragmentType>(_Fragment_QNAME, FragmentType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< resource type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Resource", substitutionHeadNamespace = "urn:mpeg:mpeg21:2002:02-DIDMODEL-NS", substitutionHeadName = "Resource")
	public JAXBElement<ResourceType> createResource(ResourceType value) {
		return new JAXBElement<ResourceType>(_Resource_QNAME, ResourceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeclarationsType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< declarations type>
	 */
	@XmlElementDecl(namespace = "urn:mpeg:mpeg21:2002:02-DIDL-NS", name = "Declarations")
	public JAXBElement<DeclarationsType> createDeclarations(DeclarationsType value) {
		return new JAXBElement<DeclarationsType>(_Declarations_QNAME, DeclarationsType.class, null, value);
	}

}
