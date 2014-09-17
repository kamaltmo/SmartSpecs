package com.namso.smartspecs;

/**
 * Created by Kamal on 15/09/2014.
 */

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Kamal on 14/09/2014.
 */
public class SpecSheet {
    Boolean loaded = false;
    String model, spec, url, pTitle, pMessage;
    String[] specSheet;
    TextView textView;
    ProgressBar progressBar = null;
    ProgressDialog progressDialog = null;
    Document doc;


    public SpecSheet (String model) {
        this.model = model;
        this.model = this.model.replaceAll("\\s","+");
        url = "http://www.google.com/search?&sourceid=navclient&btnI=I&q=gsmarena+" + this.model;
    }

    public void setCpu(TextView view) {
        textView = view;
        spec = "CPU";
        new Specs().execute();
    }

    public void setCpu(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "CPU";
        new Specs().execute();
    }

    public void setCpu(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "CPU";
        new Specs().execute();
    }


    private class Specs extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            if (progressDialog != null) {
                progressDialog.setTitle(pTitle);
                progressDialog.setMessage(pMessage);
                progressDialog.setIndeterminate(false);
                progressDialog.show();
            } else if (progressBar != null) {
                progressBar.setVisibility(View.VISIBLE);
            }
        }

        @Override
        protected Void doInBackground(Void ...params){
            Elements page = null;
            if (!loaded) {
                try {
                    doc = Jsoup.connect(url).get();
                    page = doc.select(".nfo, .ttl");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                specSheet = new String[page.size()];

                for (int i = 0; i < page.size(); i++) {
                    specSheet[i] = page.get(i).text();
                }
                loaded = true;
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            Boolean found = false;
            int i = 0;
            String value = "";

            while (!found) {
                if (specSheet[i].equals(spec)) {
                    value = specSheet[i+1];
                    found = true;
                } else if ( i == specSheet.length - 2) {
                    break;
                } else {
                    i = i + 1;
                }
            }

            textView.setText(value);

            if (progressDialog != null){
                progressDialog.dismiss();
            } else if (progressBar != null){
                progressBar.setVisibility(View.INVISIBLE);
            }
        }
    }

}



