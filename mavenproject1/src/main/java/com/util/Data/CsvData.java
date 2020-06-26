/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arulprak
 */
public class CsvData {
    public static List<ConcurrentHashMap<String, String>> listOfData = new LinkedList<>();
    /**
     * Reads data from CSV file and stores in list of Maps
     * @param strFilePath
     * @throws Exception 
     */
    public static void setData(String strFilePath) throws Exception
    {
        listOfData = new LinkedList<>();
        getDataFromCsv(strFilePath);
    }
    /**
     * Get particular cell value from CSV data
     * @param iRowNum
     * @param strColumnName
     * @return String
     * @throws Exception 
     */
    public static String getData(int iRowNum, String strColumnName) throws Exception
    {
        return listOfData.get(iRowNum).get(strColumnName);
    }
    /**
     * Reads data from CSV file
     * @param strFilePath
     * @return List<ConcurrentHashMap<String, String>>
     * @throws Exception 
     */
    public static List<ConcurrentHashMap<String, String>> getDataFromCsv(String strFilePath) throws Exception {
        try {
            File fileCsv = new File(strFilePath);
            if (fileCsv.exists() && fileCsv.isFile()) {
                FileReader readerFile = new FileReader(fileCsv);
                BufferedReader bufferFile = new BufferedReader(readerFile);
                String strLine = "";
                ConcurrentHashMap<String, String> hashMapCsv = new ConcurrentHashMap<String, String>();
                List<String> listOfHeaders = new ArrayList();

                int iCount = 0;
                while ((strLine = bufferFile.readLine()) != null) {
                    String[] arrOfValues = strLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    if (iCount == 0) {
                        for (String strEach : arrOfValues) {
                            listOfHeaders.add(strEach);
                        }
                        iCount++;
                        continue;
                    }
                    hashMapCsv = new ConcurrentHashMap<>();
                    for (int iValues = 0; iValues < arrOfValues.length; iValues++) {
                        hashMapCsv.put(listOfHeaders.get(iValues), arrOfValues[iValues]);
                    }
                    listOfData.add(hashMapCsv);
                    iCount++;
                }
            }
        } catch (Exception ex) {
            throw new Exception(ex);
        }
        return listOfData;
    }

}
