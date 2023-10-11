package Demo;

import net.bytebuddy.utility.JavaConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DinamicProportis extends BaseTest {

@FindBy(id = "enableAfter")
    public WebElement enableAfter;

    @FindBy(xpath = "//button[@id='colorChange']")
    public WebElement enableChange;

    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;
   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

//    public DinamicProportis clickAfter(WebElement enableAfter) {
//        wait.until(ExpectedConditions.elementToBeClickable(enableAfter)).click();
//        return this;
//    }
//
//    public DinamicProportis clickVisible(WebElement visibleAfter) {
//        wait.until(ExpectedConditions.visibilityOf(visibleAfter)).click();
//        return this;
//    }



    @Test(priority = 1)
    public void clickclik() throws InterruptedException{
        driver.get("https://demoqa.com/dynamic-properties");
        new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")))
                .click();

        Thread.sleep(3000);

    }
    @Test(priority = 2)
    public void visibleA() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")))
                .click();
        Thread.sleep(5000);
    }

   // @Test(priority = 3)

//    public void color(){
//        Wait<WebDriverWait> wait= new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//button[@id='colorChange']")).)
//
//    }
}
