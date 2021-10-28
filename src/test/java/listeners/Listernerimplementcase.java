package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




@Listeners(listeners.Testlisteners.class)
public class Listernerimplementcase extends Testlisteners {
	
	Listenercapture screencapture = new Listenercapture();
	static WebDriver driver;
	@Test
	public void chrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String exp = driver.getTitle();
		String actu = "flipkart";
		Assert.assertEquals(actu, exp);
		driver.close();	
	}
	
	@AfterMethod
	public void capture(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()){
		try {
			screencapture.capture( result, driver, "failscreen");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
}

