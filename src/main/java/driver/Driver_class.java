package driver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Common_functions;

public class Driver_class{
	
	
public static WebDriver driver;
	
    Common_functions com= new Common_functions();	

	public void initialization() throws IOException{
		
		selectbrowser(com.getdataval("browser"));
		
	}
	
	public void selectbrowser(String browsername) throws IOException{
		
		switch(browsername){
		
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			break;
			
		case "firefox":
											
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		}
	}
	
	public void browserClose(){
		driver.close();
	}

}
