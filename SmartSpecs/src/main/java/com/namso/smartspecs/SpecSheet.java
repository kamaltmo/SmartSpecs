package com.namso.smartspecs;

/**
 * Created by Kamal on 15/09/2014.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Kamal on 14/09/2014.
 */
public class SpecSheet {
    private  String model;
    private  String test;

    public SpecSheet (String model) {
        this.model = model;
        getSpecs();
    }

    private void getSpecs() {
        //Replace any spaces in model names with a '+'
        model = model.replaceAll("\\s","+");
        Document doc = null;

        String url = "http://www.google.com/search?&sourceid=navclient&btnI=I&q=gsmarena+" + model;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements specs = doc.select(".nfo, .ttl");
        test = specs.text();

    }

    public String getTest() {
        return test;
    }
}
