package org.example.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class DataRestResource {

    @GET
    @Path("/object")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getObject() throws JsonProcessingException {
        DataRequestObject dataRequestObject = new DataRequestObject("Tony", 1, true);
        dataRequestObject.setAdditionalProperty("AdditionalProp", "this is a new value");
        String result = new ObjectMapper().writeValueAsString(dataRequestObject);

        return Response.status(Response.Status.OK).entity(result).build();
    }
}
