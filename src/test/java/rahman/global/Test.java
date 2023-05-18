package rahman.global;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        System.out.println("Browser launch success");
        driver.manage().window().maximize();
        System.out.println("Browser maximized success");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

       String currentURL =  driver.getCurrentUrl();
        System.out.println("Current URL is "+currentURL);
        String expectedURL = "https://rahulshettyacademy.com/AutomationPractice/";

        Assert.assertEquals(currentURL,expectedURL);
       // System.out.println("Land is success");

        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println("On checkBoxOption1 click is success");

        driver.findElement(By.id("name")).sendKeys("Abu");
        System.out.println("Send Abu as a key success");

        List<WebElement> radioButtons = driver.findElements(By.name("radioButton"));
        for (WebElement ra:radioButtons){
            if(ra.getAttribute("value").equals("radio2")){
                ra.click();
            }
        }
        System.out.println("Click on radio button 2 is success");






        Thread.sleep(2000);
        driver.close();

    }

}
