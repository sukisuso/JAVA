package com.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.model.Person;

@Path("/postservice")
public class PostService {
	  
	  @POST
	  @Consumes(MediaType.APPLICATION_JSON)
	  public Response convertFtoC(Person person) throws JSONException {
 
		String result = "Post Service pp equal : " +person.toString() ;
		return Response.status(200).entity(result).build();
	  }
}
