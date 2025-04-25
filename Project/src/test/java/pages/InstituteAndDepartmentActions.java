package pages;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.InstituteAndDepartmentsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
public class InstituteAndDepartmentActions {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public static Assertion assertion;
    public static WebDriver driver;
    /**
	 * @author 10831342 - Prithviraj Seth
	 * Constructor Name : AppointmentPatientVisitorsActions
	 * Description : It initializes WebDriverHelper
	 * @param test
	 */
    public InstituteAndDepartmentActions(ExtentTest test) {
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    /*
     * Method Name: clickOnInstituteAndDepartment
     * Author Name: Prithviraj Seth
     * Description: click on Institute And Department
     * Return Type: void
     * Params List: NA
     */
    public void clickOnInstituteAndDepartment() {
        try {
            helper.waitForElementToBeVisible(InstituteAndDepartmentsPageLocators.instituteAndDepartment, 10);
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.instituteAndDepartment);
            LoggerHandler.info("Clicked on Institute and Department");
            test.log(Status.INFO, "Clicked on Institute and Department");
            test.log(Status.PASS, "Clicked on Institute and Department");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Institute and Department failed");
            test.log(Status.FAIL, "Clicked on Institute and Department failed");
            Reporter.attachScreenshotToReport("Clicked on Institute and Department failed", test, "Clicked on Institute and Department failed");
        }
    }
    /*
     * Method Name: clickOnBloodManagement
     * Author Name: Prithviraj Seth
     * Description: Click On Blood Management
     * Return Type: void
     * Params List: NA
     */
    public void clickOnBloodManagement() {
        try {
            helper.scrollByPixel(0, 3000);
            helper.waitForElementToBeVisible(InstituteAndDepartmentsPageLocators.bloodManagement, 10);
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.bloodManagement);
            Screenshot.takeScreenshot("popup");
            Reporter.attachScreenshotToReport("popup", test, "popup");
            LoggerHandler.info("Clicked on Blood Management");
            test.log(Status.INFO, "Clicked on Blood Management");
            test.log(Status.PASS, "Clicked on Blood Management");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Blood Management failed");
            test.log(Status.FAIL, "Clicked on Blood Management failed");
            Reporter.attachScreenshotToReport("Clicked on Blood Management failed", test,
                    "Clicked on Blood Management failed");
        }
    }
    /*
     * Method Name: clickOnFrequentlyAskedQuestion
     * Author Name: Prithviraj Seth
     * Description: Click On Frequently Asked Question
     * Return Type: void
     * Params List: NA
     */
    public void clickOnFrequentlyAskedQuestion() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.frequentlyAskedQuestions);
            LoggerHandler.info("Clicked on Frequently Asked Question");
            test.log(Status.INFO, "Clicked on Frequently Asked Question");
            test.log(Status.PASS, "Clicked on Frequently Asked Question");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Frequently Asked Question failed");
            test.log(Status.FAIL, "Clicked on Frequently Asked Question failed");
            Reporter.attachScreenshotToReport("Clicked on Frequently Asked Question failed", test,
                    "Clicked on Frequently Asked Question failed");
        }
    }
    /*
     * Method Name: clickOnPreparingForSurgery
     * Author Name: Prithviraj Seth
     * Description: Click On Preparing For Surgery
     * Return Type: void
     * Params List: NA
     */
    public void clickOnPreparingForSurgery() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.preparingForSurgery);
            LoggerHandler.info("Clicked on Preparing For Surgery");
            test.log(Status.INFO, "Clicked on Preparing For Surgery");
            test.log(Status.PASS, "Clicked on Preparing For Surgery");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Preparing For Surgery failed");
            test.log(Status.FAIL, "Clicked on Preparing For Surgery failed");
            Reporter.attachScreenshotToReport("Clicked on Preparing For Surgery failed", test,
                    "Clicked on Preparing For Surgery failed");
        }
    }
    /*
     * Method Name: clickOnAnemia
     * Author Name: Prithviraj Seth
     * Description: Click On Anemia
     * Return Type: void
     * Params List: NA
     */
    public void clickOnAnemia() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.anemia);
            LoggerHandler.info("Clicked on Anemia");
            test.log(Status.INFO, "Clicked on Anemia");
            test.log(Status.PASS, "Clicked on Anemia");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Anemia failed");
            test.log(Status.FAIL, "Clicked on Anemia failed");
            Reporter.attachScreenshotToReport("Clicked on Anemia failed", test, "Clicked on Anemia failed");
        }
    }
    /*
     * Method Name: clickOnRefusingABloodTransfusion
     * Author Name: Prithviraj Seth
     * Description: Click On Refusing A Blood Transfusion
     * Return Type: void
     * Params List: NA
     */
    public void clickOnRefusingABloodTransfusion() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.refusingABloodTransfusion);
            LoggerHandler.info("Clicked on Refusing A Blood Transfusion");
            test.log(Status.INFO, "Clicked on Refusing A Blood Transfusion");
            test.log(Status.PASS, "Clicked on Refusing A Blood Transfusion");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Refusing A Blood Transfusion failed");
            test.log(Status.FAIL, "Clicked on Refusing A Blood Transfusion failed");
            Reporter.attachScreenshotToReport("Clicked on Refusing A Blood Transfusion failed", test,
                    "Clicked on Refusing A Blood Transfusion failed");
        }
    }
    /*
     * Method Name: clickOnLocations
     * Author Name: Prithviraj Seth
     * Description: Click On Locations
     * Return Type: void
     * Params List: NA
     */
    public void clickOnLocations() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.locations);
            LoggerHandler.info("Clicked on Locations");
            test.log(Status.INFO, "Clicked on Locations");
            test.log(Status.PASS, "Clicked on Locations");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Locations failed");
            test.log(Status.FAIL, "Clicked on Locations failed");
            Reporter.attachScreenshotToReport("Clicked on Locations failed", test, "Clicked on Locations failed");
        }
    }
    /*
     * Method Name: clickOnContactsBloodManagement
     * Author Name: Prithviraj Seth
     * Description: Click on Contact Us button
     * Return Type: void
     * Params List: NA
     */
    public void clickOnContactsBloodManagement() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.contactsBloodManagement);
            LoggerHandler.info("Clicked on contacts");
            test.log(Status.INFO, "Clicked on contacts");
            test.log(Status.PASS, "Clicked on contacts");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on contacts failed");
            test.log(Status.FAIL, "Clicked on contacts failed");
            Reporter.attachScreenshotToReport("Clicked on contacts failed", test, "Clicked on contacts failed");
        }
    }
    /*
     * Method Name: clickOnPharmacy
     * Author Name: Prithviraj Seth
     * Description: Click On Pharmacy
     * Return Type: void
     * Params List: NA
     */
    public void clickOnPharmacy() {
        try {
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.pharmacy);
            LoggerHandler.info("Clicked on Pharmacy");
            test.log(Status.INFO, "Clicked on Pharmacy");
            test.log(Status.PASS, "Clicked on Pharmacy");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Pharmacy failed");
            test.log(Status.FAIL, "Clicked on Pharmacy failed");
            Reporter.attachScreenshotToReport("Clicked on Pharmacy failed", test, "Clicked on Pharmacy failed");
        }
    }
    /*
     * Method Name: switchTabToTakeTheSurvey
     * Author Name: Prithviraj Seth
     * Description: Switch Tab To Take The Survey
     * Return Type: void
     * Params List: NA
     */
    public void switchTabToTakeTheSurvey() {
        try {
            helper.scrollByPixel(0, 5000);
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.takeTheSurvey);
            helper.switchToNewTab();
            helper.goBackToWindow(0);
            LoggerHandler.info("verify forms");
            test.log(Status.PASS, "verify forms");
            LoggerHandler.info("Switched tab to take the survey");
            test.log(Status.INFO, "Switched tab to take the survey");
            test.log(Status.PASS, "Switched tab to take the survey");
            LoggerHandler.info("verify forms");
            test.log(Status.INFO, "verify forms");
            test.log(Status.PASS, "verify forms");
            Reporter.attachScreenshotToReport("Switched tab to take the survey failed", test,
            "Switched tab to take the survey failed");
        } catch (Exception e) {
            LoggerHandler.error("Switched tab to take the survey failed");
            test.log(Status.FAIL, "Switched tab to take the survey failed");
            Reporter.attachScreenshotToReport("Switched tab to take the survey failed", test,
                    "Switched tab to take the survey failed");
        }
    }
    /*
     * Method Name: clickOnContactUs
     * Author Name: Prithviraj Seth
     * Description: Click On Contact Us
     * Return Type: void
     * Params List: NA
     */
    public void clickOnContactUs() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.contactUs);
            LoggerHandler.info("Clicked on Contact us");
            test.log(Status.INFO, "Clicked on Contact us");
            test.log(Status.PASS, "Clicked on Contact us");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Contact us failed");
            test.log(Status.FAIL, "Clicked on Contact us failed");
            Reporter.attachScreenshotToReport("Clicked on Contact us failed", test, "Clicked on Contact us failed");
        }
    }
    /*
     * Method Name: clickOnContactClevelandClinic
     * Author Name: Prithviraj Seth
     * Description: Click On Contact Cleveland Clinic
     * Return Type: void
     * Params List: NA
     */
    public void clickOnContactClevelandClinic() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.contactClevelandClinic);
            LoggerHandler.info("Clicked on Contact Cleveland Clinic");
            test.log(Status.INFO, "Clicked on Contact Cleveland Clinic");
            test.log(Status.PASS, "Clicked on Contact Cleveland Clinic");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Contact Cleveland Clinic failed");
            test.log(Status.FAIL, "Clicked on Contact Cleveland Clinic failed");
            Reporter.attachScreenshotToReport("Clicked on Contact Cleveland Clinic failed", test,
                    "Clicked on Contact Cleveland Clinic failed");
        }
    }
    /*
     * Method Name: clickOnNeedHelp
     * Author Name: Prithviraj Seth
     * Description: Click On Need Help
     * Return Type: void
     * Params List: NA
     */
    public void clickOnNeedHelp() {
        try {
            helper.waitForElementToBeClickable(InstituteAndDepartmentsPageLocators.needHelp, 10);
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.needHelp);
            LoggerHandler.info("Clicked on Need Help");
            test.log(Status.INFO, "Clicked on Need Help");
            test.log(Status.PASS, "Clicked on Need Help");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Need Help failed");
            test.log(Status.FAIL, "Clicked on Need Help failed");
            Reporter.attachScreenshotToReport("Clicked on Need Help failed", test, "Clicked on Need Help failed");
        }
    }
    /*
     * Method Name: clickOnParking
     * Author Name: Prithviraj Seth
     * Description: Click On Parking
     * Return Type: void
     * Params List: NA
     */
    public void clickOnParking() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.parking);
            LoggerHandler.info("click on parking");
            test.log(Status.INFO, "click on parking");
            test.log(Status.PASS, "click on parking");
        } catch (Exception e) {
            LoggerHandler.error("Failed Clicked on Parking failed");
            test.log(Status.FAIL, "Failed Clicked on Parking failed");
            Reporter.attachScreenshotToReport("Failed Clicked on Parking failed", test, "Failed Clicked on Parking failed");
        }
    }
    /*
     * Method Name: clickOnTravelAssistance
     * Author Name: Prithviraj Seth
     * Description: Click On Travel Assistance
     * Return Type: void
     * Params List: NA
     */
    public void clickOnTravelAssistance() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.travelAssistance);
            LoggerHandler.info("Clicked on Travel Assistance");
            test.log(Status.INFO, "Clicked on Travel Assistance");
            test.log(Status.PASS, "Clicked on Travel Assistance");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Travel Assistance failed");
            test.log(Status.FAIL, "Clicked on Travel Assistance failed");
            Reporter.attachScreenshotToReport("Clicked on Travel Assistance failed", test,
                    "Clicked on Travel Assistance failed");
        }
    }
    /*
     * Method Name: clickOnGlobalPatientServices
     * Author Name: Prithviraj Seth
     * Description: Click On Global Patient Services
     * Return Type: void
     * Params List: NA
     */
    public void clickOnGlobalPatientServices() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.globalPatientServices);
            LoggerHandler.info("Clicked on Global Patient Services");
            test.log(Status.INFO, "Clicked on Global Patient Services");
            test.log(Status.PASS, "Clicked on Global Patient Services");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Global Patient Services failed");
            test.log(Status.FAIL, "Clicked on Global Patient Services failed");
            Reporter.attachScreenshotToReport("Clicked on Global Patient Services failed", test,
                    "Clicked on Global Patient Services failed");
        }
    }
    /*
     * Method Name: clickOnSpeakWithOurTeam
     * Author Name: Prithviraj Seth
     * Description: Click On Speak With Our Team
     * Return Type: void
     * Params List: NA
     */
    public void clickOnSpeakWithOurTeam() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.speakWithOurTeam);
            LoggerHandler.info("Clicked on Speak With Our Team");
            test.log(Status.INFO, "Clicked on Speak With Our Team");
            test.log(Status.PASS, "Clicked on Speak With Our Team");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Speak With Our Team failed");
            test.log(Status.FAIL, "Clicked on Speak With Our Team failed");
            Reporter.attachScreenshotToReport("Clicked on Speak With Our Team failed", test,
                    "Clicked on Speak With Our Team failed");
        }
    }
    /*
     * Method Name: clickOnVirtualSecondOpinion
     * Author Name: Prithviraj Seth
     * Description: Click On Virtual Second Opinion
     * Return Type: void
     * Params List: NA
     */
    public void clickOnVirtualSecondOpinion() {
        try {
            helper.waitForElementToBeVisible(InstituteAndDepartmentsPageLocators.virtualSecondOpinion, 10);
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.virtualSecondOpinion);
            LoggerHandler.info("Clicked on Virtual Second Opinion");
            test.log(Status.INFO, "Clicked on Virtual Second Opinion");
            test.log(Status.PASS, "Clicked on Virtual Second Opinion");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Virtual Second Opinion failed");
            test.log(Status.FAIL, "Clicked on Virtual Second Opinion failed");
            Reporter.attachScreenshotToReport("Clicked on Virtual Second Opinion failed", test,
                    "Clicked on Virtual Second Opinion failed");
        }
    }
    /*
     * Method Name: clickOnGetStarted
     * Author Name: Prithviraj Seth
     * Description: Click On Get Started
     * Return Type: void
     * Params List: NA
     */
    public void clickOnGetStarted() {
        try {
            helper.clickByLocator(InstituteAndDepartmentsPageLocators.getStarted);
            LoggerHandler.info("Clicked on Get Started");
            test.log(Status.INFO, "Clicked on Get Started");
            test.log(Status.PASS, "Clicked on Get Started");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Get Started failed");
            test.log(Status.FAIL, "Clicked on Get Started failed");
            Reporter.attachScreenshotToReport("Clicked on Get Started failed", test, "Clicked on Get Started failed");
        }
    }
}
