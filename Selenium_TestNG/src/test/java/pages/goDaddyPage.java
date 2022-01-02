package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class goDaddyPage{
	public static String url = "https://godaddy.com/";
	 WebDriver driver;
	
	 @FindBy(how = How.XPATH, using = 
	            "//button[@class=\"product-flyout-btn\"]")
	public WebElement MenuBtn;
	 
	 @FindBy(how = How.CSS, using =
			 "div.flyout-menu-wrap.open>button.close")
	 public WebElement menuClose;
	 
	 @FindBy(how = How.CSS, using =
			 ".menu.fmenu.expanded >div > div > div > ul > li")
	 public List<WebElement> subMenuList;
	 
	 @FindBy(how = How.CSS, using =
			 ".product-flyout-btn-lines")
	 public WebElement menu_Lines;
	 
	 @FindBy(how = How.XPATH, using = 
	            "//button[contains(text(), 'Domains')]")
	public WebElement DomainMenu; 
		
	
	public goDaddyPage(WebDriver driver) {
		
		this.driver = driver;
		//Initialise Elements
	    PageFactory.initElements(driver, this);
	}
	 public void menuClick() throws InterruptedException  {
		 MenuBtn.click();
		 DomainMenu.click();
		 Assert.assertTrue(driver.findElement(By.linkText("Domain Name Search")).isDisplayed());
		 driver.findElement(By.linkText("Domain Name Search")).click();
		 Thread.sleep(3000);
		 checkTitle("Domain Name Search | Check Domain Availability - GoDaddy IN");
     }
	 public void checkTitle(String str) {
		 String title = driver.getTitle();	
		 Assert.assertTrue(title.contains(str));
	 }

}
