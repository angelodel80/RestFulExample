package it.cnr.ilc.lc.restful.example;

import it.cnr.ilc.lc.restful.example.model.Sentence;
import it.cnr.ilc.lc.restful.example.model.junkDB.DB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author angelo
 */
public class SentenceResource {

    private static Logger logger = LogManager.getLogger(TextSentenceResource.class);
    Sentence sentence;

    private SentenceResource(String name) {
        this.sentence = DB.getInstance().getText(name).getSentence(Integer.parseInt(name));
    }

    static SentenceResource get(String name) {
        return new SentenceResource(name);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Sentence getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        logger.info("getSentence");
        return this.sentence;
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
