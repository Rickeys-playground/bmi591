package org.rickey.playground.FHIR;

import org.hl7.fhir.model.Patient;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Created by mhchowd1 on 8/24/2015.
 */
public class Unmarshaller {

    @Test
            public void testunmarshaller() throws Exception{

                JAXBContext newcontext = JAXBContext.newInstance(Patient.class.getPackage().getName());
                javax.xml.bind.Unmarshaller unmarsh = newcontext.createUnmarshaller();

                /*InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("Patient.xml");
*/              File file = new File("patient_output.xml");
                /*URL url = new URL("file:/C:/Users/mhchowd1/IdeaProjects/NewBeginning/FHIR/src/main/resources/Patient-example.xml")*/;
                Patient patient = (Patient)unmarsh.unmarshal(file);

                assertEquals(patient.getActive().isValue(), true);
               /* assertEquals(patient.getGender().getCodings().get(0).getDisplay().getValue(),"Male");
                assertEquals(patient.getGender().getCodings().get(0).getCode().getValue(),"M");
                assertEquals(patient.getAddresses().get(0).getCity().getValue(),"Dhaka");
                assertEquals(patient.getAddresses().get(0).getState().getValue(),"Vic");
                assertEquals(patient.getAddresses().get(0).getZip().getValue(),"3999");
                assertEquals(patient.getIdentifiers().get(0).getValue().getValue(), "12345");
                assertEquals(patient.getIdentifiers().get(0).getSystem().getValue(), "urn:oid:1.2.36.146.595.217.0.1");
                assertEquals(patient.getNames().get(0).getFamilies().get(0).getValue(), "Chalmers");
                assertEquals(patient.getNames().get(0).getGivens().get(0).getValue(), "Peter");*/

                /*String firstName = patient.getNames().get(0).getGivens().get(0).getValue();
                String familyName = patient.getNames().get(0).getFamilies().get(0).getValue();
                String middleName = patient.getNames().get(0).getGivens().get(1).getValue();
                String nickName = patient.getNames().get(1).getGivens().get(0).getValue();
                System.out.println("His Name is " + firstName+" "+" "+middleName+" "+familyName+", also known as "+nickName);*/
                System.out.print(patient.getGender().getCodings().get(0).getDisplay().getValue());

    }


}