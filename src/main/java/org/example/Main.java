package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee();
        ivan.employeeInformation();
        System.out.println(ivan);

        //Person newPers = new Person();
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Петров Иван", "Инженер", "petrov@mail.com", "+79586321414", 60000, 30);
        System.out.println(Arrays.toString(persArray));
    }
}