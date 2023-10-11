package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox extends BaseTest{
    @Test
    void fillUpYheFormTest() throws InterruptedException {

        driver.get("https://demoqa.com/text-box"); // открыть именно эту страницу
        String expectedName= "userName";
        WebElement fullNameInputField = driver.findElement(By.id(expectedName));
        fullNameInputField.sendKeys("John Doe");

        String expectedEmail= "userEmail";
        WebElement emailField =driver.findElement(By.id(expectedEmail));
        emailField.sendKeys("john@gmail.com");

        String expectedCurrentAdress= "currentAddress";
        WebElement currentAddress= driver.findElement(By.id(expectedCurrentAdress));
        currentAddress.sendKeys("Bishkek");

        String expectedPermanent= "permanentAddress";
        WebElement permanentAddress= driver.findElement(By.id(expectedPermanent));
        permanentAddress.sendKeys("Lenina 269a");

        WebElement submitBtn= driver.findElement(By.id("submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();

        Thread.sleep(5000);
        WebElement resultName = driver.findElement(By.id("name"));
        Assert.assertTrue(resultName.getText().contains(expectedName));
        WebElement resultEmail= driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));
        WebElement resultCurrent= driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrent.getText().contains(expectedCurrentAdress));

        WebElement resultPermanent=driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanent.getText().contains(expectedPermanent));



    }
    void fillUpYheFormTest2() throws InterruptedException {

        driver.get("https://demoqa.com/text-box"); // открыть именно эту страницу
        String expectedName= "userName";
        WebElement fullNameInputField = driver.findElement(By.id(expectedName));
        fullNameInputField.sendKeys("John Doe");

        String expectedEmail= "userEmail";
        WebElement emailField =driver.findElement(By.id(expectedEmail));
        emailField.sendKeys("john@gmail.com");

        String expectedCurrentAdress= "currentAddress";
        WebElement currentAddress= driver.findElement(By.id(expectedCurrentAdress));
        currentAddress.sendKeys("Bishkek");

        String expectedPermanent= "permanentAddress";
        WebElement permanentAddress= driver.findElement(By.id(expectedPermanent));
        permanentAddress.sendKeys("Lenina 269a");

        WebElement submitBtn= driver.findElement(By.id("submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();

        Thread.sleep(5000);
        WebElement resultName = driver.findElement(By.id("name"));
        Assert.assertTrue(resultName.getText().contains(expectedName));
        WebElement resultEmail= driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));
        WebElement resultCurrent= driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrent.getText().contains(expectedCurrentAdress));

        WebElement resultPermanent=driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanent.getText().contains(expectedPermanent));



    }
    void fillUpYheFormTest3() throws InterruptedException {

        driver.get("https://demoqa.com/text-box"); // открыть именно эту страницу
        String expectedName= "userName";
        WebElement fullNameInputField = driver.findElement(By.id(expectedName));
        fullNameInputField.sendKeys("John Doe");

        String expectedEmail= "userEmail";
        WebElement emailField =driver.findElement(By.id(expectedEmail));
        emailField.sendKeys("john@gmail.com");

        String expectedCurrentAdress= "currentAddress";
        WebElement currentAddress= driver.findElement(By.id(expectedCurrentAdress));
        currentAddress.sendKeys("Bishkek");

        String expectedPermanent= "permanentAddress";
        WebElement permanentAddress= driver.findElement(By.id(expectedPermanent));
        permanentAddress.sendKeys("Lenina 269a");

        WebElement submitBtn= driver.findElement(By.id("submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        submitBtn.click();

        Thread.sleep(5000);

//        WebElement resultName = driver.findElement(By.id("name"));
//        Assert.assertTrue(resultName.getText().contains(expectedName));
//        WebElement resultEmail= driver.findElement(By.id("email"));
//        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));
//        WebElement resultCurrent= driver.findElement(By.xpath("//p[@id='currentAddress']"));
//        Assert.assertTrue(resultCurrent.getText().contains(expectedCurrentAdress));
//
//        WebElement resultPermanent=driver.findElement(By.xpath("//p[@id='permanentAddress']"));
//        Assert.assertTrue(resultPermanent.getText().contains(expectedPermanent));

    }
}
