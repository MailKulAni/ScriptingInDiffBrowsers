package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
	
	@Test
	public void launchFirefox() {
		
		String path = System.getProperty("user.dir")+"/src/resources/java/gecko/geckodriver";
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		System.out.println("quitting driver...");
		driver.quit();
	}
}
