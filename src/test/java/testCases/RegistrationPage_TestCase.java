package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.RegistrationPage;

public class RegistrationPage_TestCase {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void verify_accountRegistration() {

		RegistrationPage rp = new RegistrationPage(driver);
		rp.username("test21");
		rp.mail("test178@gmail.com");
		rp.signup();
		rp.selectOptionByVisibleText("1");
		rp.selectOptionByValue("May");
		rp.selectOptionByIndex(1);
		rp.FirstName("User");
		rp.LastName("lastname");
		rp.Companyname("Test Company");
		rp.Address("Test Address");
		rp.selectOptionByValueCont("India");
		rp.state("MP");
		rp.City("City");
		rp.Zip("878987");
		rp.ContactNumber("8897090989");
		rp.CreateAccount();
		System.out.println("New");
		

	}

}
