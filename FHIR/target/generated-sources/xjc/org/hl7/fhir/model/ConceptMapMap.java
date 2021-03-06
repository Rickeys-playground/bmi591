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
 * A statement of relationships from one set of concepts to one or more other concept systems.
 * 
 * <p>Java class for ConceptMap.Map complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap.Map"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *         &lt;element name="equivalence" type="{http://hl7.org/fhir}ConceptMapEquivalence"/&gt;
 *         &lt;element name="comments" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://hl7.org/fhir}ConceptMap.DependsOn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap.Map", propOrder = {
    "system",
    "code",
    "equivalence",
    "comments",
    "products"
})
public class ConceptMapMap
    extends BackboneElement
    implements ToString
{

    protected Uri system;
    protected Code code;
    @XmlElement(required = true)
    protected ConceptMapEquivalence equivalence;
    protected org.hl7.fhir.model.String comments;
    @XmlElement(name = "product")
    protected List<ConceptMapDependsOn> products;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSystem(Uri value) {
        this.system = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the equivalence property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptMapEquivalence }
     *     
     */
    public ConceptMapEquivalence getEquivalence() {
        return equivalence;
    }

    /**
     * Sets the value of the equivalence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptMapEquivalence }
     *     
     */
    public void setEquivalence(ConceptMapEquivalence value) {
        this.equivalence = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setComments(org.hl7.fhir.model.String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapDependsOn }
     * 
     * 
     */
    public List<ConceptMapDependsOn> getProducts() {
        if (products == null) {
            products = new ArrayList<ConceptMapDependsOn>();
        }
        return this.products;
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
            Uri theSystem;
            theSystem = this.getSystem();
            strategy.appendField(locator, this, "system", buffer, theSystem);
        }
        {
            Code theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            ConceptMapEquivalence theEquivalence;
            theEquivalence = this.getEquivalence();
            strategy.appendField(locator, this, "equivalence", buffer, theEquivalence);
        }
        {
            org.hl7.fhir.model.String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            List<ConceptMapDependsOn> theProducts;
            theProducts = (((this.products!= null)&&(!this.products.isEmpty()))?this.getProducts():null);
            strategy.appendField(locator, this, "products", buffer, theProducts);
        }
        return buffer;
    }

}
