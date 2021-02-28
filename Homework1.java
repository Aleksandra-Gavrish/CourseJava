package Homework1;
// Написать метод вычисляющий выражение a * (b + (c / d))
// и возвращающий результат с плавающей точкой,
// где a, b, c, d – целочисленные входные параметры этого метода

public abstract class Homework1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 10;
        int f = 12;
        int e = 5;
        float d = 2f;
        float result;
        result = Method1(a, b, c, d);
        Method3(-7);
        Method4("World");
        Method5(2021);
        System.out.println("Task1: " + result);
        System.out.println("Task2: " + Method2(f, e));

    }

    public static float Method1(int a, int b, int c, float d) {
        return a * (b + (c / d));
    }


    // Написать метод, принимающий на вход два целых числа,
    // и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;

    public static boolean Method2(int f, int e) {
        int sum = f + e;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    // Написать метод, которому в качестве параметра передается целое число,
// метод должен проверить положительное ли число передали,
// или отрицательное. Замечание: ноль считаем положительным числом.
// Результат работы метода вывести в консоль
    public static void Method3(int a1) {
        if (a1 >= 0)
            System.out.println("Task3: " + "положительное");
        else
            System.out.println("Task3: " + "отрицательное");
    }

    //4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
    // Вывести приветствие в консоль.
    public static void Method4(String name) {
        System.out.println("Task4: Привет," + name + "!");
    }

    // Написать метод, который определяет является ли год високосным.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    // Для проверки работы вывести результаты работы метода в консоль

    public static void Method5(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Task5: Год высокосный");
        } else {
            System.out.println("Task5: Год не высокосный");

        }
    }
}
