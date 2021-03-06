package Homework2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] arg) {
        int[] array1 = {1, 0, 1, 0, 1, 1, 1, 1, 1};
        task1(array1);
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[8];
        array2[0] = 1;
        task2(array2);
        System.out.println(Arrays.toString(array2));
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(array3);
        System.out.println(Arrays.toString(array3));
        int[] array4 = {15, 7, 1, 8, 45, 7, 36};
        System.out.println("Задание 4 - Максимум " + task4(array4));
        System.out.println("Задание 4 - Минимум " + task5(array4));
        int[][] array6 = new int[6][6];
        task6(array6);
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static void task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
    }
    //Задать пустой целочисленный массив размером 8.
    // Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

    public static void task2(int[] array) {
        for (int i = 1, j = 1; i < array.length; i++) array[i] = j += 3;

    }

    // 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
// написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2;
    public static void task3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;

        }
    }

    // 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static int task4(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int task5(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    // Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    // заполнить его диагональные элементы единицами, используя цикл(ы);

    public static void task6(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array [i][i] = 1;
            array[i][array.length - 1 - i] = 1;

            }
        }
    }



