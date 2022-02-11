package Pages;

import driver.Launch_Browser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends Launch_Browser {
    @Test
    public void Login()
    {
        String login = "Admin";
        String password = "admin123";
        driver.findElement(By.id("txtUsername")).sendKeys(login);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test
    public void forgetPass()
    {
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.navigate().back();
    }
}

