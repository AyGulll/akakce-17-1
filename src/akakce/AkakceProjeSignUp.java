package akakce;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AkakceProjeSignUp extends BaseDriver {


    @Test

    public void SignUp() {
        driver.get("https://www.akakce.com/");


        //HomePage SignUp button click


        WebElement signUp = driver.findElement(By.linkText("Hesap Aç"));
        signUp.click();


        // Create an account page


        // Temel Bilgiler İnput Alanı

        MyFunc.Bekle(2);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='rnufn']"));
        firstName.sendKeys("İsmet");

        MyFunc.Bekle(2);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='rnufs']"));
        lastName.sendKeys("Temur");

        MyFunc.Bekle(2);

        WebElement eMail = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        eMail.sendKeys("a3432alemdar@yandex.com");

        MyFunc.Bekle(2);

        WebElement reEnterEMail = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        reEnterEMail.sendKeys("a3432alemdar@yandex.com");

        MyFunc.Bekle(2);

        WebElement passWord = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        passWord.sendKeys("Qwer123!+%");

        MyFunc.Bekle(2);

        WebElement reEnterPassWord = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        reEnterPassWord.sendKeys("Qwer123!+%");

        MyFunc.Bekle(2);

        WebElement genderSelection = driver.findElement(By.xpath("//input[@id='rngm']"));
        genderSelection.click();

        MyFunc.Bekle(2);


        //Select Menu Alanı


        WebElement webIlSecimi = driver.findElement(By.xpath("//select[@id='locpr']"));
        Select ddIlSecimi = new Select(webIlSecimi);
        ddIlSecimi.selectByIndex(54);

        MyFunc.Bekle(2);

        WebElement webIlceSecimi = driver.findElement(By.xpath("//select[@id='locds']"));
        Select ddIlceSecimi = new Select(webIlceSecimi);
        ddIlceSecimi.selectByIndex(3);

        MyFunc.Bekle(2);

        WebElement webGunSecimi = driver.findElement(By.xpath("//select[@id='bd']"));
        Select ddGunSecimi = new Select(webGunSecimi);
        ddGunSecimi.selectByIndex(3);

        MyFunc.Bekle(2);

        WebElement webAySecimi = driver.findElement(By.xpath("//select[@id='bm']"));
        Select ddAySecimi = new Select(webAySecimi);
        ddAySecimi.selectByIndex(3);

        MyFunc.Bekle(2);

        WebElement webYilSecimi = driver.findElement(By.xpath("//select[@id='by']"));
        Select ddYilSecimi = new Select(webYilSecimi);
        ddYilSecimi.selectByIndex(30);

        MyFunc.Bekle(2);


        //Kullanım Sözleşmesi Alanı

        WebElement kullanimSozlesmesi = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        kullanimSozlesmesi.click();

        MyFunc.Bekle(2);

        WebElement kampanyaBilgilendirme = driver.findElement(By.xpath("//input[@id='rnufnee']"));
        kampanyaBilgilendirme.click();

        MyFunc.Bekle(2);




        //Hesap Ac Butonu

        WebElement hesapAcButonu = driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapAcButonu.click();



        //BekleVeKapat();


    }


}
