package Homework5;

public abstract class Animals {

    private String name;
    private float run;
    private float swim;
    private float jump;

    public Animals(String name, float run, float swim, float jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
 String getName() {
        return this.name;
 }

    //У каждого животного есть ограничения на действия
    // (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
    // прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
    // плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

    public void running(float distanceMaxRun) {

        if (run >= distanceMaxRun)
            System.out.println(name + " пробежал " + distanceMaxRun + "м.");
        else
            System.out.println(name + " не может пробежать " + distanceMaxRun + "м." + "Слишком длинный путь");
    }


    protected void swimming(float distanceMaxSwim) {

        if (swim >= distanceMaxSwim)
            System.out.println(name + " проплывает " + distanceMaxSwim + ".");
        else
            System.out.println(name + " Не умеет плавать.");
    }

    protected void jumping(float distanceMaxJump) {

        if (jump >= distanceMaxJump)
            System.out.println(name + " подпрыгнул на  " + distanceMaxJump + "м.");
        else
            System.out.println(name + " не может прыгнуть " + distanceMaxJump + "м."+" слишком высоко ");
    }
}

