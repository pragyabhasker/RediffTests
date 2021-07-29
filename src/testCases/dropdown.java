package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.seleniumPractice;

public class dropdown {

	@Test
	public void dropdown() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		seleniumPractice sp = new seleniumPractice(driver);
		
		sp.selectDropdown();
		
		sp.selectCheckbox();
		
		sp.selectMultipleCheckbox();
	}
	
}
