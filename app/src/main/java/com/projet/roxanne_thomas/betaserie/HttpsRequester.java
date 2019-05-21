package com.projet.roxanne_thomas.betaserie;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpsRequester  {

    protected final String https_url;

    public HttpsRequester(String url) { this.https_url = url; }

    public void get() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL(https_url);
                    HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
                    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String input;
                    while((input = br.readLine()) != null) {
                        System.out.println(input);
                    }
                    br.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    public void post() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL(https_url);
                    HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
                    con.setRequestMethod("POST");
                    con.setDoOutput(true);
                    con.connect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
