package base;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.lang3.RandomStringUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.google.common.io.Files;






public class WebDriverConfiguration {
	
//	public static WebDriver driver;
//	
//	@Before
//	public static void initializeDriver() throws FileNotFoundException, IOException 
//	{
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+"//chromedriver.exe");
//		driver = new ChromeDriver();
//		
//	}
//
//	@After
//	public void quitDriver(Scenario scenario) throws IOException 
//	{
//		try {
//			Thread.sleep(2000);
//			if (scenario.isFailed()) 
//			{
//				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			}
//		} 
//		catch (Exception e) 
//		{
//			System.out.println(e.getMessage());
//		} 
//		finally 
//		{
//			driver.quit();
//		}
//	}
//
//	public static void navigateToURL(String URL) 
//	{
//		driver.navigate().to(URL);
//	}

}
