package omr;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class hesac extends BaseDriver {
    @Test
    public void loginTestPositive() {
    driver.get("https://www.akakce.com");
        WebElement opacc= driver.findElement (By.linkText("Hesap Aç"));
        //WebElement hesapAcLink = driver.findElement
         //       (By.xpath("//a[contains(@href, 'giris/?m=1&') and text()='Hesap Aç']"));
        opacc.click();
        MyFunc.wait(1);
        WebElement name= driver.findElement(By.name("rnufn"));
        name.sendKeys("omer");
        MyFunc.wait(1);
        WebElement surname= driver.findElement(By.name("rnufs"));
        surname.sendKeys("alm");
        MyFunc.wait(1);
        WebElement email= driver.findElement(By.name("rnufe1"));
        email.sendKeys("adem@gmail.com");
        MyFunc.wait(1);
        WebElement email2= driver.findElement(By.name("rnufe2"));
        email2.sendKeys("adem@gmail.com");
        MyFunc.wait(1);
        WebElement sifre1= driver.findElement(By.name("rnufp1"));
        sifre1.sendKeys("Benim.45");
        MyFunc.wait(1);
        WebElement sifre2= driver.findElement(By.name("rnufp2"));
        sifre2.sendKeys("Benim.45");
        MyFunc.wait(1);
        WebElement gender= driver.findElement(By.id("rngm"));
        gender.click();
       MyFunc.wait(1);
       WebElement city= driver.findElement(By.id("locpr"));
        Select il=new Select(city);
        il.selectByValue("6");
        WebElement ilce= driver.findElement(By.id("locds"));
        Select ilce2=new Select(ilce);
        ilce2.selectByValue("80");
        MyFunc.wait(1);
        WebElement day= driver.findElement(By.name("bd"));
        Select d=new Select(day);
        d.selectByValue("1");
        MyFunc.wait(1);
        WebElement month= driver.findElement(By.name("bm"));
        Select m=new Select(month);
        m.selectByValue("1");
        MyFunc.wait(1);
        WebElement year= driver.findElement(By.name("by"));
        Select y=new Select(year);
        y.selectByValue("1980");
        MyFunc.wait(1);
        WebElement chk1= driver.findElement(By.name("rnufpca"));
        chk1.click();
        WebElement chk2= driver.findElement(By.name("rnufnee"));
        chk2.click();
    }



}
