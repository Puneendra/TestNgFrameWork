package PageObjectClasess;

<<<<<<< HEAD
=======
import basePage.BasePage;
>>>>>>> master
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD
public class HomePage
{
    WebDriver driver;

    //constructor

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Locators

    @FindBy(xpath = "//span[text() ='My Account']")
    private WebElement  myAccountTab;

    @FindBy(xpath ="//a[text()='Register']")
    private WebElement  registerLink;



public void ClickOnRegister()
{
    myAccountTab.click();

}

public void ClickOnRegisterLink()
{
    registerLink.click();
}
=======
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

>>>>>>> master


}

<<<<<<< HEAD


=======
>>>>>>> master
