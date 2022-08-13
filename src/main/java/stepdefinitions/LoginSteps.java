package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;
import wrappers.GenericWrappers;

public class LoginSteps extends GenericWrappers{
	
	LoginPage login = new LoginPage();
	
	@And("Enter username")
	public void enter_username() {
		login.enterUserName();
	}
	
	@And("Enter password")
	public void enter_password() {
		login.enterPassword();
	}

	@When("Click login")
	public void click_login() {
		login.clickLogin();
	}
}
