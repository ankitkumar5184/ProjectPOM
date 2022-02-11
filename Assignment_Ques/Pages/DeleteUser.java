package Pages;

import driver.Launch_Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteUser extends Launch_Browser {
    @Test
    public void deleteUser(){
        driver.findElement(By.name("chkSelectRow[]")).click();
        driver.findElement(By.name("btnDelete")).click();
        WebElement del = driver.findElement(By.id("dialogDeleteBtn"));
        del.click();
        System.out.println("Successfully Deleted");
    }
}
