package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class BaseDriver {

    public static WebDriver driver; //singleton driver metod

    static {//public static driver baslat
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public static void BekleveKapat() {
        MyFunction.wait(5);
        driver.quit();

    }
}
