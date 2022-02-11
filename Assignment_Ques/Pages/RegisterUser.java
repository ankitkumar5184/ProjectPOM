package Pages;

import driver.Launch_Browser;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterUser extends Launch_Browser {
    String username = RandomStringUtils.randomAlphabetic(10);
    String pass =    RandomStringUtils.randomAlphabetic(8);
    String employee = "Admin A";
    @Test
    public void addUser() {
        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
        driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys(employee);
        driver.findElement(By.id("systemUser_userName")).sendKeys(username);
        Select status = new Select(driver.findElement(By.name("systemUser[status]")));
        status.selectByVisibleText("Enabled");
        status.selectByIndex(1);
        driver.findElement(By.id("systemUser_password")).sendKeys(pass);
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pass);
        driver.findElement(By.id("btnSave")).click();
    }
    @Test
    public void SearchUser()
    {
        WebElement Expected = driver.findElement(By.name("searchSystemUser[userName]"));
        Expected.sendKeys(username);
        driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys(employee);
        driver.findElement(By.name("_search")).click();
        WebElement actual = driver.findElement(By.xpath("((//input[@type='checkbox'])[2]//following::td)[1]"));
        System.out.println("Successfully added");
    }
}
