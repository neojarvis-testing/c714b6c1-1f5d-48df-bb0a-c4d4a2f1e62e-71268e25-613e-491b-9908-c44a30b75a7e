package stepdefinitions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.FooterIconPageActions;
import utils.Base;
import utils.LoggerHandler;
public class FooterIcon {
    WebDriver driver = Base.driver;
    public static ExtentTest test = Hooks.test;
    FooterIconPageActions footer;
/*
 * Method Name: Asritha_is_on_Cleveland_clinic
 * Description: Initializes the FooterIconPageActions with the driver and test instances when on the Cleveland Clinic page.
 * Author Name: T Gnana Asritha
 * Return Type: void
 * Parameter List: None
 */
 
 @Given("Asritha is on Cleveland clinic")
 public void asritha_is_on_cleveland_clinic() {
    footer = new FooterIconPageActions(driver,test);
 }
/*
 * Method Name: i_click_on_facebook_and_navigated
 * Description: Clicks the Facebook icon, navigates to Facebook in a new tab,and performs actions as required.
 * Author Name: T Gnana Asritha
 * Return Type: void
 * Parameter List: None
 */
@When("I click on facebook and navigated")
public void i_click_on_facebook_and_navigated() {
    try {
        footer.clickFacebook();
    } catch (Exception e) {
        LoggerHandler.error("Clicked on facebook");
    }
}
/*
 * Method Name: i_click_on_twitter_and_navigated
 * Description: Clicks the Twitter icon, navigates to Twitter in a new tab,and performs actions as required.
 * Author Name: T Gnana Asritha
 * Return Type: void
 * Parameter List: None
 */
@When("I click on Twitter and navigated")
public void i_click_on_twitter_and_navigated() {
   try {
    footer.clickTwitter();
   } catch (Exception e) {
        LoggerHandler.error("Clicked on Twitter");
   }
}
/*
 * Method Name: i_click_on_youtube_and_navigated
 * Description: Clicks the YouTube icon, navigates to YouTube in a new tab, and performs actions as required.
 * Author Name: T Gnana Asritha
 * Return Type: void
 * Parameter List: None
 */
@When("I click on Youtube and navigated")
public void i_click_on_youtube_and_navigated() {
    try {
        footer.clickYoutube();
    } catch (Exception e) {
        LoggerHandler.error("Clicked on Youtube");
    }
}
/*
 * Method Name: i_click_on_instagram_and_navigated
 * Description: Clicks the Instagram icon, navigates to Instagram in a new tab, and performs actions as required.
 * Author Name: T Gnana Asritha
 * Return Type: void
 * Parameter List: None
 */
@When("I click on Instagram and navigated")
public void i_click_on_instagram_and_navigated() {
    try {
        footer.clickInstagram();
    } catch (Exception e) {
        LoggerHandler.error("Clicked on Instagram");
    }
}
/*
 * Method Name: i_click_on_linkedin_and_navigated
 * Description: Clicks the LinkedIn icon, navigates to LinkedIn in a new tab, and performs actions as required.
 * Author Name: T Gnana Asritha
 * Return Type: void
 * Parameter List: None
 */
@When("I click on Linkedin and navigated")
public void i_click_on_linkedin_and_navigated() {
    try{
        footer.clickLinkdin();
    }catch(Exception e){
        LoggerHandler.error("Clicked on Linkedin");
    }
}
/*
 * Method Name: i_click_on_pinterest_and_navigated
 * Description: Clicks the Pinterest icon, navigates to Pinterest in a new tab, and performs actions as required.
 * Author Name: T Gnana Asritha
 * Return Type: void
 * Parameter List: None
 */
@When("I click on Pinterest and navigated")
public void i_click_on_pinterest_and_navigated() {
    try{
        footer.clickpintrest();
    }catch(Exception e){
        LoggerHandler.error("Clicked on Pinterest");
    }
}
/*
 * Method Name: i_click_on_snapchat_and_navigated
 * Description: Clicks the Snapchat icon, navigates to Snapchat in a new tab, and performs actions as required.
 * Author Name: T Gnana Asritha
 * Return Type: void
 * Parameter List: None
 */
@When("I click on snapchat and navigated")
public void i_click_on_snapchat_and_navigated() {
    try {
        footer.clicksnapchat();
    } catch (Exception e) {
        LoggerHandler.error("Clicked on snapchat");
    }
}
}
