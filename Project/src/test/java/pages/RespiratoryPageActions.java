package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.RespiratoryPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

/* 
    * a. Class name : RespiratoryPageActions
    * b. Author : Dharen
    * c. Description : This class provides methods to interact with elements related to the Respiratory section.
*/
public class RespiratoryPageActions {
    public static WebDriverHelper helper;
    public ExtentTest test;
        public static Assertion assertion;
    
        /*
         * a. Constructor name : RespiratoryPageActions
         * b. Author : Dharen
         * c. Description : Initializes the WebDriverHelper instance with the current
         * driver and associates the ExtentTest instance for reporting.
         * d. Parameter list :
         * - ExtentTest test: Instance of ExtentTest to log actions and results in the
         * test report.
         */
        public RespiratoryPageActions(ExtentTest test) {
            helper = new WebDriverHelper(Base.driver);
            assertion = new Assertion(Base.driver);
            this.test = test;
    }

    /*
     * a. Method name : clickOnSearchBar
     * b. Author : Dharen
     * c. Description : This method is to click on Search Bar on the top right
     * corner.
     * d. Return type : void
     * e. Parameter list : none
     */
    public void clickOnSearchBar() {
        try {
            assertion.verifyPartialPageTitle("Cleveland");
            Screenshot.takeScreenshot("HomePage");
            Reporter.attachScreenshotToReport("HomePage", test, "HomePage");
            test.log(Status.INFO, "click on search bar.");
            helper.waitForElementToBeVisible(HomePageLocators.searchbar, 4);
            helper.clickByLocator(HomePageLocators.searchbar);
            LoggerHandler.info("Clicked on Search bar.");
            test.log(Status.PASS, "Clicked on Search bar.");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Search bar.");
            test.log(Status.FAIL, "Failed to click on Search bar.");
            Screenshot.takeScreenshot("Failed to click on Search bar.");
            Reporter.attachScreenshotToReport(null, test, null);
        }
    }

    /*
     * a. Method name : sendRespiratory
     * b. Author : Dharen
     * c. Description : This method is to send keyword into the search bar.
     * d. Return type : void
     * e. Parameter list : none
     */
    public void sendRespiratory(String keyword) {
        try {
            test.log(Status.INFO, "send Respiratory");
            helper.waitForElementToBeVisible(HomePageLocators.searchbox, 4);
            helper.sendData(HomePageLocators.searchbox,keyword);
            helper.enterAction(HomePageLocators.searchbox);
            LoggerHandler.info("Sent Respiratory");
            test.log(Status.PASS, "Sent Respiratory");
        } catch (Exception e) {
            LoggerHandler.error("Failed to send Respiratory.");
            test.log(Status.FAIL, "Failed to send Respiratory.");
            Screenshot.takeScreenshot("Failed to send Respiratory");
            Reporter.attachScreenshotToReport(null, test, null);

        }
    }

    /*
     * a. Method name : clickRespiratory
     * b. Author : Dharen
     * c. Description : This method is to click on Respiratory.
     * d. Return type : void
     * e. Parameter list : none
     */
    public void clickRespiratory() {
        try {
            test.log(Status.INFO, "click on Respiratory");
            helper.waitForElementToBeVisible(RespiratoryPageLocators.respiratory, 8);
            helper.scrollToAnElement(RespiratoryPageLocators.respiratory);
            helper.clickByLocator(RespiratoryPageLocators.respiratory);
            LoggerHandler.info("Clicked on Respiratory.");
            test.log(Status.PASS, "Clicked on Respiratory.");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Respiratory");
            test.log(Status.FAIL, "Failed to click on Respiratory");
            Screenshot.takeScreenshot("Failed to click on Respiratory");
            Reporter.attachScreenshotToReport(null, test, null);
        }
    }

    /*
     * a. Method name : respiratorytest
     * b. Author : Dharen
     * c. Description : It is concrete method.
     * d. Return type : void
     * e. Parameter list : none
     */
    // public void respiratorytest() {
    //     clickOnSearchBar();
    //     sendRespiratory();
    //     clickRespiratory();
    // }
}
