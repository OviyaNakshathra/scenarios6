package skeleton;

import org.junit.Assert;

//import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenario2login {
	WebDriver driver;
	@Given("user opens the login page in newtours application")
	public void user_opens_the_login_page_in_newtours_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\selinium path\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    WebElement signin=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		signin.click();
	}

	@When("user enters the un as {string}")
	public void user_enters_the_un_as(String un) {
		WebElement username=driver.findElement(By.xpath("//*[@id='userName']"));
		username.sendKeys(un);
	}

	@When("user enters the pwd as {string}")
	public void user_enters_the_pwd_as(String pwd) {
		WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
		pass.sendKeys(pwd);
	}

	@When("Click Submit button")
	public void click_Submit_button() {
		WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		login.click(); 
	}

	@Then("verify login success")
	public void verify_login_success() {
	   System.out.println("success");
	   String title;
	   title=driver.getTitle();
	  
	   Assert.assertEquals(title,"Home");
	
	}


}
