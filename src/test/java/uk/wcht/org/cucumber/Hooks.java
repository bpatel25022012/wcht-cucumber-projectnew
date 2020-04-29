package uk.wcht.org.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.wcht.org.basepage.BasePage;
import uk.wcht.org.browserselector.BrowserSelector;
import uk.wcht.org.loadproperty.LoadProperty;
import uk.wcht.org.utility.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created By Bhavesh
 */
public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @Before
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Reporter.assignAuthor("Best in Testing", "Bhavesh Patel");
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        driver.quit();
    }

}
