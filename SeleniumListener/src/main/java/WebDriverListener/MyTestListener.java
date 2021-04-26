package WebDriverListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class MyTestListener {

	@Test
	public void UnderstandListener()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\SeleniumListeners\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver ev_driver = new EventFiringWebDriver(driver);
		MySeleniumListener my_listener = new MySeleniumListener();
		ev_driver.register(my_listener);
		
		ev_driver.get("https://www.google.com/");
		ev_driver.findElement(By.xpath("//a[text() = 'Gmail']")).click();
		
	}
	
}
