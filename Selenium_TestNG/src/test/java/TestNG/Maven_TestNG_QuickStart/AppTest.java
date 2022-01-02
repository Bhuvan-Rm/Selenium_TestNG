package TestNG.Maven_TestNG_QuickStart;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    public WebDriver driver;		
	@Test				
	public void testEasy() {	
		// System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver","C:\\Work_Related_Softwares\\SeleniumDrivers\\WebDrivers\\chromedriver.exe");  
	    driver = new ChromeDriver();  
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();	
		System.out.println(title);
		AssertJUnit.assertTrue(title.contains("Demo Guru99 Page")); 		
		driver.quit();	
	}	

}
