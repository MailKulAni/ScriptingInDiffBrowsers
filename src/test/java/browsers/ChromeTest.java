package browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void launchChrome() {
		String path = System.getProperty("user.dir")+"/src/resources/java/chromedriver/chromedriver";
		System.out.println(path);
		//System.out.println(System.getProperty("user.dir"+"/src/resources/java/chromedriver/chromedriver"));
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println("quitting driver...");
		driver.quit();
	}
}
