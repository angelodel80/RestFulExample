/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author angelo
 */
public class ItemClientResource {

    private String name;

    /**
     * Creates a new instance of ItemClientResource
     */
    private ItemClientResource(String name) {
        this.name = name;
    }

    /**
     * Get instance of the ItemClientResource
     */
    public static ItemClientResource getInstance(String name) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of ItemClientResource class.
        return new ItemClientResource(name);
    }

    /**
     * Retrieves representation of an instance of it.cnr.ilc.lc.restful.example.ItemClientResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ItemClientResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource ItemClientResource
     */
    @DELETE
    public void delete() {
    }
}
