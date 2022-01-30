package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {
	
	static WebDriver driver;

	public static void openURL() {
		System.out.println("here");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	public static void enterValue(String data) {
		new WebDriverWait(driver,30).until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='q']"))));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}
	
	public static void clickOnFirstLink() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElements(By.xpath("//div[@class='yuRUbf']/a[1]")).get(0).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	

}
