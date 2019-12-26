package step_definition_Regression;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driver.Driver_class;
import regression.Login_Class;


public class Login_steps extends Driver_class{
	
	Login_Class log;
	
	@Given("^user launch Browser$") 
	public void user_launch_Browser() throws IOException  {
		
		 initialization();
		
	}
	
	@Then("^user enter the  URL$")
    public void geturl() throws IOException, InterruptedException {	
		log = new Login_Class(driver);
		log.geturl();
		
	}

	@Then("^user enter username and password$")
	public void enter_credentials() throws IOException   {
		log= new Login_Class(driver);
		log.enter_credentials();
	    
	}
	
	@Then("^Click  signin$")
	public void user_click_on_signin_button() throws IOException  {
		System.out.println("abc in method");
	 //log.user_click_on_signin_button();
	    
	}
	
}
