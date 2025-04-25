package stepdefinitions;
 



import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
 
public class Hooks extends Base {
    public static ExtentReports report;
    @BeforeAll
    public static void testReport(){
        report=Reporter.createReport("cleveland_Report");
    }
    @Before
    public void open(){
        try {
            openBrowser();
        } catch (Exception e) {
            LoggerHandler.error("Could not open browser.");
        }
    }
    @After
    public void close(){
        driver.quit();
    }
    @AfterAll
    public static void flushReport(){
        report.flush();
    }
}