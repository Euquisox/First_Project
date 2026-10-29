package kz.kaznu.bauka.dz_5;

public class Dog extends Animal{
    public Dog(String name , float run_speed , float swim_speed , int stamina){
        super(name, run_speed, swim_speed, stamina);
    }

    @Override
    public float swim(int distance) {
        float time = (float) distance / swim_speed;
        while (stamina > 0 && distance > 0){
            stamina -= 2;
            distance -= 1;
        }
        if (stamina == 0 & distance > 0){
            System.out.println("Собака устала");
            System.out.println("Осталось еще проплыть:" + distance);
            swim_speed = 0;
            return -1;
        }
        else if((stamina == 0 | stamina > 0) & distance == 0){
            System.out.println("Собака успешно проплыла расстояние");
        }
        else {
            System.out.println("Собака успешно проплыла расстояние");
        }
        return time;
        }
}

