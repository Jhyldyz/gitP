package Demo.HomeWork;

import Demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeForm extends BaseTest {
    @Test
    void practiceForm() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement inputName = driver.findElement(By.id("firstName"));
        inputName.sendKeys("Zhyldyz");

        WebElement inputLastName = driver.findElement(By.id("lastName"));
        inputLastName.sendKeys("Zheenbaeva");

        WebElement inputEmail = driver.findElement(By.id("userEmail"));
        inputEmail.sendKeys("jilduz0@gmai.com");

        WebElement genderMail = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
        new Actions(driver).moveToElement(genderMail).click().build().perform();
        WebElement mobileNum = driver.findElement(By.id("userNumber"));
        mobileNum.sendKeys("996555357088");

        WebElement dateOfBirthInputField = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInputField.click();
        WebElement datePickerMonthSelect = driver.findElement(By.className("react-datepicker__month-select"));
        Select select = new Select(datePickerMonthSelect);

        select.selectByIndex(11);
        WebElement datePickerYearSelect = driver.findElement(By.className("react-datepicker__year-select"));
        select = new Select(datePickerYearSelect);
        select.selectByIndex(89);

        WebElement datePickerDaySelect = driver.findElement(By.className("react-datepicker__month"));
        WebElement dayElement = datePickerDaySelect.findElement(By.xpath(".//*[text()='26']"));
        dayElement.click();






//

        WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-3"));
        new Actions(driver).moveToElement(hobbies).click().build().perform();


        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys("Lenina 269a");

        WebElement picture = driver.findElement(By.id("uploadPicture"));
        picture.sendKeys("/Users/zhyldyzzheenbaeva/Desktop/123.png");

       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", picture);

        WebElement stateState = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
        stateState.click();
        WebElement state = driver.findElement(By.xpath("//*[text()='NCR']"));
        state.click();

        WebElement selectCity = driver.findElement(By.id("city"));
        selectCity.click();
        WebElement city = driver.findElement(By.xpath("//*[text()='Delhi']"));
        city.click();


        WebElement findSubject = driver.findElement(By.id("subjectsContainer"));
        findSubject.click();

        WebElement findSubject2 = driver.findElement(By.id("subjectsInput"));
        findSubject2.sendKeys("Maths");
        findSubject2.sendKeys(Keys.ENTER);

        WebElement submitBtn= driver.findElement(By.id("submit"));
        submitBtn.click();
        Thread.sleep(2000);

    }
}

