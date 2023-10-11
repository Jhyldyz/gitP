package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JS extends BaseTest {
    @Test
    void demo1() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://demoqa.com/text-box'");

        WebElement fullName = driver.findElement(By.id("userName"));
        js.executeScript("changeWindowSize(300,300)");
        fullName.sendKeys("John");
        Thread.sleep(5000);
        WebElement email = driver.findElement(By.id("userEmail"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", email, "border: 2px solid yellow");
        email.sendKeys("jil@g.com");
        WebElement current = driver.findElement(By.id("currentAddress"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", current, "border: 2px solid yellow");
        current.sendKeys("Lenina23");
        WebElement adress = driver.findElement(By.id("permanentAddress"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", adress, "border: 2px solid yellow");
        adress.sendKeys("jik");
        WebElement submit = driver.findElement(By.id("submit"));

        js.executeScript("arguments[0].click()", submit);

        Thread.sleep(8000);


        // js.executeScript("arguments[0].click()")
    }
}
