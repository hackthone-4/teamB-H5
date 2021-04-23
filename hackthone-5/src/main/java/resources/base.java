package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class base {
	public static WebDriver driver;
	
	public WebDriver intializeDriver() throws Exception {
		Properties prop = new Properties();
		FileInputStream file_path = new FileInputStream(

				"C:\\Users\\vighnharta\\Desktop\\Hackthone5\\src\\main\\java\\resources\\data.properties");
		prop.load(file_path);
		String browsername = prop.getProperty("Browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vighnharta\\Desktop\\eclipse\\eclipse\\chromedriver1.exe");
			driver = new ChromeDriver();
		}

		else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\vighnharta\\Desktop\\eclipse\\eclipse\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		return driver;

	}
	
	
	
}
