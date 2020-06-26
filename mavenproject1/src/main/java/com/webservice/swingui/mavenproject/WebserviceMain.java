/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice.swingui.mavenproject;

import com.util.Data.CsvData;

/**
 *
 * @author arulprak
 */
public class WebserviceMain {

    public void batchRequest() throws Exception
    {
        
        System.out.println(CsvData.getData(0, "Endpoint"));
    }
}
