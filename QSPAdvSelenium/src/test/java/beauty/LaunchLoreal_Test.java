package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchLoreal_Test {

	@Test
	public void loreal() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = System.getProperty("url");
		driver.get(url);
		driver.quit();

	}

}
