package utils;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
/**
 * @author 10831368 Gnana_Asritha
 * ClassName: Reporter
 * Description: Utility class for generating ExtentReports for test automation,
 * capturing screenshots, and attaching them to the reports for better debugging.
 */
public class Reporter {
    private static File file;
    private static ExtentSparkReporter sparkReporter;
    private static ExtentReports reports;
    /**
     * @author 10831368 Gnana_Asritha
     * MethodName: createReport
     * Description: Creates a new ExtentReport with a dynamically generated name based on a timestamp.
     * Sets theme and system information, and attaches the ExtentSparkReporter.
     * @param reportName - Name of the report file.
     * @return The ExtentReports instance.
     */
    public static ExtentReports createReport(String reportName) {
        String dirpath = System.getProperty("user.dir") + "/reports";
        file = new File(dirpath);
        if (!file.exists()) {
            file.mkdir();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        dateFormat.setTimeZone(istTimeZone);
        String timestamp = dateFormat.format(new Date());
        String reportPath = System.getProperty("user.dir") + "/reports/" + reportName + "_" + timestamp + ".html";
        File reportfile = new File(reportPath);
        sparkReporter = new ExtentSparkReporter(reportfile);
        sparkReporter.config().setTheme(Theme.STANDARD);
        reports = new ExtentReports();
        reports.setSystemInfo("Operating System", System.getProperty("os.name"));
        reports.setSystemInfo("Operating System version", System.getProperty("os.version"));
        reports.setSystemInfo("Java version", System.getProperty("java.version"));
        reports.setSystemInfo("Selenium version", "4.15.0");
        reports.attachReporter(sparkReporter);
        return reports;
    }
    /**
     * @author 10831368 Gnana_Asritha
     * MethodName: captureScreenShot
     * Description: Captures a screenshot of the current browser window and saves it to the reports directory.
     * Handles file operations and returns the relative path of the screenshot.
     * @param filename - The name of the screenshot file.
     * @return The relative path of the captured screenshot.
     */
    public static String captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        String destPath = "./" + name;
        if (Base.driver == null)
            System.out.println("driver is null");
        TakesScreenshot ts = (TakesScreenshot) Base.driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir") + "/reports");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }
    /**
         * @author 10831368 Gnana_Asritha
         * MethodName: attachScreenshotToReport
         * Description: Attaches a captured screenshot to the ExtentTest instance in the report.
         * @param filename - The name of the screenshot file.
         * @param test - The ExtentTest instance where the screenshot will be attached.
         * @param description - The description of the screenshot or the error scenario.
         */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description,
                    MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}