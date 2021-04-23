package stepDefinations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Login;
import resources.base;

public class stepDefination extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());

	@Before
	public void setUP() {
		System.out.println("launch chrome");
	}

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = intializeDriver();
		log.info("browser launch");
	}

	@Then("^click signin$")
	public void click_signin() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		// 1.Test case

		login.getregister().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String fname = sheet.getRow(1).getCell(0).getStringCellValue();
		login.getfname().sendKeys(fname);

		String lname = sheet.getRow(1).getCell(1).getStringCellValue();
		login.getlname().sendKeys(lname);
		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		// int tele=(int)sheet.getRow(1).getCell(3).getNumericCellValue();
		// l.getnumber().sendKeys(tele);
		login.getnumber().sendKeys("1236547890");
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		String confirmpass = sheet.getRow(1).getCell(5).getStringCellValue();
		login.getconfpass().sendKeys(confirmpass);

		login.getradio().click();
		login.getchk().click();
		login.getcontionue().click();
		login.getcontbtn().click();
		driver.close();

	}

	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String url = sheet.getRow(1).getCell(6).getStringCellValue();
		driver.get(url);

	}

	@Then("^capture sscreenshot$")
	public void capture_sscreenshot() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		// 1.Test case

		login.getregister().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String fname = sheet.getRow(2).getCell(0).getStringCellValue();
		login.getfname().sendKeys(fname);

		String lname = sheet.getRow(2).getCell(1).getStringCellValue();
		login.getlname().sendKeys(lname);
		String email = sheet.getRow(2).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		// int tele=(int)sheet.getRow(1).getCell(3).getNumericCellValue();
		// l.getnumber().sendKeys(tele);
		// login.getnumber().sendKeys("123654890");
		String pass = sheet.getRow(2).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		String confirmpass = sheet.getRow(2).getCell(5).getStringCellValue();
		login.getconfpass().sendKeys(confirmpass);

		login.getradio().click();
		login.getchk().click();
		login.getcontionue().click();
		login.getcontbtn().click();
		
		
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\vighnharta\\Desktop\\hackthone-5\\reports\\snap.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.close();

	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();
		String title = driver.getTitle();
		System.out.println(title);
		log.info("Title of we page" + title);
		driver.close();
	}
	
	  @Then("^Add to cart$")
	    public void add_to_cart() throws Throwable {
		  Login login = new Login(driver);
			Actions act = new Actions(driver);
			act.moveToElement(login.getaccount()).build().perform();
			login.getaccount().click();
			login.getlogin().click();
			File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
			FileInputStream input = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(input);
			XSSFSheet sheet = wb.getSheet("Sheet1");

			String email = sheet.getRow(1).getCell(2).getStringCellValue();
			login.getemil().sendKeys(email);
			String pass = sheet.getRow(1).getCell(4).getStringCellValue();
			login.getpass().sendKeys(pass);
			login.getloginbtn().click();
		  act.moveToElement(login.getdekstops()).build().perform();
			login.getdekstops().click();
			login.getmac1().click();
			login.getimac().click();
			login.getaddtocart().click();
			
			String msg=login.getsuccessmsg().getText();
			log.info(msg);
			File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try
			  { FileHandler.copy(src1, new File(
			 "C:\\Users\\vighnharta\\Desktop\\hackthone-5\\reports\\snap1.png"));
			  
			  } catch (Exception e) { e.printStackTrace(); 
			  } 
			
			driver.close();
	    }
	  
	  @Then("^checkout with guest user$")
	    public void checkout_with_guest_user() throws Throwable {
		  Login login = new Login(driver);
			Actions act = new Actions(driver);
		  login.getlaptops().click();
			login.getmore().click();
			login.gethp().click();
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("window.scrollBy(0,1000)");
		     
		     login.getdate().sendKeys("2021-05-05");
		     login.getaddtocart2().click();
		     login.getbasket().click();
		     
		     JavascriptExecutor js1 = (JavascriptExecutor) driver;
		     js1.executeScript("window.scrollBy(0,1000)");
		     login.getcheckout2().click();
		     Thread.sleep(3000);
		     login.getradio3().click();
		     login.getcontinue3().click();
		     
		     login.getfname2().sendKeys("priyanka");
		     login.getlname2().sendKeys("sonawane");
		     login.getemail2().sendKeys("priyanka@gmail.com");
		     login.gettelephone2().sendKeys("1236447950");
		     login.getaddress().sendKeys("shirpur");
		     login.getcity().sendKeys("dhule");
		     login.getpostal().sendKeys("425405");
		     Select select=new Select(login.getcountry());
		     select.selectByVisibleText("India");
		     
		     Select select2=new Select(login.getstate());
		     select2.selectByVisibleText("Maharashtra");
		     login.getcont4().click();
		     
		     login.getdelevery().sendKeys("hello");
		     login.getcont5().click();
		     
		     Thread.sleep(3000);
		     login.getterms().click();
		     login.getcont6().click();
		     Thread.sleep(3000);
		     login.getconfrimorder().click();
		     
		     File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try
			  { FileHandler.copy(src2, new File(
			 "C:\\Users\\vighnharta\\Desktop\\hackthone-5\\reports\\snap2.png"));
			  
			  } catch (Exception e) { e.printStackTrace(); 
			  } 
		   driver.close();
	    }
	  
	 
}