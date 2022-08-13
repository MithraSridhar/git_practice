package stepdefinitions;

import io.cucumber.java.en.When;
import pages.ProfilePage;
import wrappers.GenericWrappers;

public class ProfileSteps extends GenericWrappers{
	
	ProfilePage profile = new ProfilePage();
	
	@When("Click bookstore")
	public void click_bookstore() throws InterruptedException {
		profile.clickBookStore();
	}

}
