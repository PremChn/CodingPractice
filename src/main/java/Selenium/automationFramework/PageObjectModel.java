package Selenium.automationFramework;

import java.util.concurrent.TimeUnit;

import Selenium.Utility.Constant;
import Selenium.Utility.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import Selenium.pageObjects.HomePage;
import Selenium.appModules.SignIn_Action;
import Selenium.Utility.Log;

public class PageObjectModel {
    public static WebDriver driver;
    @BeforeMethod
    public static void beforeMethod() throws Exception{
       /*ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", "C:\\Prem\\outward\\Outward\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);
        WebDriverWait wait = new WebDriverWait(driver, 50);*/
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Selenium_Test_001");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);
        Log.info("Web application launched");
    }

    @Test
    public static void main(String args[]) throws Exception {
        // Use page Object library now
        SignIn_Action.Execute(driver);
        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
        HomePage.lnk_LogOut(driver).click();
        //This is to send the PASS value to the Excel sheet in the result column.
        ExcelUtils.setCellData("Pass",1,3);
        Log.endTestCase("Selenium_Test_001");
    }

    @AfterMethod
    public static void afterMethod() throws Exception{
        driver.quit();
        Log.info("Browser closed");
    }
}