package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expediaalerts {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		Thread.sleep(6000);
		
		WebElement flight=driver.findElement(By.xpath("//*[text()='Flights']")); // How to automate the flight tab
		flight.click();
		Thread.sleep(6000);
		
		WebElement dep=driver.findElement(By.xpath("//*[@data-name = 'd1']")); // How to automate the departure
		dep.click();
		Thread.sleep(6000);
		
		WebElement date=driver.findElement(By.xpath("//*[@aria-label='Dec 26, 2021']")); // How to automate the flight date
		date.click();
	}
	
}
