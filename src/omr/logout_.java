package omr;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class logout_ extends BaseDriver {
    @Test
    public  void logout() {
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
        MyFunc.wait(1);//*[@id='HM_v8']/ul/li[5]/a
        //WebElement logout= driver.findElement(By.xpath("//*[@id='HM_v8']/ul/li[5]/a"));
        //logout.click();
        //MyFunc.wait(1);
       WebElement out=driver.findElement(By.xpath("//*[@id='H_a_v8']"));
        MyFunc.wait(1);
        Actions akslr=new Actions(driver);
        MyFunc.wait(1);
        Action aks=akslr.moveToElement(out).build();
        MyFunc.wait(1);
        aks.perform();

        //*[@id="HM_v8"]/ul/li[5]/a
        WebElement logout= driver.findElement(By.xpath("//*[@id='HM_v8']/ul/li[5]/a"));
        logout.click();
        MyFunc.wait(3);

    }
}
