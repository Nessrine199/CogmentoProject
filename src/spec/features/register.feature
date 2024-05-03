
@Register
Feature: Inscription sur le site Cogmento
  En tant ustilisateur je veux tester la fonctionalité Sign up 
   
    
  @RegisterWithMail
  Scenario: Inscription sur le site Cogmento avec le mail 
   Given Je me rend sur le site Cogmento
    When Je clique sur le boutton Sign up
    Then Je me rederige vers la page Register with email 
    When Je saisie le mail 
    And Je check le Terms of use 
    And Je check le CAPTCHA
    And Je clique sur le boutton du register
    Then je me redirige sur la page de validation
    
  @ValidateMail
  Scenario: Validation du mail 
    Given Je me rend sur mon Gmail 
    When Je clique sur le boutton Click to validate your email
    Then Je me redirige vers le formulaire 
    
  @FillForm
  Scenario: Je rempli le formulaire
    Given Je me rend sur le formulaire 
    When Je saisie Cmopany Name
    And Je saisie le First Name 
    And Je saisie le Last Name
    And Je saise le Password  
    And Je confirme le Password 
    And Je clique sur Sign up 
    Then Je me redirige sur la page d'acceuil 