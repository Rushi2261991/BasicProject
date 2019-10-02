package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		this.driver= driver;	
	}
	
	By userName= By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By go = By.name("proceed");
	By home = By.linkText("Home");
	
	public WebElement EmailId() {
		return driver.findElement(userName);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement goButton() {
		return driver.findElement(go);
	}
	
	public WebElement homeLink() {
		return driver.findElement(home);
	}
	
	
	
	

}
