package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_functions {
	
	static Properties testdata;
	static File configfile;
	static FileInputStream filestream;
	static Properties locator;
	static Properties replace;
	static FileOutputStream out; 
	
	//load testData file
	public static void loadProperties() throws IOException{
		
		testdata= new Properties();
		configfile= new File(System.getProperty("user.dir") + "/src/main/java/config/TestData.properties");
		filestream= new FileInputStream(configfile);
		testdata.load(filestream);
	}
	
	//load Locators file
	
		
		public static void locatorproperties() throws IOException {
			locator = new Properties();
			configfile = new File(System.getProperty("user.dir")
					+ "/src/main/java/config/Locators.properties");
			filestream = new FileInputStream(configfile);
			locator.load(filestream);
		}
	// this method will get test data value
	public static String getdataval(String keydataval) throws IOException
	{
		loadProperties();
		String path = testdata.getProperty(keydataval);
		return path;
		
	}
	
	// this method will get loc value
	
	public static String getlocval(String keylocval) throws IOException
	{
		locatorproperties();
		String path = locator.getProperty(keylocval);
		return path;
		
	}
	
	// replace the value in properties file
	
	public static Properties replacelocval(String keylocval2,String value) throws IOException
	{
		loadProperties();
		testdata.setProperty(keylocval2, value);
		out=new FileOutputStream(configfile);
		//testdata.put(keylocval2, value);
        testdata.store(out, "update");
		 return testdata;
		 
		
		
	}
	
	public void common_wait(int wait,By by, WebDriver driver){
		
		WebDriverWait w2= new WebDriverWait(driver, wait);
		w2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		
		
	}
	
	public static void printstatement(String element)
	{
		System.out.println(element);		
	}
	
	public void wait(int wait) throws InterruptedException{
		Thread.sleep(wait);
	}
	
	public void click(By by, WebDriver driver, int wait)
	{
		common_wait(wait,by,driver);
		driver.findElement(by).click();
	}
	
	public void sendkeys(By by, WebDriver driver, int wait, String string )
	{
		common_wait(wait,by,driver);
		driver.findElement(by).sendKeys(string);
	}
	
	public String get_text(By by, WebDriver driver){
		String text= driver.findElement(by).getText();
		
		return text;
	}
	
	public void dropDown(By by, WebDriver driver,int index)
	{
		Select drp = new Select(driver.findElement(by));
		drp.selectByIndex(index);
				
	}
	
	public void checkBox(By by, WebDriver driver)
	{
		driver.findElement(by).click();
				
	}
	
	public static String generateRandomName(String code)
    {
        Date dNow = new Date( );                
        //SimpleDateFormat DF =  new SimpleDateFormat ("E, MMMM dd,yyyy hh:mm:ss z");
        SimpleDateFormat DF =  new SimpleDateFormat ("MMddyyhhmmss");
        //System.out.println("Current Date: " + DF.format(dNow));
        String Current_Date=DF.format(dNow);
        String rename_email = Current_Date+code;
        return rename_email;        
    }
	
	public WebElement elementPresence(By by,WebDriver driver,int wait){
		common_wait(wait, by, driver);
		return driver.findElement(by);
	}

	public boolean presentelemnet(By by,WebDriver driver,int wait,boolean present){
		common_wait(wait, by, driver);
		if(driver.findElements(by).size() >0);{
			return present=true;
		}
		
		
	}
}

