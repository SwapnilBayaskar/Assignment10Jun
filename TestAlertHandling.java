package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.AlertHandling;

public class TestAlertHandling {
	
	private AlertHandling objAlertHandling;
	
	@BeforeMethod
	public void initializeWebEnv() {
		objAlertHandling = new AlertHandling();
		objAlertHandling.initializeBrowser("https://demoqa.com/alerts");
	}
	
	@AfterMethod
	public void tearDown() {
		objAlertHandling.tearDown();
	}
	
	@Test(priority = 1)
	public void TC_001_VerifyPromptAlertFunctionality() {		
				
		//objAlertHandling.getSimpleAlert();
		//objAlertHandling.getConfirmationAlert();
		objAlertHandling.getPromptAlert();
		
		objAlertHandling.printAlertMessage();
		objAlertHandling.sendTextToAlert();
		
		objAlertHandling.acceptAlert();
		//objAlertHandling.dismissAlert();
	}
	
	@Test(priority = 0)
	public void TC_002_VerifySimpleAlertFunctionality() {
		objAlertHandling.getSimpleAlert();
		objAlertHandling.printAlertMessage();
		objAlertHandling.acceptAlert();
	}
	
	@Test(priority = 2)
	public void TC_003_VerifyConfirmationAlertFunctionality() {
		objAlertHandling.getConfirmationAlert();
		objAlertHandling.printAlertMessage();
		objAlertHandling.acceptAlert();
	}

}
