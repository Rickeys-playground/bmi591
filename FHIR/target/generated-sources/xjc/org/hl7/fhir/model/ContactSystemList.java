//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:09:54 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactSystem-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactSystem-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="phone"/&gt;
 *     &lt;enumeration value="fax"/&gt;
 *     &lt;enumeration value="email"/&gt;
 *     &lt;enumeration value="url"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactSystem-list")
@XmlEnum
public enum ContactSystemList {


    /**
     * The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     * 
     */
    @XmlEnumValue("phone")
    PHONE("phone"),

    /**
     * The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     * 
     */
    @XmlEnumValue("fax")
    FAX("fax"),

    /**
     * The value is an email address.
     * 
     */
    @XmlEnumValue("email")
    EMAIL("email"),

    /**
     * The value is a url. This is intended for various personal contacts including blogs, Twitter, Facebook, etc. Do not use for email addresses.
     * 
     */
    @XmlEnumValue("url")
    URL("url");
    private final java.lang.String value;

    ContactSystemList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ContactSystemList fromValue(java.lang.String v) {
        for (ContactSystemList c: ContactSystemList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
