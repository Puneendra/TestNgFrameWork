package testScripts;

import PageObjectClasess.HomePage;
import PageObjectClasess.RegisterPage;
import basetest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class RegistrationScripts extends BaseTest
{



    @Test

    public void Fillregistration()


    {


        logger.debug("do the Fillregistration");
    HomePage aobjHomepage = new HomePage( driver );


        aobjHomepage.Myaccount();

        logger.debug(   "Click on my ACCOUNT button");
        aobjHomepage.ClickOnRegisterLink();

        logger.debug("clicked on my registerlink ");



        RegisterPage aobjRegisterPage = new RegisterPage(driver);

        aobjRegisterPage.setFirstName("Samana");
        aobjRegisterPage.setLastName("Puni");
        aobjRegisterPage.setEmail("samanapuneendra@gmail.com");
        aobjRegisterPage.setTelephone("7337238146");
        aobjRegisterPage.setPassword("Puni@1234");
        aobjRegisterPage.setConfirm("Puni@1234");

        logger.debug("Entered all mandatory fields");
        aobjRegisterPage.clickRegisterButton();
    }






}
