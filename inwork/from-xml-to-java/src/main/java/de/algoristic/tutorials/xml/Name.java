
package de.algoristic.tutorials.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für name complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="name">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titles" type="{https://algoristic.de/employee}titles" minOccurs="0"/>
 *         &lt;element name="forename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "name", namespace = "https://algoristic.de/employee", propOrder = {
    "titles",
    "forename",
    "surname"
})
public class Name {

    @XmlElement(namespace = "https://algoristic.de/employee")
    protected Titles titles;
    @XmlElement(namespace = "https://algoristic.de/employee", required = true)
    protected String forename;
    @XmlElement(namespace = "https://algoristic.de/employee", required = true)
    protected String surname;

    /**
     * Ruft den Wert der titles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Titles }
     *     
     */
    public Titles getTitles() {
        return titles;
    }

    /**
     * Legt den Wert der titles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Titles }
     *     
     */
    public void setTitles(Titles value) {
        this.titles = value;
    }

    /**
     * Ruft den Wert der forename-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Legt den Wert der forename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * Ruft den Wert der surname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Legt den Wert der surname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

}
