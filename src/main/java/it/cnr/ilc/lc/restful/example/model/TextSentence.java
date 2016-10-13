/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angelo
 */
public class TextSentence {

    Sentence[] sentences;

    private TextSentence() {
    }

    private TextSentence(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public static TextSentence of(Sentence[] sentences) {
        return new TextSentence(sentences);
    }

    public static TextSentence of(String... sentences) {
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

}
