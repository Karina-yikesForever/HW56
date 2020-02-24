package com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.security.Timestamp;
import java.util.Date;

@Path("/hw56")
public class Time {

@GET
@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
public String currentTime(){
return new Date().toString();
}
}
