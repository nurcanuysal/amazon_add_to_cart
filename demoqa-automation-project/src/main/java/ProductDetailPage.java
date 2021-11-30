import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    By addToCardButtonLocator = By.id("add-to-cart-button");
    public  boolean isOnProductDetailPage() {
        return isDisplayed(addToCardButtonLocator);
    }

    public void addToCart() {
        click(addToCardButtonLocator);
    }
}
