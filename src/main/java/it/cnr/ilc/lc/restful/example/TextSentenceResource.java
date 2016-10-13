/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example;

import it.cnr.ilc.lc.restful.example.model.Text;
import it.cnr.ilc.lc.restful.example.model.TextSentence;
import it.cnr.ilc.lc.restful.example.model.junkDB.DB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author angelo
 */
public class TextSentenceResource {

    private static Logger logger = LogManager.getLogger(TextSentenceResource.class);
    TextSentence text;

    private TextSentenceResource(String name) {
        this.text = DB.getInstance().getText(name);
    }

    static TextSentenceResource get(String name) {
        return new TextSentenceResource(name);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TextSentence getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        logger.info("getText");
        return this.text;
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

    @Path("{name}")
    public SentenceResource getSentenceResource(@PathParam("name") String name) {
        logger.info("getSentence");
        logger.info(name);
        return SentenceResource.get(name);

    }

}
