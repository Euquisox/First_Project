package kz.kaznu.bauka.dz_2;

import java.util.Arrays;

public class MainApplication {
    static void main() {
        method_3(3, new int[5]);
        method_1(1 ,"asd");
        method_2(new int[5]);
    }
    static void method_1(int a, String txt) {
        for (int i = 1; i < a; i++) {
            System.out.println(txt);
        }
    }
    static void method_2(int[]array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int a = (int)(Math.random() * 100);
            array[i] = a;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
    static void method_3(int a, int[] array) {
        Arrays.fill(array, a);
        System.out.print(Arrays.toString(array));
    }
    static void method_4(int a , int[] array){
        int[] arr_new;
        arr_new = array;
        for (int i = 0; i < array.length; i++) {
            array[i] += a;
            arr_new[i] = array[i];

        }
    }

}