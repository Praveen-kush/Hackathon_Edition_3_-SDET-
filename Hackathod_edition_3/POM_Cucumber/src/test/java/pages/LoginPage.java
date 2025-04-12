package pages;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    WebElement loginBtn;

    @FindBy(id = "flash")
    WebElement flashMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String uname) {
        usernameField.clear();
        usernameField.sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        passwordField.clear();
        passwordField.sendKeys(pwd);
    }

    public void clickLogin() {
        loginBtn.click();
    }

    public String getFlashMessage() {
        return flashMessage.getText().trim();
    }
}
