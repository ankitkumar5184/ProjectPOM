package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
    private WebDriver driver;
    //create a constructor
    public DashBoardPage(WebDriver driver){
        this.driver= driver;
    }
    //locate elements
    private By welcomeAdmin=By.cssSelector("#branding a:nth-child(2)");
    private By logOut=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");
    public void clickWelcomeAdmin() throws InterruptedException{
        Thread.sleep(10000);
        driver.findElement(welcomeAdmin).click();
    }
    public LoginPage clickLogout() throws InterruptedException{
        Thread.sleep(8000);
        driver.findElement(logOut).click();
        return new LoginPage(driver);
    }
}
