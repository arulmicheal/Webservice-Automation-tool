/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice.swingui.mavenproject;

import com.reports.ExtentReport.Reporter;
import com.util.Data.CsvData;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arulprak
 */
public class WebserviceMain {
public static Reporter report=new Reporter();
public static Response response;
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
