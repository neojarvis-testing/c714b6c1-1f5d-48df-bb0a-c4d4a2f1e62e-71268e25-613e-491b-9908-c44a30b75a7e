package uistore;

import org.openqa.selenium.By;
/* 
    * a. Class name : RespiratoryPageLocators
    * b. Author : Dharen
    * c. Description : This class contains the locators for the elements on the Home Page, making it easier to identify and interact with them during Selenium tests.
*/
public class HomePageLocators {
    public static By clevelandcliniclogo = By.cssSelector("span.header__logo");
    public static By searchbar = By.cssSelector("#site-header > nav.nav--utility.js-nav--utility > ul > li:nth-child(8) > a");
    public static By searchbox = By.cssSelector("input#search-input");
    public static By getdirections = By.cssSelector("p + a[href='/locations']");
}
