package org.yahoo.Yahoo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pagenumber {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		toSearchPage("11-20");
		
	}

	public static void toSearchPage(String pageNumber) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\workspace\\Lifetime\\Driver\\chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.navigate().to("https://in.yahoo.com/");
		   driver.findElement(By.id("uh-search-box")).sendKeys("Selenium", Keys.ENTER);
		String reference = "//a[@title='Results $']";
		String ExactPageNumber = reference.replace("$", pageNumber);

		driver.findElement(By.xpath(ExactPageNumber)).click();

	}

}

