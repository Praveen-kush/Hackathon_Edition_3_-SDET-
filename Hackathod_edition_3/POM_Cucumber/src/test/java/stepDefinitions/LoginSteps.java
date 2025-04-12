package stepDefinitions;
import org.testng.Assert;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should see a success message {string}")
    public void user_should_see_a_success_message(String expectedMessage) {
        String actualMessage = loginPage.getFlashMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        driver.quit();
    }

    @Then("User should see an error message {string}")
    public void user_should_see_an_error_message(String expectedMessage) {
        String actualMessage = loginPage.getFlashMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        driver.quit();
    }
}
