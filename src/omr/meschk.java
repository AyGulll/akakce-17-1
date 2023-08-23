package omr;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class meschk extends BaseDriver {
    @Test
        public void mesgchk (){

        driver.get("https://www.akakce.com");
        WebElement login= driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
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
        sip.click();
        MyFunc.wait(1);
        WebElement msg= driver.findElement(By.xpath("//*[@id='AL']/li[1]/a[2]"));
        msg.click();
        MyFunc.wait(1);
        //WebElement msg2= driver.findElement(By.xpath("//*[@id='C4w']/div/p"));
        //msg2.click();
        //MyFunc.wait(1);
        WebElement tex= driver.findElement(By.xpath("//*[@id='C4w']/div/p"));
        if (tex.getText().equals("Listelenecek mesaj bulunamadı.")){
            System.out.println("mesaj kutusu bos kontrol edildi");
        }
        MyFunc.wait(1);





        }
    }

