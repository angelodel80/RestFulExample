/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example;

import it.cnr.ilc.lc.restful.example.model.Corpus;
import it.cnr.ilc.lc.restful.example.model.Text;
import it.cnr.ilc.lc.restful.example.model.junkDB.GenerateCorpora;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
@Path("/corpora")
public class CorporaResource {

    public static Logger logger = LogManager.getLogger(CorporaResource.class);

    @Context
    private UriInfo context;

    //@Path("get")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Corpus> getAllCorpora() throws Exception {
        logger.info("call to the method");

        List<Corpus> corpora;

        corpora = GenerateCorpora.generate();

        logger.info("getAllCorpora(): found " + corpora.size() + " corpora(s) on DB");

//        for (Corpus corpus : corpsora) {
//            logger.info(corpus.toString());
//            for (Text t : corpus.getTexts()) {
//                logger.info(t.getContent());
//            }
//        }
        return corpora; //do not use Response object because this causes issues when generating XML automatically
        //return "{\"c\":\"ok\"}";
    }

//    public class PersonResource {
//
//        public Person getPerson() {
//
//            Person p = new Person();
//            p.setFirstName("Nabi");
//            p.setLastName("Zamani");
//            //p.setDateOfBirth("01.01.2012");
//
//            p.setCitizenships(new String[]{"German", "Persian"});
//
//            Map<String, Object> creditCards = new HashMap<String, Object>();
//            creditCards.put("MasterCard", "1234 1234 1234 1234");
//            creditCards.put("Visa", "1234 1234 1234 1234");
//            creditCards.put("dummy", true);
//            p.setCreditCards(creditCards);
//
//            System.out.println("REST call...");
//
//            //return Response.ok().entity(p).build();
//            return p;
//        }
//
//        @POST
//        @Consumes({MediaType.APPLICATION_JSON})
//        @Produces({MediaType.TEXT_PLAIN})
//        @Path("/post")
//        public String postPerson(Person pers) throws Exception {
//
//            System.out.println("First Name = " + pers.getFirstName());
//            System.out.println("Last Name  = " + pers.getLastName());
//
//            return "ok";
//        }
//
//    }
//
//    @POST
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces({MediaType.TEXT_PLAIN})
//    @Path("/post")
//    public String postMessage(Message msg) throws Exception {
//
//        System.out.println("First Name = " + msg.getFirstName());
//        System.out.println("Last Name  = " + msg.getLastName());
//
//        return "ok";
//    }
}
