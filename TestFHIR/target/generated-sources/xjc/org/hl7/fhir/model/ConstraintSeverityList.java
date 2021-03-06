//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:15:25 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintSeverity-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstraintSeverity-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="error"/&gt;
 *     &lt;enumeration value="warning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConstraintSeverity-list")
@XmlEnum
public enum ConstraintSeverityList {


    /**
     * If the constraint is violated, the resource is not conformant.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * If the constraint is violated, the resource is conformant, but it is not necessarily following best practice.
     * 
     */
    @XmlEnumValue("warning")
    WARNING("warning");
    private final java.lang.String value;

    ConstraintSeverityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConstraintSeverityList fromValue(java.lang.String v) {
        for (ConstraintSeverityList c: ConstraintSeverityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
