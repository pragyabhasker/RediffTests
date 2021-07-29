package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffLoginpage;

public class LoginToApplication {
	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd = new RediffLoginpage(driver);
		
		rd.EmailId().sendKeys("Hi");
		rd.Password().sendKeys("hello");
		rd.Login().click();

		
		
	}

}
