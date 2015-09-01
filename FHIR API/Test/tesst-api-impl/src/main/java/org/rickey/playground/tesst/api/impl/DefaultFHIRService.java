package org.rickey.playground.tesst.api.impl;

import org.hl7.fhir.model.*;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.String;
import org.rickey.playground.tesst.api.FHIRService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by mhchowd1 on 9/1/2015.
 */
@Service ("fhirService#default")
public class DefaultFHIRService implements FHIRService {

    public Patient getPatient(java.lang.String pid){
        Patient pat = new Patient();

        org.hl7.fhir.model.String st = new String();
        st.setValue("p123");
        Identifier idd = new Identifier();
        idd.setValue(st);
        pat.getIdentifiers().add(idd);
        pat.getIdentifiers().get(0);
        DateTime datetime = new DateTime();
        Date date = new Date();
        datetime.setValue(date);

        org.hl7.fhir.model.Boolean bool = new Boolean();
        bool.setValue(true);

        Integer inte = new Integer();
        inte.setValue(5);

        CodeableConcept mariconcept = new CodeableConcept();
        String marit = new String();
        marit.setId("Single");
        Coding marital = new Coding();
        marital.setDisplay(marit);
        mariconcept.getCodings().add(marital);

        CodeableConcept genconcept = new CodeableConcept();
        String gend = new String();
        gend.setValue("Male");
        Coding gende = new Coding();
        gende.setDisplay(gend);
        genconcept.getCodings().add(gende);

        pat.setActive(bool);
        pat.setDeceasedBoolean(bool);
        pat.setDeceasedDateTime(datetime);
        pat.setMultipleBirthBoolean(bool);
        pat.setMultipleBirthInteger(inte);
        pat.setMaritalStatus(mariconcept);
        pat.setGender(genconcept);

        pat.getActive();
        pat.getMultipleBirthBoolean();
        pat.getMultipleBirthInteger();
        pat.getGender();
        pat.getMaritalStatus();
        pat.getDeceasedDateTime();
        pat.getDeceasedBoolean();

      return pat;
    }
}
