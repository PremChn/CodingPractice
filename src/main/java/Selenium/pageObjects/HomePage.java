package Selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium.Utility.Log;



public class HomePage {
    private static WebElement element = null;
    public static WebElement lnk_MyAccount(WebDriver driver){
        element = driver.findElement(By.id("account"));
        Log.info("My account link element found");
        return element;
    }

    public static WebElement lnk_LogOut(WebDriver driver){
        element = driver.findElement((By.id("account_logout")));
        Log.info("Logout link element found");
        return element;
    }
}
