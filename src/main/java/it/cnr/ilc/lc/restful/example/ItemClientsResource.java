/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author angelo
 */
@Path("/itemCs")
public class ItemClientsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ItemClientsResource
     */
    public ItemClientsResource() {
    }

    /**
     * Retrieves representation of an instance of it.cnr.ilc.lc.restful.example.ItemClientsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * Sub-resource locator method for {name}
     */
    @Path("{name}")
    public ItemClientResource getItemClientResource(@PathParam("name") String name) {
        return ItemClientResource.getInstance(name);
    }
}
