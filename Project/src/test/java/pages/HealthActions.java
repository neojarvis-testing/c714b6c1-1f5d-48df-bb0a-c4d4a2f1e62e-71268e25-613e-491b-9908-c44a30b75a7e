package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HealthPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HealthActions {
public WebDriverHelper helper;
    ExtentTest test;
    /*
 * Method Name: HealthAction
 * Author Name: Hrushikesh
 * Description: Initializes the HealthAction class by setting up the
 * WebDriverHelper instance and linking the ExtentTest instance for
 * reporting purposes.
 * Return Type: Constructor
 * Parameter List:
 *   - ExtentTest test: Instance of ExtentTest for logging and reporting.
 */

    public HealthActions(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test=test;
    }
    /*
 * Method Name: clickOnHealthLibrary
 * Author Name: Hrushikesh
 * Description: Performs a click operation on the Health Library element
 * to navigate to the health-related content section.
 * Return Type: void
 * Parameter List: None
 */
    public void clickOnHealthLibrary(){
        try{
        helper.clickByLocator(HealthPageLocators.healthLibrary);
        LoggerHandler.info("Clicked on Health Library");
        test.log(Status.INFO, "Clicked on Health Library");
        test.log(Status.PASS,"Clicked on Health Library");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Health Library failed");
            test.log(Status.FAIL,"Clicked on Health Library failed");
            Reporter.attachScreenshotToReport("HealthLibrary", test, "HealthLibrary");
        }
    }
    /*
 * Method Name: clickOnBody
 * Author Name: Hrushikesh
 * Description: Scrolls to the Body Organs element and clicks to navigate
 * to the Body Organs section.
 * Return Type: void
 * Parameter List: None
 */
    public void clickOnBody(){
        try{
        helper.scrollToAnElement(HealthPageLocators.bodyOrgans);
        helper.clickByLocator(HealthPageLocators.bodyOrgans);
        LoggerHandler.info("Clicked on BodyOrgans");
        test.log(Status.INFO, "Clicked on BodyOrgans");
        test.log(Status.PASS,"Clicked on BodyOrgans");
        }catch(Exception e){
            LoggerHandler.error("Clicked on BodyOrgans failed");
            test.log(Status.FAIL,"Clicked on BodyOrgans failed");
            Reporter.attachScreenshotToReport("BodyOrgans", test, "BodyOrgans");
        }
    }
 /*
 * Method Name: enterEyes
 * Author Name: Hrushikesh
 * Description: Performs actions in the search bar by entering the term
 * "Eyes" and executing an enter key action.
 * Return Type: void
 * Parameter List: None
 */
    public void enterEyes(String str){
        try{
            helper.clickByLocator(HealthPageLocators.searchBar);
            helper.sendData(HealthPageLocators.searchBar, str);
            helper.enterAction(HealthPageLocators.searchBar);
            LoggerHandler.info("Eyes action performed");
            test.log(Status.INFO, "Eyes action performed");
            test.log(Status.PASS,"Eyes action performed");
        }catch(Exception e){
            LoggerHandler.error("Eyes action failed");
            test.log(Status.FAIL,"Eyes action failed");
            Reporter.attachScreenshotToReport("Eyes", test, "Eyes");
        }
    }
    /*
 * Method Name: clickOnEye
 * Author Name: Hrushikesh
 * Description: Clicks on the Eye element to navigate to detailed
 * information about the Eye section.
 * Return Type: void
 * Parameter List: None
 */
    public void clickOnEye(){
        try{
            helper.clickByLocator(HealthPageLocators.eyes);
            LoggerHandler.info("Clicked on Eye");
            test.log(Status.INFO, "Clicked on Eye");
            test.log(Status.PASS,"Clicked on Eye");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Eye failed");
            test.log(Status.FAIL,"Clicked on Eye failed");
            Reporter.attachScreenshotToReport("Eye", test, "Eye");
        }
    }
    /*
 * Method Name: clickOnRedEye
 * Author Name: Hrushikesh
 * Description: Scrolls to the Red Eye element, clicks to navigate, and
 * switches to a new browser tab for additional content.
 * Return Type: void
 * Parameter List: None
 */
    public void clickOnRedEye(){
        try{
            helper.scrollToAnElement(HealthPageLocators.redEye);
            helper.clickByLocator(HealthPageLocators.redEye);
            helper.switchToNewTab();
            LoggerHandler.info("Clicked on RedEye");
            test.log(Status.INFO, "Clicked on RedEye");
            test.log(Status.PASS,"Clicked on RedEye");
            Screenshot.takeScreenshot("RedEye");
            Reporter.attachScreenshotToReport("RedEye", test, "RedEye");
        }catch(Exception e){
            LoggerHandler.error("Clicked on RedEye failed");
            test.log(Status.FAIL,"Clicked on RedEye failed");
            Reporter.attachScreenshotToReport("RedEye", test, "RedEye");
        }
    }
}
