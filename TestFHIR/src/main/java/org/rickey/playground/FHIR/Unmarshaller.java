package org.rickey.playground.FHIR;

import org.hl7.fhir.model.Medication;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Created by mhchowd1 on 8/27/2015.
 */
public class Unmarshaller {

    @Test
    public void testUnmarshaller() throws Exception{

        JAXBContext con = JAXBContext.newInstance(Medication.class.getPackage().getName());
        javax.xml.bind.Unmarshaller unmarsh = con.createUnmarshaller();

        File file = new File("src/main/resources/medication.xml");
        Medication medic = (Medication) unmarsh.unmarshal(file);

        System.out.println(medic.getCode().getCodings().get(0).getCode().getValue());
        System.out.println(medic.getIsBrand().isValue());
        System.out.println(medic.getProduct().getForm().getCodings().get(0).getDisplay().getValue());

        assertEquals(medic.getCode().getCodings().get(0).getCode().getValue(),"323418000");
    }
}
