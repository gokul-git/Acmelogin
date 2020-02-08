package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.HomePage;
import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_LoginLogOut extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login testCase using kumar.testleaf@gmail.com UserName and LogOut";
		nodes = "acmeslogincheck";
		authors = "Gokul";
		category = "Smoke";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd) throws InterruptedException {
		new LoginPage(driver, node, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();
		new HomePage(driver, node, test)
		.Verifytitle();
		
//		.clickLogout();		
	}


}





