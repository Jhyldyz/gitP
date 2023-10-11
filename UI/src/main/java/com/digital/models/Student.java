package com.digital.models;

import lombok.*;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Builder
//@EqualsAndHashCode
@Data
//@SneakyThrows можно использовать через трай кеч
public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String eMail;
    private String phoneNUmber;
    private String currentAddress;
    private String password;
    private String age;
    private String salary;
    private String department;


}
