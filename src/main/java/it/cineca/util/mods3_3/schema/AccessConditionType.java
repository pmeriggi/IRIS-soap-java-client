//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2009.10.27 at 12:34:36 PM CET
//

package it.cineca.util.mods3_3.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * 506, 540
 * <p>
 * Java class for accessConditionType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accessConditionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.loc.gov/mods/v3}extensionType">
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}language"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessConditionType")
public class AccessConditionType extends ExtensionType {

	/** The display label. */
	@XmlAttribute
	protected String displayLabel;

	/** The access condition type. */
	@XmlAttribute(name = "type")
	protected String accessConditionType;

	/** The language. */
	@XmlAttribute(name = "lang")
	protected String language;

	/** The lang. */
	@XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
	protected String lang;

	/** The script. */
	@XmlAttribute
	protected String script;

	/** The transliteration. */
	@XmlAttribute
	protected String transliteration;

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
	 * Gets the value of the accessConditionType property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getAccessConditionType() {
		return accessConditionType;
	}

	/**
	 * Sets the value of the accessConditionType property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setAccessConditionType(String value) {
		accessConditionType = value;
	}

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLanguage(String value) {
		language = value;
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

	/**
	 * Gets the value of the script property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getScript() {
		return script;
	}

	/**
	 * Sets the value of the script property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setScript(String value) {
		script = value;
	}

	/**
	 * Gets the value of the transliteration property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTransliteration() {
		return transliteration;
	}

	/**
	 * Sets the value of the transliteration property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTransliteration(String value) {
		transliteration = value;
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