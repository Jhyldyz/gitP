package com.digital.utils;

import com.digital.models.Student;
import com.github.javafaker.Faker;

public class FakeDataProvider {
    static Faker faker = new Faker();

    public String generateFakeFullName() {
        return faker.name().fullName();
    }
    public String generationFirstName(){
        return faker.name().firstName();
    }

    public String generateFakeLastName() {
        return faker.name().lastName();
    }

    public String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public String generationPhoneNUmber() {
        return faker.number().digits(10);
    }

    public String generationFakeCurrentAddress() {
        return faker.address().fullAddress();
    }
    public String generationAge() {
        return faker.number().digits(2);
    }
    public String generationSalary() {
        return faker.number().digits(5);
    }


    public String generationFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }

    public Student createFakeStudent(){
        Student student= new Student();
        student.setFirstName(generationFirstName());
        student.setLastName(generateFakeLastName());
        student.setEMail(generateFakeEmail());
        student.setPhoneNUmber(generationPhoneNUmber());
        student.setCurrentAddress(generationFakeCurrentAddress());
        student.setAge(generationAge());
        student.setSalary(generationSalary());

        return student;

    }
    public Student createFakeStudentForWebtables(){
        Student student= new Student();
        student.setFirstName(generationFirstName());
        student.setLastName(generateFakeLastName());
        student.setEMail(generateFakeEmail());
        student.setAge(generationAge());
        student.setSalary(generationSalary());
        student.setDepartment("Psihologi");
        return student;

    }


}
