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
	
	@Then("^user enter the URL$")
    public void geturl() throws IOException, InterruptedException {	
		log = new Login_Class(driver);
		log.geturl();
		
	}

	@Then("^user enter username and password$")
	public void enter_credentials() throws IOException   {
		
		log.enter_credentials();
	    
	}
	

	@Then("^Click signin button$")
	public void user_click_on_signin_button() throws IOException  {
		log.user_click_on_signin_button();
	 //check 2

	
	   	}
	
	@Given("^Click on imports link$")
	public void click_on_imports_link() throws IOException {
		log = new Login_Class(driver);
		log.Click_on_import_button();
	    
	}
	@Then("^Click on import users$")
	public void click_on_import_users() throws IOException {
		log = new Login_Class(driver);
	   log.Hirarchy_File_upload();
	   
	}

	@Then("^Click on upload user csv file$")
	public void click_on_upload_file_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Verify user csv uploaded$")
	public void verify_user_csv_uploaded() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("^Click on import hirarchy$")
	public void click_on_import_hirarchy()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("^Click on import group templates$")
	public void click_on_import_group_templates() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Click on import groups$")
	public void click_on_import_groups() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Click on import membership$")
	public void click_on_import_membership() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
