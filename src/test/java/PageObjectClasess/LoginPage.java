package PageObjectClasess;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }



    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;


    @FindBy(xpath = "//input[@value='Login']")
    private WebElement LoginButton;

//Methods


    public void login(String email, String password)
    {


        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        LoginButton.click();

    }







}
