package testScripts;

import PageObjectClasess.HomePage;
import PageObjectClasess.LandingPage;
import PageObjectClasess.LoginPage;
import Utilities.DataProviders;
import basetest.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

public class LoginDataDrivenTest extends BaseTest
{


    @Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class )
    public void performLoginWithDifferentData(String username,String pwd,String expectedCase) {

        logger.info("Start performLoginWithDifferentData");

        HomePage homepageaobj = new HomePage(driver);
        homepageaobj.Myaccount();
        logger.info("clicked on Myaccount button");
        homepageaobj.ClickOnLogin();
        logger.info("clicked on Login button");

        LoginPage Loginpageobj = new LoginPage(driver);

        Loginpageobj.login(username, pwd);
        logger.info("clicked on Login button");

        LandingPage landingpageobj = new LandingPage(driver);
        landingpageobj.isMyAccountTabPresent();
        logger.info("clicked on Login button");


        LandingPage landingaobj = new LandingPage(driver);

        boolean isFound = landingaobj.isMyAccountTabPresent();

        if (isFound == true) {
            logger.info("Login Successfull");
            landingaobj.clickOnLogoutButton();
        } else {
            logger.info("Login Failed");
        }

//        boolean expectedflag = true;
//        if (expectedCase == "Valid") {
//            logger.info("Login Successfull");
//
//        } else {
//            logger.info("Login Failed");
//
//        }


    }
}