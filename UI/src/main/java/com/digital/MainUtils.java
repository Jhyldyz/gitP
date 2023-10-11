package com.digital;

import com.digital.driver.Driver;
import com.digital.helper.AlertHelper;
import com.digital.helper.FrameHelper;
import com.digital.helper.ScreenShotMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class MainUtils {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = Driver.getDriver().switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();


        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();

        driver.findElement(By.id("promtBuyyon")).click();
        alert.sendKeys("Nuta");
        alert.accept();


    }

    @Test
    public void testToAlert() throws InterruptedException, IOException {
        ScreenShotMethods screenShotMethods= new ScreenShotMethods();
        WebDriver driver = Driver.getDriver();
        AlertHelper alertHelper = new AlertHelper();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);
        alertHelper.acceptAlert();
        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();
        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("Jildiz");
        screenShotMethods.takeScreenShot();

    }

    @Test
    void test10() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath(" //div[@id='framesWrapper']/div"));
        System.out.println(div.getText());
    }

    @Test
    void test2() {
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Child Iframe");
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
    }

    @Test
    void test3() throws InterruptedException {
        driver.get("https://demoqa.com/nestedframes");
        FrameHelper frameHelper = new FrameHelper();
//        frameHelper.switchToFrameById("frame1");
//        System.out.println(driver.findElement(By.tagName("body")).getText());
//        frameHelper.switchToParentFrame();
        //System.out.println(driver.findElement(By.id("//div[@id='framesWrapper']/div")));
        frameHelper.switchToFrameByIndex(0);
        System.out.println(driver.findElement(By.linkText("Parent frame")));
                frameHelper.switchToDefaultContent()
                .switchToFrameByWebElement(driver.findElement(By.tagName("p")));
        Thread.sleep(5000);
    }
}
