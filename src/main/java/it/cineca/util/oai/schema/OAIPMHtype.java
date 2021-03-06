//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.05.09 at 04:56:30 PM CEST
//

package it.cineca.util.oai.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for OAI-PMHtype complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OAI-PMHtype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="request" type="{http://www.openarchives.org/OAI/2.0/}requestType"/>
 *         &lt;choice>
 *           &lt;element name="error" type="{http://www.openarchives.org/OAI/2.0/}OAI-PMHerrorType" maxOccurs="unbounded"/>
 *           &lt;element name="Identify" type="{http://www.openarchives.org/OAI/2.0/}IdentifyType"/>
 *           &lt;element name="ListMetadataFormats" type="{http://www.openarchives.org/OAI/2.0/}ListMetadataFormatsType"/>
 *           &lt;element name="ListSets" type="{http://www.openarchives.org/OAI/2.0/}ListSetsType"/>
 *           &lt;element name="GetRecord" type="{http://www.openarchives.org/OAI/2.0/}GetRecordType"/>
 *           &lt;element name="ListIdentifiers" type="{http://www.openarchives.org/OAI/2.0/}ListIdentifiersType"/>
 *           &lt;element name="ListRecords" type="{http://www.openarchives.org/OAI/2.0/}ListRecordsType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAI-PMHtype", propOrder = { "responseDate", "request", "error", "identify", "listMetadataFormats", "listSets",
		"getRecord", "listIdentifiers", "listRecords" })
public class OAIPMHtype {

	/** The response date. */
	@XmlElement(required = true)
	protected XMLGregorianCalendar responseDate;

	/** The request. */
	@XmlElement(required = true)
	protected RequestType request;

	/** The error. */
	protected List<OAIPMHerrorType> error;

	/** The identify. */
	@XmlElement(name = "Identify")
	protected IdentifyType identify;

	/** The list metadata formats. */
	@XmlElement(name = "ListMetadataFormats")
	protected ListMetadataFormatsType listMetadataFormats;

	/** The list sets. */
	@XmlElement(name = "ListSets")
	protected ListSetsType listSets;

	/** The get record. */
	@XmlElement(name = "GetRecord")
	protected GetRecordType getRecord;

	/** The list identifiers. */
	@XmlElement(name = "ListIdentifiers")
	protected ListIdentifiersType listIdentifiers;

	/** The list records. */
	@XmlElement(name = "ListRecords")
	protected ListRecordsType listRecords;

	/**
	 * Gets the value of the responseDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getResponseDate() {
		return responseDate;
	}

	/**
	 * Sets the value of the responseDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setResponseDate(XMLGregorianCalendar value) {
		responseDate = value;
	}

	/**
	 * Gets the value of the request property.
	 * 
	 * @return possible object is {@link RequestType }
	 */
	public RequestType getRequest() {
		return request;
	}

	/**
	 * Sets the value of the request property.
	 * 
	 * @param value allowed object is {@link RequestType }
	 */
	public void setRequest(RequestType value) {
		request = value;
	}

	/**
	 * Gets the value of the error property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the error property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getError().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link OAIPMHerrorType }
	 * 
	 * @return the error
	 */
	public List<OAIPMHerrorType> getError() {
		if (error == null) {
			error = new ArrayList<OAIPMHerrorType>();
		}
		return error;
	}

	/**
	 * Gets the value of the identify property.
	 * 
	 * @return possible object is {@link IdentifyType }
	 */
	public IdentifyType getIdentify() {
		return identify;
	}

	/**
	 * Sets the value of the identify property.
	 * 
	 * @param value allowed object is {@link IdentifyType }
	 */
	public void setIdentify(IdentifyType value) {
		identify = value;
	}

	/**
	 * Gets the value of the listMetadataFormats property.
	 * 
	 * @return possible object is {@link ListMetadataFormatsType }
	 */
	public ListMetadataFormatsType getListMetadataFormats() {
		return listMetadataFormats;
	}

	/**
	 * Sets the value of the listMetadataFormats property.
	 * 
	 * @param value allowed object is {@link ListMetadataFormatsType }
	 */
	public void setListMetadataFormats(ListMetadataFormatsType value) {
		listMetadataFormats = value;
	}

	/**
	 * Gets the value of the listSets property.
	 * 
	 * @return possible object is {@link ListSetsType }
	 */
	public ListSetsType getListSets() {
		return listSets;
	}

	/**
	 * Sets the value of the listSets property.
	 * 
	 * @param value allowed object is {@link ListSetsType }
	 */
	public void setListSets(ListSetsType value) {
		listSets = value;
	}

	/**
	 * Gets the value of the getRecord property.
	 * 
	 * @return possible object is {@link GetRecordType }
	 */
	public GetRecordType getGetRecord() {
		return getRecord;
	}

	/**
	 * Sets the value of the getRecord property.
	 * 
	 * @param value allowed object is {@link GetRecordType }
	 */
	public void setGetRecord(GetRecordType value) {
		getRecord = value;
	}

	/**
	 * Gets the value of the listIdentifiers property.
	 * 
	 * @return possible object is {@link ListIdentifiersType }
	 */
	public ListIdentifiersType getListIdentifiers() {
		return listIdentifiers;
	}

	/**
	 * Sets the value of the listIdentifiers property.
	 * 
	 * @param value allowed object is {@link ListIdentifiersType }
	 */
	public void setListIdentifiers(ListIdentifiersType value) {
		listIdentifiers = value;
	}

	/**
	 * Gets the value of the listRecords property.
	 * 
	 * @return possible object is {@link ListRecordsType }
	 */
	public ListRecordsType getListRecords() {
		return listRecords;
	}

	/**
	 * Sets the value of the listRecords property.
	 * 
	 * @param value allowed object is {@link ListRecordsType }
	 */
	public void setListRecords(ListRecordsType value) {
		listRecords = value;
	}

}
