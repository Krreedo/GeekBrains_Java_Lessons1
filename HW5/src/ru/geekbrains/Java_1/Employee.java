package ru.geekbrains.Java_1;

public class Employee {
    private final String lastName;
    private final String name;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String lastName, String name, String email, String phone, int salary, int age) {
        this.lastName = lastName;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void EmployeeInfo(){
        System.out.printf("Досье на сотрудника %s %s.\nEmail: %s, Телефон: %s \nЗарплата: %d рублей, Возраст: %d лет.\n" , lastName,name,email,phone,salary,age);
    }

    public int getAge() {
        return age;
    }

}
