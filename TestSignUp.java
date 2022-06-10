package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.UtilitiesClass;
import com.FacebookPage.FacebookSignUpPage;

public class TestSignUp extends UtilitiesClass{
	
	private FacebookSignUpPage objFacebookSignUp;
	
	@BeforeClass
	public void initializationMethod() {
		objFacebookSignUp = new FacebookSignUpPage();
		objFacebookSignUp.initializeBrowser();
		objFacebookSignUp.openFacebookURL();
	}
	
	@Test(priority = 0)
	public void TC_001_VerifyFacebookSignUpFunctionality() {
				
		objFacebookSignUp.setFirstName(getFirstname());
		objFacebookSignUp.setLastName(getSurname());
		objFacebookSignUp.setMobile(getMobileNumber(8));
		//objFacebookSignUp.setConfirmMobile(getMobileNumber(8));
		objFacebookSignUp.setPassword();
		objFacebookSignUp.setDay(getDay());
		objFacebookSignUp.setMonth(getMonth());
		objFacebookSignUp.setYear(getYear());
		objFacebookSignUp.setGender(getGender());
				
	}
	
	@Test(priority = 1)
	public void TC_002_VerifySignUpPageLinksFunctionality() {
		objFacebookSignUp.clickOnTermsLink();
		objFacebookSignUp.clickOnDataPolicy();
		objFacebookSignUp.clickOnCookiePolicy();
	}
	
	@AfterClass
	public void tearDownMethod() {
		objFacebookSignUp.closeBrowser();
	}

}
