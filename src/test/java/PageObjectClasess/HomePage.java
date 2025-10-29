package PageObjectClasess;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    WebDriver driver;


        public HomePage(WebDriver driver)
        {
            super(driver);

        }


        @FindBy(xpath = "//span[text() ='My Account']")
        private WebElement myAccountTab;

        @FindBy(xpath = "//a[text()='Register']")
        private WebElement registerLink;


        public void ClickOnRegister ()
        {
            myAccountTab.click();

        }

        public void ClickOnRegisterLink ()
        {
            registerLink.click();
        }



}

