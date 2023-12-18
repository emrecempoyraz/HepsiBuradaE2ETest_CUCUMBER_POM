package PageObjects;

import TestManager.IDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

   @FindBy(css = "div.searchBoxOld-uKvVtLzPNdHp38hj3B13")
    private WebElement searchBar ;

    @FindBy(css = "button#onetrust-accept-btn-handler")
    private WebElement acceptCookie ;

    @FindBy(css = ".theme-IYtZzqYPto8PhOx3ku3c")
    private WebElement textField ;

    @FindBy(xpath = "//div[@class='searchBoxOld-yDJzsIfi_S5gVgoapx6f']")
    private WebElement searchIcon ;

    public void searchProduct () {
        helper.clickElement(searchBar);
        helper.sendKeys(textField,IDriver.PRODUCT);
        helper.clickElement(searchIcon);
    }

    public void acceptCookies () {
        helper.clickElement(acceptCookie);
    }
}
