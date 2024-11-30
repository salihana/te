package org.example;

public class Employee {
    String employee = "Иванов Иван Иванович";
    String post = "бухгалтер";
    String email = "ivanov@mail.com";
    String phone = "+79998883322";
    int salary = 60000;
    int age = 35;


    public void employeeInformation(){
    System.out.println (employee);
     System.out.println ("должность: " + post);
    System.out.println ("возраст: " + age + " лет.");
    System.out.println ("email: " + email);
    System.out.println ("номер телефона: " + phone);
    System.out.println ("оклад: " + salary + " руб.");
 }
}
