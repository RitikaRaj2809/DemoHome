package vehicle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchKtm_Test {
	@Test
	public void ktm() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktmindia.com/");
		driver.quit();
	}


}
