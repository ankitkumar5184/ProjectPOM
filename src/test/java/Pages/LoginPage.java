package Pages;

import TestBase.testBase;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static TestBase.testBase.driver;

public class LoginPage extends testBase {
    String path,uname,pass,message;
    @FindBy(id="txtUsername")
    WebElement username;
    @FindBy(id="txtPassword")
    WebElement userpass;
    @FindBy(id="btnLogin")
    WebElement loginButton;
    @FindBy(linkText = "Forgot your password?")
    WebElement forgetPass;

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }
    public String VerifyTitle() {
        return driver.getTitle();
    }
    public void login() throws IOException {
        path = System.getProperty("user.dir")+ "//ExcelSheet//loginData.xlsx";
        System.out.println(path);
        FileInputStream fis = null;
        try{
            fis=new FileInputStream(path);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Login_Details");
        System.out.println(sheet.getLastRowNum());
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            uname = sheet.getRow(i).getCell(0).getStringCellValue();
            username.sendKeys(uname);
            pass = sheet.getRow(i).getCell(1).getStringCellValue();
            userpass.sendKeys(pass);
            loginButton.click();



//        username.sendKeys(prop.getProperty("username"));
//        userpass.sendKeys(prop.getProperty("password"));
//        loginButton.click();
        }
    }
    public void forgetpas(){
        forgetPass.click();
        driver.navigate().back();
    }

}
