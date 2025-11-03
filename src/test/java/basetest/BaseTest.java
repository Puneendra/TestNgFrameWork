package basetest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest
{
    public WebDriver driver;

    //for logger
    public Logger logger;

    //ForProperties
    public Properties prop = new  Properties();

    @BeforeClass

    @Parameters({"browser"})//for tentng perameters
    public void setUp(String browser) throws IOException
    {

        //creating Logv4j2
        logger = LogManager.getLogger(this.getClass());
        //LoadProperties file;
        FileReader file = new FileReader(".\\src\\test\\resources\\config.properties");
//Load file;
        prop.load(file);
        switch (browser.toLowerCase())
        {
            case "chrome" : driver=new ChromeDriver(); break;
            case "firefox" : driver=new FirefoxDriver(); break;
            case "safari" : driver=new SafariDriver(); break;
            case "edge" : driver=new EdgeDriver(); break;
            default:
                System.out.println("Browser not recognized");
                break;



        }



        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();

    }



}
