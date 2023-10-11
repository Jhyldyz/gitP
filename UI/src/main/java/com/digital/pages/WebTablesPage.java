package com.digital.pages;

import com.digital.models.Student;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WebTablesPage extends BasePage {
    WebTablesPage webTablesPage;
    @FindBy(id = "addNewRecordButton")
    public WebElement addBtn;
    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;
    @FindBy(id = "age")
    public WebElement ageInput;
    @FindBy(id = "salary")
    public WebElement salaryInput;
    @FindBy(id = "department")
    public WebElement departmentInput;
    @FindBy(id = "submit")
    public WebElement submitBtn;
    @FindBy(id = "edit-record-1")
    public WebElement redactorBtn;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement resultFirstName;


    public WebTablesPage addBtnClick() {
        elementActions.clickTheButton(addBtn);
        return this;
    }

    public WebTablesPage fillAppFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;
    }

    public WebTablesPage fillAppLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }

    public WebTablesPage fillAppEmail(String txt) {
        elementActions.writeText(emailInput, txt);
        return this;
    }

    public WebTablesPage fillAppAge(String txt) {
        elementActions.writeText(ageInput, txt);
        return this;
    }

    public WebTablesPage fillAppSalary(String txt) {
        elementActions.writeText(salaryInput, txt);
        return this;
    }

    public WebTablesPage fillAppDepartmen(String txt) {
        elementActions.writeText(departmentInput, txt);
        return this;
    }

    public WebTablesPage clickSubmit() {
        elementActions.clickTheButton(submitBtn);
        return this;
    }

    public WebTablesPage fillAppTheForm(Student student) {
        fillAppFirstName(student.getFirstName());
        fillAppLastName(student.getLastName());
        fillAppEmail(student.getEMail());
        fillAppAge(student.getAge());
        fillAppSalary(student.getSalary());
        fillAppDepartmen(student.getDepartment());
        clickSubmit();
        return this;
    }

//    public WebTablesPage testForm() throws InterruptedExcerption {
//        Thread.sleep(7000);
//        elementActions.clickTheButton(redactorBtn);
//        System.out.println(resultFirstName.getText());
//        System.out.println(lastNameInput.getText());
//        Assert.assertTrue(resultFirstName.getText().contains("Cierra"));
//        Assert.assertTrue(lastNameInput.getText().contains("Vega"));
//        return this;
//    }

}
