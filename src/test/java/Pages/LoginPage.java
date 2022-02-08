package Pages;

import TestBase.testBase;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import static TestBase.testBase.driver;

public class LoginPage extends testBase {
    public static Properties prop;
    public static WebDriver driver;
    //String path,uname,pass,message;

    @FindBy(id="txtUsername")
    WebElement username;

    @FindBy(id="txtPassword")
    WebElement userpass;

    @FindBy(id="btnLogin")
    WebElement loginButton;

    @FindBy(linkText = "Forgot your password?")
    WebElement forgetPass;

    public LoginPage (WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    public String VerifyTitle() {
        return driver.getTitle();
    }
    public void login() throws IOException {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path+"//TestData//loginData.xls");
        System.out.println("Hello");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(0);
        //System.out.println(sheet.getLastRowNum());
        String uname = sheet.getRow(1).getCell(0).getStringCellValue();
        String pass = sheet.getRow(1).getCell(1).getStringCellValue();

        username.sendKeys(uname);
        userpass.sendKeys(pass);
        loginButton.click();

    }
    public void forgetpas(){
        forgetPass.click();
        driver.navigate().back();
    }

}
