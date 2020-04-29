package uk.wcht.org.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.wcht.org.utility.Utility;

/*
Created By Bhavesh
*/public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy (xpath = "//button[@class=\"modal__close js-modal-close\"]")
    WebElement _closeButton;

    @FindBy(xpath = "//span[contains(text(),'Your account')]")
    WebElement _yourAccount;

    @FindBy(linkText ="Your community" )
    WebElement yourCommunity;


    public void clickOnCloseButton(){
        Reporter.addStepLog("Clicking on close button : " + _closeButton.toString());
        clickOnElement(_closeButton);
        log.info("Clicking on close button : " + _closeButton.toString());
    }

    public void clickOnYourAccount() {
        Reporter.addStepLog("Clicking on your account link : " + _yourAccount.toString());
        clickOnElement(_yourAccount);
        log.info("Clicking on your account link : " + _yourAccount.toString());

    }
        public void clickOnYourCommunity(){
            Reporter.addStepLog("Clicking on your community link : " + yourCommunity.toString());
            clickOnElement(yourCommunity);
            log.info("Clicking on your community link : " + yourCommunity.toString());

    }

    }