package pages;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.FooterIconPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class FooterIconPageActions {
    ExtentReports reports;
    WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;
 
    /*
     * Method Name: FooterIconPageActions
     * Author Name: T Gnana Asritha
     * Description: Constructor that initializes the WebDriverHelper and assigns the
     * provided ExtentTest and LoggerHandler instances.
     * Return Type: N/A (Constructor)
     * Parameter List:
     * - ExtentTest test: The ExtentTest instance for logging test results.
     */
    public FooterIconPageActions(WebDriver driver, ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
 
    }
 
    /*
     * Method Name: clickFacebook
     * Author Name: T Gnana Asritha
     * Description: Clicks the Facebook icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
 
    public void clickFacebook() {
        try {
            helper.scrollToAnElement(FooterIconPageLocators.facebook);
            helper.waitForElementToBeVisible(FooterIconPageLocators.facebook, 4);
            helper.clickByLocator(FooterIconPageLocators.facebook);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Navigated back to Home page");
            test.log(Status.INFO, "Navigated back to Home page");
            test.log(Status.PASS, "Navigated back to Home page");
            Reporter.attachScreenshotToReport("Facebook", test, "Facebook Screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Facebook Icon Failed");
            test.log(Status.FAIL, "Clicked on Facebook Icon Failed");
            Reporter.attachScreenshotToReport("Facebook", test, "Facebook Screenshot");
 
        }
    }
 
    /*
     * Method Name: clickTwitter
     * Author Name: T Gnana Asritha
     * Description: Clicks the Twitter icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickTwitter() {
        try {
 
            helper.clickByLocator(FooterIconPageLocators.twitter);
            LoggerHandler.info("Clicked on Twitter Icon");
            test.log(Status.INFO, "Clicked on Twitter Icon");
            test.log(Status.PASS, "Clicked on Twitter Icon");
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Navigated back to Home page");
            test.log(Status.INFO, "Navigated back to Home page");
            test.log(Status.PASS, "Navigated back to Home page");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Twitter Icon Failed");
            test.log(Status.FAIL, "Clicked on Twitter Icon Failed");
            Reporter.attachScreenshotToReport("Twitter", test, "Twitter Screenshot");
        }
    }
 
    /*
     * Method Name: clickYoutube
     * Author Name: T Gnana Asritha
     * Description: Clicks the Youtube icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickYoutube() {
        try {
            helper.clickByLocator(FooterIconPageLocators.youtube);
            LoggerHandler.info("Clicked on Youtube Icon");
            test.log(Status.INFO, "Clicked on Youtube Icon");
            test.log(Status.PASS, "Clicked on Youtube Icon");
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Navigated back to Home page");
            test.log(Status.INFO, "Navigated back to Home page");
            test.log(Status.PASS, "Navigated back to Home page");
            Reporter.attachScreenshotToReport("Youtube", test, "Youtube Screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Youtube Icon Failed");
            test.log(Status.FAIL, "Clicked on Youtube Icon Failed");
            Reporter.attachScreenshotToReport("Youtube", test, "Youtube Screenshot");
        }
    }
 
    /*
     * Method Name: clickInstagram
     * Author Name: T Gnana Asritha
     * Description: Clicks the Instagram icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickInstagram() {
        try {
            helper.clickByLocator(FooterIconPageLocators.instagram);
            LoggerHandler.info("Clicked on Instagram Icon");
            test.log(Status.INFO, "Clicked on Instagram Icon");
            test.log(Status.PASS, "Clicked on Instagram Icon");
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Navigated back to Home page");
            test.log(Status.INFO, "Navigated back to Home page");
            test.log(Status.PASS, "Navigated back to Home page");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Instagram Icon Failed");
            test.log(Status.FAIL, "Clicked on Instagram Icon Failed");
            Reporter.attachScreenshotToReport("Instagram", test, "Instagram Screenshot");
        }
    }
 
    /*
     * Method Name: clickLinkdin
     * Author Name: T Gnana Asritha
     * Description: Clicks the LinkedIn icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickLinkdin() {
        try {
            helper.clickByLocator(FooterIconPageLocators.linkdin);
            LoggerHandler.info("Clicked on Linkedin Icon");
            test.log(Status.INFO, "Clicked on Linkedin Icon");
            test.log(Status.PASS, "Clicked on Linkedin Icon");
            Reporter.attachScreenshotToReport("Linkedin", test, "Linkedin Screenshot");
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Navigated back to Home page");
            test.log(Status.INFO, "Navigated back to Home page");
            test.log(Status.PASS, "Navigated back to Home page");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Linkedin Icon Failed");
            test.log(Status.FAIL, "Clicked on Linkedin Icon Failed");
            Reporter.attachScreenshotToReport("Linkedin", test, "Linkedin Screenshot");
        }
    }
 
    /*
     * Method Name: clickpintrest
     * Author Name: T Gnana Asritha
     * Description: Clicks the Pinterest icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickpintrest() {
        try {
            helper.clickByLocator(FooterIconPageLocators.pinterest);
            LoggerHandler.info("Clicked on Pinterest Icon");
            test.log(Status.INFO, "Clicked on Pinterest Icon");
            test.log(Status.PASS, "Clicked on Pinterest Icon");
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Navigated back to Home page");
            test.log(Status.INFO, "Navigated back to Home page");
            test.log(Status.PASS, "Navigated back to Home page");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Pinterest Icon Failed");
            test.log(Status.FAIL, "Clicked on Pinterest Icon Failed");
            Reporter.attachScreenshotToReport("Pinterest", test, "Pinterest Screenshot");
 
        }
    }
 
    /*
     * Method Name: clicksnapchat
     * Author Name: T Gnana Asritha
     * Description: Clicks the Snapchat icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clicksnapchat() {
        try {
            helper.clickByLocator(FooterIconPageLocators.snapchat);
            LoggerHandler.info("Clicked on Snapchat Icon");
            test.log(Status.INFO, "Clicked on Snapchat Icon");
            test.log(Status.PASS, "Clicked on Snapchat Icon");
            Reporter.attachScreenshotToReport("Snapchat", test, "Snapchat Screenshot");
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Navigated back to Home page");
            test.log(Status.INFO, "Navigated back to Home page");
            test.log(Status.PASS, "Navigated back to Home page");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Snapchat Icon Failed");
            test.log(Status.FAIL, "Clicked on Snapchat Icon Failed");
            Reporter.attachScreenshotToReport("Snapchat", test, "Snapchat Screenshot");
        }
    }
}
