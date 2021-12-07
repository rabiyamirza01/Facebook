package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://amazon.com"); // this is how open the site
driver.navigate().refresh();  // How to refresh
driver.navigate().back();  // How to do backward
driver.navigate().forward();  // How to do forward
driver.manage().window().maximize();
// every browser has a unique ID which is also called window handle and also created on the back end side
String handleofwindow=driver.getWindowHandle(); //syntax of window handle
System.out.println(handleofwindow);
	}

}
