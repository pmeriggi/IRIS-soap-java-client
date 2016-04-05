//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.06.09 at 11:45:08 AM CEST
//

package it.cineca.util.didl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for ConditionType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2002:02-DIDMODEL-NS}ConditionType">
 *       &lt;attribute name="require" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="except" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType")
public class ConditionType extends it.cineca.util.didmodel.ConditionType {

	/** The require. */
	@XmlAttribute
	@XmlIDREF
	@XmlSchemaType(name = "IDREFS")
	protected List<Object> require;

	/** The except. */
	@XmlAttribute
	@XmlIDREF
	@XmlSchemaType(name = "IDREFS")
	protected List<Object> except;

	/**
	 * Gets the value of the require property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the require property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRequire().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * 
	 * @return the require
	 */
	public List<Object> getRequire() {
		if (require == null) {
			require = new ArrayList<Object>();
		}
		return require;
	}

	/**
	 * Gets the value of the except property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the except property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExcept().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * 
	 * @return the except
	 */
	public List<Object> getExcept() {
		if (except == null) {
			except = new ArrayList<Object>();
		}
		return except;
	}

}
