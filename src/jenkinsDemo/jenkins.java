package jenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class jenkins {
	
    @Test
	public void jen() {
		
	System.setProperty("webdriver.chrome.driver","E:\\newDriver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	String i= driver.getTitle();
	
	driver.quit();
	
	System.out.println(i);
	}
}
