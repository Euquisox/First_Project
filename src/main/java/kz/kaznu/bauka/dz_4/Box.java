package kz.kaznu.bauka.dz_4;

import java.util.Objects;
import java.util.Scanner;

public class Box {
    private String shape;
    private String color;
    private String BoxState = "Open";
    Scanner in = new Scanner(System.in);
    int input_count = 0;

    public void OpenOrClosed(){
        String state = in.next();
        if (state.equals("Open")){
            if (Objects.equals(BoxState, "Open")){
                System.out.println("Коробка уже открытка");
            }  else {
                System.out.println("Коробка открыта");
                BoxState = "Open";
            }
        }
        else if (state.equals("Close")) {
            if (Objects.equals(BoxState , "Close")){
                System.out.println("Коробка уже закрыта");
            } else {
                System.out.println("Коробка закрыта");
                BoxState = "Close";
            }
        }
        else{
            System.out.println("Введено неверное значение");
        }
    }
    public void Info(){
        System.out.println(shape);
        System.out.println(color);
    }
    public void setColor(String color){
        this.color = color;
        System.out.println("Цвет коробки изменен на:" + color);
    }
    public void setShape(String shape){
        this.shape = shape;
        System.out.println("Размер коробки изменен на:" + shape);

    }
    public void PutItem(){
        String input = in.next();
        if (BoxState.equals("Open")) {
            System.out.println("В коробке есть:" + input);
            input_count += 1;
        }
        else if(BoxState == "Closed"){
            System.out.println("Откройте коробку чтобы положить туда что то");
            OpenOrClosed();
        }
    }
    public void ThrowAwayItem(){
        if (input_count == 0){
            System.out.println("Выкидывать нечего");
        } else if (Objects.equals(BoxState, "Closed")) {
            System.out.println("Откройте коробку чтобы что то выкинуть");
            OpenOrClosed();
        }
        else{
            System.out.println("Выкинули 1 вещь");
            input_count -= 1;
        }
    }

}
