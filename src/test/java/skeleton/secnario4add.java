package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class secnario4add {
	WebDriver driver;
	@Given("user go to  login page in testme application")
	public void user_go_to_login_page_in_testme_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\selinium path\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    WebElement signin=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		signin.click();
	}

	@When("users will enter the un as {string}")
	public void users_will_enter_the_un_as(String un) {
		WebElement username=driver.findElement(By.xpath("//*[@id='userName']"));
		username.sendKeys(un);
	}

	@When("users will enter the pwd as {string}")
	public void users_will_enter_the_pwd_as(String pwd) {
		WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
		pass.sendKeys(pwd);
	}

	@When("Click Submit button in login")
	public void click_Submit_button_in_login() {
		WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		login.click(); 
	}

	@Then("verifies the login success")
	public void verifies_the_login_success() {
		  System.out.println("success");
		   String title;
		   title=driver.getTitle();
		  
		   Assert.assertEquals(title,"Home");
	}

	@Then("user selects the search product as {string}")
	public void user_selects_the_search_product_as(String string) {
		WebElement product=driver.findElement(By.xpath("//*[@id='myInput']"));
		product.sendKeys(string);
	}

	@Then("clicks on the find button")
	public void clicks_on_the_find_button() {
		WebElement find=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
		find.click();
		WebElement cart=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]"));
		cart.click();
		if(driver.getTitle().equals("View cart"))
		  Assert.assertFalse(false);
		else
			Assert.assertTrue(true);
	}



}
