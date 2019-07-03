package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenario3search {
	WebDriver driver;
	@Given("user opens  login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\selinium path\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    WebElement signin=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		signin.click();
	}

	@When("users enters the un as {string}")
	public void users_enters_the_un_as(String un) {
		WebElement username=driver.findElement(By.xpath("//*[@id='userName']"));
		username.sendKeys(un);
	    
	}

	@When("users enters the pwd as {string}")
	public void users_enters_the_pwd_as(String pwd) {
		WebElement pass=driver.findElement(By.xpath("//*[@id='password']"));
		pass.sendKeys(pwd);
	}

	@When("Click on  Submit button")
	public void click_on_Submit_button() {
		WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		login.click(); 
	}

	@Then("verify the login success")
	public void verify_the_login_success() {
		System.out.println("success");
		   String title;
		   title=driver.getTitle();
		  
		   Assert.assertEquals(title,"Home");
	}

	@Then("user enters the search product as {string}")
	public void user_enters_the_search_product_as(String string) {
		WebElement product=driver.findElement(By.xpath("//*[@id='myInput']"));
		product.sendKeys(string);
		//Actions select=new Actions(driver);
		//select.sendKeys(string,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@Then("click on the find button")
	public void click_on_the_find_button() {
		WebElement find=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
		find.click();
	}



}
