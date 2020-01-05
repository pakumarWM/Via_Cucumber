package regression;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		
		
		
	}
	
	public void verify_homepage(boolean present){
		try {
			//WebElement home=elementPresence(By.xpath(getlocval("Verify_hompage")), driver, 10);
			
//			if (elementPresence(By.xpath(getlocval("Verify_hompage")), driver, 10).isDisplayed()){
//				System.out.println("in if");
//			}
//			
//			else{
//				System.out.println("not on home page");
//			}
				
			presentelemnet(By.xpath(getlocval("Verify_hompage")), driver, 10, present);
			if (present=true){
				System.out.println("in if");
			}
			else{
				
			}
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void Click_on_import_button() throws IOException, InterruptedException{
		
		click(By.xpath(getlocval("Import_button")), driver, 5);
		
	}
	
	public void User_import() throws IOException, InterruptedException{
		
	try{
		click(By.xpath(getlocval("Users_link")), driver, 5);
		
		
		String filePath=System.getProperty("user.dir")+"/resources/import files/users.csv";
		sendkeys(By.xpath(getlocval("Upload_file")), driver, 5, filePath);
		
		wait(5000);
		click(By.xpath(getlocval("Check_status")), driver, 10);
		
//		WebElement we=elementPresence(By.xpath(getlocval("Verify_import")), driver, 10);
//		 if (we.isDisplayed())
//			 {
//					printstatement("There is an issue in Users file");
//					printstatement("-------------------------------------------");
//				}	
//		 else
//		 {
//				printstatement("Users file is successfully imported");
//				printstatement("-------------------------------------------");
//			}	
		
		wait(5000);
		
		boolean isLoginElementPresentStg=driver.findElements(By.xpath(getlocval("Verify_import"))).size()>0;
		if(isLoginElementPresentStg) 
			{
				printstatement("There is an issue in Users file");
				printstatement("-------------------------------------------");
			}					
		else
			{
				printstatement("Users file is successfully imported");
				printstatement("-------------------------------------------");
			}	
	}
	catch (Exception e){
		e.printStackTrace();
		printstatement("User.csv file NOT imported");
	}
}
		
	
	
	public void Hirarchy_File_upload() throws IOException, InterruptedException{
		
		
		
		click(By.xpath(getlocval("Hirarchy_link")), driver, 5);
		
		wait(3000);
		
		String filePath=System.getProperty("user.dir")+"/resources/import files/hierarchy.csv";
		sendkeys(By.xpath(getlocval("Upload_file")), driver, 5, filePath);
		wait(5000);
		
		click(By.xpath(getlocval("Check_status")), driver, 10);
		
		wait(5000);
				
			boolean isLoginElementPresentStg=driver.findElements(By.xpath(getlocval("Verify_import"))).size()>0;
			if(isLoginElementPresentStg) 
				{
					printstatement("There is an issue in hirarchy file");
					printstatement("-------------------------------------------");
				}					
			else
				{
					printstatement("Hirarchy file is successfully imported");
					printstatement("-------------------------------------------");
				}	
		
		
		
	}
	
		
	public void GroupTemplates_File_upload() throws IOException{
		
	}

	public void Groups_File_upload() throws IOException{
	
	}

	public void Membership_File_upload() throws IOException{
	
	}

}
