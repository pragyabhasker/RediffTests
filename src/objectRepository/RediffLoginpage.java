package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
    WebDriver driver;

	public RediffLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

    By username = By.xpath("//*[@id='login1']");
    By password = By.xpath("//*[@id='password']");
    By loginButton = By.name("proceed");

    public WebElement EmailId() {
    	return driver.findElement(username);
    }
    
    public WebElement Password() {
    	return driver.findElement(password);
    }
    
    public WebElement Login() {
    	return driver.findElement(loginButton);
    }

}
