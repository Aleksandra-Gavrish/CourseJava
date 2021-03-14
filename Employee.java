package Homework4;
//Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст
public class Employee {

    private String fullName;
    private String position;
    private String phone;
    private float salary;
    private int age;

    // 2 Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee(String fullName, String position, String phone, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    public String getFullName() {
        return fullName;
    }

    String getPosition() {
        return position;
    }

    String getPhone() {
        return phone;
    }

    int getSalary() {
        return (int) salary;
    }

    int getAge() {
        return (int) age;
    }

}
