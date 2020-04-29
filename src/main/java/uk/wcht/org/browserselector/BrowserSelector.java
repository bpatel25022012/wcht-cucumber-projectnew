package uk.wcht.org.browserselector;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import uk.wcht.org.basepage.BasePage;

/*
Created By Bhavesh
*/
public class BrowserSelector extends BasePage {
    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());
    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            log.info("launching the  Chrome browser");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            log.info("launching the Firefox browser");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
            log.info("launching the IE browser");
            driver = new InternetExplorerDriver();
        } else {
            log.info("Wrong browser");
            System.out.println("Wrong browser");
        }


    }

}
