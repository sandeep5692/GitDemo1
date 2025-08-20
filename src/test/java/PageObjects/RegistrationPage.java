package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement name;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement email;

	@FindBy(xpath = "//button[normalize-space()='Signup']")
	WebElement Signup;

	@FindBy(xpath = "(//input[@id='id_gender1'])[1]")
	WebElement gender;

	@FindBy(xpath = "(//input[@id='password'])")
	WebElement password;

	@FindBy(xpath = "//select[@id='days']")
	WebElement day;

	@FindBy(xpath = "//select[@id='months']")
	WebElement month;

	@FindBy(xpath = "//select[@id='years']")
	WebElement year;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='company']")
	WebElement company;

	@FindBy(xpath = "(//input[@id='address1'])[1]")
	WebElement address1;

	@FindBy(xpath = "(//select[@id='country']")
	WebElement country;

	@FindBy(xpath = "//input[@id='state']")
	WebElement state;

	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zip;

	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mobile;

	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement createAccount;
	
	public void genders() {
		gender.click();
	}

	public void username(String uname) {
		name.sendKeys(uname);
	}

	public void mail(String mail) {
		email.sendKeys(mail);
	}

	public void signup() {
		Signup.click();
	}

	public void selectOptionByVisibleText(String VisibleText) {
		Select select = new Select(day);
		select.selectByVisibleText(VisibleText);
	}

	public void selectOptionByValue(String value) {
		Select select = new Select(month);
		select.selectByVisibleText(value);
	}

	public void selectOptionByIndex(int index) {
		Select select = new Select(year);
		select.selectByIndex(index);
	}

	public void FirstName(String fname) {
		firstname.sendKeys(fname);
	}

	public void LastName(String Lname) {
		lastname.sendKeys(Lname);
	}
	
	public void Companyname(String Job) {
		company.sendKeys(Job);
	}
	
	public void Address(String add) {
		address1.sendKeys(add);
	}
	
	public void selectOptionByValueCont(String Country) {
		Select select = new Select(country);
		select.selectByValue(Country);
	}
	
	public void state(String state1) {
		state.sendKeys(state1);
	}
	
	public void City(String city1) {
		city.sendKeys(city1);
	}
	
	public void Zip(String zipcode) {
		zip.sendKeys(zipcode);
	}
	
	public void ContactNumber(String contact) {
		mobile.sendKeys(contact);
	}
	
	public void CreateAccount() {
		createAccount.click();
	}

}
