package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("Hello@gmail.com");
		rd.Password().sendKeys("password");
		rd.homeLink().click();
		
		RediffHomePage rH = new RediffHomePage(driver);
		rH.SearchBox().sendKeys("Rediff");
		rH.SearchButton().click();
		
	}
	
	public void main() {
		WebDriver driver = new ChromeDriver();
		RediffHomePage rH = new RediffHomePage(driver);
		rH.SearchBox().sendKeys("Rediff");
		rH.SearchButton().click();
	}
	
	

}
