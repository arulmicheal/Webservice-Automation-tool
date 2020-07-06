/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice;

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
import org.apache.http.HttpClientConnection;
import org.apache.http.impl.DefaultBHttpClientConnection;

/**
 *
 * @author arulprak
 */
public class RestWebserviceResponse {

    private static final String LINE_FEED = "\r\n";
    private HttpURLConnection httpConnection;
    private OutputStream outputStream;
    private PrintWriter writer;
    private String response = "";

    /**
     * This constructor initializes a new HTTP POST request with content type is set to
     * multipart/form-data.
     *
     * @param requestURL
     * @param charset
     * @throws IOException
     */
    public void httpRequest(String strRequestUrl, String strMethod, String strRequestBody)
            throws Exception {
        URL url = new URL(strRequestUrl);
        httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.setDoInput(true);
        httpConnection.setRequestProperty("Content-Type",
                "application/json");
        sendPOST(strRequestBody);

    }

    public void sendPOST(String strRequestBody)
            throws Exception {
        httpConnection.setDoOutput(true);
        outputStream = httpConnection.getOutputStream();
        outputStream.write(strRequestBody.getBytes());
        outputStream.close();
        outputStream.flush();
    }

    public void response() throws IOException {
        //Checking server return status code
        int status = httpConnection.getResponseCode();
        if (status == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpConnection.getInputStream()));
            while (reader.readLine() != null) {
            }
            reader.close();
            httpConnection.disconnect();
        } else {
            throw new IOException("Server returned non-OK status: " + status);
        }
    }
}
