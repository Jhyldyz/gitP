package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElementDemo extends BaseTest{
    @Test
    void demo12(){
        driver.get("https://demoqa.com/text-box");
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

//        WebElement submitBtn= driver.findElement(By.id("submit"));
//        Actions actions= new Actions(driver);
//        submitBtn.click();
//        WebElement submitBtn = driver.findElement(By.id("submit")); // btn buttonjs.executeScript("arguments[0].setAttribute('style',arguments[1]);", submitBtn, "border: 2px solid red");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement submitBtn = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitBtn).perform();
        js1.executeScript("arguments[0].click();", submitBtn);

    }
}
