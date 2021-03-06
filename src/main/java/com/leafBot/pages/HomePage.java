package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(RemoteWebDriver driver, ExtentTest node, ExtentTest test) {
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@Given("Verify the Tilte")
	public HomePage Verifytitle() throws InterruptedException {
		Thread.sleep(3000);
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "ACME System 1 - Dashboard";
		if (actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Title is matched");
			
		}
		else {
			System.err.println("Title mismatched");
		}
		return null;
	}
	
	 /* @FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Demo')]]") public
	  WebElement eleLoggedName;
	  
	  public HomePage verifyLoggedName(String data) {
	  verifyPartialText(eleLoggedName, data); return this; }
	  
	  @FindBy(how=How.LINK_TEXT,using="CRM/SFA") public WebElement eleCRMSFALink;
	  
	  public MyHomePage clickCRMSFA(){ click(eleCRMSFALink); return new
	  MyHomePage(driver, node, test); }
	  
	  @FindBy(how=How.CLASS_NAME,using="decorativeSubmit") private WebElement
	  eleLogOut;
	  
	  public LoginPage clickLogout() { click(eleLogOut); return new
	  LoginPage(driver, node, test);*/
	  
	  }
	  
	 
