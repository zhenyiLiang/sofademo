package com.szrcb.ibs.sofawebdemo.endpoint.facade;

import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/sofarest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
public interface SampleRestFacade {
    /**
     * http://localhost:8341/sofarest/hello
     */
    @POST
    @Path("/hello")
    Map<String,Object> hello(@RequestParam Map<String, Object>  dataMap);

    @GET
    @Path("/hello")
    Map<String,Object> hello(@QueryParam(value = "message") String message);

}
