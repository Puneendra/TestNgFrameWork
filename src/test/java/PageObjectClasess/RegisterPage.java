package PageObjectClasess;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{
    WebDriver driver;

    public RegisterPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement telephoneInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@name='confirm']")
    private WebElement confirmInput;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButtonInput;

    public void setFirstName(String firstName)
    {
        firstNameInput.sendKeys(firstName);
    }

    public void setLastName(String lastName)
    {
        lastNameInput.sendKeys(lastName);
    }

    public void setEmail(String email)
    {
        emailInput.sendKeys(email);
    }

    public void setTelephone(String telephone)
    {
        telephoneInput.sendKeys(telephone);
    }

    public void setPassword(String password)
    {
        passwordInput.sendKeys(password);
    }

    public void setConfirm(String confirm)
    {
        confirmInput.sendKeys(confirm);
    }

    public void clickRegisterButton()
    {
        continueButtonInput.click();
    }
}
