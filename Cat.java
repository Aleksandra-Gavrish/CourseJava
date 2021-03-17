package Homework5;

public class Cat extends Animals {

    public Cat (String name, float run, float swim, float jump) {
        super(name, run, swim, jump);
    }
        @Override
       protected void swimming (float distanceMaxSwim){
            System.out.println( getName() + " не умеет плавать!");
        }

    }
