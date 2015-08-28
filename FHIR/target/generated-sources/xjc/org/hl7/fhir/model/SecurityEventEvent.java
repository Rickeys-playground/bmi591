//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:09:54 PM MST 
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
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>Java class for SecurityEvent.Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent.Event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="subtype" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="action" type="{http://hl7.org/fhir}SecurityEventAction" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{http://hl7.org/fhir}instant"/&gt;
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}SecurityEventOutcome" minOccurs="0"/&gt;
 *         &lt;element name="outcomeDesc" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent.Event", propOrder = {
    "type",
    "subtypes",
    "action",
    "dateTime",
    "outcome",
    "outcomeDesc"
})
public class SecurityEventEvent
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(name = "subtype")
    protected List<CodeableConcept> subtypes;
    protected SecurityEventAction action;
    @XmlElement(required = true)
    protected Instant dateTime;
    protected SecurityEventOutcome outcome;
    protected org.hl7.fhir.model.String outcomeDesc;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSubtypes() {
        if (subtypes == null) {
            subtypes = new ArrayList<CodeableConcept>();
        }
        return this.subtypes;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventAction }
     *     
     */
    public SecurityEventAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventAction }
     *     
     */
    public void setAction(SecurityEventAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setDateTime(Instant value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventOutcome }
     *     
     */
    public SecurityEventOutcome getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventOutcome }
     *     
     */
    public void setOutcome(SecurityEventOutcome value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the outcomeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getOutcomeDesc() {
        return outcomeDesc;
    }

    /**
     * Sets the value of the outcomeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setOutcomeDesc(org.hl7.fhir.model.String value) {
        this.outcomeDesc = value;
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
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            List<CodeableConcept> theSubtypes;
            theSubtypes = (((this.subtypes!= null)&&(!this.subtypes.isEmpty()))?this.getSubtypes():null);
            strategy.appendField(locator, this, "subtypes", buffer, theSubtypes);
        }
        {
            SecurityEventAction theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            Instant theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime);
        }
        {
            SecurityEventOutcome theOutcome;
            theOutcome = this.getOutcome();
            strategy.appendField(locator, this, "outcome", buffer, theOutcome);
        }
        {
            org.hl7.fhir.model.String theOutcomeDesc;
            theOutcomeDesc = this.getOutcomeDesc();
            strategy.appendField(locator, this, "outcomeDesc", buffer, theOutcomeDesc);
        }
        return buffer;
    }

}
