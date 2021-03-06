//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2009.10.27 at 12:34:36 PM CET
//

package it.cineca.util.mods3_3.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for relatedItemType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.loc.gov/mods/v3}modsGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="preceding"/>
 *             &lt;enumeration value="succeeding"/>
 *             &lt;enumeration value="original"/>
 *             &lt;enumeration value="host"/>
 *             &lt;enumeration value="constituent"/>
 *             &lt;enumeration value="series"/>
 *             &lt;enumeration value="otherVersion"/>
 *             &lt;enumeration value="otherFormat"/>
 *             &lt;enumeration value="isReferencedBy"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedItemType", propOrder = { "modsGroup" })
public class RelatedItemType {

	/** The mods group. */
	@XmlElements({ @XmlElement(name = "extension", type = ExtensionType.class), @XmlElement(name = "part", type = PartType.class),
			@XmlElement(name = "abstract", type = AbstractType.class), @XmlElement(name = "language", type = LanguageType.class),
			@XmlElement(name = "typeOfResource", type = TypeOfResourceType.class),
			@XmlElement(name = "targetAudience", type = TargetAudienceType.class),
			@XmlElement(name = "classification", type = ClassificationType.class),
			@XmlElement(name = "recordInfo", type = RecordInfoType.class), @XmlElement(name = "titleInfo", type = TitleInfoType.class),
			@XmlElement(name = "physicalDescription", type = PhysicalDescriptionType.class),
			@XmlElement(name = "identifier", type = IdentifierType.class), @XmlElement(name = "subject", type = SubjectType.class),
			@XmlElement(name = "note", type = NoteType.class), @XmlElement(name = "relatedItem", type = RelatedItemType.class),
			@XmlElement(name = "accessCondition", type = AccessConditionType.class),
			@XmlElement(name = "originInfo", type = OriginInfoType.class), @XmlElement(name = "location", type = LocationType.class),
			@XmlElement(name = "name", type = NameType.class), @XmlElement(name = "tableOfContents", type = TableOfContentsType.class),
			@XmlElement(name = "genre", type = GenreType.class) })
	protected List<Object> modsGroup;

	/** The related type. */
	@XmlAttribute(name = "type")
	protected String relatedType;

	/** The display label. */
	@XmlAttribute
	protected String displayLabel;

	/** The id. */
	@XmlAttribute(name = "ID")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;

	/** The type. */
	@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
	protected String type;

	/** The href. */
	@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
	@XmlSchemaType(name = "anyURI")
	protected String href;

	/** The role. */
	@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
	protected String role;

	/** The arcrole. */
	@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
	protected String arcrole;

	/** The title. */
	@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
	protected String title;

	/** The show. */
	@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
	protected String show;

	/** The actuate. */
	@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
	protected String actuate;

	/**
	 * Gets the value of the modsGroup property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the modsGroup property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getModsGroup().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ExtensionType } {@link PartType } {@link AbstractType }
	 * 
	 * @return the mods group {@link LanguageType } {@link TypeOfResourceType } {@link TargetAudienceType } {@link ClassificationType }
	 * {@link RecordInfoType } {@link TitleInfoType } {@link PhysicalDescriptionType } {@link IdentifierType } {@link SubjectType }
	 * {@link NoteType } {@link RelatedItemType } {@link AccessConditionType } {@link OriginInfoType } {@link LocationType } {@link NameType }
	 * {@link TableOfContentsType } {@link GenreType }
	 */
	public List<Object> getModsGroup() {
		if (modsGroup == null) {
			modsGroup = new ArrayList<Object>();
		}
		return modsGroup;
	}

	/**
	 * Gets the value of the relatedType property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRelatedType() {
		return relatedType;
	}

	/**
	 * Sets the value of the relatedType property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRelatedType(String value) {
		relatedType = value;
	}

	/**
	 * Gets the value of the displayLabel property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * Sets the value of the displayLabel property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDisplayLabel(String value) {
		displayLabel = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setID(String value) {
		id = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getType() {
		if (type == null) {
			return "simple";
		}
		else {
			return type;
		}
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
	 * Gets the value of the href property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getHref() {
		return href;
	}

	/**
	 * Sets the value of the href property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setHref(String value) {
		href = value;
	}

	/**
	 * Gets the value of the role property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the value of the role property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRole(String value) {
		role = value;
	}

	/**
	 * Gets the value of the arcrole property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getArcrole() {
		return arcrole;
	}

	/**
	 * Sets the value of the arcrole property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setArcrole(String value) {
		arcrole = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTitle(String value) {
		title = value;
	}

	/**
	 * Gets the value of the show property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getShow() {
		return show;
	}

	/**
	 * Sets the value of the show property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setShow(String value) {
		show = value;
	}

	/**
	 * Gets the value of the actuate property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getActuate() {
		return actuate;
	}

	/**
	 * Sets the value of the actuate property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setActuate(String value) {
		actuate = value;
	}

}
