package edu.asu.bmi.cda.fhir;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.Organization;
import org.hl7.fhir.model.Patient;
import org.hl7.fhir.model.Practitioner;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.String;
import org.hl7.fhir.model.*;

public class Testpatient {

    @Test
    public void patienttester()throws ParseException {



        DateTime datetime = new DateTime();
        Date date = new Date();
        datetime.setValue(date);

        Boolean bool = new Boolean();
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

        //test patient
        Patient tester = new Patient();

        tester.setActive(bool);
        tester.setDeceasedBoolean(bool);
        tester.setDeceasedDateTime(datetime);
        tester.setMultipleBirthBoolean(bool);
        tester.setMultipleBirthBoolean(bool);
        tester.setMultipleBirthInteger(inte);
        tester.setMaritalStatus(mariconcept);
        tester.setGender(genconcept);

        System.out.println("Today's date is "+date);
        System.out.println("No. of Birthdates he has "+ tester.getMultipleBirthInteger().getValue());
        System.out.println("He died on "+ tester.getDeceasedDateTime().getValue());
        System.out.println("His gender was "+ tester.getGender().getCodings().get(0).getDisplay().getValue());

        assertEquals(tester.getActive(), bool);
        assertEquals(tester.getDeceasedBoolean(), bool);
        assertEquals(tester.getDeceasedDateTime(), datetime);
        assertEquals(tester.getMultipleBirthBoolean(), bool);
        assertEquals(tester.getMaritalStatus(), mariconcept);
        assertEquals(tester.getMultipleBirthInteger(),inte);
        assertEquals(tester.getGender(),genconcept);






    }
}
