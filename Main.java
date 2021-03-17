package Homework5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добавь дистанцию бега");
        float distanceMaxRun = in.nextFloat();
        System.out.println("Добавь дистанция для плавания");
        float distanceMaxSwim = in.nextFloat();
        System.out.println("Добавь высоту прыжка");
        float distanceMaxJump = in.nextFloat();

        //У каждого животного есть ограничения на действия
        // (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
        // прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
        // плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

        Cat Cat = new Cat("Кот Матроскин", 200, 0, 2);
        Dog Dog = new Dog("Собака Шарик ", 500, 10, 0.5f);
        Horse Horse = new Horse("Конь Юлий", 1500, 100, 3);
        Bird Bird = new Bird("Птица Феникс", 5, 0, 0.2f);

        Cat.running(distanceMaxRun);
        Cat.swimming(distanceMaxSwim);
        Cat.jumping(distanceMaxJump);

        System.out.println("___________________________________________________________________");

        Dog.running(distanceMaxRun);
        Dog.swimming(distanceMaxSwim);
        Dog.jumping(distanceMaxJump);

        System.out.println("___________________________________________________________________");

        Horse.running(distanceMaxRun);
        Horse.swimming(distanceMaxSwim);
        Horse.jumping(distanceMaxJump);

        System.out.println("___________________________________________________________________");
        
        Bird.running(distanceMaxRun);
        Bird.swimming(distanceMaxSwim);
        Bird.jumping(distanceMaxJump);

        //
    }
}
