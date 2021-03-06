//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:15:25 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Slicing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Slicing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discriminator" type="{http://hl7.org/fhir}id"/&gt;
 *         &lt;element name="ordered" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="rules" type="{http://hl7.org/fhir}SlicingRules"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Slicing", propOrder = {
    "discriminator",
    "ordered",
    "rules"
})
public class ProfileSlicing
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected Id discriminator;
    @XmlElement(required = true)
    protected Boolean ordered;
    @XmlElement(required = true)
    protected SlicingRules rules;

    /**
     * Gets the value of the discriminator property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getDiscriminator() {
        return discriminator;
    }

    /**
     * Sets the value of the discriminator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setDiscriminator(Id value) {
        this.discriminator = value;
    }

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrdered(Boolean value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link SlicingRules }
     *     
     */
    public SlicingRules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlicingRules }
     *     
     */
    public void setRules(SlicingRules value) {
        this.rules = value;
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
            Id theDiscriminator;
            theDiscriminator = this.getDiscriminator();
            strategy.appendField(locator, this, "discriminator", buffer, theDiscriminator);
        }
        {
            Boolean theOrdered;
            theOrdered = this.getOrdered();
            strategy.appendField(locator, this, "ordered", buffer, theOrdered);
        }
        {
            SlicingRules theRules;
            theRules = this.getRules();
            strategy.appendField(locator, this, "rules", buffer, theRules);
        }
        return buffer;
    }

}
