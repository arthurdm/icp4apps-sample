package dev.appsody.starter;

import static javax.ws.rs.core.MediaType.TEXT_HTML;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("/")
public class StarterResource {

    @GET
    @Produces(TEXT_HTML)
    public String info() {
        return "Microservice v1.0.1";
    }

}
