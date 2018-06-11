package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is on Bank Login Page$")
	public void user_is_on_bank_login_page() throws Throwable {
		System.out.println("\nUser sucessfully navigate to Banking page");
		System.out.println("\nUser sucessfully navigate to Banking page");
		System.out.println("\nUser sucessfully navigate to Banking page");
	}

	@When("^User is login with correct Username and password$")
	public void user_is_login_with_correct_username_and_password() throws Throwable {
		System.out.println("User successfully Login in Banking page");
		System.out.println("User successfully Login in Banking page");
		System.out.println("User successfully Login in Banking page");
		System.out.println("User successfully Login in Banking page");
	}

	@Then("^Homepage is populated$")
	public void homepage_is_populated() throws Throwable {
		System.out.println("After Login homepage is populated");
	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		System.out.println("Car are: " + arg1);

	}

	@When("^User is login with correct Username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_is_login_with_correct_username_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("The username is: " + strArg1);
		System.out.println("The username is: " + strArg2);
	}

	@When("^User is Signup with following details$")
	public void User_is_Signup_with_following_details(DataTable data) {
		List<List<String>> Obj = data.raw();
		System.out.println(Obj.get(0).get(0));
		System.out.println(Obj.get(0).get(1));
		System.out.println(Obj.get(0).get(2));
		System.out.println(Obj.get(0).get(3));
		System.out.println(Obj.get(0).get(4));
	}

	@When("^User is login with username (.+) and pswd (.+)$")
	public void user_is_login_with_username_and_pswd(String username, String password) throws Throwable {
		System.out.println("Username is: " + username);
		System.out.println("Username is: " + password);

	}

	@Given("^Validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("Browser is validated");

	}

	@When("^Brower is triggred$")
	public void brower_is_triggred() throws Throwable {
		System.out.println("Browser is triggred");
		
	}

	@Then("^Check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("Check if browser is started");
	}

}
