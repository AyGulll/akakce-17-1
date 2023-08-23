package akakce;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseDriver {
@Test
    public void LoginTest(){

    driver.get("https://www.akakce.com/");
    WebElement login= driver.findElement(By.xpath("//*[text()='Giriş Yap']"));
    login.click();
    MyFunction.wait(3);
    WebElement emailbox=driver.findElement(By.xpath("//input[@id='life']"));
    emailbox.sendKeys("BoraDora@gmail.com");
    MyFunction.wait(3);
    WebElement password=driver.findElement(By.xpath("//input[@id='lifp']"));
    password.sendKeys("BoraDora123");
    MyFunction.wait(3);
    WebElement rememberme=driver.findElement(By.xpath("//input[@name='lifr']"));
    rememberme.isSelected();
    MyFunction.wait(3);
    WebElement enter= driver.findElement(By.xpath("//input[@id='lfb']"));
    enter.click();


    BekleveKapat();
    }



}
