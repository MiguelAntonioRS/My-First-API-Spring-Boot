package com.example.apiRest.controllers;

import com.example.apiRest.models.Boot;
import com.example.apiRest.services.BootServices;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootsControllers {
    private final BootServices bootServices;

    public BootsControllers(BootServices bootServices) {
        this.bootServices = bootServices;

        this.bootServices.add(new Boot("Miguel", Math.random()));
        this.bootServices.add(new Boot("Tania", Math.random()));
        this.bootServices.add(new Boot("Alexander", Math.random()));
    }

    @GET
    @Path("/boot")
    @Produces("application/json")
    public List<Boot> listBoot() {
        return bootServices.getAll();
    }

    @GET
    @Path("/boot/{name}")
    @Produces("application/json")
    public Boot listOne(@PathParam("name") String name) {
        return bootServices.getBoot(name);
    }

    @POST
    @Path("/boot")
    @Produces("application/json")
    @Consumes("application/json")
    public Response postBoot(Boot boot) {
        bootServices.add(boot);

        return Response.created(URI.create("/boot/" + boot.getName())).build();
    }
}
