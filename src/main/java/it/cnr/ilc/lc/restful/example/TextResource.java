/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example;

import it.cnr.ilc.lc.restful.example.model.Text;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author angelo
 */
public class TextResource {

    private static Logger logger = LogManager.getLogger(TextResource.class);

    String uri;

    private TextResource(String uri) {
        this.uri = uri;
    }

    public static TextResource getInstance(String uri) {
        return new TextResource(uri);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Text getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        logger.info("getText");
        return Text.of("il contenuto di " + this.uri);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        logger.info("put");
        logger.info(content);
    }

    /**
     * DELETE method for resource ItemResource
     */
    @DELETE
    public void delete() {
        logger.info("delete");
    }
}
