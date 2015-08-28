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
 * <p>Java class for ConditionRelationshipType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionRelationshipType-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="due-to"/&gt;
 *     &lt;enumeration value="following"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConditionRelationshipType-list")
@XmlEnum
public enum ConditionRelationshipTypeList {


    /**
     * this condition follows the identified condition/procedure/substance and is a consequence of it.
     * 
     */
    @XmlEnumValue("due-to")
    DUE_TO("due-to"),

    /**
     * this condition follows the identified condition/procedure/substance, but it is not known whether they are causually linked.
     * 
     */
    @XmlEnumValue("following")
    FOLLOWING("following");
    private final java.lang.String value;

    ConditionRelationshipTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConditionRelationshipTypeList fromValue(java.lang.String v) {
        for (ConditionRelationshipTypeList c: ConditionRelationshipTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
