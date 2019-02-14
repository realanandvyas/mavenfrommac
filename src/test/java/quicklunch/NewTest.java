package quicklunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {

	@Test
	public void ClickCallsTab() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://ci.datakonnect.com/");
	}
}
