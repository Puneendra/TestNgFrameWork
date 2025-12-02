package Utilities;

import basetest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter spark;
    public ExtentReports extent;
    public ExtentTest test;

    @Override
    public void onStart(ITestContext context) {

        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        spark = new ExtentSparkReporter("./reports/Report_" + timestamp + ".html");
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Execution Report");
        spark.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(spark);

        extent.setSystemInfo("Application", "Amazon.com");
        extent.setSystemInfo("Environment", "Test");
        extent.setSystemInfo("Browser", context.getCurrentXmlTest().getParameter("browser"));
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        test = extent.createTest(result.getMethod().getMethodName());
        test.assignCategory(result.getMethod().getMethodName());

        test.log(Status.PASS, result.getMethod().getMethodName() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        test = extent.createTest(result.getMethod().getMethodName());
        test.assignCategory(result.getMethod().getMethodName());
        test.log(Status.FAIL, result.getThrowable());

        String path = BaseTest.takeScreenShot(result.getMethod().getMethodName());

            test.addScreenCaptureFromPath(path);

    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        test = extent.createTest(result.getMethod().getMethodName());
        test.assignCategory(result.getMethod().getMethodName());
        test.log(Status.SKIP, result.getMethod().getMethodName() + " skipped");
        test.log(Status.INFO, result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context)
    {
        extent.flush();
    }
}
