package goDaddy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.goDaddyPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MenuLinks {
  public WebDriver driver;
  public goDaddyPage gdp;
  
  @BeforeClass
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Work_Related_Softwares\\SeleniumDrivers\\WebDrivers\\msedgedriver.exe");  
	  driver = new EdgeDriver(); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://godaddy.com/");  
	  gdp = PageFactory.initElements(driver,goDaddyPage.class);
  }

  @Test(priority=1)
  public void verifyTitle() throws InterruptedException {  			
		gdp.checkTitle("GoDaddy"); 	
		gdp.menuClick();
		Thread.sleep(3000);
  }
//  @Test(priority=3) 
//  public void verifyAllMenu() throws InterruptedException {
//
//	  List<WebElement> menuList = driver.findElements(By.cssSelector(".menu.fmenu"));
//	  int c=1;
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  WebDriverWait wait = new WebDriverWait(driver, 5);
//
//	  menuList.forEach(e -> {
//		  driver.findElement(By.xpath("//button[@class=\"product-flyout-btn\"]")).click();
//	      js.executeScript("arguments[0].click();", e);
//	      List<WebElement> subList = driver.findElements(By.cssSelector(".menu.fmenu.expanded >div > div > div > ul > li"));
//	      for(WebElement li:subList)
//	      System.out.println(li.getText());
//	      driver.findElement(By.cssSelector("div.flyout-menu-wrap.open>button.close")).click();
//	      try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	      //wait.until(ExpectedConditions.attributeToBe(e,"class", "dontNeedToClick"));
//	      //if element have not only dontNeedToClick class use attributeContains
//	      //wait.until(ExpectedConditions.attributeContains(e,"class", "dontNeedToClick"));
//	  });
//	  	
//  }
  

  @AfterClass
  public void afterTest() {
	  driver.quit();  
  }
  
}
