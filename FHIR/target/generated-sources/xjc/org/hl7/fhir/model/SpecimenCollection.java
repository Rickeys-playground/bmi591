//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 08:26:41 PM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Sample for analysis.
 * 
 * <p>Java class for Specimen.Collection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specimen.Collection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collector" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="collectedDateTime" type="{http://hl7.org/fhir}dateTime"/&gt;
 *           &lt;element name="collectedPeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="sourceSite" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen.Collection", propOrder = {
    "collector",
    "comments",
    "collectedPeriod",
    "collectedDateTime",
    "quantity",
    "method",
    "sourceSite"
})
public class SpecimenCollection
    extends BackboneElement
    implements ToString
{

    protected ResourceReference collector;
    @XmlElement(name = "comment")
    protected List<org.hl7.fhir.model.String> comments;
    protected Period collectedPeriod;
    protected DateTime collectedDateTime;
    protected Quantity quantity;
    protected CodeableConcept method;
    protected CodeableConcept sourceSite;

    /**
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setCollector(ResourceReference value) {
        this.collector = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.hl7.fhir.model.String }
     * 
     * 
     */
    public List<org.hl7.fhir.model.String> getComments() {
        if (comments == null) {
            comments = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the collectedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getCollectedPeriod() {
        return collectedPeriod;
    }

    /**
     * Sets the value of the collectedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setCollectedPeriod(Period value) {
        this.collectedPeriod = value;
    }

    /**
     * Gets the value of the collectedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCollectedDateTime() {
        return collectedDateTime;
    }

    /**
     * Sets the value of the collectedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCollectedDateTime(DateTime value) {
        this.collectedDateTime = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the sourceSite property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSourceSite() {
        return sourceSite;
    }

    /**
     * Sets the value of the sourceSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSourceSite(CodeableConcept value) {
        this.sourceSite = value;
    }

    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            ResourceReference theCollector;
            theCollector = this.getCollector();
            strategy.appendField(locator, this, "collector", buffer, theCollector);
        }
        {
            List<org.hl7.fhir.model.String> theComments;
            theComments = (((this.comments!= null)&&(!this.comments.isEmpty()))?this.getComments():null);
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            Period theCollectedPeriod;
            theCollectedPeriod = this.getCollectedPeriod();
            strategy.appendField(locator, this, "collectedPeriod", buffer, theCollectedPeriod);
        }
        {
            DateTime theCollectedDateTime;
            theCollectedDateTime = this.getCollectedDateTime();
            strategy.appendField(locator, this, "collectedDateTime", buffer, theCollectedDateTime);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        {
            CodeableConcept theMethod;
            theMethod = this.getMethod();
            strategy.appendField(locator, this, "method", buffer, theMethod);
        }
        {
            CodeableConcept theSourceSite;
            theSourceSite = this.getSourceSite();
            strategy.appendField(locator, this, "sourceSite", buffer, theSourceSite);
        }
        return buffer;
    }

}