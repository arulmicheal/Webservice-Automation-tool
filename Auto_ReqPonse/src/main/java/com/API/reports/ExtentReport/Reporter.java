package com.API.reports.ExtentReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {

	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest test, suiteTest;
	public String testCaseName, testNodes, testDescription, category, authors;


	public void startReport() {
		html = new ExtentHtmlReporter("./reports/result.html");
		extent = new ExtentReports();		
		extent.attachReporter(html);
	}


	public void startTest(String testCaseName) {
		test = extent.createTest(testCaseName);
	}



	public ExtentTest startTestCase(String testNodes) {
		test = 	suiteTest.createNode(testNodes);
		return test;
	}

	//public abstract long takeScreenshot();

/**
 * Step report for the execution
 * @param desc description of the step
 * @param status status of the step
 * @param bSnap boolean to confirm to take screenshot or not
 */
	public void reportStep(String desc, String status, boolean bSnap)  {

		//MediaEntityModelProvider img = null;
		/*if(bSnap && !status.equalsIgnoreCase("INFO")){

			long snapNumber = 100000L;
			snapNumber = takeScreenshot();
			try {
				img = MediaEntityBuilder.createScreenCaptureFromPath
						("./../reports/images/"+snapNumber+".jpg").build();
			} catch (IOException e) {				
			}
		}*/
		if(status.equalsIgnoreCase("PASS")) {
			test.pass(desc);			
		}else if (status.equalsIgnoreCase("FAIL")) {
			test.fail(desc);
			throw new RuntimeException();
		}else if (status.equalsIgnoreCase("WARNING")) {
			test.warning(desc);
		}else if (status.equalsIgnoreCase("INFO")) {
			test.info(desc);
		}						
	}

	/**
	 * Step report for the execution
	 * @param desc description of the step
	 * @param status status of the step
	 */
	public void reportStep(String desc, String status) {
		reportStep(desc, status, true);
	}

	public void endResult() {
		extent.flush();
	}	

}
