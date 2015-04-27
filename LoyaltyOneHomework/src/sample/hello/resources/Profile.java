package sample.hello.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

//The Java class will be hosted at the URI path "/profile"
@Path("/profile/{userName}")
public class Profile {
 
 // The Java method will process HTTP GET requests
 @GET
 @Produces("text/plain")
 public String getText(@PathParam("userName") String userID) {
     // Return path param (userName)
     return userID;
 }
}