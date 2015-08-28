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
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * 
 * <p>Java class for Encounter.Hospitalization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Encounter.Hospitalization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preAdmissionIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="origin" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="admitSource" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *         &lt;element name="accomodation" type="{http://hl7.org/fhir}Encounter.Accomodation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="diet" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="specialCourtesy" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specialArrangement" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="dischargeDisposition" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="dischargeDiagnosis" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="reAdmission" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Encounter.Hospitalization", propOrder = {
    "preAdmissionIdentifier",
    "origin",
    "admitSource",
    "period",
    "accomodations",
    "diet",
    "specialCourtesies",
    "specialArrangements",
    "destination",
    "dischargeDisposition",
    "dischargeDiagnosis",
    "reAdmission"
})
public class EncounterHospitalization
    extends BackboneElement
    implements ToString
{

    protected Identifier preAdmissionIdentifier;
    protected ResourceReference origin;
    protected CodeableConcept admitSource;
    protected Period period;
    @XmlElement(name = "accomodation")
    protected List<EncounterAccomodation> accomodations;
    protected CodeableConcept diet;
    @XmlElement(name = "specialCourtesy")
    protected List<CodeableConcept> specialCourtesies;
    @XmlElement(name = "specialArrangement")
    protected List<CodeableConcept> specialArrangements;
    protected ResourceReference destination;
    protected CodeableConcept dischargeDisposition;
    protected ResourceReference dischargeDiagnosis;
    protected Boolean reAdmission;

    /**
     * Gets the value of the preAdmissionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getPreAdmissionIdentifier() {
        return preAdmissionIdentifier;
    }

    /**
     * Sets the value of the preAdmissionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setPreAdmissionIdentifier(Identifier value) {
        this.preAdmissionIdentifier = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setOrigin(ResourceReference value) {
        this.origin = value;
    }

    /**
     * Gets the value of the admitSource property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAdmitSource() {
        return admitSource;
    }

    /**
     * Sets the value of the admitSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdmitSource(CodeableConcept value) {
        this.admitSource = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the accomodations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accomodations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccomodations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncounterAccomodation }
     * 
     * 
     */
    public List<EncounterAccomodation> getAccomodations() {
        if (accomodations == null) {
            accomodations = new ArrayList<EncounterAccomodation>();
        }
        return this.accomodations;
    }

    /**
     * Gets the value of the diet property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDiet() {
        return diet;
    }

    /**
     * Sets the value of the diet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDiet(CodeableConcept value) {
        this.diet = value;
    }

    /**
     * Gets the value of the specialCourtesies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialCourtesies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialCourtesies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSpecialCourtesies() {
        if (specialCourtesies == null) {
            specialCourtesies = new ArrayList<CodeableConcept>();
        }
        return this.specialCourtesies;
    }

    /**
     * Gets the value of the specialArrangements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialArrangements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialArrangements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSpecialArrangements() {
        if (specialArrangements == null) {
            specialArrangements = new ArrayList<CodeableConcept>();
        }
        return this.specialArrangements;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDestination(ResourceReference value) {
        this.destination = value;
    }

    /**
     * Gets the value of the dischargeDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDischargeDisposition() {
        return dischargeDisposition;
    }

    /**
     * Sets the value of the dischargeDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDischargeDisposition(CodeableConcept value) {
        this.dischargeDisposition = value;
    }

    /**
     * Gets the value of the dischargeDiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getDischargeDiagnosis() {
        return dischargeDiagnosis;
    }

    /**
     * Sets the value of the dischargeDiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDischargeDiagnosis(ResourceReference value) {
        this.dischargeDiagnosis = value;
    }

    /**
     * Gets the value of the reAdmission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReAdmission() {
        return reAdmission;
    }

    /**
     * Sets the value of the reAdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReAdmission(Boolean value) {
        this.reAdmission = value;
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
            Identifier thePreAdmissionIdentifier;
            thePreAdmissionIdentifier = this.getPreAdmissionIdentifier();
            strategy.appendField(locator, this, "preAdmissionIdentifier", buffer, thePreAdmissionIdentifier);
        }
        {
            ResourceReference theOrigin;
            theOrigin = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theOrigin);
        }
        {
            CodeableConcept theAdmitSource;
            theAdmitSource = this.getAdmitSource();
            strategy.appendField(locator, this, "admitSource", buffer, theAdmitSource);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod);
        }
        {
            List<EncounterAccomodation> theAccomodations;
            theAccomodations = (((this.accomodations!= null)&&(!this.accomodations.isEmpty()))?this.getAccomodations():null);
            strategy.appendField(locator, this, "accomodations", buffer, theAccomodations);
        }
        {
            CodeableConcept theDiet;
            theDiet = this.getDiet();
            strategy.appendField(locator, this, "diet", buffer, theDiet);
        }
        {
            List<CodeableConcept> theSpecialCourtesies;
            theSpecialCourtesies = (((this.specialCourtesies!= null)&&(!this.specialCourtesies.isEmpty()))?this.getSpecialCourtesies():null);
            strategy.appendField(locator, this, "specialCourtesies", buffer, theSpecialCourtesies);
        }
        {
            List<CodeableConcept> theSpecialArrangements;
            theSpecialArrangements = (((this.specialArrangements!= null)&&(!this.specialArrangements.isEmpty()))?this.getSpecialArrangements():null);
            strategy.appendField(locator, this, "specialArrangements", buffer, theSpecialArrangements);
        }
        {
            ResourceReference theDestination;
            theDestination = this.getDestination();
            strategy.appendField(locator, this, "destination", buffer, theDestination);
        }
        {
            CodeableConcept theDischargeDisposition;
            theDischargeDisposition = this.getDischargeDisposition();
            strategy.appendField(locator, this, "dischargeDisposition", buffer, theDischargeDisposition);
        }
        {
            ResourceReference theDischargeDiagnosis;
            theDischargeDiagnosis = this.getDischargeDiagnosis();
            strategy.appendField(locator, this, "dischargeDiagnosis", buffer, theDischargeDiagnosis);
        }
        {
            Boolean theReAdmission;
            theReAdmission = this.getReAdmission();
            strategy.appendField(locator, this, "reAdmission", buffer, theReAdmission);
        }
        return buffer;
    }

}
