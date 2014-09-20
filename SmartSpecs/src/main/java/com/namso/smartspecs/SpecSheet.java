package com.namso.smartspecs;

/**
 * Created by Kamal on 15/09/2014.
 */

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by Kamal on 14/09/2014.
 */
public class SpecSheet {

    Boolean loaded = false, first = false, last = false, save = false;
    String model, spec, url, pTitle, pMessage;
    String[] specSheet;
    TextView textView;
    ProgressBar progressBar = null;
    ProgressDialog progressDialog = null;
    Document doc;
    Context context;


    public SpecSheet (String model, Boolean save, Context context) {
        this.context = context;
        this.save = save;
        this.model = model;
        this.model = this.model.replaceAll("\\s","+");
        url = "http://www.google.com/search?&sourceid=navclient&btnI=I&q=gsmarena+" + this.model;
    }

    //Methods that fill a text view with your required specifications
    //Allow you to send in progress bar or progress dialog to update while data is being retrieved
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


    //AsyncTask that retrieves the spec sheet from the internet
    private class Specs extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //Checks if progress Dialog or progress bar are being used and sets them accordingly
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

            //Checks if the device details have been previously stored
            File file = context.getFileStreamPath(model);
            if (!file.exists()) {

                //If not already loaded or saved retrieves data
                if (!loaded) {
                    try {
                        doc = Jsoup.connect(url).get();
                        page = doc.select(".nfo, .ttl");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    //Parses the data into an string array
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

                    //Saves array to file if requested
                    if (save && loaded) {
                        String FILENAME = model;
                        try {
                            FileOutputStream fOut = context.openFileOutput(FILENAME, context.MODE_APPEND);
                            ObjectOutputStream oos = new ObjectOutputStream(fOut);
                            oos.writeObject(specSheet);
                            oos.close();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }catch(IOException e){
                            e.printStackTrace();
                        }

                    }
                }
            } else {
                //Retrieves string array from file if save already
                String FILENAME = model;
                try {
                    FileInputStream fIn = context.openFileInput(FILENAME);
                    ObjectInputStream ois = new ObjectInputStream(fIn);
                    specSheet = (String[]) ois.readObject();
                    ois.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            Boolean found = false;
            int i = 0;
            String value = "N/A";

            //Searches string array for required specification
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

            //Sets textview to the required value
            textView.setText(value);

            //Changes state of any progress bars
            if (progressDialog != null){
                progressDialog.dismiss();
            } else if (progressBar != null){
                progressBar.setVisibility(View.INVISIBLE);
            }
        }
    }

}



