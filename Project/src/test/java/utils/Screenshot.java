package utils;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;
/**
 * @author 10831415 - Arun
 * ClassName: Screenshot
 * Description: Utility class for capturing browser screenshots and saving them to a specified directory.
 */
public class Screenshot extends Base{
    public static TakesScreenshot takesScreenshot;
    /**
     * @author 10831415 - Arun
     * MethodName: takeScreenshot
     * Description: Captures a screenshot of the current browser window and saves it to a directory named "screenshots".
     * Creates the directory if it does not exist, and names the file dynamically based on the provided fileName and timestamp.
     * @param fileName - The base name for the screenshot file.
     */
    public static void takeScreenshot(String fileName){
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String newFileName = fileName +"_"+ timeStamp +".png";
        takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File screenshotsDirectory = new File(System.getProperty("user.dir")+ "/screenshots");
        if(!screenshotsDirectory .exists()){
            screenshotsDirectory.mkdirs();
        }
        File targetFile = new File(screenshotsDirectory,newFileName);
        try{
            Files.copy(sourceFile,targetFile);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}