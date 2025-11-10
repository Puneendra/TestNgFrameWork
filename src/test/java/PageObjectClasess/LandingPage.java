package PageObjectClasess;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage
{
    WebDriver driver;

    public LandingPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement myAccountTab;

    @FindBy(xpath = "//a[text()='Logout' and @class='list-group-item']")
    private WebElement logoutButton;


//Methods

    public boolean  isMyAccountTabPresent()
    {
        try {
            return myAccountTab.isDisplayed();
        } catch (Exception e)
        {
            return false;
        }

    }
        public void  clickOnLogoutButton()
        {
            logoutButton.click();
        }



    }











