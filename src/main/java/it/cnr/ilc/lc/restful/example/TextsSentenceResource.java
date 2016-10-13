/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example;

import it.cnr.ilc.lc.restful.example.model.Sentence;
import it.cnr.ilc.lc.restful.example.model.TextSentence;
import it.cnr.ilc.lc.restful.example.model.junkDB.DB;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
@Path("/TextsSentence")
public class TextsSentenceResource {

    private static Logger logger = LogManager.getLogger(TextsSentenceResource.class);

    public TextsSentenceResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TextSentence> getAllTexts() {
        logger.info("getAllText");
        return DB.getInstance().getAllTexts();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void postJson(String name) {
        DB.getInstance().add(TextSentence.of("ciao", "come stai"), name);
    }

    @Path("{name}")
    public TextSentenceResource getTextSentenceResource(@PathParam("name") String name) {
        logger.info("getTextSentence");
        logger.info(name);
        return TextSentenceResource.get(name);

    }

}
