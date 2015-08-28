//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 08:26:41 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsOfTime-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsOfTime-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="s"/&gt;
 *     &lt;enumeration value="min"/&gt;
 *     &lt;enumeration value="h"/&gt;
 *     &lt;enumeration value="d"/&gt;
 *     &lt;enumeration value="wk"/&gt;
 *     &lt;enumeration value="mo"/&gt;
 *     &lt;enumeration value="a"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitsOfTime-list")
@XmlEnum
public enum UnitsOfTimeList {


    /**
     * second.
     * 
     */
    @XmlEnumValue("s")
    S("s"),

    /**
     * minute.
     * 
     */
    @XmlEnumValue("min")
    MIN("min"),

    /**
     * hour.
     * 
     */
    @XmlEnumValue("h")
    H("h"),

    /**
     * day.
     * 
     */
    @XmlEnumValue("d")
    D("d"),

    /**
     * week.
     * 
     */
    @XmlEnumValue("wk")
    WK("wk"),

    /**
     * month.
     * 
     */
    @XmlEnumValue("mo")
    MO("mo"),

    /**
     * year.
     * 
     */
    @XmlEnumValue("a")
    A("a");
    private final java.lang.String value;

    UnitsOfTimeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static UnitsOfTimeList fromValue(java.lang.String v) {
        for (UnitsOfTimeList c: UnitsOfTimeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
