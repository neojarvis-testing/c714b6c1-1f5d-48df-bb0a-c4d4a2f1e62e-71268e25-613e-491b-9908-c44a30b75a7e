package stepdefinitions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
/*
 * a. ClassName : Hooks
 * b. Author : Dharen
 * c. Description : Handles setup and teardown tasks such as initializing reports and managing browser sessions.
 */
public class Hooks extends Base {
    public static ExtentReports report;
    public static ExtentTest test;
    /*
     * a. Method name : testReport
     * b. Author : Dharen
     * c. Description : Creates a new ExtentReport instance with a specified report name.
     * d. Return type : void
     * e. Parameter list : None
     */
    @BeforeAll
    public static void testReport() {
        report = Reporter.createReport("cleveland_Report");
    }
    /*
     * a. Method name : open
     * b. Author : Dharen
     * c. Description : Opens the browser instance and handles exceptions during browser initialization.
     * d. Return type : void
     * e. Parameter list : None
     */
    @Before
    public void open() {
        try {
            openBrowser();
        } catch (Exception e) {
            LoggerHandler.error("Could not open browser.");
        }
    }
    /*
     * a. Method name : close
     * b. Author : Dharen
     * c. Description : Closes the browser session gracefully.
     * d. Return type : void
     * e. Parameter list : None
     */
    @After
    public void close() {
        driver.quit();
    }
    /*
     * a. Method name : flushReport
     * b. Author : Dharen
     * c. Description : Flushes the report data to ensure it is written to the report file.
     * d. Return type : void
     * e. Parameter list : None
     */
    @AfterAll
    public static void flushReport() {
        report.flush();
    }
}
