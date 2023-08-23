package omr;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkAccount extends BaseDriver {

    @Test
    public void checkAccount() {

        driver.get("https://www.akakce.com");
        WebElement login= driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        //WebElement giris = driver.findElement(By.xpath("//a[contains(@href, '/akakcem/giris/') and text()='Giriş Yap']"));
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
        WebElement nmtag= driver.findElement(By.xpath("//*[@id='HM_v8']/i/a"));
        System.out.println("nmtag = " + nmtag.getText()); //*[@id='HM_p_v8']/a/text()[2]
       // Assert.assertTrue("kullanici dogru olustu",nmtag.getText().equals("As"));
        if (nmtag.getText().equals("As"))
          System.out.println("kullanci dogru olustu");
        MyFunc.wait(3);  // #HM_v8 > i > a    //*[@id="HM_v8"]/i/a


    }
}
