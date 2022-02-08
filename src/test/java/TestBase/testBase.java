package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class testBase {
    public Properties prop;
    public static WebDriver driver;
    public testBase(){
        try{
            FileInputStream ip = new FileInputStream("C:\\Users\\AnkitKumar\\IdeaProjects\\InfoStride\\ProjectPOM\\src\\test\\java\\config\\config.properties");
            prop = new Properties();
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void initialization(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.get(prop.getProperty("url"));

    }

}
