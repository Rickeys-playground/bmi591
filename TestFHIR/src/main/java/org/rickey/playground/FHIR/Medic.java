package org.rickey.playground.FHIR;

import org.hl7.fhir.model.*;
import org.hl7.fhir.model.String;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

/**
 * Created by mhchowd1 on 8/27/2015.
 */
public class Medic {

    @Test
    public void testMedic () throws ParseException {
        /*org.hl7.fhir.model.String namestring = new String();
        namestring.setValue("Penicillin VK oral suspension 125mg/5ml");
        setNames(namestring);*/

        Coding namecode = new Coding();
        Code codevalue = new Code();
        codevalue.setValue("323418000");
        Uri nameuri = new Uri();
        nameuri.setValue("http://snomed.info/sct");
        String displaystring = new String();
        displaystring.setValue("Phenoxymethylpenicillin 125mg/5mL oral solution (product)");
        namecode.setDisplay(displaystring);
        namecode.setSystem(nameuri);
        namecode.setCode(codevalue);

        CodeableConcept code = new CodeableConcept();
        code.getCodings().add(namecode);

        System.out.println(code.getCodings().get(0).getDisplay().getValue());

        assertEquals(code.getCodings().get(0).getDisplay(),displaystring);
    }
}
