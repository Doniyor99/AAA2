package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EtsyHomePage;
import pages.EtsyResultsPage;

public class SearchStepDefinitions {

	WebDriver driver;
	EtsyHomePage etsyHomePage;
	EtsyResultsPage etsyResultsPage;
	@Given("^I am on Etsy$")
	public void i_am_on_Etsy(){
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/com/etsy/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.etsy.com/");
	}
	
	@When("^I search an \"([^\"]*)\" on etsy$")
	public void i_search_an_on_etsy(String itemToSearch){
		etsyHomePage = new EtsyHomePage(driver);
		etsyHomePage.searchField.sendKeys(itemToSearch);
		etsyHomePage.searchBtn.click();
	}
	
	@Then("^I should be able to see results count$")
	public void i_should_be_able_to_see_results_count(){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		etsyResultsPage = new EtsyResultsPage(driver);
		wait.until(ExpectedConditions.visibilityOf(etsyResultsPage.resltsCount));
		
		System.out.println(etsyResultsPage.resltsCount.getText());
//		int resultsCount = Integer.parseInt(etsyResultsPage.resltsCount.getText());
//		System.out.println(resultsCount);
	}
}
