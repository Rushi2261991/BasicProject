package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	
	WebDriver driver;
	public RediffHomePage(WebDriver driver) {
		this.driver= driver;	
	}
	
	
	By searchBox = By.id("srchword");
	By searchButton = By.className("newsrchbtn");
	
	
	
	public WebElement SearchBox() {
		return driver.findElement(searchBox);
	}
	
	public WebElement SearchButton() {
		return driver.findElement(searchButton);
	}
	
	
}



