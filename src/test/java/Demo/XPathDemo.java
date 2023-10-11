package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XPathDemo extends BaseTest{
    @Test void absolutXpath() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        WebElement firstNameInputField= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        firstNameInputField.sendKeys("John");
        Thread.sleep(7000);
    }
    @Test
    void relativeXpath() {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameInputField.sendKeys("Kukeeva");

        WebElement name = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        WebElement number = driver.findElement(By.xpath("//*[@id= 'userNumber']"));
        WebElement registationForm = driver.findElement(By.xpath("//*[text()='Student Registration Form']"));
        WebElement contains = driver.findElement(By.xpath("//*[contains(text(), 'Student')]"));
        WebElement emailText = driver.findElement(By.xpath("//form/div[2]/div/label"));
        WebElement currentAddress = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2])"));
        WebElement parent = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]/../.."));

    }
@Test
void searchPhone(){

     driver.get("https://www.amazon.com/s?k=iphone+15+pro+max+case&crid=DWHRSH23DNBS&sprefix=i%2Caps%2C273&ref=nb_sb_ss_ts-doa-p_1_1");
            WebElement phone= driver.findElement(By.xpath("//span[contains(text(), 'Pelican Shield Brushed Aluminum - iPhone 15 Pro Max Case 6.7\" [Compatible with MagSafe] [21ft Military Grade Drop Protection] Magnetic Charging Phone Case Cover w/Belt Clip Holster Kickstand - Black')]"));

            System.out.println(phone.getText());


        }

}