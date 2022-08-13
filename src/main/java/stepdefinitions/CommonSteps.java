package stepdefinitions;

import io.cucumber.java.en.Given;
import wrappers.GenericWrappers;

public class CommonSteps extends GenericWrappers{
	
	@Given("Opening the browser")
	public void open_browser() {
		invokeApp("chrome", "");
	}

}
