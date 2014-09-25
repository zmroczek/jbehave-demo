package zmroczek.acceptance.steps;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zmroczek.acceptance.pages.HelloWorldPage;
import zmroczek.acceptance.pages.MainPage;

@Component
public class HelloWorldSteps {

    @Autowired
    private WebDriver driver;

    @Autowired
    private MainPage mainPage;

    @Autowired
    private HelloWorldPage helloWorldPage;

    @Given("I am on main page")
    public void onMainPage() {
        mainPage.navigateToThisPage();
    }

    @When("I click on the next page link")
    public void clickOnNextPageLink() {
        mainPage.clickOnNextPageLink();
    }

    @Then("I should see \"Hello world\"")
    public void shouldSeeHelloWorld() {
        helloWorldPage.findHelloWorld();
    }

    @AfterStories
    public void closeBrowser() {
        driver.close();
    }
}
