package zmroczek.acceptance.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldPage extends BasePage {

    @FindBy(id="helloWorld")
    private WebElement helloWorld;

    @Autowired
    public HelloWorldPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Override
    public String getPath() {
        return "nextPage/";
    }

    public void findHelloWorld() {
        helloWorld.isDisplayed();
    }
}
