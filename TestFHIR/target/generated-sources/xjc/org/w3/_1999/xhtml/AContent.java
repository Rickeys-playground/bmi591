//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:15:25 PM MST 
//


package org.w3._1999.xhtml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * 
 * 				a elements use "Inline" excluding a
 * 			
 * 
 * <p>Java class for a.content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="a.content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}br"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}span"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}bdo"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}map"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}img"/&gt;
 *           &lt;/choice&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}tt"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}i"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}b"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}big"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}small"/&gt;
 *           &lt;/choice&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}em"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}strong"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}dfn"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}code"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}q"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}samp"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}kbd"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}var"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}cite"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}abbr"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}acronym"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}sub"/&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}sup"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a.content", propOrder = {
    "content"
})
@XmlSeeAlso({
    A.class
})
public class AContent implements ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = Img.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = Small.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = Sup.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = Sub.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = Map.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = Big.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * 
     * 				a elements use "Inline" excluding a
     * 			Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B }
     * {@link Kbd }
     * {@link Q }
     * {@link Strong }
     * {@link Tt }
     * {@link Img }
     * {@link Em }
     * {@link Small }
     * {@link Code }
     * {@link Sup }
     * {@link Acronym }
     * {@link Sub }
     * {@link Map }
     * {@link Br }
     * {@link Cite }
     * {@link Var }
     * {@link Span }
     * {@link Bdo }
     * {@link String }
     * {@link I }
     * {@link Big }
     * {@link Samp }
     * {@link Abbr }
     * {@link Dfn }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public String toString() {
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
        {
            List<Object> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        return buffer;
    }

}
