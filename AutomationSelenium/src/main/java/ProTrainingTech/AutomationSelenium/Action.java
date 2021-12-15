package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions action=new Actions (driver);
		action.moveToElement(sign).build().perform();
		Thread.sleep(6000);
		
		WebElement music=driver.findElement(By.linkText("Music Library"));
		action.moveToElement(music).click().build().perform();
		

	}

}
