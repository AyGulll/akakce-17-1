package omr;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class accdel extends BaseDriver {
    @Test
    public void accdell() {

        driver.get("https://www.akakce.com");
        WebElement login= driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
       // WebElement giris5 = driver.findElement(By.xpath("//a[contains(@href, '/akakcem/giris/') and text()='Giriş Yap']"));
        login.click();
        MyFunc.wait(1);
        WebElement mail= driver.findElement(By.xpath("//*[@id='life']"));
        mail.sendKeys("adem@gmail.com");
        MyFunc.wait(1);
        WebElement pass= driver.findElement(By.xpath("//*[@id='lifp']"));
        pass.sendKeys("Benim.45");
        MyFunc.wait(1);
        WebElement gir= driver.findElement(By.xpath("//*[@id='lfb']"));
        gir.click();
        MyFunc.wait(1);
        WebElement sip= driver.findElement(By.xpath("//*[@id='HM_v8']/i/a"));
       // WebElement hesabiSil = driver.findElement(By.linkText("Hesabımı Sil"));
        sip.click();
        MyFunc.wait(1);
        WebElement sil= driver.findElement(By.xpath("//*[@id='AL']/li[4]/a[4]"));
        sil.click();
        MyFunc.wait(1);
        WebElement passd= driver.findElement(By.xpath("//*[@id='p']"));
        passd.sendKeys("Benim.45");
        MyFunc.wait(1);
        //WebElement siltik= driver.findElement(By.xpath("//*[@id='u']"));
        //        siltik.click();
        //        MyFunc.wait(1);
        // -------Hata mesajını seç ve kontrol et
        //WebElement hataMesaji = driver.findElement(By.xpath("//*[contains(text(), 'Mevcut şifrenizi doğru girdiğinizden emin olun.')]"));
        //String hataMetni = hataMesaji.getText();
        //String waitnenHataMesaji = "Mevcut şifrenizi doğru girdiğinizden emin olun.";
        //Assert.assertEquals("Hata mesajı kontrolü", waitnenHataMesaji, hataMetni);


    }
}
