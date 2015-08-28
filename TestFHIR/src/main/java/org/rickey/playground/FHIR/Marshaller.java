package org.rickey.playground.FHIR;

import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.*;
import org.hl7.fhir.model.String;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import java.io.File;
import java.io.FileOutputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by mhchowd1 on 8/27/2015.
 */
public class Marshaller {

    @Test
            public void testMarshaller() throws Exception{


        MedicationKind kv = new MedicationKind();
        kv.setValue(MedicationKindList.fromValue("product"));
        org.hl7.fhir.model.Boolean bool = new Boolean();
        bool.setValue(false);
        org.hl7.fhir.model.String disp = new String();
        disp.setValue("Paracetamol");
        Coding code = new Coding();
        code.setDisplay(disp);
        Code co = new Code();
        co.setValue("420420");
        code.setCode(co);

        CodeableConcept cod = new CodeableConcept();
        cod.getCodings().add(code);
        Medication med = new Medication();
        med.setCode(cod);
        med.setIsBrand(bool);
        med.setKind(kv);

        FileOutputStream fil = new FileOutputStream(new File("med_output.xml"));

        JAXBContext jb = JAXBContext.newInstance(Medication.class.getPackage().getName());
        javax.xml.bind.Marshaller marsh = jb.createMarshaller();
        marsh.marshal(med,fil);
        marsh.marshal(med,System.out);

        javax.xml.bind.Unmarshaller unmarsh = jb.createUnmarshaller();
        File ins = new File("med_output.xml");
        Medication med1= (Medication) unmarsh.unmarshal(ins);
        assertEquals(med.getIsBrand().isValue(),med1.getIsBrand().isValue());

        System.out.println("   ");
        System.out.println("   ");
        System.out.println(med1.getCode().getCodings().get(0).getDisplay().getValue());






    }
}
