package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class seleniumBasics {
    public static void main(String args[]){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", "C:\\Prem\\outward\\Outward\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);
        WebDriverWait wait = new WebDriverWait(driver, 50);
        driver.get("https://www.mcom-057.tbe.zeus.fds.com/shop/product/natures-spa-by-paramount-jazmine-latex-17-ultra-plush-euro-pillow-top-mattress-set-king?ID=4375390&CategoryID=25931#fn=sp%3D1%26spc%3D2%26ruleId%3D78%26kws%3D4375390%26searchPass%3DallMultiMatchWithSpelling%26slotId%3D2");
        driver.findElement(By.xpath("//*[@id=\"mainCont\"]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div" +
                                            "[4]/div/div[2]/div/ul/li[1]"));
    }
}
