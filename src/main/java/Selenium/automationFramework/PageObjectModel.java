package Selenium.automationFramework;

import java.util.concurrent.TimeUnit;

import Selenium.Utility.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

import Selenium.pageObjects.HomePage;
import Selenium.appModules.SignIn_Action;

public class PageObjectModel {
    private static WebDriver driver = null;
    public static void main(String args[]) throws Exception {
        /*ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", "C:\\Prem\\outward\\Outward\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);
        WebDriverWait wait = new WebDriverWait(driver, 50);*/
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");

        // Use page Object library now
        SignIn_Action.Execute(driver);
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        HomePage.lnk_LogOut(driver).click();
        driver.quit();

        //This is to send the PASS value to the Excel sheet in the result column.
        ExcelUtils.setCellData("Pass",1,3);
    }
}
