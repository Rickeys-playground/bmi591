//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:09:54 PM MST 
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
 * <p>Java class for Profile.Binding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Binding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="isExtensible" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="conformance" type="{http://hl7.org/fhir}BindingConformance" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="referenceUri" type="{http://hl7.org/fhir}uri"/&gt;
 *           &lt;element name="referenceResource" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Binding", propOrder = {
    "name",
    "isExtensible",
    "conformance",
    "description",
    "referenceResource",
    "referenceUri"
})
public class ProfileBinding
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected org.hl7.fhir.model.String name;
    @XmlElement(required = true)
    protected Boolean isExtensible;
    protected BindingConformance conformance;
    protected org.hl7.fhir.model.String description;
    protected ResourceReference referenceResource;
    protected Uri referenceUri;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setName(org.hl7.fhir.model.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isExtensible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsExtensible() {
        return isExtensible;
    }

    /**
     * Sets the value of the isExtensible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExtensible(Boolean value) {
        this.isExtensible = value;
    }

    /**
     * Gets the value of the conformance property.
     * 
     * @return
     *     possible object is
     *     {@link BindingConformance }
     *     
     */
    public BindingConformance getConformance() {
        return conformance;
    }

    /**
     * Sets the value of the conformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingConformance }
     *     
     */
    public void setConformance(BindingConformance value) {
        this.conformance = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the referenceResource property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getReferenceResource() {
        return referenceResource;
    }

    /**
     * Sets the value of the referenceResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReferenceResource(ResourceReference value) {
        this.referenceResource = value;
    }

    /**
     * Gets the value of the referenceUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getReferenceUri() {
        return referenceUri;
    }

    /**
     * Sets the value of the referenceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setReferenceUri(Uri value) {
        this.referenceUri = value;
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
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Boolean theIsExtensible;
            theIsExtensible = this.getIsExtensible();
            strategy.appendField(locator, this, "isExtensible", buffer, theIsExtensible);
        }
        {
            BindingConformance theConformance;
            theConformance = this.getConformance();
            strategy.appendField(locator, this, "conformance", buffer, theConformance);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            ResourceReference theReferenceResource;
            theReferenceResource = this.getReferenceResource();
            strategy.appendField(locator, this, "referenceResource", buffer, theReferenceResource);
        }
        {
            Uri theReferenceUri;
            theReferenceUri = this.getReferenceUri();
            strategy.appendField(locator, this, "referenceUri", buffer, theReferenceUri);
        }
        return buffer;
    }

}
