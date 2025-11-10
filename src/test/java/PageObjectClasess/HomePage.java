package PageObjectClasess;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountTab;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerLink;
    @FindBy(xpath = "//a[text()='Login']")
    private WebElement LoginLink;

    public void Myaccount()
    {
        myAccountTab.click();
    }

    public void ClickOnRegisterLink()
    {
        registerLink.click();
    }
    public  void ClickOnLogin()
    {
        LoginLink.click();
    }


}
