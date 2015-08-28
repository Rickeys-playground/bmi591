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
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * 
 * <p>Java class for Conformance.Rest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Rest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mode" type="{http://hl7.org/fhir}RestfulConformanceMode"/&gt;
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="security" type="{http://hl7.org/fhir}Conformance.Security" minOccurs="0"/&gt;
 *         &lt;element name="resource" type="{http://hl7.org/fhir}Conformance.Resource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="operation" type="{http://hl7.org/fhir}Conformance.Operation1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="query" type="{http://hl7.org/fhir}Conformance.Query" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="documentMailbox" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Rest", propOrder = {
    "mode",
    "documentation",
    "security",
    "resources",
    "operations",
    "queries",
    "documentMailboxes"
})
public class ConformanceRest
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected RestfulConformanceMode mode;
    protected org.hl7.fhir.model.String documentation;
    protected ConformanceSecurity security;
    @XmlElement(name = "resource", required = true)
    protected List<ConformanceResource> resources;
    @XmlElement(name = "operation")
    protected List<ConformanceOperation1> operations;
    @XmlElement(name = "query")
    protected List<ConformanceQuery> queries;
    @XmlElement(name = "documentMailbox")
    protected List<Uri> documentMailboxes;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link RestfulConformanceMode }
     *     
     */
    public RestfulConformanceMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestfulConformanceMode }
     *     
     */
    public void setMode(RestfulConformanceMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDocumentation(org.hl7.fhir.model.String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceSecurity }
     *     
     */
    public ConformanceSecurity getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceSecurity }
     *     
     */
    public void setSecurity(ConformanceSecurity value) {
        this.security = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceResource }
     * 
     * 
     */
    public List<ConformanceResource> getResources() {
        if (resources == null) {
            resources = new ArrayList<ConformanceResource>();
        }
        return this.resources;
    }

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceOperation1 }
     * 
     * 
     */
    public List<ConformanceOperation1> getOperations() {
        if (operations == null) {
            operations = new ArrayList<ConformanceOperation1>();
        }
        return this.operations;
    }

    /**
     * Gets the value of the queries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceQuery }
     * 
     * 
     */
    public List<ConformanceQuery> getQueries() {
        if (queries == null) {
            queries = new ArrayList<ConformanceQuery>();
        }
        return this.queries;
    }

    /**
     * Gets the value of the documentMailboxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentMailboxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentMailboxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getDocumentMailboxes() {
        if (documentMailboxes == null) {
            documentMailboxes = new ArrayList<Uri>();
        }
        return this.documentMailboxes;
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
            RestfulConformanceMode theMode;
            theMode = this.getMode();
            strategy.appendField(locator, this, "mode", buffer, theMode);
        }
        {
            org.hl7.fhir.model.String theDocumentation;
            theDocumentation = this.getDocumentation();
            strategy.appendField(locator, this, "documentation", buffer, theDocumentation);
        }
        {
            ConformanceSecurity theSecurity;
            theSecurity = this.getSecurity();
            strategy.appendField(locator, this, "security", buffer, theSecurity);
        }
        {
            List<ConformanceResource> theResources;
            theResources = (((this.resources!= null)&&(!this.resources.isEmpty()))?this.getResources():null);
            strategy.appendField(locator, this, "resources", buffer, theResources);
        }
        {
            List<ConformanceOperation1> theOperations;
            theOperations = (((this.operations!= null)&&(!this.operations.isEmpty()))?this.getOperations():null);
            strategy.appendField(locator, this, "operations", buffer, theOperations);
        }
        {
            List<ConformanceQuery> theQueries;
            theQueries = (((this.queries!= null)&&(!this.queries.isEmpty()))?this.getQueries():null);
            strategy.appendField(locator, this, "queries", buffer, theQueries);
        }
        {
            List<Uri> theDocumentMailboxes;
            theDocumentMailboxes = (((this.documentMailboxes!= null)&&(!this.documentMailboxes.isEmpty()))?this.getDocumentMailboxes():null);
            strategy.appendField(locator, this, "documentMailboxes", buffer, theDocumentMailboxes);
        }
        return buffer;
    }

}
