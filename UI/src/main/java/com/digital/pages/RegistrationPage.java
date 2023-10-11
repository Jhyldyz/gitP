package com.digital.pages;

import com.digital.models.Student;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage extends BasePage {
    @FindBy(id = "firstname")
    public WebElement firstNameInput;

    @FindBy(id = "lastname")
    public WebElement lastNameInput;

    @FindBy(id = "userName")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "recaptcha-anchor")
    public WebElement recaptchaInput;

    @FindBy(id= "register")
    public WebElement registerClick;

    @FindBy(id = "newUser")
    public WebElement newUserInput;


    public RegistrationPage fillUpTheFirstName(String txt) {
        elementActions.writeText(firstNameInput, "Jilduz");
        return this;
    }

    public RegistrationPage fillUpTheLastName(String txt) {
        elementActions.writeText(lastNameInput, "Jeenbaeva");
        return this;
    }

    public RegistrationPage fillUpUserName(String txt) {
        elementActions.writeText(userNameInput, "Jika");
        return this;
    }

    public RegistrationPage fillUpThePassword(String txt) {
        elementActions.writeText(passwordInput, "Jilduz123!@#");
        return this;
    }

    public RegistrationPage fillUpTheRecaptcha() {
        elementActions.clickTheButton(recaptchaInput);
        return this;
    }
    public RegistrationPage registerClick(){
        elementActions.clickTheButton(registerClick);
        return this;
    }
 public RegistrationPage registerNewUser(){
        elementActions.clickTheButton(newUserInput);
        return this;
 }
    public void fillUpTheFormRegistrationPages(Student student){
        fillUpTheFirstName(student.getFirstName());
        fillUpTheLastName(student.getLastName());
        fillUpUserName(student.getUserName());
        fillUpThePassword(student.getPassword());
        fillUpTheRecaptcha();
        registerClick();
    }

//    public void recaptcha(){
//        WebDriver driver = new ChromeDriver(elementActions);
//        driver.get("https://rsps100.com/vote/760");
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
//}
}

