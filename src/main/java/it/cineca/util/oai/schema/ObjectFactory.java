//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.05.09 at 04:56:30 PM CEST
//

package it.cineca.util.oai.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

// TODO: Auto-generated Javadoc
/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * it.cineca.util.oai.schema package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java
 * representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions,
 * element declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

	/** The Constant _OAIPMH_QNAME. */
	private static final QName _OAIPMH_QNAME = new QName("http://www.openarchives.org/OAI/2.0/", "OAI-PMH");

	/** The Constant _Relation_QNAME. */
	private static final QName _Relation_QNAME = new QName("http://purl.org/dc/elements/1.1/", "relation");

	/** The Constant _Dc_QNAME. */
	private static final QName _Dc_QNAME = new QName("http://www.openarchives.org/OAI/2.0/oai_dc/", "dc");

	/** The Constant _Contributor_QNAME. */
	private static final QName _Contributor_QNAME = new QName("http://purl.org/dc/elements/1.1/", "contributor");

	/** The Constant _Title_QNAME. */
	private static final QName _Title_QNAME = new QName("http://purl.org/dc/elements/1.1/", "title");

	/** The Constant _Publisher_QNAME. */
	private static final QName _Publisher_QNAME = new QName("http://purl.org/dc/elements/1.1/", "publisher");

	/** The Constant _Type_QNAME. */
	private static final QName _Type_QNAME = new QName("http://purl.org/dc/elements/1.1/", "type");

	/** The Constant _Language_QNAME. */
	private static final QName _Language_QNAME = new QName("http://purl.org/dc/elements/1.1/", "language");

	/** The Constant _Creator_QNAME. */
	private static final QName _Creator_QNAME = new QName("http://purl.org/dc/elements/1.1/", "creator");

	/** The Constant _Rights_QNAME. */
	private static final QName _Rights_QNAME = new QName("http://purl.org/dc/elements/1.1/", "rights");

	/** The Constant _Identifier_QNAME. */
	private static final QName _Identifier_QNAME = new QName("http://purl.org/dc/elements/1.1/", "identifier");

	/** The Constant _Description_QNAME. */
	private static final QName _Description_QNAME = new QName("http://purl.org/dc/elements/1.1/", "description");

	/** The Constant _Format_QNAME. */
	private static final QName _Format_QNAME = new QName("http://purl.org/dc/elements/1.1/", "format");

	/** The Constant _Subject_QNAME. */
	private static final QName _Subject_QNAME = new QName("http://purl.org/dc/elements/1.1/", "subject");

	/** The Constant _Source_QNAME. */
	private static final QName _Source_QNAME = new QName("http://purl.org/dc/elements/1.1/", "source");

	/** The Constant _Date_QNAME. */
	private static final QName _Date_QNAME = new QName("http://purl.org/dc/elements/1.1/", "date");

	/** The Constant _Coverage_QNAME. */
	private static final QName _Coverage_QNAME = new QName("http://purl.org/dc/elements/1.1/", "coverage");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.cineca.util.oai.schema
	 */
	public ObjectFactory() {}

	/**
	 * Create an instance of {@link DescriptionType }.
	 * 
	 * @return the description type
	 */
	public DescriptionType createDescriptionType() {
		return new DescriptionType();
	}

	/**
	 * Create an instance of {@link ListSetsType }.
	 * 
	 * @return the list sets type
	 */
	public ListSetsType createListSetsType() {
		return new ListSetsType();
	}

	/**
	 * Create an instance of {@link GetRecordType }.
	 * 
	 * @return the gets the record type
	 */
	public GetRecordType createGetRecordType() {
		return new GetRecordType();
	}

	/**
	 * Create an instance of {@link HeaderType }.
	 * 
	 * @return the header type
	 */
	public HeaderType createHeaderType() {
		return new HeaderType();
	}

	/**
	 * Create an instance of {@link AboutType }.
	 * 
	 * @return the about type
	 */
	public AboutType createAboutType() {
		return new AboutType();
	}

	/**
	 * Create an instance of {@link MetadataFormatType }.
	 * 
	 * @return the metadata format type
	 */
	public MetadataFormatType createMetadataFormatType() {
		return new MetadataFormatType();
	}

	/**
	 * Create an instance of {@link ListMetadataFormatsType }.
	 * 
	 * @return the list metadata formats type
	 */
	public ListMetadataFormatsType createListMetadataFormatsType() {
		return new ListMetadataFormatsType();
	}

	/**
	 * Create an instance of {@link IdentifyType }.
	 * 
	 * @return the identify type
	 */
	public IdentifyType createIdentifyType() {
		return new IdentifyType();
	}

	/**
	 * Create an instance of {@link RecordType }.
	 * 
	 * @return the record type
	 */
	public RecordType createRecordType() {
		return new RecordType();
	}

	/**
	 * Create an instance of {@link MetadataType }.
	 * 
	 * @return the metadata type
	 */
	public MetadataType createMetadataType() {
		return new MetadataType();
	}

	/**
	 * Create an instance of {@link OAIPMHtype }.
	 * 
	 * @return the OAIPM htype
	 */
	public OAIPMHtype createOAIPMHtype() {
		return new OAIPMHtype();
	}

	/**
	 * Create an instance of {@link RequestType }.
	 * 
	 * @return the request type
	 */
	public RequestType createRequestType() {
		return new RequestType();
	}

	/**
	 * Create an instance of {@link OAIPMHerrorType }.
	 * 
	 * @return the OAIPM herror type
	 */
	public OAIPMHerrorType createOAIPMHerrorType() {
		return new OAIPMHerrorType();
	}

	/**
	 * Create an instance of {@link ResumptionTokenType }.
	 * 
	 * @return the resumption token type
	 */
	public ResumptionTokenType createResumptionTokenType() {
		return new ResumptionTokenType();
	}

	/**
	 * Create an instance of {@link ListRecordsType }.
	 * 
	 * @return the list records type
	 */
	public ListRecordsType createListRecordsType() {
		return new ListRecordsType();
	}

	/**
	 * Create an instance of {@link ListIdentifiersType }.
	 * 
	 * @return the list identifiers type
	 */
	public ListIdentifiersType createListIdentifiersType() {
		return new ListIdentifiersType();
	}

	/**
	 * Create an instance of {@link SetType }.
	 * 
	 * @return the sets the type
	 */
	public SetType createSetType() {
		return new SetType();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OAIPMHtype }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< oaipm htype>
	 */
	@XmlElementDecl(namespace = "http://www.openarchives.org/OAI/2.0/", name = "OAI-PMH")
	public JAXBElement<OAIPMHtype> createOAIPMH(OAIPMHtype value) {
		return new JAXBElement<OAIPMHtype>(_OAIPMH_QNAME, OAIPMHtype.class, null, value);
	}

	/**
	 * Create an instance of {@link ElementType }.
	 * 
	 * @return the element type
	 */
	public ElementType createElementType() {
		return new ElementType();
	}

	/**
	 * Create an instance of {@link OaiDcType }.
	 * 
	 * @return the oai dc type
	 */
	public OaiDcType createOaiDcType() {
		return new OaiDcType();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "relation")
	public JAXBElement<ElementType> createRelation(ElementType value) {
		return new JAXBElement<ElementType>(_Relation_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OaiDcType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< oai dc type>
	 */
	@XmlElementDecl(namespace = "http://www.openarchives.org/OAI/2.0/oai_dc/", name = "dc")
	public JAXBElement<OaiDcType> createDc(OaiDcType value) {
		return new JAXBElement<OaiDcType>(_Dc_QNAME, OaiDcType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "contributor")
	public JAXBElement<ElementType> createContributor(ElementType value) {
		return new JAXBElement<ElementType>(_Contributor_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "title")
	public JAXBElement<ElementType> createTitle(ElementType value) {
		return new JAXBElement<ElementType>(_Title_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "publisher")
	public JAXBElement<ElementType> createPublisher(ElementType value) {
		return new JAXBElement<ElementType>(_Publisher_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "type")
	public JAXBElement<ElementType> createType(ElementType value) {
		return new JAXBElement<ElementType>(_Type_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "language")
	public JAXBElement<ElementType> createLanguage(ElementType value) {
		return new JAXBElement<ElementType>(_Language_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "creator")
	public JAXBElement<ElementType> createCreator(ElementType value) {
		return new JAXBElement<ElementType>(_Creator_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "rights")
	public JAXBElement<ElementType> createRights(ElementType value) {
		return new JAXBElement<ElementType>(_Rights_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "identifier")
	public JAXBElement<ElementType> createIdentifier(ElementType value) {
		return new JAXBElement<ElementType>(_Identifier_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "description")
	public JAXBElement<ElementType> createDescription(ElementType value) {
		return new JAXBElement<ElementType>(_Description_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "format")
	public JAXBElement<ElementType> createFormat(ElementType value) {
		return new JAXBElement<ElementType>(_Format_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "subject")
	public JAXBElement<ElementType> createSubject(ElementType value) {
		return new JAXBElement<ElementType>(_Subject_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "source")
	public JAXBElement<ElementType> createSource(ElementType value) {
		return new JAXBElement<ElementType>(_Source_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "date")
	public JAXBElement<ElementType> createDate(ElementType value) {
		return new JAXBElement<ElementType>(_Date_QNAME, ElementType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}.
	 * 
	 * @param value the value
	 * @return the JAXB element< element type>
	 */
	@XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "coverage")
	public JAXBElement<ElementType> createCoverage(ElementType value) {
		return new JAXBElement<ElementType>(_Coverage_QNAME, ElementType.class, null, value);
	}

}
