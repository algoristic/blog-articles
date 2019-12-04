
package de.algoristic.tutorials.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für employee complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{https://algoristic.de/employee}name"/>
 *         &lt;element name="birthday" type="{https://algoristic.de/employee}birthday"/>
 *         &lt;element name="contact" type="{https://algoristic.de/employee}contact" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="personnelNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="gender">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="m"/>
 *             &lt;enumeration value="f"/>
 *             &lt;enumeration value="d"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", namespace = "https://algoristic.de/employee", propOrder = {
    "name",
    "birthday",
    "contact"
})
public class Employee {

    @XmlElement(namespace = "https://algoristic.de/employee", required = true)
    protected Name name;
    @XmlElement(namespace = "https://algoristic.de/employee", required = true)
    protected Birthday birthday;
    @XmlElement(namespace = "https://algoristic.de/employee")
    protected Contact contact;
    @XmlAttribute(name = "personnelNumber")
    protected Integer personnelNumber;
    @XmlAttribute(name = "gender")
    protected String gender;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der birthday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Birthday }
     *     
     */
    public Birthday getBirthday() {
        return birthday;
    }

    /**
     * Legt den Wert der birthday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Birthday }
     *     
     */
    public void setBirthday(Birthday value) {
        this.birthday = value;
    }

    /**
     * Ruft den Wert der contact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Legt den Wert der contact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Ruft den Wert der personnelNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonnelNumber() {
        return personnelNumber;
    }

    /**
     * Legt den Wert der personnelNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonnelNumber(Integer value) {
        this.personnelNumber = value;
    }

    /**
     * Ruft den Wert der gender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Legt den Wert der gender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

}
