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
    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
        handles.add(driver.getWindowHandle());
    }
    public void clickByLocator(By locator) {
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            LoggerHandler.error("Unable to click element: " + locator);
        }
    }
    public void sendData(By locators, String data) {
        try {
            driver.findElement(locators).sendKeys(data);
        } catch (Exception e) {
            LoggerHandler.error("Failed to enter text into element: " + locators);
        }
    }
    public void scrollToAnElement(By locator) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(locator);
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            LoggerHandler.error("Unable to scroll to element: " + locator);
        }
    }
    public void jsClick(By locator) {
        try {
            JavascriptExecutor obj = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(locator);
            obj.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            LoggerHandler.error("JavaScript click failed for element: " + locator);
        }
    }
    public void scrollByPixel(int x, int y) {
        try {
            JavascriptExecutor obj = (JavascriptExecutor) driver;
            obj.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
        } catch (Exception e) {
            LoggerHandler.error("Unable to scroll by pixels: x=" + x + ", y=" + y);
        }
    }
    public void waitForElementToBeVisible(By locator, int sec) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(sec))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            LoggerHandler.error("Timeout waiting for element visibility: " + locator);
        }
    }
    public void waitForElementToBeClickable(By locator, int sec) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(sec))
                    .until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            LoggerHandler.error("Timeout waiting for element to be clickable: " + locator);
        }
    }
    public void hoverByLocator(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover over element: " + locator);
        }
    }
    public void enterAction(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            LoggerHandler.error("Enter key action failed for element: " + locator);
        }
    }
    public void dropDown(By locator, String value) {
        try {
            WebElement webElement = driver.findElement(locator);
            Select option = new Select(webElement);
            option.selectByVisibleText(value);
        } catch (Exception e) {
            LoggerHandler.error("Failed to select dropdown value '" + value + "' for element: " + locator);
        }
    }
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
    public void goBackToWindow(int i) {
        try {
            driver.switchTo().window(handles.get(i));
        } catch (Exception e) {
            LoggerHandler.error("Unable to switch back to window index: " + i);
        }
    }
    public List<WebElement> getElementsByXPath(String path) {
        return driver.findElements(By.xpath(path));
    }
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