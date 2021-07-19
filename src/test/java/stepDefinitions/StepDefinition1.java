package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 {
	WebDriver driver;
	@When("^i launch url in browser$")
	public void i_launch_url_in_browser() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
    }

	@When("^i select single and zero dependants$")
	public void i_select_single_and_zero_dependants() throws Throwable {
		
	   
	}

	@When("^i enter income and other income$")
	public void i_enter_income_and_other_income() throws Throwable {
		
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("80000");
		driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys("10000");
	   Thread.sleep(5000);
	}

	@When("^i enter living expenses and current home loan repayment$")
	public void i_enter_living_expenses_and_current_home_loan_repayment() throws Throwable {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']")).sendKeys("0");
	    Thread.sleep(5000);
	}

	@When("^i enter other loan repayments$")
	public void i_enter_other_loan_repayments() throws Throwable {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys("100");
		Thread.sleep(5000);
	   
	}

	@When("^i enter other commitments$")
	public void i_enter_other_commitments() throws Throwable {
	   driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys("0");
	}

	@When("^i enter total credit card limit$")
	public void i_enter_total_credit_card_limit() throws Throwable {
	   driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys("10000");
	}

	@When("^i click how much i could barrow$")
	public void i_click_how_much_i_could_barrow() throws Throwable {
	    driver.findElement(By.xpath("//button[@id='btnBorrowCalculater']")).click();
	}

	@Then("^i could see the total estimation$")
	public void i_could_see_the_total_estimation() throws Throwable {
		
	    
	}

	@When("^i click on start over$")
	public void i_click_on_start_over() throws Throwable {
	   driver.findElement(By.xpath("//button[@class='start-over']")).click();
	}



}
