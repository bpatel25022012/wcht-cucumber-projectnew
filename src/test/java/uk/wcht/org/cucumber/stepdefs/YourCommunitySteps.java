package uk.wcht.org.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import uk.wcht.org.pages.HomePage;
import uk.wcht.org.pages.YourCommunity;

/**
 * Created By Bhavesh
 */
public class YourCommunitySteps {
    @And("^I click on your community page link$")
    public void iClickOnYourCommunityPageLink() {
        new HomePage().clickOnYourCommunity();
    }

    @Then("^I should navigate to your community page successfully$")
    public void iShouldNavigateToYourCommunityPageSuccessfully() {
        Assert.assertEquals(new YourCommunity().getYourCommunityText(),"Your community");
    }

    @And("^I click on our community work tab$")
    public void iClickOnOurCommunityWorkTab() {
        new YourCommunity().clickOnOurCommunityWork();
    }

    @Then("^I should navigate to our community work page$")
    public void iShouldNavigateToOurCommunityWorkPage() {
        Assert.assertEquals(new YourCommunity().getOurCommunityWorkPageText(),"Our community work");
    }
}
