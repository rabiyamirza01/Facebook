package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");	
		
		WebElement ping=driver.findElement(By.name("alert"));
		ping.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept(); // How to accept the alert
		
		WebElement pinf=driver.findElement(By.name("confirmation")); // How to automate the confirmation box
		pinf.click();
		driver.switchTo().alert().dismiss();
		
		
		WebElement pingg=driver.findElement(By.name("prompt"));// How to automate the prompt box
		pingg.click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("Alert is displayed");
		driver.switchTo().alert().accept();
		
		
		

	}

}
