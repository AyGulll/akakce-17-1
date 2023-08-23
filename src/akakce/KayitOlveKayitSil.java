package akakce;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class KayitOlveKayitSil extends BaseDriver{

    @Test
    public void Test1()
    {
        driver.get("https://www.akakce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //HESAP AÇMA

        WebElement hesapAcLink = driver.findElement(By.xpath("//a[contains(@href, 'giris/?m=1&') and text()='Hesap Aç']"));
        hesapAcLink.click();
        MyFunction.wait(1);

        WebElement ad = driver.findElement(By.id("rnufn"));
        ad.sendKeys("Bora");
        MyFunction.wait(1);

        WebElement soyad = driver.findElement(By.id("rnufs"));
        soyad.sendKeys("Dora");
        MyFunction.wait(1);

        WebElement email1 = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email1.sendKeys("BoraDora@gmail.com");
        MyFunction.wait(1);

        WebElement email2 = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        email2.sendKeys("BoraDora@gmail.com");
        MyFunction.wait(1);

        WebElement sifre1 = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre1.sendKeys("BoraDora123");
        MyFunction.wait(1);

        WebElement sifre2 = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifre2.sendKeys("BoraDora123");
        MyFunction.wait(1);

        WebElement cinsiyet = driver.findElement(By.xpath("//input[@id='rngm']"));
        cinsiyet.click();
        MyFunction.wait(1);

        WebElement il = driver.findElement(By.xpath("//*[@id='locpr']"));
        il.click();
        MyFunction.wait(1);

        WebElement ilno = driver.findElement(By.xpath("//*[@value='35']"));
        ilno.click();
        MyFunction.wait(1);

        WebElement ilce = driver.findElement(By.xpath("//*[@id='locds']"));
        ilce.click();
        MyFunction.wait(1);

        WebElement ilceno = driver.findElement(By.xpath("//*[@value='469']"));
        ilceno.click();
        MyFunction.wait(1);

        WebElement gun = driver.findElement(By.xpath("//*[@id='bd']"));
        gun.click();
        MyFunction.wait(1);

        WebElement gunno = driver.findElement(By.xpath("//select[@id='bd']/option[2]"));
        gunno.click();
        MyFunction.wait(1);

        WebElement ay = driver.findElement(By.xpath("//*[@id='bm']"));
        ay.click();
        MyFunction.wait(1);

        WebElement ayno = driver.findElement(By.xpath("//select[@id='bm']/option[2]"));
        ayno.click();
        MyFunction.wait(1);

        WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));
        yil.click();
        MyFunction.wait(1);

        WebElement yilno = driver.findElement(By.xpath("//select[@id='by']/option[22]"));
        yilno.click();
        MyFunction.wait(1);

        WebElement kullanimSozlesmesi = driver.findElement(By.xpath("//*[@id='rnufpca']"));
        kullanimSozlesmesi.click();
        MyFunction.wait(1);

        WebElement kampanya = driver.findElement(By.xpath("//*[@id='rnufnee']"));
        kampanya.click();
        MyFunction.wait(1);
      
        WebElement hesapAc = driver.findElement(By.xpath("//*[@id='rfb']"));
        hesapAc.click();

        System.out.println("Test 1: Hesap başarıyla oluşturuldu");

    }

    @Test
    public void Test2() {

        driver.get("https://www.akakce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement giris = driver.findElement(By.xpath("//a[contains(@href, '/akakcem/giris/') and text()='Giriş Yap']"));
        giris.click();
        MyFunction.wait(1);

        // Giriş yap
        WebElement email3 = driver.findElement(By.id("life"));
        email3.sendKeys("BoraDora@gmail.com");

        WebElement sifre3 = driver.findElement(By.id("lifp"));
        sifre3.sendKeys("BoraDora123");

        WebElement girisyap = driver.findElement(By.id("lfb"));
        girisyap.click();
        MyFunction.wait(1);

        WebElement hsp = driver.findElement(By.id("H_a_v8"));
        hsp.click();
        MyFunction.wait(1);

        WebElement hsp1 = driver.findElement(By.id("HM_v8"));
        hsp1.click();

        WebElement hesabiSil = driver.findElement(By.linkText("Hesabımı Sil"));
        hesabiSil.click();

        // Şifreyi gir ve "Hesabımı Sil" butonuna tıkla
        WebElement sifreGir = driver.findElement(By.id("p"));
        sifreGir.sendKeys("BoraDora456");
        MyFunction.wait(1);

        WebElement hesabimiSilbtn = driver.findElement(By.id("u"));
        hesabimiSilbtn.click();
        MyFunction.wait(1);

        // Hata mesajını seç ve kontrol et
        WebElement hataMesaji = driver.findElement(By.xpath("//*[contains(text(), 'Mevcut şifrenizi doğru girdiğinizden emin olun.')]"));
        String hataMetni = hataMesaji.getText();
        String waitnenHataMesaji = "Mevcut şifrenizi doğru girdiğinizden emin olun.";
        Assert.assertEquals("Hata mesajı kontrolü", waitnenHataMesaji, hataMetni);


        System.out.print("Test 2: Başarılıyla geçti ve istenilen mesajı alındı -> " + waitnenHataMesaji);

    }

    @Test
    public void Test3()
    {
        driver.get("https://www.akakce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


//        WebElement hsp3= driver.findElement(By.id("H_a_v8"));
//        hsp3.click();
//        MyFunction.wait(1);
//
//        WebElement cik = driver.findElement(By.xpath("//*[contains(text(), '#Çık')]"));
//        cik.click();
//        MyFunction.wait(1);

        WebElement giris5 = driver.findElement(By.xpath("//a[contains(@href, '/akakcem/giris/') and text()='Giriş Yap']"));
        giris5.click();
        MyFunction.wait(1);

        // Giriş yap
        WebElement email3 = driver.findElement(By.id("life"));
        email3.sendKeys("BoraDora@gmail.com");

        WebElement sifre3 = driver.findElement(By.id("lifp"));
        sifre3.sendKeys("BoraDora123");

        WebElement girisyap = driver.findElement(By.id("lfb"));
        girisyap.click();
        MyFunction.wait(1);

        WebElement hsp2 = driver.findElement(By.id("HM_v8"));
        hsp2.click();


        WebElement hesabiSil= driver.findElement(By.linkText("Hesabımı Sil"));
        hesabiSil.click();

        // Şifreyi gir ve "Hesabımı Sil" butonuna tıkla
        WebElement sifreGir = driver.findElement(By.id("p"));
        sifreGir.sendKeys("BoraDora123");
        MyFunction.wait(1);

        WebElement hesabimiSilbtn = driver.findElement(By.id("u"));
        hesabimiSilbtn.click();
        MyFunction.wait(1);

        System.out.println("Test 3: Başarılıyla geçti, hesap silindi  " );

        BekleveKapat();

    }


    @Test
    public void Test4()
    {

        driver.get("https://www.akakce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement giris = driver.findElement(By.xpath("//a[contains(@href, '/akakcem/giris/') and text()='Giriş Yap']"));
        giris.click();
        MyFunction.wait(1);

        // Giriş yap
        WebElement email3 = driver.findElement(By.id("life"));
        email3.sendKeys("BoraDora@gmail.com");

        WebElement sifre3 = driver.findElement(By.id("lifp"));
        sifre3.sendKeys("BoraDora123");

        WebElement girisyap1 = driver.findElement(By.id("lfb"));
        girisyap1.click();
        MyFunction.wait(1);

        WebElement hataMesaji1 = driver.findElement(By.xpath("//*[contains(text(), 'Böyle bir kullanıcı yok.')]"));
        String hataMetni1 = hataMesaji1.getText();
        String waitnenHataMesaji1 = "Böyle bir kullanıcı yok.";
        Assert.assertEquals("Hata mesajı kontrolü", waitnenHataMesaji1, hataMetni1);

        System.out.print("Test 4: Başarılıyla geçti ve istenilen mesajı alındı -> " + waitnenHataMesaji1);

        BekleveKapat();

    }

}



