package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    private static WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    static By username= By.id("txtUsername");
    public static void enterUsername(String uName){
        //find username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
    static By password= By.id("txtPassword");
    public static void enterPassword(String pwd){
        //find password element and enter password
        driver.findElement(password).sendKeys(pwd);
    }

    public static DashBoardPage clickLoginBtn(){
        //click login button
        driver.findElement(By.id("btnLogin")).click();
        return new DashBoardPage(driver);

    }
}