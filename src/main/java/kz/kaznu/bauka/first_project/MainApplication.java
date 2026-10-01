package kz.kaznu.bauka.first_project;

public class MainApplication {
    static void main(String[] args) {
//         greetings();
//         checkSign();
//         selectColor();
//         addOrSubtractAndPrint();
        compareNumbers();
    }
    static void greetings() {
        System.out.println("Hello\nWorld\nFrom\nJava");
    }
    static void checkSign() {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * -10);
        int c = (int)(Math.random() * 10);
        int sum = a + b + c;
        if (sum > 0) {
            System.out.println("Cумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }
    static void selectColor() {
        int a = 1;
        int min = 1;
        int max = 35;
        while (a < 30) {
            a++;
            int data = (int)(Math.random() * (max - min + 1) + min);
            if (data < 10){
                System.out.println(data + " красный");
            }
            if (data > 10 && data < 20){
                System.out.println(data + " желтый");
            }
            if (data > 20){
                System.out.println(data + " зеленый");
            }
        }

    }
    static void compareNumbers(){
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        if (a >= b){
            System.out.println("a >=b" + "     " + a + "|"+ b);
        }
        else {
            System.out.println("a < b" + "     " + a + "|" + b);
        }
    }
    static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        initValue = (int)(Math.random() * 10);
        delta = (int)(Math.random() * 10);
        if (increment) {
            int sum = initValue + delta;
            System.out.println(sum);
        }
        else {
            int subt = (initValue - delta);
            System.out.println(subt);
        }
    }

}
