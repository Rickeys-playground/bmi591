package org.rickey.playground.tesst.api;

import org.hl7.fhir.model.Patient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by mhchowd1 on 9/1/2015.
 */
@Path("FHIRService")
public interface FHIRService {
    @Path("Patient/{pid}")
    @GET
    @Produces({"application/xml"})
    Patient getPatient( @PathParam("pid") String pid);
}
