package basePage;

import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
=======
import org.openqa.selenium.support.PageFactory;
>>>>>>> master

public class BasePage
{
    WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver=driver;
<<<<<<< HEAD
=======
        PageFactory.initElements(driver, this);
>>>>>>> master
    }

}
