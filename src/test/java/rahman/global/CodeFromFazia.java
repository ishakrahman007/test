package rahman.global;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CodeFromFazia {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser maximize success");
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedUrl = "https://rahulshettyacademy.com/locatorspractice/";
        String actualUrl = driver.getCurrentUrl();
      //  Assert.assertEquals(expectedUrl, actualUrl);
        System.out.println("True");

        //id
        driver.findElement(By.id("inputUsername")).sendKeys("Fazia");
        System.out.println("User name is entered in the username field");
        //name
        driver.findElement(By.name("inputPassword")).sendKeys("12345");
        System.out.println("Password  is entered in the Password field");
        //cssSelector
        driver.findElement(By.className("signInBtn")).click();
        System.out.println("Click on button success");

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       // System.out.println("error displayed");

        driver.findElement(By.linkText("Forgot your password?")).click();
        System.out.println("Click on button success");

        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Rahul");
        System.out.println("User name entered with success");

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Rahul@gmail.com");
        System.out.println("Password entered with success");

        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("1234567");
        System.out.println("Phone number entered with success");


        driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
        System.out.println("Click on btn success");

        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());

        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        System.out.println("Click on btn success");

        driver.findElement(By.id("inputUsername")).sendKeys("Fazia");
        System.out.println("User name is entered in the username field");
        //name
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        System.out.println("Password is entered in the password field");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();
        System.out.println("This cssSelector does not work with click()");


        Thread.sleep(3000);
        driver.close();
    }
}

