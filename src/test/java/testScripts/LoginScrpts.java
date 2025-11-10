package testScripts;

import PageObjectClasess.HomePage;
import PageObjectClasess.LandingPage;
import PageObjectClasess.LoginPage;
import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScrpts extends BaseTest {

    @Test
    public void loginValidation() {

        logger.info("starts Login Validation");


        HomePage aobjHomepage = new HomePage(driver);

        aobjHomepage.Myaccount();
        logger.info("click oN MyAccount");

        aobjHomepage.ClickOnLogin();

        logger.info("click on Login button");


        LoginPage loginnaobj = new LoginPage(driver);
        loginnaobj.login(prop.getProperty("username"), prop.getProperty("password"));

        //page verifications;

        LandingPage landingpageaobj  = new LandingPage(driver);

        boolean isfound = landingpageaobj.isMyAccountTabPresent();

        Assert.assertTrue(isfound,"Not Loggedin please enter valid credentials");




    }
}