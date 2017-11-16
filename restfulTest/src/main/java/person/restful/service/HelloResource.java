package person.restful.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import person.restful.pojo.User;

@Path("/hello")  
public class HelloResource {  
    @GET
    @Produces(MediaType.TEXT_PLAIN)  
    public String sayHello() {  
        return "Hello World!" ;  
    }  
   
      
    @GET  
    @Path("/{param}")    
    @Produces("text/plain;charset=UTF-8")  
    public String sayHelloToUTF8(@PathParam("param") String username) {  
        return "Hello " + username;  
    }  
    
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public User sayRestfull(@QueryParam("username") String username){
    	User user = new User();
    	user.name = username;
    	return user;
    }
      
} 