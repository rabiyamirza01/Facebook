package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		WebElement dragged=driver.findElement(By.id("draggable"));
		WebElement droped=driver.findElement(By.id("droppable"));
		Actions action=new Actions (driver);
		action.dragAndDrop(dragged, droped).build().perform();
		
	}

}
