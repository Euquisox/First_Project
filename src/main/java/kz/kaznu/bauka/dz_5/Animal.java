package kz.kaznu.bauka.dz_5;

public abstract class Animal {
    protected String name;
    protected float run_speed;
    protected float swim_speed;
    protected int stamina;
    public Animal(String name , float run_speed , float swim_speed , int stamina){
        this.name = name;
        this.run_speed = run_speed;
        this.swim_speed = swim_speed;
        this.stamina = stamina;
    }
    public float run(int distance){
        float time = (float) distance / run_speed;
        while (stamina > 0 && distance > 0){
            stamina -= 1;
            distance -= 1;
        }
        if (stamina == 0 & distance > 0){
            System.out.println("Животное устало");
            run_speed = 0;
            System.out.println("осталось еще пробежать:" + distance);
            return -1;
        }
        else {
            System.out.println("Животное пробежало успешно заданное расстояние");
        }
        return time;
    }
    public abstract float swim(int distance);

    public void info(){
        if (stamina == 0){
            System.out.println("Животное устало");
    }
        else {
            System.out.println("У животного еще есть силы");
        }
    }
}
