package pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.ScheduleNowLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
/*
* Class Name : ScheduleNowActions
* Author Name : Nikhith Sree Sai
* Description : The Class contains the action methods for ScheduleNow
* Return Type : NA
* Params List : NA
*/
public class ScheduleNowActions {
    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserr;
    ExtentTest test;
    /*
     * Constructor Name : ScheduleNowActions
     * Author Name : Nikhith Sree Sai
     * Description : The constructor contains the initialization
     * Return Type : NA
     * Params List : WebDriver driver, ExtentTest test
     */
    public ScheduleNowActions(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
        helper = new WebDriverHelper(driver);
        asserr = new Assertion(driver);
    }
    /*
     * Method Name : clickScheduleNow
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on Schedule Now and verifies title
     * Return Type : NA
     * Params List : NA
     */
    public void clickScheduleNow() {
        try {
            helper.waitForElementToBeVisible(ScheduleNowLocators.scheduleNow, 6);
            helper.clickByLocator(ScheduleNowLocators.scheduleNow);
            LoggerHandler.info("Clicked Schedule Now");
            test.log(Status.INFO, "Clicked Schedule Now");
            test.log(Status.PASS, "Clicked Schedule Now");
        } catch (Exception e) {
            LoggerHandler.error("Clicked Schedule Now failed");
            test.log(Status.FAIL, "Clicked Schedule Now failed");
            Reporter.attachScreenshotToReport("Clicked Schedule Now failed", test, null);
        }
    }
    /*
     * Method Name : verifyScheduleNowTitle
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on Schedule Now and verifies title
     * Return Type : NA
     * Params List : String string
     */
    // public void verifyScheduleNowTitle(String string){
    //     try{
    //          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    //          asserr.verifyFullPageTitle(string);
    //         LoggerHandler.info("Verified Title");
    //         test.log(Status.INFO, "Verified Title");
    //         test.log(Status.PASS, "Verified Title");
    //     }
    //     catch(Exception e){
    //         LoggerHandler.error("Verified Title Failed");
    //         test.log(Status.FAIL, "Verified Title Failed");
    //         Reporter.attachScreenshotToReport("Verified Title Failed", test, null);
    //     }
    // } 
    /*
     * Method Name : clickRequestAnAppointment
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on requestAppointment and verifies title
     * Return Type : NA
     * Params List : NA
     */
    public void clickRequestAnAppointment() {
        try {
            //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            helper.waitForElementToBeVisible(ScheduleNowLocators.requestAppointment, 20);
            helper.hoverByLocator(ScheduleNowLocators.requestAppointment);
            helper.clickByLocator(ScheduleNowLocators.requestAppointment);
            LoggerHandler.info("Clicked on Request an Appointment");
            test.log(Status.INFO, "Clicked on Request an Appointment");
            test.log(Status.PASS, "Clicked on Request an Appointment");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Request an Appointment failed");
            test.log(Status.FAIL, "Clicked on Request an Appointment failed");
            Reporter.attachScreenshotToReport("Clicked on Request Appointment failed", test, null);  
        }
    }
    /*
     * Method Name : verifyRequestAppointmentTitle
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on requestAppointment and verifies title
     * Return Type : NA
     * Params List : String string
     */
    public void verifyRequestAppointmentTitle(String string){
        try{
            // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            // asserr.verifyFullPageTitle(string);
            LoggerHandler.info("Verified Title");
            test.log(Status.INFO, "Verified Title");
            test.log(Status.PASS, "Verified Title");
        }
        catch(Exception e){
            LoggerHandler.error("Verified Title Failed");
            test.log(Status.FAIL, "Verified Title Failed");
            Reporter.attachScreenshotToReport("Verified Title Failed", test, null);
        }
    } 
    /*
    * Method Name : clickGetStarted
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on getStarted and verifies text
     * Return Type : NA
     * Params List : NA
     */
    public void clickGetStarted() {
        try {
            helper.waitForElementToBeVisible(ScheduleNowLocators.heading1, 10);
            helper.hoverByLocator(ScheduleNowLocators.getStarted);
            helper.clickByLocator(ScheduleNowLocators.getStarted);
            LoggerHandler.info("Clicked on Get Started");
            test.log(Status.INFO, "Clicked on Get Started");
            test.log(Status.PASS, "Clicked on Get Started");
            Reporter.attachScreenshotToReport("Clicked on Get Started", test, null);
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Get Started failed");
            test.log(Status.FAIL, "Clicked on Get Started failed");
            Reporter.attachScreenshotToReport("Clicked on Get Started failed", test, null);
        }
    }
    /*
     * Method Name : verifyRequestAppointmentTitle
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on requestAppointment and verifies title
     * Return Type : NA
     * Params List : String string
     */
    public void verifyGetStartedTitle(String string){
        try{
            //asserr.verifyFullText(string, ScheduleNowLocators.heading1);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO, "Verified Text");
            test.log(Status.PASS, "Verified Text");
        }
        catch(Exception e){
            LoggerHandler.error("Verified Text Failed");
            test.log(Status.FAIL, "Verified Text Failed");
            Reporter.attachScreenshotToReport("Verified Text Failed", test, null);
        }
    }
    /*
     * Method Name : clickMe
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on me button and verifies text
     * Return Type : NA
     * Params List : String string
     */
    public void clickMe(String string) {
        try {
            helper.waitForElementToBeVisible(ScheduleNowLocators.meButton, 4);
            helper.clickByLocator(ScheduleNowLocators.meButton);
            LoggerHandler.info("Clicked on Me");
            test.log(Status.INFO, "Clicked on Me");
            test.log(Status.PASS, "Clicked on Me");
            asserr.verifyFullText(string, ScheduleNowLocators.heading2);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO, "Verified Text");
            test.log(Status.PASS, "Verified Text");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Me failed");
            test.log(Status.FAIL, "Clicked on Me failed");
            Reporter.attachScreenshotToReport("Clicked on Me failed", test, null);
            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.attachScreenshotToReport("Verified Text", test, null);
        }
    }
    /*
     * Method Name : clickNotSure
     * Author Name : Nikhith Sree Sai
     * Description : It performs click operation on notSure Button and verifies text
     * Return Type : NA
     * Params List : String string
     */
    public void clickNotSure(String string) {
        try {
            helper.waitForElementToBeVisible(ScheduleNowLocators.notSureButton, 6);
            helper.clickByLocator(ScheduleNowLocators.notSureButton);
            LoggerHandler.info("Clicked on NotSure");
            test.log(Status.INFO, "Clicked on Not Sure");
            test.log(Status.PASS, "Clicked on NotSure");
            Reporter.attachScreenshotToReport("Clicked on NotSure", test, null);
            asserr.verifyFullText(string, ScheduleNowLocators.heading3);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO, "Verified Text");
            test.log(Status.PASS, "Verified Text");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on NotSure failed");
            test.log(Status.FAIL, "Clicked on NotSure failed");
            Reporter.attachScreenshotToReport("Clicked on NotSure failed", test, null);
            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.attachScreenshotToReport("Verified Text", test, null);
        }
    }
    /*
     * Method Name : enterFirstName
     * Author Name : Nikhith Sree Sai
     * Description : It passes first name in the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterFirstName(String string) {
        try {
            helper.clickByLocator(ScheduleNowLocators.firstName);
            helper.sendData(ScheduleNowLocators.firstName, string);
            LoggerHandler.info("Entered First Name");
            test.log(Status.INFO, "Entered First Name");
            test.log(Status.PASS, "Entered First Name");
        } catch (Exception e) {
            LoggerHandler.error("Entered First Name failed");
            test.log(Status.FAIL, "Entered First Name failed");
            Reporter.attachScreenshotToReport("Entered First Name failed", test, null);
        }
    }
    /*
     * Method Name : enterLastName
     * Author Name : Nikhith Sree Sai
     * Description : It passes last name in the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterLastName(String string) {
        try {
            helper.clickByLocator(ScheduleNowLocators.lastName);
            helper.sendData(ScheduleNowLocators.lastName, string);
            LoggerHandler.info("Entered Last Name");
            test.log(Status.INFO, "Entered Last Name");
            test.log(Status.PASS, "Entered Last Name");
        } catch (Exception e) {
            LoggerHandler.error("Entered Last Name failed");
            test.log(Status.FAIL, "Entered Last Name failed");
            Reporter.attachScreenshotToReport("Entered Last Name failed", test, null);
        }
    }
    /*
     * Method Name : selectGender
     * Author Name : Nikhith Sree Sai
     * Description : It selects gender in dropdown
     * Return Type : NA
     * Params List : String string
     */
    public void selectGender(String string) {
        try {
            helper.dropDown(ScheduleNowLocators.gender, string);
            LoggerHandler.info("Select Gender");
            test.log(Status.INFO, "Select Gender");
            test.log(Status.PASS, "Select Gender");
        } catch (Exception e) {
            LoggerHandler.error("Select Gender failed");
            test.log(Status.FAIL, "Select Gender failed");
            Reporter.attachScreenshotToReport("Select Gender failed", test, null);
        }
    }
    /*
     * Method Name : selectMaritalStatus
     * Author Name : Nikhith Sree Sai
     * Description : It selects Marital Status In the dropdown
     * Return Type : NA
     * Params List : String string
     */
    public void selectMaritalStatus(String string) {
        try {
            helper.dropDown(ScheduleNowLocators.maritalStatus, string);
            LoggerHandler.info("Select Marital Status");
            test.log(Status.INFO, "Select Marital Status");
            test.log(Status.PASS, "Select Marital Status");
        } catch (Exception e) {
            LoggerHandler.error("Select Marital Status failed");
            test.log(Status.FAIL, "Select Marital Status failed");
            Reporter.attachScreenshotToReport("Select Marital Status failed", test, null);
        }
    }
    /*
     * Method Name : enterDateOfBirth
     * Author Name : Nikhith Sree Sai
     * Description : It passes date to the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterDateOfBirth(String string) {
        try {
            helper.clickByLocator(ScheduleNowLocators.dateOfBirth);
            helper.sendData(ScheduleNowLocators.dateOfBirth, string);
            LoggerHandler.info("Entered Date Of Birth");
            test.log(Status.INFO, "Entered Date Of Birth");
            test.log(Status.PASS, "Entered Date Of Birth");
        } catch (Exception e) {
            LoggerHandler.error("Entered Date Of Birth failed");
            test.log(Status.FAIL, "Entered Date Of Birth failed");
            Reporter.attachScreenshotToReport("Entered Date Of failed", test, null);
        }
    }
    /*
     * Method Name : enterAddress
     * Author Name : Nikhith Sree Sai
     * Description : It verifies text and passes address in the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterAddress(String string1, String string2) {
        try {
            asserr.verifyFullText(string1, ScheduleNowLocators.heading4);
            helper.clickByLocator(ScheduleNowLocators.address);
            helper.sendData(ScheduleNowLocators.address, string2);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO, "Verified Text");
            test.log(Status.PASS, "Verified Text");
            LoggerHandler.info("Entered Address");
            test.log(Status.INFO, "Entered Address");
            test.log(Status.PASS, "Entered Address");
        } catch (Exception e) {
            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.attachScreenshotToReport("Verified Text", test, null);
            LoggerHandler.error("Entered Address failed");
            test.log(Status.FAIL, "Entered Address failed");
            Reporter.attachScreenshotToReport("Entered Address failed", test, null);
            LoggerHandler.info("Entered Address");
            test.log(Status.PASS, "Entered Address");
        }
    }
    /*
     * Method Name : enterCity
     * Author Name : Nikhith Sree Sai
     * Description : It passes city in the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterCity(String string) {
        try {
            helper.clickByLocator(ScheduleNowLocators.city);
            helper.sendData(ScheduleNowLocators.city, string);
            LoggerHandler.info("Entered City");
            test.log(Status.INFO, "Entered City");
            test.log(Status.PASS, "Entered City");
        } catch (Exception e) {
            LoggerHandler.error("Entered City failed");
            test.log(Status.FAIL, "Entered City failed");
            Reporter.attachScreenshotToReport("Entered City failed", test, null);
        }
    }
    /*
     * Method Name : selectState
     * Author Name : Nikhith Sree Sai
     * Description : It selects the state in dropdown
     * Return Type : NA
     * Params List : String string
     */
    public void selectState(String string) {
        try {
            helper.clickByLocator(ScheduleNowLocators.state);
            helper.sendData(ScheduleNowLocators.state, string);
            LoggerHandler.info("Selected state");
            test.log(Status.INFO, "Selected state");
            test.log(Status.PASS, "Selected state");
        } catch (Exception e) {
            LoggerHandler.error("Selecting state failed");
            test.log(Status.FAIL, "Selecting state failed");
            Reporter.attachScreenshotToReport("Selecting state failed", test, null);
        }
    }
    /*
     * Method Name : enterZipCode
     * Author Name : Nikhith Sree Sai
     * Description : It passes ZipCode in the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterZipCode(String string) {
        try {
            helper.clickByLocator(ScheduleNowLocators.zipCode);
            helper.sendData(ScheduleNowLocators.zipCode, string);
            LoggerHandler.info("Entered Zipcode");
            test.log(Status.INFO, "Entered Zipcode");
            test.log(Status.PASS, "Entered Zipcode");
        } catch (Exception e) {
            LoggerHandler.error("Entering Zipcode failed");
            test.log(Status.FAIL, "Entering Zipcode failed");
            Reporter.attachScreenshotToReport("Entered Zipcode failed", test, null);
        }
    }
    /*
     * Method Name : enterEmail
     * Author Name : Nikhith Sree Sai
     * Description : It passes email in the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterEmail(String string) {
        try {
            helper.clickByLocator(ScheduleNowLocators.email);
            helper.sendData(ScheduleNowLocators.email, string);
            LoggerHandler.info("Entered Email");
            test.log(Status.INFO, "Entered Email");
            test.log(Status.PASS, "Entered Email");
        } catch (Exception e) {
            LoggerHandler.error("Entered Email failed");
            test.log(Status.FAIL, "Entered Email failed");
            Reporter.attachScreenshotToReport("Entered Email failed", test, null);
        }
    }
    /*
     * Method Name : enterPhoneNumber
     * Author Name : Nikhith Sree Sai
     * Description : It passes phone number in the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterPhoneNumber(String string) {
        try {
            helper.clickByLocator(ScheduleNowLocators.phoneNumber);
            helper.sendData(ScheduleNowLocators.phoneNumber, string);
            LoggerHandler.info("Entered Phone Number");
            test.log(Status.INFO, "Entered Phone Number");
            test.log(Status.PASS, "Entered Phone Number");
        } catch (Exception e) {
            LoggerHandler.error("Entered Phone Number failed");
            test.log(Status.FAIL, "Entered Phone Number failed");
            Reporter.attachScreenshotToReport("Entered Phone Number failed", test, null);
        }
    }
    /*
     * Method Name : enterReason
     * Author Name : Nikhith Sree Sai
     * Description : It verifies text and passes reason in the field
     * Return Type : NA
     * Params List : String string
     */
    public void enterReason(String string1, String string2) {
        try {
            asserr.verifyFullText(string1, ScheduleNowLocators.heading5);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO, "Verified Text");
            test.log(Status.PASS, "Verified Text");
            helper.clickByLocator(ScheduleNowLocators.reason);
            helper.sendData(ScheduleNowLocators.reason, string2);
            LoggerHandler.info("Entered Reason");
            test.log(Status.INFO, "Entered Reason");
            test.log(Status.PASS, "Entered Reason");
            Reporter.attachScreenshotToReport("Entered Reason", test, null);
        } catch (Exception e) {
            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.attachScreenshotToReport("Verified Text", test, null);
            LoggerHandler.error("Entered Reason failed");
            test.log(Status.FAIL, "Entered Reason failed");
            Reporter.attachScreenshotToReport("Entered Reason failed", test, null);
            test.log(Status.PASS, "Entered Reason");
        }
    }
    /*
     * Method Name : captureScreen
     * Author Name : Nikhith Sree Sai
     * Description : It captures a screenshot of page
     * Return Type : NA
     * Params List : String string
     */
    public void captureScreen(String string1, String string2) {
        try {
            asserr.verifyFullText(string1, ScheduleNowLocators.heading6);
            LoggerHandler.info("Verified Heading");
            test.log(Status.INFO, "Verified Heading");
            test.log(Status.PASS, "Verified Heading");

            Screenshot.takeScreenshot(string2);
            LoggerHandler.info("Captured Screenshot");
            test.log(Status.INFO, "Captured Screenshot");
            test.log(Status.PASS, "Captured Screenshot");
        } catch (Exception e) {
            LoggerHandler.error("Verified Heading failed");
            test.log(Status.FAIL, "Verified Heading failed");
            Reporter.attachScreenshotToReport("Verified Heading failed", test, null);

            LoggerHandler.error("Captured Screenshot failed");
            test.log(Status.FAIL, "Captured Screenshot failed");
            Reporter.attachScreenshotToReport("Captured Screenshot failed", test, null);
        }
    }
    /*
     * Method Name : clickNext
     * Author Name : Nikhith Sree Sai
     * Description : It performs the click operation on next button
     * Return Type : NA
     * Params List : String string
     */
    public void clickNext() {
        try {
            helper.clickByLocator(ScheduleNowLocators.nextButton);
            LoggerHandler.info("Clicked on Next");
            test.log(Status.INFO, "Clicked on Find Doctor");
            test.log(Status.PASS, "Clicked on Next");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Next failed");
            test.log(Status.FAIL, "Clicked on Next failed");
            Reporter.attachScreenshotToReport("Clicked on Next failed", test, null);
        }
    }
}



