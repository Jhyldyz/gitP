package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox2 {
    @Test
    void fillUpThePracticeForm(){
        WebDriverManager.chromedriver().setup();// сетап хром драйвер
        WebDriver driver=new ChromeDriver(); // создали обьект
        driver.manage().window().maximize(); //окно сделали с помощью максимайз максимально большим
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// setup the time повремени немного времени

        driver.get("https://demoqa.com/automation-practice-form"); // открыть именно эту страницу

        String expectedName= "firstName";
        WebElement fullNameInputField= driver.findElement(By.id(expectedName));
        fullNameInputField.sendKeys("Zhyldyz");
        WebElement resultName= driver.findElement(By.id("firstName"));
        Assert.assertTrue(resultName.getText().contains(expectedName));

       // js.executeScript("arguments[0].click();", button);// нажать кнопку внутри хтмл кода

        String expectedLastName= "lastName";
        String expectedEmail="userEmail";
        String expectedMobile="userNumber";
        String expectedDate= "dateOfBirthInput";
        String expectedCurrenetAdress="currentAddress";


    }
}
