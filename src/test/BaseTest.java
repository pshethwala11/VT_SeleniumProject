package test;

import java.io.File;
import java.time.Duration;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	
	String url = "https://github.com/django";
	  
	// Open browser and navigate to github page
    @BeforeMethod
    public void setUp() {
		
    String log4jConfigFile = System.getProperty("user.dir")
                + File.separator + "log4j.properties";
    PropertyConfigurator.configure(log4jConfigFile);

    System.setProperty("webdriver.chrome.driver","bin/chromedriver");
    driver = new ChromeDriver();

    driver.get(url);
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    
   }
    
    // Quit Browser
    @AfterMethod
	public void quit() {
	  
       driver.quit();
	}

}
