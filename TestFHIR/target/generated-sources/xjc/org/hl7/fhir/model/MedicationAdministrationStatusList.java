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
 * <p>Java class for MedicationAdministrationStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationAdministrationStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="in progress"/&gt;
 *     &lt;enumeration value="on hold"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="entered in error"/&gt;
 *     &lt;enumeration value="stopped"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MedicationAdministrationStatus-list")
@XmlEnum
public enum MedicationAdministrationStatusList {


    /**
     * The administration has started but has not yet completed.
     * 
     */
    @XmlEnumValue("in progress")
    IN_PROGRESS("in progress"),

    /**
     * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended".
     * 
     */
    @XmlEnumValue("on hold")
    ON_HOLD("on hold"),

    /**
     * All actions that are implied by the administration have occurred.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The administration was entered in error and therefore nullified.
     * 
     */
    @XmlEnumValue("entered in error")
    ENTERED_IN_ERROR("entered in error"),

    /**
     * Actions implied by the administration have been permanently halted, before all of them occurred.
     * 
     */
    @XmlEnumValue("stopped")
    STOPPED("stopped");
    private final java.lang.String value;

    MedicationAdministrationStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MedicationAdministrationStatusList fromValue(java.lang.String v) {
        for (MedicationAdministrationStatusList c: MedicationAdministrationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
