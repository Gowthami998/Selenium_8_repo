package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTest {
	// maven parameter test
	@Test
	public void maven() {
	   
		String url = System.getProperty("url");
		  String email = System.getProperty("email");
		  String password = System.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}

}

