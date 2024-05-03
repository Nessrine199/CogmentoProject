package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_object.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

public class RegisterStepDefinition {

	private RegisterPage registerPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
	}

	@Given("Je me rend sur le site Cogmento")
	public void jeMeRendSurLeSiteCogmento() {
	seleniumUtils.get(configFileReader.getProperties("cogmento.url"));   
	}
	@When("Je clique sur le boutton Sign up")
	public void jeCliqueSurLeBouttonSignUp() {
    seleniumUtils.click(registerPage.sinUpButton);   

	}

	@Then("Je me rederige vers la page Register with email")
	public void jeMeRederigeVersLaPageRegisterWithEmail() {
	validations.assertTrue(registerPage.mailMessage,configFileReader.getProperties("home.message"));
	   
	}
	@When("Je saisie le mail")
	public void jeSaisieLeMail() {
	seleniumUtils.writeText(registerPage.emailField,configFileReader.getProperties("home.email"));	
	}
	@When("Je check le Terms of use")
	public void jeCheckLeTermsOfUse() {
	seleniumUtils.click(registerPage.termsCase);
	    
	}
	@When("Je check le CAPTCHA")
	public void jeCheckLeCAPTCHA() throws InterruptedException {
	Long highWait =  seleniumUtils.getWait("HighWait");
	Thread.sleep(highWait);
	
	}
	@When("Je clique sur le boutton du register")
	public void jeCliqueSurLeBouttonDuRegister() {
    seleniumUtils.click(registerPage.submitButton);
	}

	@Then("je me redirige sur la page de validation")
	public void jeMeRedirigeSurLaPageDeValidation() {
   
	}
	@Given("Je me rend sur mon Gmail")
	public void jeMeRendSurMonGmail() throws InterruptedException {
	Long highWait =  seleniumUtils.getWait("HighWait");
	Thread.sleep(highWait);
	}
	@When("Je clique sur le boutton Click to validate your email")
	public void jeCliqueSurLeBouttonClickToValidateYourEmail() {	
	}
	
	@Then("Je me redirige vers le formulaire")
	public void jeMeRedirigeVersLeFormulaire() {

	}

	@Given("Je me rend sur le formulaire")
	public void jeMeRendSurLeFormulaire() {
	seleniumUtils.get(configFileReader.getProperties("cogmento.formulaire"));   
	validations.assertEquals(registerPage.validateMessage, configFileReader.getProperties("home.validatemessage")); 
	}

	@When("Je saisie Cmopany Name")
	public void jeSaisieCmopanyName() {
	seleniumUtils.writeText(registerPage.CompanyName, configFileReader.getProperties("home.company"));
	    
	}
	@When("Je saisie le First Name")
	public void jeSaisieLeFirstName() {
	seleniumUtils.writeText(registerPage.FirstName, configFileReader.getProperties("home.FirstName"));

	}
	@When("Je saisie le Last Name")
	public void jeSaisieLeLastName() {
    seleniumUtils.writeText(registerPage.LastName, configFileReader.getProperties("home.LastName"));    
	}
	@When("Je saise le Password")
	public void jeSaiseLePassword() {
	seleniumUtils.writeText(registerPage.Password, configFileReader.getProperties("home.Password")); 	
	}
	
	@When("Je confirme le Password")
	public void jeConfirmeLePassword() {
	seleniumUtils.writeText(registerPage.confirmPassword, configFileReader.getProperties("home.Confirm"));   
	}
	@When("Je clique sur Sign up")
	public void jeCliqueSurSignUp() {
	seleniumUtils.click(registerPage.SignupFinal);
	    
	}
	@Then("Je me redirige sur la page d'acceuil")
	public void jeMeRedirigeSurLaPageDAcceuil() {
	String currentUrl = seleniumUtils.getCurrentUrl();
	validations.assertTrueContains(currentUrl, configFileReader.getProperties("cogmento.url"));
	}






 
}
