package akakce;


import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class KayitOlveKayitSil  extends BaseDriver {


    @Test
    public void Test1()    // YENI HESAP OLUŞTURMA
	
    {
        driver.get("https://www.akakce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement hesapAcLink = driver.findElement(By.xpath("//a[contains(@href, 'giris/?m=1&') and text()='Hesap Aç']"));
        hesapAcLink.click();
        MyFunction.wait(1);

        WebElement ad = driver.findElement(By.id("rnufn"));
        ad.sendKeys("DurmakYok");
        MyFunction.wait(1);

        WebElement soyad = driver.findElement(By.id("rnufs"));
        soyad.sendKeys("YolaDevam");
        MyFunction.wait(1);

        WebElement email1 = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email1.sendKeys("DurmakYok123@gmail.com");
        MyFunction.wait(1);

        WebElement email2 = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        email2.sendKeys("DurmakYok123@gmail.com");
        MyFunction.wait(1);

        WebElement sifre1 = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre1.sendKeys("DurmakYok123");
        MyFunction.wait(1);

        WebElement sifre2 = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifre2.sendKeys("DurmakYok123");
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
        MyFunction.wait(1);

        System.out.println(" Test 1: Başarılıyla geçti, hesap oluşturuldu");
    }

    
    @Test
    public void Test2()       // DOĞRU EMAIL VE YANLIŞ ŞİFRE İLE HESAP SİLME TESTİ
    {
        driver.get("https://www.akakce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement giris = driver.findElement(By.xpath("//a[contains(@href, '/akakcem/giris/') and text()='Giriş Yap']"));
        giris.click();
        MyFunction.wait(1);

        // Giriş yap
        WebElement email3 = driver.findElement(By.id("life"));
        email3.sendKeys("DurmakYok123@gmail.com");
	    MyFunction.wait(1);

        WebElement sifre3 = driver.findElement(By.id("lifp"));
        sifre3.sendKeys("DurmakYok123");
	    MyFunction.wait(1);

        WebElement girisyap = driver.findElement(By.id("lfb"));
        girisyap.click();
        MyFunction.wait(1);

        WebElement hsp = driver.findElement(By.id("H_a_v8"));
        hsp.click();
        MyFunction.wait(1);

        WebElement hsp1 = driver.findElement(By.id("HM_v8"));
        hsp1.click();
	    MyFunction.wait(1);

        WebElement hesabiSil = driver.findElement(By.linkText("Hesabımı Sil"));
        hesabiSil.click();
	    MyFunction.wait(1);

        // Şifreyi gir ve "Hesabımı Sil" butonuna tıkla
        WebElement sifreGir = driver.findElement(By.id("p"));
        sifreGir.sendKeys("DurmakYok456");
        MyFunction.wait(1);

        WebElement hesabimiSilbtn = driver.findElement(By.id("u"));
        hesabimiSilbtn.click();
        MyFunction.wait(1);

        // Hata mesajını seç ve kontrol et
        WebElement hataMesaji = driver.findElement(By.xpath("//*[contains(text(), 'Mevcut şifrenizi doğru girdiğinizden emin olun.')]"));
        String hataMetni = hataMesaji.getText();
        String beklenenHataMesaji = "Mevcut şifrenizi doğru girdiğinizden emin olun.";
        Assert.assertEquals("Hata mesajı kontrolü", beklenenHataMesaji, hataMetni);

        WebElement tamamtamam = driver.findElement(By.cssSelector("button[onclick='Modal_v8.close()']"));
        tamamtamam.click();
        MyFunction.wait(1);

        System.out.println(" Test 2: Başarılıyla geçti, istenilen mesajı alındı-> " + hataMetni);

        MyFunction.wait(1);
    }

    
    @Test
    public void Test3()        // DOĞRU EMAİL VE DOĞRU ŞİFRE İLE HESAP SİLME TESTİ
    {

        driver.get("https://www.akakce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        WebElement giris = driver.findElement(By.xpath("//a[contains(@href, '/akakcem/giris/') and text()='Giriş Yap']"));
        giris.click();
        MyFunction.wait(1);

        // Giriş yap
        WebElement email3 = driver.findElement(By.id("life"));
        email3.sendKeys("DurmakYok123@gmail.com");
	    MyFunction.wait(1);

        WebElement sifre3 = driver.findElement(By.id("lifp"));
        sifre3.sendKeys("DurmakYok123");
	    MyFunction.wait(1);

        WebElement girisyap = driver.findElement(By.id("lfb"));
        girisyap.click();
        MyFunction.wait(1);

        WebElement hsp = driver.findElement(By.id("H_a_v8"));
        hsp.click();
        MyFunction.wait(1);

        WebElement hsp1 = driver.findElement(By.id("HM_v8"));
        hsp1.click();
	    MyFunction.wait(1);

        WebElement hesabiSil = driver.findElement(By.linkText("Hesabımı Sil"));
        hesabiSil.click();
	    MyFunction.wait(1);

        // Şifreyi gir 
        WebElement sifreGir = driver.findElement(By.id("p"));
        sifreGir.sendKeys("DurmakYok123");
        MyFunction.wait(1);

	    // "Hesabımı Sil" butonuna tıkla
        WebElement hesabimiSilbtn = driver.findElement(By.id("u"));
        hesabimiSilbtn.click();
        MyFunction.wait(1);

        WebElement anaSayfaGit = driver.findElement(By.cssSelector("#C4w > ul > li > p > a:nth-child(2)"));
        anaSayfaGit.click();
        MyFunction.wait(1);

        System.out.println(" Test 3: Başarılıyla geçti, hesap silindi  " );

        MyFunction.wait(1);
    }

    
    @Test
    public void Test4()       //HESABI SİLİP SİLMEDİĞİNİ KONTROL TESTİ
    {
        MyFunction.wait(4);

        driver.get("https://www.akakce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement giris = driver.findElement(By.xpath("//a[contains(@href, '/akakcem/giris/') and text()='Giriş Yap']"));
        giris.click();
        MyFunction.wait(1);

        // Giriş yap
        WebElement email3 = driver.findElement(By.id("life"));
        email3.sendKeys("DurmakYok123@gmail.com");
	    MyFunction.wait(1);

        WebElement sifre3 = driver.findElement(By.id("lifp"));
        sifre3.sendKeys("DurmakYok123");
	    MyFunction.wait(1);

        WebElement girisyap1 = driver.findElement(By.id("lfb"));
        girisyap1.click();
        MyFunction.wait(1);

        WebElement hataMesaji1 = driver.findElement(By.xpath("//*[contains(text(), 'Böyle bir kullanıcı yok.')]"));
        String hataMetni1 = hataMesaji1.getText();
        String beklenenHataMesaji1 = "Böyle bir kullanıcı yok.";
        Assert.assertEquals("Hata mesajı kontrolü", beklenenHataMesaji1, hataMetni1);

        System.out.println(" Test 4: Başarılıyla geçti ve istenilen mesajı alındı -> " + beklenenHataMesaji1);

        MyFunction.wait(1);

        BekleveKapat();


    }

}
