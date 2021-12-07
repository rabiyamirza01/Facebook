package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
	//WebElement searchfor=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
	//searchfor.click();
		
		WebElement passwordfield=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordfield.sendKeys("Michigan001");


	}

}
