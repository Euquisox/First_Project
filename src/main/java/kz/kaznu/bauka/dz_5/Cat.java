package kz.kaznu.bauka.dz_5;

public class Cat extends Animal{
    public Cat(String name , float run_speed , float swim_speed , int stamina){
        super(name, run_speed, swim_speed, stamina);
    }

    @Override
    public float swim(int distance){
        swim_speed = 0;
        System.out.println("Кот не умеет плавать");
        return -1;
    }
}
