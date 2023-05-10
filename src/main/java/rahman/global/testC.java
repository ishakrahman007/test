package rahman.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testC {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser maximize success");

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.close();

        String actualUrl = "https://mailchimp.com/";
        String expectedUrl = driver.getCurrentUrl();
      //Assert.assertEquals(expectedUrl, actualUrl);
        driver.findElement(By.cssSelector(".gn__cta.gn__cta--primary.ctaPrimary")).click();

        driver.findElement(By.cssSelector(".ctaBuyNow.ctaPrimary.ctaPrimary--small.ctaPrimary--fullWidth")).click();


        driver.findElement(By.cssSelector("#email")).sendKeys("test@testing.com");
        driver.findElement(By.cssSelector("#new_username")).sendKeys("");

        driver.findElement(By.cssSelector(".rounded-corners-4.av-password.invalid")).sendKeys("Abcd$007");
        Thread.sleep(2000);
        driver.close();
    }
}
