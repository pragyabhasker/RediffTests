package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class seleniumPractice {
	
    WebDriver driver;

	public seleniumPractice(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dropdown-class-example")
	WebElement dropdown;
	
	public void selectDropdown() {
		Select s = new Select(dropdown);
		s.selectByValue("option1");
		System.out.println(s.getFirstSelectedOption().getText());
		Assert.assertEquals(s.getFirstSelectedOption().getText(), "Option1", "Wrong option selected");
		
	}
	
	public void selectCheckbox() {
		driver.findElement(By.id("checkBoxOption2")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected(), "Option 2 not selected");
	}
	
	public void selectMultipleCheckbox() {
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#checkbox-example input[type='checkbox']"));
		
		for (int i =0; i < checkBoxes.size(); i++) {
			
			if(checkBoxes.get(i).getAttribute("value").equalsIgnoreCase("option3")) {
				checkBoxes.get(i).click();
			}
		}
	}

}
