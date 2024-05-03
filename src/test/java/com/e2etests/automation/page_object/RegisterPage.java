package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class RegisterPage {
	
	@FindBy(how = How.LINK_TEXT, using = "Sign Up")
	public static WebElement sinUpButton;
	
	@FindBy(how = How.ID, using = "email")
	public static WebElement emailField;

	@FindBy(how = How.ID, using = "terms")
	public static WebElement termsCase;
	
	@FindBy(how = How.ID, using = "recaptcha-anchor")
	public static WebElement captcha;
	
	@FindBy(how = How.ID, using = "submitButton")
	public static WebElement submitButton;
	
	@FindBy(how = How.TAG_NAME, using = "h2")
	public static WebElement verficationMessage;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Please enter your email address.')]")
	public static WebElement mailMessage;
	
	@FindBy(how = How.TAG_NAME, using = "h2")
	public static WebElement validateMessage;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='account_name']")
	public static WebElement CompanyName ;
	
	@FindBy(how = How.NAME, using = "first_name")
	public static WebElement FirstName ;

	@FindBy(how = How.NAME, using = "last_name")
	public static WebElement LastName ;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement Password ;
	
	@FindBy(how = How.NAME, using = "password_confirm")
	public static WebElement confirmPassword ;
	
	@FindBy(how = How.TAG_NAME, using = "button")
	public static WebElement SignupFinal ;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
	}
}
