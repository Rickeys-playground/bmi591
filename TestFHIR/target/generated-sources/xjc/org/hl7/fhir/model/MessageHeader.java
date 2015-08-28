//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:15:25 PM MST 
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
 * <p>Java class for MessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}id"/&gt;
 *         &lt;element name="timestamp" type="{http://hl7.org/fhir}instant"/&gt;
 *         &lt;element name="event" type="{http://hl7.org/fhir}Coding"/&gt;
 *         &lt;element name="response" type="{http://hl7.org/fhir}MessageHeader.Response" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://hl7.org/fhir}MessageHeader.Source"/&gt;
 *         &lt;element name="destination" type="{http://hl7.org/fhir}MessageHeader.Destination" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="enterer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="author" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="receiver" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="responsible" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", propOrder = {
    "identifier",
    "timestamp",
    "event",
    "response",
    "source",
    "destinations",
    "enterer",
    "author",
    "receiver",
    "responsible",
    "reason",
    "datas"
})
@XmlRootElement(name = "MessageHeader")
public class MessageHeader
    extends Resource
    implements ToString
{

    @XmlElement(required = true)
    protected Id identifier;
    @XmlElement(required = true)
    protected Instant timestamp;
    @XmlElement(required = true)
    protected Coding event;
    protected MessageHeaderResponse response;
    @XmlElement(required = true)
    protected MessageHeaderSource source;
    @XmlElement(name = "destination")
    protected List<MessageHeaderDestination> destinations;
    protected ResourceReference enterer;
    protected ResourceReference author;
    protected ResourceReference receiver;
    protected ResourceReference responsible;
    protected CodeableConcept reason;
    @XmlElement(name = "data")
    protected List<ResourceReference> datas;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setIdentifier(Id value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setTimestamp(Instant value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setEvent(Coding value) {
        this.event = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderResponse }
     *     
     */
    public MessageHeaderResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderResponse }
     *     
     */
    public void setResponse(MessageHeaderResponse value) {
        this.response = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderSource }
     *     
     */
    public MessageHeaderSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderSource }
     *     
     */
    public void setSource(MessageHeaderSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageHeaderDestination }
     * 
     * 
     */
    public List<MessageHeaderDestination> getDestinations() {
        if (destinations == null) {
            destinations = new ArrayList<MessageHeaderDestination>();
        }
        return this.destinations;
    }

    /**
     * Gets the value of the enterer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getEnterer() {
        return enterer;
    }

    /**
     * Sets the value of the enterer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setEnterer(ResourceReference value) {
        this.enterer = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setAuthor(ResourceReference value) {
        this.author = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReceiver(ResourceReference value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setResponsible(ResourceReference value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReason(CodeableConcept value) {
        this.reason = value;
    }

    /**
     * Gets the value of the datas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getDatas() {
        if (datas == null) {
            datas = new ArrayList<ResourceReference>();
        }
        return this.datas;
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
            Id theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            Instant theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp);
        }
        {
            Coding theEvent;
            theEvent = this.getEvent();
            strategy.appendField(locator, this, "event", buffer, theEvent);
        }
        {
            MessageHeaderResponse theResponse;
            theResponse = this.getResponse();
            strategy.appendField(locator, this, "response", buffer, theResponse);
        }
        {
            MessageHeaderSource theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            List<MessageHeaderDestination> theDestinations;
            theDestinations = (((this.destinations!= null)&&(!this.destinations.isEmpty()))?this.getDestinations():null);
            strategy.appendField(locator, this, "destinations", buffer, theDestinations);
        }
        {
            ResourceReference theEnterer;
            theEnterer = this.getEnterer();
            strategy.appendField(locator, this, "enterer", buffer, theEnterer);
        }
        {
            ResourceReference theAuthor;
            theAuthor = this.getAuthor();
            strategy.appendField(locator, this, "author", buffer, theAuthor);
        }
        {
            ResourceReference theReceiver;
            theReceiver = this.getReceiver();
            strategy.appendField(locator, this, "receiver", buffer, theReceiver);
        }
        {
            ResourceReference theResponsible;
            theResponsible = this.getResponsible();
            strategy.appendField(locator, this, "responsible", buffer, theResponsible);
        }
        {
            CodeableConcept theReason;
            theReason = this.getReason();
            strategy.appendField(locator, this, "reason", buffer, theReason);
        }
        {
            List<ResourceReference> theDatas;
            theDatas = (((this.datas!= null)&&(!this.datas.isEmpty()))?this.getDatas():null);
            strategy.appendField(locator, this, "datas", buffer, theDatas);
        }
        return buffer;
    }

}
