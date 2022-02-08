package Test;

import Pages.LoginPage;
import TestBase.testBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends testBase {
    LoginPage p;
    public LoginTest(){
        super();
    }
    @BeforeSuite
    public void launch(){
        initialization();
        p = new LoginPage();
    }
    @Test
    public void checkTitle(){
        String title = p.VerifyTitle();
        Assert.assertEquals(title,"OrangeHRM");
    }
    @Test
    public void loginDetails() throws IOException {
        p.login();
    }
    @Test
    public void ForgetPass(){
        p.forgetpas();
    }

}
