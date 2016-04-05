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

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for IdentifyType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="repositoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="protocolVersion" type="{http://www.openarchives.org/OAI/2.0/}protocolVersionType"/>
 *         &lt;element name="adminEmail" type="{http://www.openarchives.org/OAI/2.0/}emailType" maxOccurs="unbounded"/>
 *         &lt;element name="earliestDatestamp" type="{http://www.openarchives.org/OAI/2.0/}UTCdatetimeType"/>
 *         &lt;element name="deletedRecord" type="{http://www.openarchives.org/OAI/2.0/}deletedRecordType"/>
 *         &lt;element name="granularity" type="{http://www.openarchives.org/OAI/2.0/}granularityType"/>
 *         &lt;element name="compression" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.openarchives.org/OAI/2.0/}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifyType", propOrder = { "repositoryName", "baseURL", "protocolVersion", "adminEmail", "earliestDatestamp",
		"deletedRecord", "granularity", "compression", "description" })
public class IdentifyType {

	/** The repository name. */
	@XmlElement(required = true)
	protected String repositoryName;

	/** The base url. */
	@XmlElement(required = true)
	protected String baseURL;

	/** The protocol version. */
	@XmlElement(required = true)
	protected String protocolVersion;

	/** The admin email. */
	@XmlElement(required = true)
	protected List<String> adminEmail;

	/** The earliest datestamp. */
	@XmlElement(required = true)
	protected String earliestDatestamp;

	/** The deleted record. */
	@XmlElement(required = true)
	protected DeletedRecordType deletedRecord;

	/** The granularity. */
	@XmlElement(required = true)
	protected GranularityType granularity;

	/** The compression. */
	protected List<String> compression;

	/** The description. */
	protected List<DescriptionType> description;

	/**
	 * Gets the value of the repositoryName property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRepositoryName() {
		return repositoryName;
	}

	/**
	 * Sets the value of the repositoryName property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRepositoryName(String value) {
		repositoryName = value;
	}

	/**
	 * Gets the value of the baseURL property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * Sets the value of the baseURL property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setBaseURL(String value) {
		baseURL = value;
	}

	/**
	 * Gets the value of the protocolVersion property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * Sets the value of the protocolVersion property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setProtocolVersion(String value) {
		protocolVersion = value;
	}

	/**
	 * Gets the value of the adminEmail property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the adminEmail property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAdminEmail().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * @return the admin email
	 */
	public List<String> getAdminEmail() {
		if (adminEmail == null) {
			adminEmail = new ArrayList<String>();
		}
		return adminEmail;
	}

	/**
	 * Gets the value of the earliestDatestamp property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getEarliestDatestamp() {
		return earliestDatestamp;
	}

	/**
	 * Sets the value of the earliestDatestamp property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setEarliestDatestamp(String value) {
		earliestDatestamp = value;
	}

	/**
	 * Gets the value of the deletedRecord property.
	 * 
	 * @return possible object is {@link DeletedRecordType }
	 */
	public DeletedRecordType getDeletedRecord() {
		return deletedRecord;
	}

	/**
	 * Sets the value of the deletedRecord property.
	 * 
	 * @param value allowed object is {@link DeletedRecordType }
	 */
	public void setDeletedRecord(DeletedRecordType value) {
		deletedRecord = value;
	}

	/**
	 * Gets the value of the granularity property.
	 * 
	 * @return possible object is {@link GranularityType }
	 */
	public GranularityType getGranularity() {
		return granularity;
	}

	/**
	 * Sets the value of the granularity property.
	 * 
	 * @param value allowed object is {@link GranularityType }
	 */
	public void setGranularity(GranularityType value) {
		granularity = value;
	}

	/**
	 * Gets the value of the compression property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the compression property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCompression().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * @return the compression
	 */
	public List<String> getCompression() {
		if (compression == null) {
			compression = new ArrayList<String>();
		}
		return compression;
	}

	/**
	 * Gets the value of the description property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the description property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDescription().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link DescriptionType }
	 * 
	 * @return the description
	 */
	public List<DescriptionType> getDescription() {
		if (description == null) {
			description = new ArrayList<DescriptionType>();
		}
		return description;
	}

}
