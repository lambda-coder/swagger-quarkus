package com.lambdacoder;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/hello")
@Tag(name = "Example Greeting resource", description = "This is an example GreetingResource")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}
