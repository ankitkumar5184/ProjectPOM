package Pages;

import TestBase.testBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends testBase {



    @FindBy(partialLinkText = "Welcome")
    WebElement logout;

    @FindBy(linkText = "Logout")
    WebElement logbutton;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }


    public void Logout(){
        logout.click();
        logbutton.click();
    }
}
