package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions2 {
	WebDriver driver;
	
	@When("^i open url in browseres$")
	public void i_open_url_in_browseres() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Given("^i enter living expenses as one$")
	public void i_enter_living_expenses_as_one() throws Throwable {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("1");
		Thread.sleep(2000);
	   
	}

	@When("^i click how much could i barrow button$")
	public void i_click_how_much_could_i_barrow_button() throws Throwable {
		 driver.findElement(By.xpath("//button[@id='btnBorrowCalculater']")).click();
	}
	
	@Then("^i could see error message$")
	public void i_could_see_error_message() throws Throwable {
		String expected="Based on the details";
	    String actual=driver.findElement(By.xpath("//span[@class='borrow__error__text']")).getText();
	    if(actual.equalsIgnoreCase(expected));
	    {
	    	System.out.println("Error get sucessfully");	   
	    }
		
	   
	}



}
