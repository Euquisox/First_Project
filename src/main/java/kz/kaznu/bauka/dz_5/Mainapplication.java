package kz.kaznu.bauka.dz_5;

public class Mainapplication {
    public static void main(){
        Animal cat = new Cat("Мурзик" , 5 , 0 , 50);
        Animal dog  = new Dog("Тузик" , 10 , 5 , 100);
        Animal horse = new Horse("Конь" , 30 , 10 , 100);
        horse.swim(100);


    }
}
