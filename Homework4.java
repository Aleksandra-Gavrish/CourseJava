package Homework4;

public class Homework4 {
    public static void main(String[] args) {

        //Вывести при помощи методов из пункта 3 ФИО и должность
        Employee w = new Employee("Kovaleva M.B.", "Master", "8999999999", 80000, 48);

        System.out.println("Сотрудник" + " " + w.getFullName() + ", должность" + " " + w.getPosition() + ".");


        System.out.println(".......................................................................");
        // Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;


            Employee[] workerArray = new Employee[5];
            workerArray[0] = new Employee("Ivanov I.I.", "CEO", "8123456789", 150000, 48);
            workerArray[1] = new Employee("Petrov P.P.", "Engineer1", "8000000000", 70000, 37);
            workerArray[2] = new Employee("Fedorova O.V.", "Accountant", "8111111111", 50000, 43);
            workerArray[3] = new Employee("Sidorov V.G.", "Engineer2", "8222222222", 50000, 28);
            workerArray[4] = new Employee("Mironova A.E.", "Cleaner", "83333333333", 15000, 15);

            for (int i = 0; i < workerArray.length; i++)
                if (workerArray[i].getAge() > 40) {
                    System.out.println("Сотрудник" + " " + workerArray[i].getFullName() + ", должность" + " "
                            + workerArray[i].getPosition() +
                            ", Телефон" + " " + workerArray[i].getPhone() + ", Зарплата" + " " + workerArray[i].getSalary() +
                            ", Возраст" + " " + workerArray[i].getAge() +"."); }
                    else { System.out.println("Сотрудник младше 40 нет"); }

        }


    }


