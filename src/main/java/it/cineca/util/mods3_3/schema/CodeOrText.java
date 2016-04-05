//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2009.10.27 at 12:34:36 PM CET
//

package it.cineca.util.mods3_3.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for codeOrText.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="codeOrText">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="code"/>
 *     &lt;enumeration value="text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "codeOrText")
@XmlEnum
public enum CodeOrText {

	/** The code. */
	@XmlEnumValue("code")
	CODE("code"),
	/** The text. */
	@XmlEnumValue("text")
	TEXT("text");

	/** The value. */
	private final String value;

	/**
	 * Instantiates a new code or text.
	 * 
	 * @param v the v
	 */
	CodeOrText(String v) {
		value = v;
	}

	/**
	 * Value.
	 * 
	 * @return the string
	 */
	public String value() {
		return value;
	}

	/**
	 * From value.
	 * 
	 * @param v the v
	 * @return the code or text
	 */
	public static CodeOrText fromValue(String v) {
		for (CodeOrText c : CodeOrText.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}