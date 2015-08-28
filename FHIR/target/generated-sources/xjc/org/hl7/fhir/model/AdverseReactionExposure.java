//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:09:54 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Records an unexpected reaction suspected to be related to the exposure of the reaction subject to a substance.
 * 
 * <p>Java class for AdverseReaction.Exposure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdverseReaction.Exposure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}ExposureType" minOccurs="0"/&gt;
 *         &lt;element name="causalityExpectation" type="{http://hl7.org/fhir}CausalityExpectation" minOccurs="0"/&gt;
 *         &lt;element name="substance" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdverseReaction.Exposure", propOrder = {
    "date",
    "type",
    "causalityExpectation",
    "substance"
})
public class AdverseReactionExposure
    extends BackboneElement
    implements ToString
{

    protected DateTime date;
    protected ExposureType type;
    protected CausalityExpectation causalityExpectation;
    protected ResourceReference substance;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType }
     *     
     */
    public ExposureType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType }
     *     
     */
    public void setType(ExposureType value) {
        this.type = value;
    }

    /**
     * Gets the value of the causalityExpectation property.
     * 
     * @return
     *     possible object is
     *     {@link CausalityExpectation }
     *     
     */
    public CausalityExpectation getCausalityExpectation() {
        return causalityExpectation;
    }

    /**
     * Sets the value of the causalityExpectation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CausalityExpectation }
     *     
     */
    public void setCausalityExpectation(CausalityExpectation value) {
        this.causalityExpectation = value;
    }

    /**
     * Gets the value of the substance property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSubstance() {
        return substance;
    }

    /**
     * Sets the value of the substance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubstance(ResourceReference value) {
        this.substance = value;
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
            DateTime theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            ExposureType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            CausalityExpectation theCausalityExpectation;
            theCausalityExpectation = this.getCausalityExpectation();
            strategy.appendField(locator, this, "causalityExpectation", buffer, theCausalityExpectation);
        }
        {
            ResourceReference theSubstance;
            theSubstance = this.getSubstance();
            strategy.appendField(locator, this, "substance", buffer, theSubstance);
        }
        return buffer;
    }

}
