package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.DashboardPage;
import pages.loginPage;

public class dashboardSteps {
    DashboardPage db = new DashboardPage();
    loginPage login = new loginPage();


    @Then("^click on pass management$")
    public void clickOnPassManagement() throws Exception {
        db.RegisterBtn();
    }

    @Then("^I Click create an account$")
    public void iClickCreateAnAccount() throws Exception {
        db.RegisterBtn();
    }


    @Then("^I create my mail signup \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCreateMyMailSignupAnd(String arg0, String arg1) throws Exception {
        db.RegisterData(arg0,arg1);
    }

    @Then("^I Click create an account button$")
    public void iClickCreateAnAccountButton() throws Exception{
        db.CreateAccountBtn();
    }

    @Then("^I Click Login my account$")
    public void iClickLoginMyAccount() throws Exception {
        db.SigninBtn();
    }

    @Then("^I Enter  \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void iEnterAndCredentials(String arg0, String arg1)  throws Exception {
        login.EnterUser(arg0);
        login.EnterPass(arg1);
        login.ClickSubmitButton();
    }

    @Then("^I create my mail signup \"([^\"]*)\" and \"([^\"]*)\" negative password$")
        public void iCreateMyMailSignupAndNegativePassword(String arg0, String arg1) throws Exception {
            // Write code here that turns the phrase above into concrete actions
            db.RegisterData(arg0,arg1);
            db.passwordVerify();
    }

    @Then("^I create my mail signup \"([^\"]*)\" and \"([^\"]*)\" negative email$")
    public void iCreateMyMailSignupAndNegativeEmail(String arg0, String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        db.RegisterData(arg0,arg1);
        db.emailVerify();
    }

    @Then("^I Enter  \"([^\"]*)\" and \"([^\"]*)\" negative email$")
    public void iEnterAndNegativeEmail(String arg0, String arg1) throws Exception {
        login.EnterUser(arg0);
        login.EnterPass(arg1);
        login.ClickSubmitButton();
        login.emailVerification();
    }


    @Then("^I Enter \"([^\"]*)\" and \"([^\"]*)\" while signing up$")
    public void iEnterAndWhileSigningUp(String arg0, String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        db.RegisterData(arg0,arg1);
        db.alreadySignedUp();
    }

    @Then("^I Enter \"([^\"]*)\" or \"([^\"]*)\" invalid$")
    public void iEnterOrInvalid(String arg0, String arg1) throws Exception {
        login.EnterUser(arg0);
        login.EnterPass(arg1);
        login.ClickSubmitButton();
        login.PWVerification();
    }


    @Then("^I Enter \"([^\"]*)\" \"([^\"]*)\" empty email$")
    public void iEnterEmptyEmail(String arg0, String arg1) throws Exception {
        login.EnterUser(arg0);
        login.EnterPass(arg1);
        login.ClickSubmitButton();
        login.emailVerification();
    }

    @Then("^I Enter \"([^\"]*)\" \"([^\"]*)\" empty password$")
    public void iEnterEmptyPassword(String arg0, String arg1) throws Exception {
        login.EnterUser(arg0);
        login.EnterPass(arg1);
        login.ClickSubmitButton();
        login.pwVerification();
    }

    @Then("^I go to My Account details$")
    public void iGoToMyAccountDetails() throws Exception{
        db.myAccountbtn();
    }


    @Then("^I Click to go to my account and open all respective options$")
    public void iClickToGoToMyAccountAndOpenAllRespectiveOptions() throws Exception{
        db.myAccountOptions();
    }

    @Then("^I Click to go to my account Information email$")
    public void iClickToGoToMyAccountInformationEmail() throws Exception{
        db.myAccountInformationEmail();
    }

    @Then("^I Click to go to my account Information password$")
    public void iClickToGoToMyAccountInformationPassword() throws Exception {
        db.myAccountInformationPassword();
    }

    @Then("^I Click to go to my address book$")
    public void iClickToGoToMyAddressBook() throws Exception{
        db.addressBook();
    }

    @Then("^I Click to go to newspaper$")
    public void iClickToGoToNewspaper() throws Exception{
        db.newspaper();
    }

    @Then("^I Click to Random Jacket Product$")
    public void iClickToRandomJacketProduct() throws Exception{
        db.RandomJacketProduct();
    }
    @Then("^I Click to Random Bags Product$")
    public void iClickToRandomBagsProduct() throws Exception{
        db.RandomBagsProduct();
    }
    @Then("^I Click to add Random Jacket Product and Checkout$")
    public void iClickToAddRandomJacketProductAndCheckout() throws Exception{
        db.RandomJacketProductCheckout();
    }
    @Then("^I Click to add Random Jacket Product Update Cart and Checkout$")
    public void iClickToAddRandomJacketProductUpdateCartAndCheckout() throws Exception{
        db.RandomJacketProductUpdateCartCheckout();
    }

    @Then("^I Click to go to update my address book$")
    public void iClickToGoToUpdateMyAddressBook() throws Exception{
        db.UpdateAddressBook();
    }

    @Then("^I Click to Random category$")
    public void iClickToRandomCategory() throws Exception{
        db.RandomCategory();
    }

    @Then("^I Click to Random product of that category$")
    public void iClickToRandomProductOfThatCategory() throws Exception{
        db.RandomProductFromCategory();
    }

    @Then("^I Click to add Random Bag Product and Checkout$")
    public void iClickToAddRandomBagProductAndCheckout() throws Exception{
        db.RandomBagProductCheckout();
    }

    @Then("^I Select a random category of Bags$")
    public void iSelectARandomCategoryOfBags() throws Exception{
        db.SelectRandomBagCategory();
    }


    @Then("^Add product to Cart from bags category$")
    public void addProductToCartFromBagsCategory() throws Exception{
        db.addProductToCartFromBagsCategory();
    }

    @Then("^Proceed to checkout and redirect to paypal$")
    public void proceedToCheckoutAndRedirectToPaypal() throws Exception{
        db.proceedToCheckoutAndRedirectToPaypal();
    }
}
