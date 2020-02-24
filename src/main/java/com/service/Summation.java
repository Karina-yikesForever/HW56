package com.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/summation")
public class Summation{

    @GET
    @Produces (MediaType.TEXT_PLAIN)
    @Path("/summation/{intA}&{intB}")
    public String getSummation(@PathParam("intA") Integer a,
                               @PathParam("intB") Integer b){
        return a+b+ " ";
    }
}
