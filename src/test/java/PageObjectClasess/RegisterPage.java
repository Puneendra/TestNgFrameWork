package PageObjectClasess;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage
{
    WebDriver driver;
public RegisterPage(WebDriver driver)
{
    super(driver);
}

//constructor


//locators
@FindBy(xpath = "//input[@name='firstname']")
private WebElement firstName;

@FindBy(xpath = "//input[@name='lastname']")
private WebElement lastName;

@FindBy(xpath = "//input[@name='email']")
private WebElement email;

@FindBy(xpath = "//input[@name='telephone']")
private WebElement telephone;

@FindBy(xpath = "//input[@name='password']")
private WebElement password;

@FindBy(xpath = "//input[@name='confirm']")
private WebElement confirmPassword;

@FindBy(xpath = "//input[@value='Continue']")
private WebElement continueButton;



}







