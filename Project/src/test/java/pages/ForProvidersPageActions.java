package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.ForProvidersPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
 
import utils.WebDriverHelper;
 
public class ForProvidersPageActions {
    ExtentTest test;
    WebDriverHelper helper;
 
    public ForProvidersPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
 
    /*
     * a. MethodName: forProviders
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to Scroll to ForProviders.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void forProviders() {
        try {
            helper.scrollToAnElement(ForProvidersPageLocators.forproviders);
            LoggerHandler.info("Scrolled till forproviders");
            test.log(Status.INFO, "Scrolled till forproviders");
            test.log(Status.PASS, "Scrolled till forproviders ");
        } catch (Exception e) {
            LoggerHandler.error("Scrolled failed till forproviders");
        }
    }
 
    /*
     * a. MethodName: join
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to click on joinournursing.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void join() {
        try {
            helper.clickByLocator(ForProvidersPageLocators.JoinOurNursing);
            LoggerHandler.info("Clicked on JoinOurNursing");
            test.log(Status.INFO, "Clicked on JoinOurNursing");
            test.log(Status.PASS, "Clicked on JoinOurNursing");
 
            helper.clickByLocator(ForProvidersPageLocators.clevelandcliniclink);
            LoggerHandler.info("Clicked on clevelandcliniclink");
            test.log(Status.INFO, "Clicked on clevelandcliniclink");
            test.log(Status.PASS, "Clicked on clevelandcliniclink");
 
            helper.switchToNewTab();
            LoggerHandler.info("Switched to new tab");
            test.log(Status.INFO, "Switched to new tab");
            test.log(Status.PASS, "Switched to new tab");
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Join Our Nursing");
            test.log(Status.PASS, "Clicked on Join Our Nursing");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on JoinOurNursing Failed");
            test.log(Status.FAIL, "Clicked on JoinOurNursing Failed");
            LoggerHandler.info("Clicked on clevelandcliniclink Failed");
            test.log(Status.PASS, "Clicked on clevelandcliniclink Failed");
            LoggerHandler.info("Clicked on Switch to new tab Failed");
            test.log(Status.PASS, "Clicked on switch to new tab Failed ");
            Reporter.attachScreenshotToReport("JoinOurNursing Failed", test, "JoinOurNursing Failed");
        }
    }
 
    /*
     * a. MethodName: career
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to click on career.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void career() {
        try {
            helper.scrollToAnElement(ForProvidersPageLocators.forproviders);
            helper.waitForElementToBeVisible(ForProvidersPageLocators.careers, 10);
            helper.clickByLocator(ForProvidersPageLocators.careers);
            LoggerHandler.info("Clicked on careers");
            test.log(Status.INFO, "Clicked on careers");
            test.log(Status.PASS, "Clicked on careers");
            helper.waitForElementToBeVisible(ForProvidersPageLocators.careers, 10);
            helper.hoverByLocator(ForProvidersPageLocators.findcareer);
            LoggerHandler.info("Hovered on findcarrer");
            test.log(Status.INFO, "Hovered on findcarrer");
            test.log(Status.PASS, "Hovered on findcarrer");
            helper.clickByLocator(ForProvidersPageLocators.findcareer);
            LoggerHandler.info("Clicked on findcareer");
            test.log(Status.INFO, "Clicked on findcareer");
            test.log(Status.PASS, "Clicked on findcareer");
            helper.switchToNewTab();
            LoggerHandler.info("Switched to new tab");
            test.log(Status.INFO, "Switched to new tab");
            test.log(Status.PASS, "Switched to new tab");
            Base.driver.close();
            helper.goBackToWindow(0);
        } catch (Exception e) {
            LoggerHandler.error("Clicked on careers Failed");
            test.log(Status.FAIL, "Clicked on careers Failed");
            LoggerHandler.error("Hovered on findcarrer Failed");
            test.log(Status.FAIL, "Hovered on findcarrer Failed");
            LoggerHandler.error("Clicked on findcareer Failed");
            test.log(Status.FAIL, "Clicked on findcareer Failed");
            LoggerHandler.error("Switched to new tab Failed");
            test.log(Status.FAIL, "Switched to new tab Failed");
            Reporter.attachScreenshotToReport("careers failed", test, "careers failed");
            LoggerHandler.error("Clicked on Join Our Nursing Failed");
            test.log(Status.FAIL, "Clicked on Join Our Nursing Failed");
        }
    }
 
    /*
     * a. MethodName: patient
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to click on patient.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void patient() {
        try {
            helper.scrollToAnElement(ForProvidersPageLocators.forproviders);
            helper.waitForElementToBeVisible(ForProvidersPageLocators.Referpatient, 10);
            helper.clickByLocator(ForProvidersPageLocators.Referpatient);
            LoggerHandler.info("Clicked on Referpatient");
            test.log(Status.INFO, "Clicked on Referpatient");
            test.log(Status.PASS, "Clicked on Referpatient");
            helper.clickByLocator(ForProvidersPageLocators.physicianteam);
            LoggerHandler.info("Clicked on physicianteam");
            test.log(Status.INFO, "Clicked on physicianteam");
            test.log(Status.PASS, "Clicked on physicianteam");
            helper.switchToNewTab();
            LoggerHandler.info("Switched to new tab");
            test.log(Status.INFO, "Switched to new tab");
            test.log(Status.PASS, "Switched to new tab");
            Thread.sleep(3000);
            Base.driver.close();
            helper.goBackToWindow(0);
        } catch (InterruptedException e) {
            LoggerHandler.error("Clicked on Referpatient Failed");
            test.log(Status.FAIL, "Clicked on Referpatient Failed");
            LoggerHandler.error("Clicked on physicianteam Failed");
            test.log(Status.FAIL, "Clicked on physicianteam Failed");
            LoggerHandler.error("Switched to new tab Failed");
            test.log(Status.FAIL, "Switched to new tab Failed");
            Reporter.attachScreenshotToReport("Diseases failed", test, "Diseases failed");
            helper.clickByLocator(ForProvidersPageLocators.physicianteam);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Patient");
            test.log(Status.PASS, "Clicked on Patient");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Patient Failed");
            test.log(Status.FAIL, "Clicked on Patient Failed");
        }
    }
}