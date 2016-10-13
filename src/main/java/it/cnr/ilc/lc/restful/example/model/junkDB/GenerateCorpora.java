/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.restful.example.model.junkDB;

import it.cnr.ilc.lc.restful.example.model.Corpus;
import it.cnr.ilc.lc.restful.example.model.Text;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angelo
 */
public class GenerateCorpora {

    private GenerateCorpora() {
    }

    static public List<Corpus> generate() {
        List<Corpus> corpora = new ArrayList<>();

        Text tx1 = Text.of("content1");
        Text tx2 = Text.of("content2");
        Text tx3 = Text.of("content3");
        Text tx4 = Text.of("content4");
        Text tx5 = Text.of("content5");
        Text[] txs = new Text[]{tx1, tx2, tx3, tx4, tx5};

        Corpus c1 = Corpus.of(txs);
        corpora.add(c1);

        Text tx6 = Text.of("content6");
        Text tx7 = Text.of("content7");
        Text tx8 = Text.of("content8");
        Text tx9 = Text.of("content9");
        Text tx10 = Text.of("content10");
        Text[] txs2 = new Text[]{tx6, tx7, tx8, tx9, tx10};

        Corpus c2 = Corpus.of(txs2);
        corpora.add(c2);

        return corpora;

    }
}
