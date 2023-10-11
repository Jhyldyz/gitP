package Demo.HomeWork;

import Demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomeWork extends BaseTest {
    @Test
    void testClick(){
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        WebElement firstInputName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstInputName.sendKeys("Meervan");

        WebElement lastInputName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastInputName.sendKeys("Datkaeva");

        WebElement mailFemale= driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        mailFemale.click();

        WebElement yearsOfExperience= driver.findElement(By.xpath("(//input[@value='4'])"));
        yearsOfExperience.click();

        WebElement dateOf= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        dateOf.sendKeys("22.03.1987");


        WebElement professionInput= driver.findElement(By.xpath("//input[@value='Automation Tester']"));
        professionInput.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", professionInput);


//        WebElement photoInput=driver.findElement(By.xpath("//input[@name= 'photo']"));
//        photoInput.sendKeys("07908B7A-34BB-499B-AA0D-0861BD0625E1.png");


        WebElement flavoursOfSelenium=driver.findElement(By.xpath("//input[@value='  Selenium IDE ']"));
        flavoursOfSelenium.click();

        WebElement continentsBtn= driver.findElement(By.xpath("//select[@name='continents']/option[4]"));
        continentsBtn.click();

        WebElement seleniumCommands= driver.findElement(By.xpath("//select[@name='selenium_commands']/option[3]"));
        seleniumCommands.click();

        WebElement sumbitBtn= driver.findElement(By.xpath("//button[@name='submit']"));
        sumbitBtn.click();










    }
}
