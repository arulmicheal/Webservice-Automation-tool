/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.API.main;

import java.util.HashMap;

/**
 *
 * @author praka
 */
public interface API_Request {
     public void sendRequest(String strRequestUrl, String strMethod, String strRequestBody,
    HashMap<String,String> mapHeaders, HashMap<String,String> mapParams) throws Exception;
    public void sendGET() throws Exception;
    public void sendPOST(String strRequestBody)throws Exception;

    /**
     *Returns stored response from last request
     * @return
     * @throws Exception
     */
    public String getResponse() throws Exception;
    public void setResponse() throws Exception;
    
}
