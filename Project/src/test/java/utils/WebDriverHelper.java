package utils;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class WebDriverHelper {
    WebDriver driver = Base.driver;
    List<String> handles = new ArrayList<>();
    /**
 * - Author - Hrushikesh
 * - MethodName - WebDriverHelper
 * - Description - Initializes the WebDriver instance and stores the current window handle.
 * - @param driver - The WebDriver object used for browser interactions.
 */
    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
        handles.add(driver.getWindowHandle());
    }
 /**
 * - Author - Hrushikesh
 * - MethodName - clickByLocator
 * - Description - Finds the specified element and performs a click action.
 * - Logs an error message in case of failure.
 * - @param locator - The locator to identify the element.
 */
    public void clickByLocator(By locator) {
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            LoggerHandler.error("Unable to click element: " + locator);
        }
    }
/**
 * - Author - Hrushikesh
 * - MethodName - sendData
 * - Description - Finds the specified element and inputs the provided text.
 * - Logs an error message in case of failure.
 * - @param locators - The locator to identify the element.
 * - @param data - The text to be entered into the element.
 */
    public void sendData(By locators, String data) {
        try {
            driver.findElement(locators).sendKeys(data);
        } catch (Exception e) {
            LoggerHandler.error("Failed to enter text into element: " + locators);
        }
    }
/**
 * - Author - Hrushikesh
 * - MethodName - scrollToAnElement
 * - Description - Scrolls to make the specified element visible on the webpage.
 * - Logs an error message in case of failure.
 * - @param locator - The locator of the element to scroll to.
 */
    public void scrollToAnElement(By locator) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(locator);
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            LoggerHandler.error("Unable to scroll to element: " + locator);
        }
    }
/**
 * - Author - Hrushikesh
 * - MethodName - jsClick
 * - Description - Uses JavaScript to perform a click action on the specified element.
 * - Logs an error message in case of failure.
 * - @param locator - The locator of the element to click using JavaScript.
 */
    public void jsClick(By locator) {
        try {
            JavascriptExecutor obj = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(locator);
            obj.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            LoggerHandler.error("JavaScript click failed for element: " + locator);
        }
    }
    /**
 * - Author - Hrushikesh
 * - MethodName - scrollByPixel
 * - Description - Scrolls the webpage by the specified number of pixels.
 * - Logs an error message in case of failure.
 * - @param x - Horizontal pixel offset.
 * - @param y - Vertical pixel offset.
 */
    public void scrollByPixel(int x, int y) {
        try {
            JavascriptExecutor obj = (JavascriptExecutor) driver;
            obj.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
        } catch (Exception e) {
            LoggerHandler.error("Unable to scroll by pixels: x=" + x + ", y=" + y);
        }
    }
 /**
 * - Author - Hrushikesh
 * - MethodName - waitForElementToBeVisible
 * - Description - Waits until the specified element is visible on the webpage.
 * - Logs an error message in case of failure.
 * - @param locator - The locator of the element to wait for.
 * - @param sec - The maximum time to wait, in seconds.
 */
    public void waitForElementToBeVisible(By locator, int sec) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(sec))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            LoggerHandler.error("Timeout waiting for element visibility: " + locator);
        }
    }
    /**
 * - Author - Hrushikesh
 * - MethodName - waitForElementToBeClickable
 * - Description - Waits until the specified element is clickable on the webpage.
 * - Logs an error message in case of failure.
 * - @param locator - The locator of the element to wait for.
 * - @param sec - The maximum time to wait, in seconds.
 */
    public void waitForElementToBeClickable(By locator, int sec) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(sec))
                    .until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            LoggerHandler.error("Timeout waiting for element to be clickable: " + locator);
        }
    }
/**
 * - Author - Hrushikesh
 * - MethodName - hoverByLocator
 * - Description - Performs a hover action over the specified element using mouse actions.
 * - Logs an error message in case of failure.
 * - @param locator - The locator of the element to hover over.
 */
    public void hoverByLocator(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover over element: " + locator);
        }
    }
 /**
 * - Author - Hrushikesh
 * - MethodName - enterAction
 * - Description - Sends an "Enter" key action to the specified element.
 * - Logs an error message in case of failure.
 * - @param locator - The locator of the element to interact with.
 */
    public void enterAction(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            LoggerHandler.error("Enter key action failed for element: " + locator);
        }
    }
/**
 * - Author - Hrushikesh
 * - MethodName - dropDown
 * - Description - Selects a value from a dropdown menu using visible text.
 * - Logs an error message in case of failure.
 * - @param locator - The locator of the dropdown element.
 * - @param value - The visible text of the dropdown option to select.
 */
    public void dropDown(By locator, String value) {
        try {
            WebElement webElement = driver.findElement(locator);
            Select option = new Select(webElement);
            option.selectByVisibleText(value);
        } catch (Exception e) {
            LoggerHandler.error("Failed to select dropdown value '" + value + "' for element: " + locator);
        }
    }
 /**
 * - Author - Hrushikesh
 * - MethodName - switchToNewTab
 * - Description - Switches the browser's focus to a newly opened tab.
 * - Logs an error message in case of failure.
 */
    public void switchToNewTab() {
        try {
            String currentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String checkWindow : allWindows) {
                if (!checkWindow.equalsIgnoreCase(currentWindow) && !handles.contains(checkWindow)) {
                    handles.add(checkWindow);
                    driver.switchTo().window(checkWindow);
                }
            }
        } catch (Exception e) {
            LoggerHandler.error("Unable to switch to new tab.");
        }
    }
/**
 * - Author - Hrushikesh
 * - MethodName - goBackToWindow
 * - Description - Switches the browser's focus back to a specific window by index.
 * - Logs an error message in case of failure.
 * - @param i - The index of the window to switch to.
 */
    public void goBackToWindow(int i) {
        try {
            driver.switchTo().window(handles.get(i));
        } catch (Exception e) {
            LoggerHandler.error("Unable to switch back to window index: " + i);
        }
    }
 /**
 * - Author - Hrushikesh
 * - MethodName - getElementsByXPath
 * - Description - Retrieves a list of elements using the specified XPath.
 * - @param path - The XPath string used to locate elements.
 * - @return List<WebElement> - A list of WebElements matching the XPath.
 */
    public List<WebElement> getElementsByXPath(String path) {
        return driver.findElements(By.xpath(path));
    }
    /**
 * - Author - Hrushikesh
 * - MethodName - iterateResults
 * - Description - Iterates through a list of elements retrieved by XPath to find and click
 * - the one containing the specified text value.
 * - Logs an error message in case of failure.
 * - @param path - The XPath string used to locate elements.
 * - @param value - The text value to search for within the elements.
 */
    public void iterateResults(String path, String value) {
        try {
            List<WebElement> resultList = getElementsByXPath(path);
            for (WebElement ele : resultList) {
                if (ele.getText().contains(value)) {
                    ele.click();
                    break;
                }
            }
        } catch (Exception e) {
            LoggerHandler.error("Failed to iterate over XPath results for value: " + value);
        }
    }
}