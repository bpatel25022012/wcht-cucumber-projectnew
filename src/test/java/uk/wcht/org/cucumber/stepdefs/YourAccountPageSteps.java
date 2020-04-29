package uk.wcht.org.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.wcht.org.pages.HomePage;
import uk.wcht.org.pages.YourAccountPage;

/**
 * Created By Bhavesh
 */
public class YourAccountPageSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on close button$")
    public void iClickOnCloseButton() {
        new HomePage().clickOnCloseButton();
    }

    @And("^I click on your account page link$")
    public void iClickOnYourAccountPageLink() {
        new HomePage().clickOnYourAccount();
    }

    @Then("^I should navigate to your account page successfully$")
    public void iShouldNavigateToYourAccountPageSuccessfully() {
        Assert.assertEquals(new YourAccountPage().getWelcomeText(), "It's easy to manage your tenancy with an online account.");
    }

    @And("^I click on create new account link$")
    public void iClickOnCreateNewAccountLink() {
        new YourAccountPage().clickOnCreateNewAccountBtn();
    }

    @Then("^I should navigate to register account page$")
    public void iShouldNavigateToRegisterAccountPage() {
        Assert.assertEquals(new YourAccountPage().getRegisterText(), "Register");

    }
}
