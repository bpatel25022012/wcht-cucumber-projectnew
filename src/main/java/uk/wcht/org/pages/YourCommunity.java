package uk.wcht.org.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.wcht.org.utility.Utility;

/**
 * Created By Bhavesh
 */
public class YourCommunity extends Utility {
    private static final Logger log = LogManager.getLogger(YourCommunity.class.getName());

@FindBy (xpath = "//h1[contains(text(),'Your community')]")
    WebElement welcomeText;

@FindBy (xpath = "//body//section//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]")
WebElement ourCommunityWorkTab;

@FindBy (xpath = "//h1[contains(text(),'Our community work')]")
WebElement ourCommunityworkPageText;

    public String getYourCommunityText(){
        Reporter.addStepLog("Getting text from : " + welcomeText.toString());
        log.info("Getting text from " +welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnOurCommunityWork(){
        Reporter.addStepLog("clicking on our community work : " + ourCommunityWorkTab.toString());
        log.info("clicking on our community work : " + ourCommunityWorkTab.toString());
        clickOnElement(ourCommunityWorkTab);
    }

    public String getOurCommunityWorkPageText(){
        Reporter.addStepLog("Getting text from : " +ourCommunityworkPageText.toString());
        log.info("Getting text from : " +ourCommunityworkPageText.toString());
        return getTextFromElement(ourCommunityworkPageText);
    }
}
