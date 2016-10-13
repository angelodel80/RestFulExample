/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example.model;

/**
 *
 * @author angelo
 */
public class Sentence {

    String content;

    private Sentence() {
    }

    private Sentence(String content) {
        this.content = content;
    }

    public static Sentence of(String content) {
        return new Sentence(content);
    }

    public String getContent() {
        return content;
    }

}