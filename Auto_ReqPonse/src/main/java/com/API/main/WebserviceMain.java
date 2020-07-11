/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.API.main;

import com.API.reports.ExtentReport.Reporter;
import com.API.swingui.BatchExecution;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arulprak
 */
public class WebserviceMain {
public static Reporter report=new Reporter();
public static Response response;
public API_Request request;
    public void sendRequest(String strEndpoint, String strMethod, String strRequestBody, 
            HashMap<String,String> mapHeaders, HashMap<String,String> mapParams) throws Exception
    {
        report.startTest(strEndpoint);
        try
        {
            request= new RestAPIRequest();
            //Sending request
            request.sendRequest(strEndpoint, strMethod, strRequestBody, mapHeaders, mapParams);
            
        }catch(Exception ex)
        {
            Logger.getLogger(WebserviceMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sendSOAPRequest(String strEndpoint, String strMethod, String strRequestBody, 
            HashMap<String,String> mapHeaders, HashMap<String,String> mapParams) throws Exception
    {
        report.startTest(strEndpoint);
        try
        {
            request= new SoapAPIRequest();
            //Sending request
            request.sendRequest(strEndpoint, strMethod, strRequestBody, mapHeaders, mapParams);
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void batchRequest(String strEndpoint, String strMethod) throws Exception
    {
        report.startTest(strEndpoint);
        try
        {
            //Getting Endpoint URL
            RestAssured.baseURI = strEndpoint;
            // specified in the above step.
            RequestSpecification httpRequest = RestAssured.given();
            response =null;
            //Setting Request Method and sending request
            switch (strMethod.toLowerCase()) 
            {
                case "get":
                    response= httpRequest.request(Method.GET);
                    break;
                case "post":
                    response= httpRequest.request(Method.POST);
                case "put":
                    response=httpRequest.request(Method.PUT);
                case "delete":
                    response=httpRequest.request(Method.DELETE);
                default:
                    response=httpRequest.request(Method.GET);
            };
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
