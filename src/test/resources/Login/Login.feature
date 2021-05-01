
Feature: Login feature

  Background:
    Given I am on Login page of "http://elearningm1.upskills.in/"
   @Login @InvalidLogin
  #Scenario: Login as Admin
    #When I enter the username as "elearner"
    #And I enter password as "epass@123Delete"
    #And I click on Login button
    #And I click on Compose option 
     #And I enter the Send to address "nav"
     #And I click the name "naveen naveen (naveen)"
    #And I enter the Subject "Testing"
    #And I enter the Message "Hello"  
    #And I click on Send Message button 
    #Then I see a message "The message has been sent to" 
    



  Scenario: Login as Admin
     And I click on signup button  
    And I enter firstname "Alearner"
    And I enter lastname "Blearner"
      And I enter email "aaa@b.com"
       And I enter username "Blearner24"
       And I enter password "epass@123Delete"
        And I enter confirm password "epass@123Delete"
         And I click on regbtn 
     And I see a regmessage "Your personal settings have been registered."
			And I click on caret
     Then I see regmail "aaa@b.com"
        

     
   
    
    
 