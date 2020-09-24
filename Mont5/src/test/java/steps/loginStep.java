package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.BeforeClass;
import pages.DashboardPage;
import pages.loginPage;
import runners.CucumberRunner;

public class loginStep {
     loginPage login = new loginPage();
     CucumberRunner c = new CucumberRunner();
    DashboardPage db = new DashboardPage();


    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String user, String pass) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        login.EnterUser(user);
        login.EnterPass(pass);
    }

    @Then("^I logout$")
    public void iLogout() throws Exception {
    login.logout();
    }


    @Given("^I am on Mont(\\d+) Home page$")
    public void iAmOnMontHomePage(int arg0)  throws Exception{
        c.setEnv();
    }
}
