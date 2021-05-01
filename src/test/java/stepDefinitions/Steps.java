package stepDefinitions;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.internal.thread.TestNGThread;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps {
	WebDriver driver;
	@Given("I am on Login page of {string}")
	public void i_am_on_login_page_of(String string) {
		// Write code here that turns the phrase above into concrete actions
//		String url="https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnushaAM\\Downloads\\chromewebdriver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(string);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		  driver.findElement(By.id("login")).sendKeys(string);
	    
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
		 driver.findElement(By.id("password")).sendKeys(string);
	    
	}

	@When("I click on Login button")
	public void i_click_on_submit_button() throws InterruptedException {
		 driver.findElement(By.id("form-login_submitAuth")).click();
		 Thread.sleep(10);
	    
	}

	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
		  String name=driver.findElement(By.id("welcome")).getText();
		    String Actual=string;
//		    Assert.assertEquals(name, Actual);
		    Assert.assertTrue(name.contains(string));
		    System.out.println("Login successful");
		    Thread.sleep(10);
		    driver.close();
	    
	}

	@Then("I should see error message as {string}")
	public void i_should_see_error_message_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		String expectedMsg="Invalid credentials";
		String actu=driver.findElement(By.id("spanMessage")).getText();
		  Assert.assertEquals(string, actu);
		    System.out.println("Error as expected");
		    Thread.sleep(10);
		    driver.close();
		
	    
	}
	
	@When("I click on Compose option")
	public void i_click_on_compose_option() throws InterruptedException {
		 driver.findElement(By.xpath("//a[contains(text(),'Compose')]")).click();
		 Thread.sleep(10);
	    
	}

	
	@When("I enter the Send to address {string}")
	public void i_enter_send_to_address(String string) throws InterruptedException {
		 driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(string);
		 Thread.sleep(30);
	}
	
	@When("I click the name {string}")
	public void i_click_the_name(String string) throws InterruptedException {
//		c="//ul[@id='select2-compose_message_users-results']/li[contains(text()='"&string&"'";
//		driver.findElement(By.xpath("//ul[@id='select2-compose_message_users-results']/li[contains(text(),'naveen naveen')]")).click();;
		
		try {
		    Thread.sleep(10000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		java.util.List<WebElement> searchOptions= driver.findElements(By.xpath("//ul[@id='select2-compose_message_users-results']/li"));
		 Thread.sleep(10);
				 for (WebElement option : searchOptions	)
				 {
					 String actual=option.getText();
					 Thread.sleep(10);
					 if(actual.contains(string))
					 {
		
						 option.click();						 
////						 option.sendKeys(Keys.DOWN);
//						 option.sendKeys(Keys.RETURN);
//						 
////						 Actions a = new Actions(driver);
////					      a.moveToElement(option).doubleClick().build().perform();
//						 
						 Thread.sleep(10);
						 break;
						 
					 }
					 
				 }
		 
		 }
	    
	
	@When("I enter the Subject {string}")
	public void i_enter_subject(String string) throws InterruptedException {
		 driver.findElement(By.id("compose_message_title")).sendKeys(string);
		 Thread.sleep(10);
	}
	
	@When("I enter the Message {string}")
	public void i_enter_message(String string) throws InterruptedException {
		try {
		    Thread.sleep(10000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		driver.switchTo().frame(0);
		Thread.sleep(5);
		driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys(string);
		 driver.switchTo().defaultContent();
		Thread.sleep(10);
	}
	@When("I click on Send Message button")
	public void i_click_on_send_message_button() throws InterruptedException {
		 driver.findElement(By.id("compose_message_compose")).click();
		 Thread.sleep(10);
	    
	}

	@Then("I see a message {string}")
	public void i_see_a_message_as(String string) throws InterruptedException {
		  String name=driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
//		    Assert.assertEquals(name, Actual);
		    Assert.assertTrue(name.contains(string));
		    System.out.println("Message verfied sucessfully");
		    Thread.sleep(30);
		    driver.close();
	    
	}
	
	
//	registration 
	@When("I click on signup button")
	public void i_click_on_signup_button() throws InterruptedException {
		 driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
		 Thread.sleep(10);
	    
	}
	
	@When("I enter firstname {string}")
	public void i_enter_firstname(String string) throws InterruptedException {
		 driver.findElement(By.id("registration_firstname")).sendKeys(string);
		 Thread.sleep(10);
	}
	@When("I enter lastname {string}")
	public void i_enter_lastname(String string) throws InterruptedException {
		 driver.findElement(By.id("registration_lastname")).sendKeys(string);
		 Thread.sleep(10);
	}
	@When("I enter email {string}")
	public void i_enter_email(String string) throws InterruptedException {
		 driver.findElement(By.id("registration_email")).sendKeys(string);
		 Thread.sleep(10);
	}
	@When("I enter username {string}")
	public void i_enter_username(String string) throws InterruptedException {
		 driver.findElement(By.id("username")).sendKeys(string);
		 Thread.sleep(10);
	}
	@When("I enter password {string}")
	public void i_enter_password(String string) throws InterruptedException {
		 driver.findElement(By.id("pass1")).sendKeys(string);
		 Thread.sleep(10);
	}
	@When("I enter confirm password {string}")
	public void i_enter_confirm_password(String string) throws InterruptedException {
		 driver.findElement(By.id("pass2")).sendKeys(string);
		 Thread.sleep(10);
	}
	@When("I click on regbtn")
	public void i_click_on_regbtn() throws InterruptedException {
		 driver.findElement(By.id("registration_submit")).click();
		 Thread.sleep(10);
	    
	}
	@When("I see a regmessage {string}")
	public void i_see_a_regmessage(String string) throws InterruptedException {
		  String name=driver.findElement(By.xpath("//p[contains(.,'Your personal settings have been registered.')]")).getText();
//		    Assert.assertEquals(name, Actual);
		    Assert.assertTrue(name.contains(string));
		    System.out.println("Message verfied sucessfully");
		    Thread.sleep(30);
		    driver.close();
	    
	}
	@When("I click on caret")
	public void i_click_on_caret() throws InterruptedException {
		 driver.findElement(By.xpath("//span[@class='caret']")).click();
		
	    
	}
	@Then("I see a regmail {string} ")
	public void i_see_a_regmail(String string) throws InterruptedException {
		try {
		    Thread.sleep(10000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		java.util.List<WebElement> name=driver.findElements(By.xpath("//li[@class='user-header']//p"));
//		 
		  for (WebElement j: name)
		  {
			  String mail=j.getText();
			  if(mail.contains(string)) {
				  
				  System.out.println("Mail verfied scuccefully");
				  break;
			  }
		  }
		 
		    Thread.sleep(30);
		    driver.close();
	    
	}
	
	
	
	
}
