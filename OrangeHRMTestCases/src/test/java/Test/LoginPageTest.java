package Test;

import Pages.DashBoardPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends SetUp {
    @Test
    public void testLogin() throws InterruptedException
    {

    LoginPage.enterUsername("Admin");
    LoginPage.enterPassword("admin123");

    DashBoardPage dashboardPage=LoginPage.clickLoginBtn();
    dashboardPage.clickWelcomeAdmin();
    loginPage= dashboardPage.clickLogout();

}
}