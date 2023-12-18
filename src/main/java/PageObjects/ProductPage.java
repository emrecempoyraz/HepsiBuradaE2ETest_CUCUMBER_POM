package PageObjects;

import gherkin.lexer.Sr_cyrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#addToCart")
    private WebElement addToCartButton ;

    @FindBy(css = ".checkoutui-ProductOnBasketHeader-nOvp_U8bHbLzgKbSUFaz")
    private WebElement successText ;

    public void addProductToCart () throws InterruptedException {
        Thread.sleep(7000);
        helper.refreshPage();
        helper.clickElement(addToCartButton);
    }

    public boolean isOnProductPage () {
        helper.windowHandle();
        String actualLink = driver.getCurrentUrl();
        String expectedLink = "https://www.hepsiburada.com/xiaomi-redmi-watch-3-active-akilli-saat-sesli-gorusme-p-HBCV00004PRC21";
        return actualLink.equals(expectedLink);
    }

    public boolean isProductAddedToCart () {
        String actualMessage = successText.getText();
        String expectedMessage = "Ürün sepetinizde";
        return actualMessage.contains(expectedMessage);
    }
}
