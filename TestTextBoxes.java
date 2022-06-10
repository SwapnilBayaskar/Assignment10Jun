package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.TextBoxes;

public class TestTextBoxes {
	
	private TextBoxes objTextBoxes;
	
	@BeforeClass
	public void initializeWebEnv() {
		objTextBoxes = new TextBoxes();
		objTextBoxes.initializeBrowser("https://demoqa.com/text-box");
	}
	
	@AfterClass
	public void tearDown() {
		objTextBoxes.tearDown();
	}
	
	@Test
	public void Test_VerifyTextBoxFunctionality() {
		
	
		objTextBoxes.setFullName("Swapnil Bayaskar");
		objTextBoxes.setEmail("swapnil@gmail.com");
		objTextBoxes.setAddress("404, ABC Heights, Pune, MH-18");
		objTextBoxes.setImplicitWait(5);
		objTextBoxes.setPermanentAddress();
		objTextBoxes.setImplicitWait(5);
		objTextBoxes.clickOnSubmit();

	}

}
