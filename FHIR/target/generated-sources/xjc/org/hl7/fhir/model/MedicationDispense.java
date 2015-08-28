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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MedicationDispense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationDispenseStatus" minOccurs="0"/&gt;
 *         &lt;element name="patient" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="dispenser" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="authorizingPrescription" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dispense" type="{http://hl7.org/fhir}MedicationDispense.Dispense" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="substitution" type="{http://hl7.org/fhir}MedicationDispense.Substitution" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense", propOrder = {
    "identifier",
    "status",
    "patient",
    "dispenser",
    "authorizingPrescriptions",
    "dispenses",
    "substitution"
})
@XmlRootElement(name = "MedicationDispense")
public class MedicationDispense
    extends Resource
    implements ToString
{

    protected Identifier identifier;
    protected MedicationDispenseStatus status;
    protected ResourceReference patient;
    protected ResourceReference dispenser;
    @XmlElement(name = "authorizingPrescription")
    protected List<ResourceReference> authorizingPrescriptions;
    @XmlElement(name = "dispense")
    protected List<MedicationDispenseDispense> dispenses;
    protected MedicationDispenseSubstitution substitution;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationDispenseStatus }
     *     
     */
    public MedicationDispenseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationDispenseStatus }
     *     
     */
    public void setStatus(MedicationDispenseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPatient(ResourceReference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the dispenser property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getDispenser() {
        return dispenser;
    }

    /**
     * Sets the value of the dispenser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDispenser(ResourceReference value) {
        this.dispenser = value;
    }

    /**
     * Gets the value of the authorizingPrescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizingPrescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizingPrescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getAuthorizingPrescriptions() {
        if (authorizingPrescriptions == null) {
            authorizingPrescriptions = new ArrayList<ResourceReference>();
        }
        return this.authorizingPrescriptions;
    }

    /**
     * Gets the value of the dispenses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispenses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispenses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationDispenseDispense }
     * 
     * 
     */
    public List<MedicationDispenseDispense> getDispenses() {
        if (dispenses == null) {
            dispenses = new ArrayList<MedicationDispenseDispense>();
        }
        return this.dispenses;
    }

    /**
     * Gets the value of the substitution property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationDispenseSubstitution }
     *     
     */
    public MedicationDispenseSubstitution getSubstitution() {
        return substitution;
    }

    /**
     * Sets the value of the substitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationDispenseSubstitution }
     *     
     */
    public void setSubstitution(MedicationDispenseSubstitution value) {
        this.substitution = value;
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
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            MedicationDispenseStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            strategy.appendField(locator, this, "patient", buffer, thePatient);
        }
        {
            ResourceReference theDispenser;
            theDispenser = this.getDispenser();
            strategy.appendField(locator, this, "dispenser", buffer, theDispenser);
        }
        {
            List<ResourceReference> theAuthorizingPrescriptions;
            theAuthorizingPrescriptions = (((this.authorizingPrescriptions!= null)&&(!this.authorizingPrescriptions.isEmpty()))?this.getAuthorizingPrescriptions():null);
            strategy.appendField(locator, this, "authorizingPrescriptions", buffer, theAuthorizingPrescriptions);
        }
        {
            List<MedicationDispenseDispense> theDispenses;
            theDispenses = (((this.dispenses!= null)&&(!this.dispenses.isEmpty()))?this.getDispenses():null);
            strategy.appendField(locator, this, "dispenses", buffer, theDispenses);
        }
        {
            MedicationDispenseSubstitution theSubstitution;
            theSubstitution = this.getSubstitution();
            strategy.appendField(locator, this, "substitution", buffer, theSubstitution);
        }
        return buffer;
    }

}
