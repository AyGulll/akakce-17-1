package akakce;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _6_hesdog extends BaseDriver {
    @Test
    public void hsdg(){

        driver.get("https://www.akakce.com");
        WebElement login = driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        login.click();
        MyFunction.wait(1);
        WebElement mail = driver.findElement(By.xpath("//*[@id='life']"));
        mail.sendKeys("adem@gmail.com");
        MyFunction.wait(1);
        WebElement pass = driver.findElement(By.xpath("//*[@id='lifp']"));
        pass.sendKeys("Benim.45");
        MyFunction.wait(1);
        WebElement msg2= driver.findElement(By.xpath("//*[@id='lfb']"));
        msg2.click();
        MyFunction.wait(1);
        WebElement tex= driver.findElement(By.xpath("//*[@id='HM_v8']/i/a"));
        String gelmsj=tex.getText();
       // String bekmes="As";
        Assert.assertTrue("kullanici hesabi dogrulandi",gelmsj.equals("As"));

        MyFunction.wait(1);


    }
}
