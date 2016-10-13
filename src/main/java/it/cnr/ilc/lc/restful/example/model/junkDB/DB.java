/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example.model.junkDB;

import it.cnr.ilc.lc.restful.example.model.TextSentence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author angelo
 */
public class DB {

    private static Logger logger = LogManager.getLogger(DB.class);
    static DB instanceDB = null;

    Map<String, TextSentence> db = new HashMap<>();

    private DB() {
    }

    public static DB getInstance() {
        logger.info("getInstance");

        if (instanceDB == null) {
            logger.info("create new DB");
            instanceDB = new DB();
            return instanceDB;
        } else {
            logger.info("return the DB");
            return instanceDB;
        }
    }

    synchronized public DB add(TextSentence text, String name) {
        logger.info("add on DB " + name + " " + text);
        db.put(name, text);
        return this;
    }

    synchronized public DB remouve(String name) {
        db.remove(name);
        return this;
    }

    public List<TextSentence> getAllTexts() {
        return new ArrayList<>(db.values());
    }

    public TextSentence getText(String name) {
        return db.get(name);
    }

}
