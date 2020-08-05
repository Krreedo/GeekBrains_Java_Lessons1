package ru.geekbrains.Java_1;

import java.util.Random;

public class HW5 {

    public static void main(String[] args) {
        Random random = new Random();
        Employee[] employeesList = new Employee[5];
        employeesList[0] = new Employee("Ivanov","Ivan","iii@gmail.ru","+79222234439",random.nextInt(100000)+40000,random.nextInt(47)+18);
        employeesList[1] = new Employee("Zaharova","Margarita","kisa339@ok.ru","+7(812)330-33-12",random.nextInt(100000)+40000,random.nextInt(47)+18);
        employeesList[2] = new Employee("Kletchuk","Victor","penetrator3000@rbk.ru","+79999999999",random.nextInt(100000)+40000,random.nextInt(47)+18);
        employeesList[3] = new Employee("Zavyalova","Ekaterina","tripesyat@mail.ru","8(912)8899012",random.nextInt(100000)+40000,random.nextInt(47)+18);
        employeesList[4] = new Employee("Putin","Yuri","eeee@rt.ru","undefined",random.nextInt(100000)+40000,random.nextInt(47)+18);
        for (int i = 0; i <employeesList.length ; i++) {
            if(employeesList[i].getAge() >= 40){
                employeesList[i].EmployeeInfo();
            }

        }

    }

}
