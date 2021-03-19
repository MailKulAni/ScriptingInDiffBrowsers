package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SafariTest {
	
	@Test
	public void launchSafari() {
		
// Allow remote automation for safari before running any tests: 
//https://stackoverflow.com/questions/41629592/macos-sierra-how-to-enable-allow-remote-automation-using-command-line
		
		WebDriver driver = new SafariDriver();
		
		driver.get("https://google.com");
		System.out.println("quitting driver...");
		driver.quit();
	}
}
