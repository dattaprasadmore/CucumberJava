package StepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver()); 
	private String sTitle;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user gets the title of page")
	public void user_gets_the_title_of_page() {
		sTitle = loginPage.getLoginPageTitle();
		System.out.println("Login page title is: " + sTitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(sTitle.contains(expectedTitleName));
	}

	@Then("forgot your password should be displayed")
	public void forgot_your_password_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPasswordLinkExist());
	}

	@When("user enteres username {string}")
	public void user_enteres_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enteres password {string}")
	public void user_enteres_password(String password) {
		loginPage.enterPassword(password);
	}

	@Then("clicks on login button")
	public void clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

	@Then("user gets the title of the Dashboard page")
	public void user_gets_the_title_of_the_Dashboard_page() {
		
	}

}
