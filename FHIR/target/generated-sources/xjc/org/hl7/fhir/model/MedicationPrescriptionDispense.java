//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 08:26:41 PM MST 
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
 * An order for both supply of the medication and the instructions for administration of the medicine to a patient.
 * 
 * <p>Java class for MedicationPrescription.Dispense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationPrescription.Dispense"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="medication" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="validityPeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRepeatsAllowed" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="expectedSupplyDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationPrescription.Dispense", propOrder = {
    "medication",
    "validityPeriod",
    "numberOfRepeatsAllowed",
    "quantity",
    "expectedSupplyDuration"
})
public class MedicationPrescriptionDispense
    extends BackboneElement
    implements ToString
{

    protected ResourceReference medication;
    protected Period validityPeriod;
    protected Integer numberOfRepeatsAllowed;
    protected Quantity quantity;
    protected TimeDuration expectedSupplyDuration;

    /**
     * Gets the value of the medication property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getMedication() {
        return medication;
    }

    /**
     * Sets the value of the medication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setMedication(ResourceReference value) {
        this.medication = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValidityPeriod(Period value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the numberOfRepeatsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRepeatsAllowed() {
        return numberOfRepeatsAllowed;
    }

    /**
     * Sets the value of the numberOfRepeatsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRepeatsAllowed(Integer value) {
        this.numberOfRepeatsAllowed = value;
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
     * Gets the value of the expectedSupplyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDuration }
     *     
     */
    public TimeDuration getExpectedSupplyDuration() {
        return expectedSupplyDuration;
    }

    /**
     * Sets the value of the expectedSupplyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDuration }
     *     
     */
    public void setExpectedSupplyDuration(TimeDuration value) {
        this.expectedSupplyDuration = value;
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
            ResourceReference theMedication;
            theMedication = this.getMedication();
            strategy.appendField(locator, this, "medication", buffer, theMedication);
        }
        {
            Period theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            strategy.appendField(locator, this, "validityPeriod", buffer, theValidityPeriod);
        }
        {
            Integer theNumberOfRepeatsAllowed;
            theNumberOfRepeatsAllowed = this.getNumberOfRepeatsAllowed();
            strategy.appendField(locator, this, "numberOfRepeatsAllowed", buffer, theNumberOfRepeatsAllowed);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        {
            TimeDuration theExpectedSupplyDuration;
            theExpectedSupplyDuration = this.getExpectedSupplyDuration();
            strategy.appendField(locator, this, "expectedSupplyDuration", buffer, theExpectedSupplyDuration);
        }
        return buffer;
    }

}
