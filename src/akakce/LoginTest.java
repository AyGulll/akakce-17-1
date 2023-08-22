package akakce;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseDriver {
@Test
    public void LoginTest(){



    driver.get("https://www.akakce.com/");
    WebElement login= driver.findElement(By.xpath("//*[text()='Giriş Yap']"));
    login.click();

    WebElement emailbox=driver.findElement(By.xpath("//input[@id='life']"));
    emailbox.sendKeys("fdsg@sdf.com");

    WebElement password=driver.findElement(By.xpath("//input[@id='lifp']"));
    password.sendKeys("123456");

    WebElement rememberme=driver.findElement(By.xpath("//input[@name='lifr']"));
    rememberme.isSelected();

    WebElement enter= driver.findElement(By.xpath("//input[@id='lfb']"));
    enter.click();


    BekleveKapat();
    }



}
