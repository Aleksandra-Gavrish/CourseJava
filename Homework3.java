package Homework3;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
        public static int size = 5;
        public static int block = 4;
        public static final char empty = '_';
        public static final char markerX = 'X';
        public static final char markerO = 'O';
        public static char[][] map;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(markerX)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(markerO)) {
                    System.out.println("Победил Компьютер");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

       public static boolean checkWin(char symb) {
          //  if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
          //  if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
            // if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
            // if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
           // if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
            // if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
            // if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
            // if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
           // return false;
           int col, row;
           for (col=0; col<size+1; col++) {
               for (row=0; row<size+1; row++) {
                   if (checkDiagonal(symb) || checkLines(symb)) return true;
               }
        }
           return false;
    }
    public static boolean checkDiagonal(char symb) {
       boolean toright;
       boolean toleft;
        toright = true;
        toleft = true;
        for (int i=0; i<block; i++) {
            toright &= (map[i][i] == symb);
            toleft &= (map[i][size-i-1]== symb);
        }

        if (toright || toleft) return true;
        return false;
    }

    public static boolean checkLines(char symb) {
        boolean cols, rows;
        int col, row;
        for (col = 0; col < block; col++) {
            cols = true;
            rows = true;
            for (row = 0; row < block; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }
            if (cols || rows) return true;
        }
        return false;
    }
        public static boolean isMapFull() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (map[i][j] == empty) return false;
                }
            }
            return true;
        }

        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(size);
                y = rand.nextInt(size);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = markerO;
        }

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = markerX;
        }

        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= size || y < 0 || y >= size) return false;
            if (map[y][x] == empty) return true;
            return false;
        }

        public static void initMap() {
            map = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    map[i][j] = empty;
                }
            }
        }

        public static void printMap() {

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
System.out.print(map[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

