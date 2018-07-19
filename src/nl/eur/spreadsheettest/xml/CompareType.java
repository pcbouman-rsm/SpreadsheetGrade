//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.20 at 02:41:11 PM CET 
//


package nl.eur.spreadsheettest.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="range" type="{assignment.xsd}rangeType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sheetName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eps" type="{http://www.w3.org/2001/XMLSchema}double" default="10e-8" />
 *       &lt;attribute name="textStrict" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compareType", propOrder = {
    "description",
    "range"
})
public class CompareType {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String range;
    @XmlAttribute(name = "sheetName")
    protected String sheetName;
    @XmlAttribute(name = "eps")
    protected Double eps;
    @XmlAttribute(name = "textStrict")
    protected Boolean textStrict;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange(String value) {
        this.range = value;
    }

    /**
     * Gets the value of the sheetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetName() {
        return sheetName;
    }

    /**
     * Sets the value of the sheetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetName(String value) {
        this.sheetName = value;
    }

    /**
     * Gets the value of the eps property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getEps() {
        if (eps == null) {
            return  1.0E-7D;
        } else {
            return eps;
        }
    }

    /**
     * Sets the value of the eps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEps(Double value) {
        this.eps = value;
    }

    /**
     * Gets the value of the textStrict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTextStrict() {
        if (textStrict == null) {
            return false;
        } else {
            return textStrict;
        }
    }

    /**
     * Sets the value of the textStrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextStrict(Boolean value) {
        this.textStrict = value;
    }

}