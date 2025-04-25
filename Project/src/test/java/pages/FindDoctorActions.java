package pages;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.FindDoctorLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;
/*
* Class Name : FindDoctorActions
* Author Name : Nikhith Sree Sai
* Description : The Class contains the action methods for FindDoctor
* Return Type : NA
* Params List : NA
*/
public class FindDoctorActions {
    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserr;
    ExtentTest test;
    /*
     * Constructor Name : FindDoctorActions
     * Author Name : Nikhith Sree Sai
     * Description : The constructor contains the initialization
     * Return Type : NA
     * Params List : WebDriver driver, ExtentTest test
     */
    public FindDoctorActions(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
        helper = new WebDriverHelper(driver);
    }
    /*
     * Method Name : clickFindDoctor
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on the findDoctor locator
     * Return Type : NA
     * Params List : NA
     */
    public void clickFindDoctor() {
        try {
            helper.clickByLocator(FindDoctorLocators.findDoctor);
            LoggerHandler.info("Clicked on Find Doctor");
            test.log(Status.INFO, "Clicked on Find Doctor");
            test.log(Status.PASS, "Clicked on Find Doctor");
            Reporter.attachScreenshotToReport("Clicked on Find Doctor", test, null);
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Find Doctor failed");
            test.log(Status.FAIL, "Clicked on Find Doctor failed");
            Reporter.attachScreenshotToReport("Clicked on Find Doctor failed", test, null);
        }
    }
    /*
     * Method Name : enterHeart
     * Author Name : Nikhith Sree Sai
     * Description : It passes heart value to search bar and performs enter action
     * Return Type : NA
     * Params List : String string
     */
    public void enterHeart(String string) {
        try {
            helper.clickByLocator(FindDoctorLocators.searchBar);
            helper.sendData(FindDoctorLocators.searchBar, string);
            LoggerHandler.info("Entered input Heart");
            test.log(Status.INFO, "Entered input Heart");
            test.log(Status.PASS, "Entered input Heart");
            helper.enterAction(FindDoctorLocators.searchBar);
        } catch (Exception e) {
            LoggerHandler.error("Entered input Heart failed");
            test.log(Status.FAIL, "Entered input Heart failed");
            Reporter.attachScreenshotToReport("Entered input Heart failed", test, null);
        }
    }
    /*
     * Method Name : enterLocation
     * Author Name : Nikhith Sree Sai
     * Description : It passes location value to filter and performs click operation
     * Return Type : NA
     * Params List : String string
     */
    public void enterLocation(String string) {
        try {
            helper.waitForElementToBeVisible(FindDoctorLocators.location, 10);
            helper.clickByLocator(FindDoctorLocators.location);
            helper.sendData(FindDoctorLocators.location, string);
            LoggerHandler.info("Entered Location");
            test.log(Status.INFO, "Entered Location");
            test.log(Status.PASS, "Entered Location");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Location failed");
            test.log(Status.FAIL, "Entered Location failed");
            Reporter.attachScreenshotToReport("Entered Location failed", test, null);
        }
    }
    /*
     * Method Name : enterLocationValue
     * Author Name : Nikhith Sree Sai
     * Description : It passes location value to filter and performs click operation
     * Return Type : NA
     * Params List : NA
     */
    public void clickLocationValue(){
        try{
            helper.waitForElementToBeVisible(FindDoctorLocators.loc, 10);
            helper.hoverByLocator(FindDoctorLocators.loc);
            helper.clickByLocator(FindDoctorLocators.loc);
            LoggerHandler.info("Clicked Location Value");
            test.log(Status.INFO, "Clicked Location Value");
            test.log(Status.PASS, "Clicked Location Value");
            Reporter.attachScreenshotToReport("Clicked Location Value", test, null);
        } catch (Exception e) {
            LoggerHandler.error("Clicked Location Value failed");
            test.log(Status.FAIL, "Clicked Location Value failed");
            Reporter.attachScreenshotToReport("Clicked Location Value failed", test, null);
        }
    }
    /*
     * Method Name : enterDepartment
     * Author Name : Nikhith Sree Sai
     * Description : It passes department value to filter and performs click operation
     * Return Type : NA
     * Params List : String string
     */
    public void enterDepartment(String string) {
        try {
            helper.waitForElementToBeVisible(FindDoctorLocators.department, 10);
            helper.clickByLocator(FindDoctorLocators.department);
            helper.sendData(FindDoctorLocators.department, string);
            LoggerHandler.info("Entered Department");
            test.log(Status.INFO, "Entered Department");
            test.log(Status.PASS, "Entered Department");

        } catch (Exception e) {
            LoggerHandler.error("Entered Department failed");
            test.log(Status.FAIL, "Entered Department failed");
            Reporter.attachScreenshotToReport("Entered Department failed", test, null);
        }
    }
    /*
     * Method Name : clickDepartmentValue
     * Author Name : Nikhith Sree Sai
     * Description : It passes department value to filter and performs click operation
     * Return Type : NA
     * Params List : String string
     */
    public void clickDepartmentValue(){
        try{
            helper.waitForElementToBeVisible(FindDoctorLocators.dept, 10);
            helper.hoverByLocator(FindDoctorLocators.dept);
            helper.clickByLocator(FindDoctorLocators.dept);
            LoggerHandler.info("Clicked Department Value");
            test.log(Status.INFO, "Clicked Department Value");
            test.log(Status.PASS, "Clicked Department Value");
            Reporter.attachScreenshotToReport("Clicked Department Value", test, null);
        }
        catch(Exception e){
            LoggerHandler.error("Clicked Department Value failed");
            test.log(Status.FAIL, "Clicked Department Value failed");
            Reporter.attachScreenshotToReport("Clicked Department Value failed", test, null);

        }
    }
    /*
     * Method Name : enterLanguage
     * Author Name : Nikhith Sree Sai
     * Description : It passes language value to filter and performs enter action
     * Return Type : NA
     * Params List : String string
     */
    public void enterLanguage(String string) {
        try {
            helper.waitForElementToBeVisible(FindDoctorLocators.language, 10);
            helper.clickByLocator(FindDoctorLocators.language);
            helper.sendData(FindDoctorLocators.language, string);
            helper.enterAction(FindDoctorLocators.language);
            LoggerHandler.info("Entered Language");
            test.log(Status.INFO, "Entered Language");
            test.log(Status.PASS, "Entered Language");
            Reporter.attachScreenshotToReport("Entered Language", test, null);
        } catch (Exception e) {
            LoggerHandler.error("Entered Language failed");
            test.log(Status.FAIL, "Entered Language failed");
            Reporter.attachScreenshotToReport("Entered Language failed", test, null);
        }
    }
}
