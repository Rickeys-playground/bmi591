package org.rickey.playground.FHIR;

import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.*;
import org.hl7.fhir.model.String;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/*
Created by mhchowd1 on 8/27/2015.
*/



public class Marshaller {


    @Test
    public void TestMarshaller() throws Exception {

        Boolean bool = new Boolean();
        bool.setValue(true);
        String st = new String();
        st.setValue("Male");
        Uri uri = new Uri();
        uri.setValue("http://hl7.org/fhir/v3/AdministrativeGender");
        Code code = new Code();
        code.setValue("M");
        Coding coddin = new Coding();
        coddin.setDisplay(st);
        coddin.setCode(code);
        coddin.setSystem(uri);
        CodeableConcept genconcept = new CodeableConcept();
        genconcept.getCodings().add(coddin);
        /*
        PatientContact ptcon = new PatientContact();
        ptcon.setName("Benedicte");*/

        Patient pt = new Patient();
        pt.setGender(genconcept);
        pt.setActive(bool);

        FileOutputStream fil = null;
        try {
            fil = new FileOutputStream(new File("patient_output.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JAXBContext jb = JAXBContext.newInstance(Patient.class.getPackage().getName());
        javax.xml.bind.Marshaller jbm = jb.createMarshaller();
        jbm.marshal(pt, fil);
        jbm.marshal(pt, System.out);

        javax.xml.bind.Unmarshaller um = (javax.xml.bind.Unmarshaller) jb.createUnmarshaller();
        File ins = new File("patient_output.xml");
        Patient pt1 = (Patient) um.unmarshal(ins);


/*

        Marshaller m = jb.createMarshaller();
        jb.marshal()

        File fl = new File("patient_output.xml");
        Patient pt1 = (Patient).

*/
    }
}
