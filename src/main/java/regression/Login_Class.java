package regression;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Common_functions;

public class Login_Class extends Common_functions{
	
	WebDriver driver;
	
	public Login_Class(WebDriver driver){
		this.driver=driver;
	}
	
	public void geturl() throws IOException{
		
		driver.get(getdataval("url"));
		}
	
    public void enter_credentials() throws IOException{
		
		sendkeys(By.id(getlocval("Email_textbox")), driver, 5, getdataval("email_login"));
		sendkeys(By.id(getlocval("Password_textbox")), driver, 5, getdataval("password"));
	}
	public void user_click_on_signin_button() throws IOException{
		click(By.xpath(getlocval("SignIn_button")),driver,5);
		click(By.xpath(getlocval("Import_button")), driver, 5);
		click(By.xpath(getlocval("Hirarchy_link")), driver, 5);
	}
	
}
