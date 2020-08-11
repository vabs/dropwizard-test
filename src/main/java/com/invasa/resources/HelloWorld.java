package com.invasa.resources;

import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class HelloWorld {

    @GET
    @Timed
    public Response helloWorldResource() {
        return Response.status(Response.Status.OK).entity("this is a result").build();
    }

}
