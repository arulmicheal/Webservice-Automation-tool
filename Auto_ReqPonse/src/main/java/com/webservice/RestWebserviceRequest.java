/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice;

import static com.webservice.WebserviceMain.response;
import io.restassured.http.Method;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import org.apache.http.HttpClientConnection;
import org.apache.http.impl.DefaultBHttpClientConnection;

/**
 *
 * @author arulprak
 */
public class RestWebserviceRequest {

    private static final String LINE_FEED = "\r\n";
    private HttpURLConnection httpConnection;
    private OutputStream outputStream;
    private PrintWriter writer;
    private String strResponse = "";

    public void httpRequest(String strRequestUrl, String strMethod, String strRequestBody,
    HashMap<String,String> mapHeaders, HashMap<String,String> mapParams) throws Exception {
        URL url = new URL(strRequestUrl);
        httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.setDoInput(true);
        httpConnection.setRequestProperty("Content-Type",
                "application/json");
        switch (strMethod.toLowerCase()) 
            {
                case "get":
                    sendGET();
                    break;
                default:
                    sendPOST(strRequestBody);
            };
        setResponse();
    }

    private void sendGET()
            throws Exception {
        httpConnection.setDoOutput(false);
    }
    private void sendPOST(String strRequestBody)
            throws Exception {
        httpConnection.setDoOutput(true);
        outputStream = httpConnection.getOutputStream();
        outputStream.write(strRequestBody.getBytes());
        outputStream.close();
        outputStream.flush();
    }
    public String getResponse()
    {
        return strResponse;
    }
    private void setResponse() throws Exception {
        //Checking server return status code
        int status = httpConnection.getResponseCode();
        StringBuilder sb= new StringBuilder();
        String strLine="";
        if (status == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpConnection.getInputStream()));
            
            while ((strLine=reader.readLine()) != null) {
                sb.append(strLine);
            }
            reader.close();
            httpConnection.disconnect();
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpConnection.getErrorStream()));
            while ((strLine=reader.readLine()) != null) {
                sb.append(strLine);
            }
            reader.close();
        }
        strResponse = strResponse; sb.toString();
    }
}
