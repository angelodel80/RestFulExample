package it.cnr.ilc.lc.restful.example;

import it.cnr.ilc.lc.restful.example.model.Text;
import it.cnr.ilc.lc.restful.example.model.Corpus;
import it.cnr.ilc.lc.restful.example.model.junkDB.GenerateCorpora;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
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
@Path("/texts")
public class TextsResource {
    
    private static Logger logger = LogManager.getLogger(TextsResource.class);
    
    @Context
    private UriInfo context;
    
    public TextsResource() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Text> getAllTexts() {
        logger.info("getAll");
        List<Corpus> corpora = GenerateCorpora.generate();
        List<Text> texts = new ArrayList<>();
        for (Corpus c : corpora) {
            for (Text text : c.getTexts()) {
                texts.add(text);
            }
        }
        return texts;
    }
    
    @Path("{uri}")
    public TextResource getTextResource(@PathParam("uri") String uri) {
        logger.info("getTextResource");
        logger.info(uri);
        return TextResource.getInstance(uri);
    }
    
}
