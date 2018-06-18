package org.eclipse.microprofile12.jwtauth.jaxrs;

import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("/resource")
@Produces(TEXT_PLAIN)
public class Resource {
    
    //@Inject
    //private Principal principal;

   /* @Inject
    JsonWebToken callerPrincipal;*/
    
    @GET
    @Path("/protected")
    @RolesAllowed("architect")
    public String protectedResource() {
        /*return
            "This is a protected resource \n" +
            //"web username: " + principal.getName() + "\n";
                 //   "web username: " + callerPrincipal.getName() + "\n";*/
        return "";
    }
    
    @GET
    @Path("public")
    @Operation(summary = "Finds Pets by status",
            description = "Multiple status values can be provided with comma separated strings")
    public String publicResource() {
        /*return
            "This is a public resource \n" +
            //"web username: " + principal.getName() + "\n";
                    "web username: " + callerPrincipal.getName() + "\n";*/
        return "";
    }

}
