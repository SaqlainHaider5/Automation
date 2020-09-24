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


    @Then("^I Click Register my account$")
    public void iClickRegisterMyAccount() throws Exception {
        db.RegisterBtn();
        db.RegisterEmail();

    }


    @Then("^I create my mail signup \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCreateMyMailSignupAnd(String arg0, String arg1) throws Exception {
        db.RegisterData(arg0,arg1);
        db.CloseFlyer();

    }

    @Then("^I Click Login my account$")
    public void iClickLoginMyAccount() throws Exception {
        db.RegisterBtn();

    }

    @Then("^I Enter  \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void iEnterAndCredentials(String arg0, String arg1)  throws Exception {
        login.EnterUser(arg0);
        login.EnterPass(arg1);
        login.ClickSubmitButton();
    }

    @Then("^I Close Flyer$")
    public void iCloseFlyer() throws Exception {
        db.CloseFlyer();

    }

    @Then("^I create my mail signup \"([^\"]*)\" and \"([^\"]*)\" negative email$")
    public void iCreateMyMailSignupAndNegativeEmail(String arg0, String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        db.RegisterData(arg0,arg1);
        db.emailVerify();
    }

    @Then("^I create my mail signup \"([^\"]*)\" and \"([^\"]*)\" negative password$")
    public void iCreateMyMailSignupAndNegativePassword(String arg0, String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        db.RegisterData(arg0,arg1);
        db.passwordVerify();
    }

    @Then("^I Enter  \"([^\"]*)\" and \"([^\"]*)\" negative email$")
    public void iEnterAndNegativeEmail(String arg0, String arg1) throws Exception {
        login.EnterUser(arg0);
        login.EnterPass(arg1);
        login.ClickSubmitButton();
        login.emailVerification();
    }

    @Then("^I Enter \"([^\"]*)\" or \"([^\"]*)\" invalid$")
    public void iEnterOrInvalid(String arg0, String arg1) throws Exception {
        login.EnterUser(arg0);
        login.EnterPass(arg1);
        login.ClickSubmitButton();
        login.pwVerification();
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

    @Then("^I Enter \"([^\"]*)\" and \"([^\"]*)\" while signing up$")
    public void iEnterAndWhileSigningUp(String arg0, String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        db.RegisterData(arg0,arg1);
        db.alreadySignedUp();
    }

    @Then("^I Click Signin with Google$")
    public void iClickSigninWithGoogle() throws Exception {
        db.RegisterBtn();
        db.GoogleBtn();
    }

    @Then("^I close Gmailtab$")
    public void iCloseGmailtab() throws Exception {
        db.Gmailtab();
    }

    @Then("^I Click Signin Button$")
    public void iClickSigninButton() throws Exception{
        db.SignInBtn();
    }

    @Then("^I click on Google Signin Button$")
    public void iClickOnGoogleSigninButton() throws Exception{
        db.GoogleBtn();
    }

    @Then("^I Click to go to my account$")
    public void iClickToGoToMyAccount() throws Exception{
        db.myAccount();
    }

    @Then("^I Click to go to my account Information email$")
    public void iClickToGoToMyAccountInformationEmail() throws Exception{
        db.myAccountInformationEmail();
        db.emailVerification();
    }

    @Then("^I Click to go to my account Information password$")
    public void iClickToGoToMyAccountInformationPassword() throws Exception {
        db.myAccountInformationPassword();
        db.pwVerify();
    }

    @Then("^I Click to go to my address book$")
    public void iClickToGoToMyAddressBook() throws Exception {
        db.addressBook();
    }


    @Then("^I Click to go to newspaper$")
    public void iClickToGoToNewspaper() throws Exception{
        db.newspaper();
    }


    @Then("^I Click to add to cart$")
    public void iClickToAddToCart() throws Exception{
        db.AddToCart();
    }


    @Then("^I Click to go to WishList$")
    public void iClickToGoToWishList() throws Exception{
        db.WishList();
    }

    @Then("^I display$")
    public void iDisplay() throws Exception {
        db.RandomCategory();
    }

    @Then("^I Click to Cart and Proceed to Checkout$")
    public void iClickToCartAndProceedToCheckout() throws Exception{
        db.checkout();
    }


    @Then("^I Click to Random Product$")
    public void iClickToRandomProduct() throws Exception{
        db.RandomProduct();
    }

    @Then("^I Click Add to Cart for a Random Product$")
    public void iClickAddToCartForARandomProduct() throws Exception{
        db.RandomAddToCart();
    }

    @Then("^I Click Add to WishList for a Random Product$")
    public void iClickAddToWishListForARandomProduct() throws Exception {
        db.RandomAddToWishList();
    }

    @Then("^I verify buttons$")
    public void iVerifyButtons() throws Exception {
        db.Buttons();
    }

    @Then("^I Click Add to Cart for a Random Product and Update Cart$")
    public void iClickAddToCartForARandomProductAndUpdateCart() throws Exception{
        db.RandomAddToCartANDREMOVE();
    }

    @Then("^I Click Add to Cart for a Random Product and Increase Value of Item in Cart$")
    public void iClickAddToCartForARandomProductAndIncreaseValueOfItemInCart() throws Exception{
        db.RandomAddToCartANDIncreaseValue();
    }

    @Then("^I Open File and print URLS$")
    public void iOpenFileAndPrintURLS() throws Exception{
        db.readData();
    }

}
