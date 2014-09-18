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
    Boolean loaded, first, last = false;
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

    public void setWifi(TextView view) {
        textView = view;
        spec = "WLAN";
        first = true;
        new Specs().execute();
    }

    public void setWifi(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "WLAN";
        first = true;
        new Specs().execute();
    }

    public void setWifi(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "WLAN";
        first = true;
        new Specs().execute();
    }

    public void setCamera(TextView view) {
        textView = view;
        spec = "Primary";
        first = true;
        new Specs().execute();
    }

    public void setCamera(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "Primary";
        first = true;
        new Specs().execute();
    }

    public void setCamera(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "Primary";
        first = true;
        new Specs().execute();
    }

    public void setBluetooth(TextView view) {
        textView = view;
        spec = "Bluetooth";
        new Specs().execute();
    }

    public void setBluetooth(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "Bluetooth";
        new Specs().execute();
    }

    public void setBluetooth(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "Bluetooth";
        new Specs().execute();
    }

    public void setNFC(TextView view) {
        textView = view;
        spec = "NFC";
        new Specs().execute();
    }

    public void setNFC(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "NFC";
        new Specs().execute();
    }

    public void setNFC(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "NFC";
        new Specs().execute();
    }

    public void setDisplay(TextView view) {
        textView = view;
        spec = "Size";
        new Specs().execute();
    }

    public void setDisplay(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "Size";
        new Specs().execute();
    }

    public void setDisplay(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "Size";
        new Specs().execute();
    }

    public void setRam(TextView view) {
        textView = view;
        spec = "Internal";
        last = true;
        new Specs().execute();
    }

    public void setRam(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "Internal";
        last = true;
        new Specs().execute();
    }

    public void setRam(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "Internal";
        last = true;
        new Specs().execute();
    }

    public void setOS(TextView view) {
        textView = view;
        spec = "OS";
        new Specs().execute();
    }

    public void setOS(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "OS";
        new Specs().execute();
    }

    public void setOS(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "OS";
        new Specs().execute();
    }

    public void setChipset(TextView view) {
        textView = view;
        spec = "Chipset";
        new Specs().execute();
    }

    public void setChipset(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "Chipset";
        new Specs().execute();
    }

    public void setChipset(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "Chipset";
        new Specs().execute();
    }

    public void setGpu(TextView view) {
        textView = view;
        spec = "GPU";
        new Specs().execute();
    }

    public void setGpu(TextView view, ProgressBar pBar) {
        textView = view;
        progressBar = pBar;
        spec = "GPU";
        new Specs().execute();
    }

    public void setGPU(TextView view, ProgressDialog pDialog, String pTitle, String pMessage) {
        textView = view;
        progressDialog = pDialog;
        this.pTitle = pTitle;
        this.pMessage = pMessage;
        spec = "GPU";
        new Specs().execute();
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


                if (page != null) {
                    specSheet = new String[page.size()];
                    for (int i = 0; i < page.size(); i++) {
                        specSheet[i] = page.get(i).text();
                    }
                    loaded = true;
                } else {
                    specSheet = new String[1];
                    specSheet[0] = "N/A";
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            Boolean found = false;
            int i = 0;
            String value = "N/A";

            while (!found) {
                if (specSheet[i].equals(spec)) {
                    value = specSheet[i+1];
                    found = true;
                } else if ( i == specSheet.length - 2 || (specSheet.length - 2 <= 0) ) {
                    break;
                } else {
                    i = i + 1;
                }
            }

            if (last) {
                value = value.replaceAll("^(.*), ", "");
                last = false;
            } else if (first) {
                value = value.replace(",(.*)", "");
                first = false;
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



