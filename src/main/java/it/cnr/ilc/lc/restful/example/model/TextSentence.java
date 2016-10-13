/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example.model;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author angelo
 */
public class TextSentence {

    private static Logger logger = LogManager.getLogger(TextSentence.class);

    Sentence[] sentences;

    private TextSentence() {
    }

    private TextSentence(Sentence[] sentences) {
        logger.info("TextSentence constructor");
        logger.info("sentences lenght" + sentences.length);
        this.sentences = sentences;
    }

    public static TextSentence of(Sentence[] sentences) {
        return new TextSentence(sentences);
    }

    public static TextSentence of(String... sentences) {
        logger.info("TextSentence of");
        List<Sentence> sents = new ArrayList<>();
        for (String sentence : sentences) {
            sents.add(Sentence.of(sentence));
        }
        return new TextSentence(sents.toArray(new Sentence[1]));
    }

    public Sentence getSentence(int i) {
        return sentences[i];
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.getContent());
            sb.append("; ");
        }
        return sb.toString();
    }

}
