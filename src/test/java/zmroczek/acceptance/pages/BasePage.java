package zmroczek.acceptance.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public abstract class BasePage {

    @Autowired
    private WebDriver driver;

    @Value("${server.url}")
    private String serverUrl;

    public void navigateToThisPage() {
        driver.get(serverUrl + "/" + getPath());
    }

    public abstract String getPath();
}
