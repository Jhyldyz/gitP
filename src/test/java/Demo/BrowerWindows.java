package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class BrowerWindows extends BaseTest {
    @Test
    public void windowsTest() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("tabButton")))
                .click();
        Thread.sleep(5000);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        WebElement sample = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(sample.getText(), "This is a sample page");
        Thread.sleep(3000);
    }

    @Test
    public void windowButton() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("windowButton")))
                .click();
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebElement sample = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(sample.getText(), "This is a sample page");
        Thread.sleep(3000);
    }

    @Test
    public void windowTest() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("messageWindowButton")))
                .click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs);
        driver.switchTo().window(tabs.get(1));
        driver.manage().window().maximize();
        Thread.sleep(7000);
        WebElement elem = driver.findElement(By.xpath("/html/body"));
        System.out.println(elem.getText());
        Assert.assertTrue(elem.getText().contains("Knowledge increases by sharing but not by saving"));

    }
}
