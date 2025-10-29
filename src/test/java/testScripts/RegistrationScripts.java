package testScripts;

import PageObjectClasess.HomePage;
import PageObjectClasess.RegisterPage;
import basetest.BaseTest;
import org.testng.annotations.Test;

public class RegistrationScripts extends BaseTest
{



    @Test

    public void Fillregistration()
    {
    HomePage aobjHomepage = new HomePage( driver );


        aobjHomepage.ClickOnRegister();

        aobjHomepage.ClickOnRegisterLink();

        RegisterPage aobjRegisterPage = new RegisterPage(driver);

        aobjRegisterPage.setFirstName("Samana");
        aobjRegisterPage.setLastName("Puni");
        aobjRegisterPage.setEmail("samanapuneendra@gmail.com");
        aobjRegisterPage.setTelephone("7337238146");
        aobjRegisterPage.setPassword("Puni@1234");
        aobjRegisterPage.setConfirm("Puni@1234");
        aobjRegisterPage.clickRegisterButton();
    }






}
