package uk.wcht.org.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.wcht.org.utility.Utility;

/*
Created By Bhavesh
*/
public class YourAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(YourAccountPage.class.getName());


@FindBy (xpath = "//span[contains(text(),\"It's easy to manage your tenancy with an online ac\")]")
    WebElement _welcomeText;
@FindBy (xpath = "//html//body//main//div//div//div//div//div//div//div//div//div//form//input")
WebElement createNewAccount;

@FindBy(xpath = "//h3[contains(text(),'Register')]")
WebElement registerPageText;


public String getWelcomeText(){
Reporter.addStepLog("Getting text from : " + _welcomeText.toString());
    log.info("Getting text from " +_welcomeText.toString());
    return getTextFromElement(_welcomeText);
}

public void clickOnCreateNewAccountBtn(){
    Reporter.addStepLog("Clicking On create new account : " + createNewAccount.toString());
    log.info("Clicking On create new account : " + createNewAccount.toString());
    clickOnElement(createNewAccount);
}
public String getRegisterText(){
    Reporter.addStepLog("Getting text from : " + registerPageText.toString());
    log.info("Getting text from " +registerPageText.toString());
    return getTextFromElement(registerPageText);
}



}
