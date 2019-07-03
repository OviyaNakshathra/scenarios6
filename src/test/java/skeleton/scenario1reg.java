package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenario1reg {
	WebDriver driver;
	@Given("user login to TestMe App")
	public void user_login_to_TestMe_App() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\selinium path\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    WebElement signup=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a"));
		signup.click();
	}
	@When("user enters the  username as {string}")
	public void user_enters_the_username_as(String un) {
		WebElement username=driver.findElement(By.xpath("//*[@id='userName']"));
		username.sendKeys(un);
	    }
	
	@When("user enters the  firstname as {string}")
	public void user_enters_the_firstname_as(String fn) {
		WebElement firstname=driver.findElement(By.xpath("//*[@id='firstName']"));
		firstname.sendKeys(fn);
	}

	@When("user enters the lastname as  {string}")
	public void user_enters_the_lastname_as(String ln) {
		WebElement lastname=driver.findElement(By.xpath("//*[@id='lastName']"));
		lastname.sendKeys(ln);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
		WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys(pwd);
	    
	}

	@When("user enters the confirmpwd as {string}")
	public void user_enters_the_confirmpwd_as(String conpwd) {
		WebElement conpassword=driver.findElement(By.xpath("//*[@id='pass_confirmation']"));
		conpassword.sendKeys(conpwd);
	}

	@When("user selects the gender")
	public void user_selects_the_gender() {
		WebElement gender=driver.findElement(By.xpath("//*[@id='gender']"));
		gender.click();
	    
	}


	@When("user enters the email as {string}")
	public void user_enters_the_email_as(String em) {
		WebElement email=driver.findElement(By.id("emailAddress"));
		email.sendKeys(em);
	    
	}

	@When("user enters the mobile number  as {string}")
	public void user_enters_the_mobile_number_as(String ph) {
		WebElement phone=driver.findElement(By.xpath("//*[@id='mobileNumber']"));
		phone.sendKeys(ph);
	}

	@When("user enters the dob as {string}")
	public void user_enters_the_dob_as(String dob) {
		WebElement date=driver.findElement(By.xpath("//*[@id='dob']"));
		date.sendKeys(dob);
	}

	@When("user enters the addre as {string}")
	public void user_enters_the_addre_as(String add) {
		WebElement addre=driver.findElement(By.xpath("//*[@id='address']"));
		addre.sendKeys(add);
	}

	//@When("user selects the security question as {string}")
	//public void user_selects_the_security_question_as(String string) {
	    
	

	@When("user enters the anwser as {string}")
	public void user_enters_the_anwser_as(String answer) {
		WebElement ans=driver.findElement(By.xpath("//*[@id='answer']"));
		ans.sendKeys(answer);}

	@Then("click submit button")
	public void click_submit_button() {
		WebElement submit=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]"));
		submit.click();
	   
	}

	@Then("verify the signup Success message")
	public void verify_the_signup_Success_message() {
	    System.out.println("success");
	}



}
