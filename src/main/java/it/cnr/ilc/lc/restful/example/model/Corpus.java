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
public class Corpus {

    Text[] texts;

    private Corpus() {
        texts = null;
    }

    private Corpus(Text[] texts) {
        init(texts);
    }

    private void init(Text[] txs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.texts = txs;
    }

    static public Corpus of(Text[] txs) {
        return new Corpus(txs);
    }

    public Text[] getTexts() {
        return texts;
    }

}
