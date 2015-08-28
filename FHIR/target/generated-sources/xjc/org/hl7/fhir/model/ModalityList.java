//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 08:26:41 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Modality-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Modality-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AU"/&gt;
 *     &lt;enumeration value="BDUS"/&gt;
 *     &lt;enumeration value="BI"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="DG"/&gt;
 *     &lt;enumeration value="DX"/&gt;
 *     &lt;enumeration value="ECG"/&gt;
 *     &lt;enumeration value="EPS"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="HC"/&gt;
 *     &lt;enumeration value="HD"/&gt;
 *     &lt;enumeration value="IO"/&gt;
 *     &lt;enumeration value="IVOCT"/&gt;
 *     &lt;enumeration value="IVUS"/&gt;
 *     &lt;enumeration value="KER"/&gt;
 *     &lt;enumeration value="KO"/&gt;
 *     &lt;enumeration value="LEN"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="NM"/&gt;
 *     &lt;enumeration value="OAM"/&gt;
 *     &lt;enumeration value="OCT"/&gt;
 *     &lt;enumeration value="OP"/&gt;
 *     &lt;enumeration value="OPM"/&gt;
 *     &lt;enumeration value="OPT"/&gt;
 *     &lt;enumeration value="OPV"/&gt;
 *     &lt;enumeration value="OT"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="PX"/&gt;
 *     &lt;enumeration value="REG"/&gt;
 *     &lt;enumeration value="RF"/&gt;
 *     &lt;enumeration value="RG"/&gt;
 *     &lt;enumeration value="RTDOSE"/&gt;
 *     &lt;enumeration value="RTIMAGE"/&gt;
 *     &lt;enumeration value="RTPLAN"/&gt;
 *     &lt;enumeration value="RTRECORD"/&gt;
 *     &lt;enumeration value="RTSTRUCT"/&gt;
 *     &lt;enumeration value="SEG"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="SMR"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="SRF"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="VA"/&gt;
 *     &lt;enumeration value="XA"/&gt;
 *     &lt;enumeration value="XC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Modality-list")
@XmlEnum
public enum ModalityList {

    AR,
    AU,
    BDUS,
    BI,
    BMD,
    CR,
    CT,
    DG,
    DX,
    ECG,
    EPS,
    ES,
    GM,
    HC,
    HD,
    IO,
    IVOCT,
    IVUS,
    KER,
    KO,
    LEN,
    LS,
    MG,
    MR,
    NM,
    OAM,
    OCT,
    OP,
    OPM,
    OPT,
    OPV,
    OT,
    PR,
    PT,
    PX,
    REG,
    RF,
    RG,
    RTDOSE,
    RTIMAGE,
    RTPLAN,
    RTRECORD,
    RTSTRUCT,
    SEG,
    SM,
    SMR,
    SR,
    SRF,
    TG,
    US,
    VA,
    XA,
    XC;

    public java.lang.String value() {
        return name();
    }

    public static ModalityList fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
