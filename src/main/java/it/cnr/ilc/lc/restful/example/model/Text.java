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
public class Text {

    String content;

    private Text() {
    }

    private Text(String cont) {
        init(cont);
    }

    private void init(String cont) {
        this.content = cont;
    }

    static public Text of(String content) {
        return new Text(content);
    }

    public String getContent() {
        return content;
    }
}
