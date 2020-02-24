package com.service;

import com.model.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserName {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String isOk(User user){
        if ("OK".equals(user.getCondition()) || "OK".equals(user.getCondition())){
            return "temporalkey";
        }
        else{
            return "Something got wrong";
        }
    }
}
