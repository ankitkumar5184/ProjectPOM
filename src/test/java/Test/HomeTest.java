package Test;

import Pages.HomePage;
import TestBase.testBase;
import org.testng.annotations.Test;

public class HomeTest {


    public HomeTest() {
        super();
    }

    @Test
    public void logout() {
       HomePage hp = new HomePage();
        hp.Logout();
    }
}
