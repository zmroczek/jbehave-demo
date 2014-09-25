package zmroczek.acceptance.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MainPage extends BasePage {

    @FindBy(linkText = "Next page")
    private WebElement nextPageLink;

    @Autowired
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Override
    public String getPath() {
        return "";
    }

    public void clickOnNextPageLink() {
        nextPageLink.click();
    }
}
