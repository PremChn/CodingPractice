package Selenium.appModules;

import Selenium.Utility.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium.pageObjects.HomePage;
import Selenium.pageObjects.LogIn_Page;

import javax.security.auth.login.LoginContext;

public class SignIn_Action {
    public static void Execute(WebDriver driver) throws Exception {
        String excelUtilUserName = ExcelUtils.getCellData(1, 1);
        String excelUtilPassword = ExcelUtils.getCellData(1,2);
        HomePage.lnk_MyAccount(driver).click ();
        LogIn_Page.txtbx_UserName(driver).sendKeys(excelUtilUserName);
        LogIn_Page.txtbx_Password(driver).sendKeys(excelUtilPassword);
        LogIn_Page.btn_LogIn(driver).click();
    }

}
