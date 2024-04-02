package vehicle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchPulsar_Test {
	@Test
	public void pulsar() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/");
		driver.quit();
	}


}
