package com.digital.pages;

import com.digital.models.Student;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy (xpath = "(//div[@class='rt-tr -even'])[2]")
    public List <WebElement> actualResult;


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
        listOfStudent= new ArrayList<>();
        fillAppFirstName(student.getFirstName());
        listOfStudent.add(student.getFirstName());
        fillAppLastName(student.getLastName());
        listOfStudent.add(student.getLastName());
        fillAppEmail(student.getEMail());
        listOfStudent.add(student.getEMail());
        fillAppAge(student.getAge());
        listOfStudent.add(student.getAge());
        fillAppSalary(student.getSalary());
        listOfStudent.add(student.getSalary());
        fillAppDepartmen(student.getDepartment());
        listOfStudent.add(student.getDepartment());
        clickSubmit();
        return this;

    }
    List<String> listOfStudent= new ArrayList<>();


    public WebTablesPage getInfoFromActualList(){
       for (int i=0; i<actualResult.size(); i++){
           if(i==0) {
               Assert.assertTrue(actualResult.get(i).getText().contains(listOfStudent.get(i)));
           }
       }
        System.out.println(listOfStudent.toString());
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
