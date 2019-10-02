package Selenium.appModules;

import Selenium.Utility.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium.pageObjects.HomePage;
import Selenium.pageObjects.LogIn_Page;
import Selenium.Utility.Log;

import javax.security.auth.login.LoginContext;

public class SignIn_Action {
    public static void Execute(WebDriver driver) throws Exception {
        String excelUtilUserName = ExcelUtils.getCellData(1, 1);
        Log.info("Username picked from Excel is "+ excelUtilUserName);
        String excelUtilPassword = ExcelUtils.getCellData(1,2);
        Log.info("Username picked from Excel is "+ excelUtilPassword);
        HomePage.lnk_MyAccount(driver).click();
        Log.info("Click action performed on My Account link");
        LogIn_Page.txtbx_UserName(driver).sendKeys(excelUtilUserName);
        Log.info("Username entered in the Username text box");
        LogIn_Page.txtbx_Password(driver).sendKeys(excelUtilPassword);
        Log.info("Password entered in the Password text box");
        LogIn_Page.btn_LogIn(driver).click();
        Log.info("Click action performed on Submit button");
    }
}
