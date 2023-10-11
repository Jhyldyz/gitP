package Demo.HomeWork;

import Demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomeWork2 extends BaseTest {
    @Test
    void testClick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm'");
        WebElement FirstInputName = driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstInputName.sendKeys("Meervan");
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", FirstInputName, "border: 2px solid yellow");

        WebElement LastInputName = driver.findElement(By.xpath("//input[@name='lastname']"));
        LastInputName.sendKeys("Datkaeva");
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", LastInputName, "border: 2px solid yellow");

        WebElement femaleBtn = driver.findElement(By.xpath("//input[@value='Female']"));
        femaleBtn.click();
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", femaleBtn, "border: 2px solid yellow");

        WebElement yearsBtn = driver.findElement(By.xpath("//input[@value='1']"));
        yearsBtn.click();
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", yearsBtn, "border: 2px solid yellow");

        WebElement dataBirth = driver.findElement(By.xpath("(//input[@style='width:95%;padding:4px 0px 4px 5px;margin:4px 0px'])[3]"));
        dataBirth.sendKeys("29.07.1987");
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", dataBirth, "border: 2px solid yellow");

        WebElement professionInput = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
        professionInput.click();
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", professionInput, "border: 2px solid yellow");

//    WebElement fileBtn = driver.findElement(By.xpath("//input[@name='photo']"));
//        fileBtn.sendKeys("C:\\Users\\User\\Desktop\\Без названия.jpeg");

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", professionInput);

        WebElement seleniumBtn = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
        seleniumBtn.click();


        WebElement continentChoseBtn = driver.findElement(By.xpath("//select[@name='continents']/option[4]"));
        continentChoseBtn.click();

        WebElement anyBtn = driver.findElement(By.xpath("//select[@name='selenium_commands']/option[3]"));
        anyBtn.click();

        WebElement submitBtn = driver.findElement(By.cssSelector("button[name^='submit']"));

        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", submitBtn, "border: 2px solid red");

        submitBtn.click();

    }

}
