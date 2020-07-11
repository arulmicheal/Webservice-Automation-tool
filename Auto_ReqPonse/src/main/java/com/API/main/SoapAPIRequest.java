/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.API.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/**
 *
 * @author arulprak
 */
public class SoapAPIRequest implements API_Request{

    private HttpURLConnection httpConnection;
    private OutputStream outputStream;
    private PrintWriter writer;
    private String strResponse = "";

    @Override
    public void sendRequest(String strRequestUrl, String strMethod, String strRequestBody,
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

    @Override
    public void sendGET()
            throws Exception {
        httpConnection.setDoOutput(false);
    }
    @Override
    public void sendPOST(String strRequestBody)
            throws Exception {
        httpConnection.setDoOutput(true);
        outputStream = httpConnection.getOutputStream();
        outputStream.write(strRequestBody.getBytes());
        outputStream.close();
        outputStream.flush();
    }
    @Override
    public String getResponse()
    {
        return strResponse;
    }
    @Override
    public void setResponse() throws Exception {
        //Checking server return status code
        int status = httpConnection.getResponseCode();
        StringBuilder sb= new StringBuilder();
        String strLine;
        if (status == HttpURLConnection.HTTP_OK) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpConnection.getInputStream()))) {
                while ((strLine=reader.readLine()) != null) {
                    sb.append(strLine);
                }
            }
            httpConnection.disconnect();
        } else {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpConnection.getErrorStream()))) {
                while ((strLine=reader.readLine()) != null) {
                    sb.append(strLine);
                }
            }
        }
        strResponse = sb.toString();
    }
}
