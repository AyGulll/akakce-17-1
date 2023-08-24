package akakce;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _3_Logout extends BaseDriver {

    @Test
    public void logoutTest(){
        driver.get("https://www.akakce.com/");
        WebElement login=driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        login.click();

        WebElement email=driver.findElement(By.xpath(" //*[@id='life']"));
        email.sendKeys("gul11@gmail.com");

        WebElement paasword=driver.findElement(By.id("lifp"));
        paasword.sendKeys("12345PLMok");
        WebElement clickgiris=driver.findElement(By.xpath("//*[@id='lfb']"));
        clickgiris.click();
        MyFunction.wait(1);
        WebElement logout=driver.findElement(By.xpath("//*[@id='HM_v8']/ul/li[5]/a"));
        logout.click();

        MyFunction.wait(1);

    }
}
