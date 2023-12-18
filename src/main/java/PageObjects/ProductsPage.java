package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "(//h3[@data-test-id='product-card-name'])[1]")
    private WebElement productLink ;

    public void selectProduct () {
        helper.clickElement(productLink);
    }
}
