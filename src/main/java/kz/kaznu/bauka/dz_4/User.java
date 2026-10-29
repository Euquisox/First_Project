package kz.kaznu.bauka.dz_4;

public class User {
    private String first_name;
    private String last_name;
    private String surname;
    private int year;
    private String email;

    public User(String first_name , String last_name , String surname , int year , String email){
    }
    void UserInfo(){
        System.out.println("ФИО:" + first_name+ " " + last_name + " " + surname);
        System.out.println("Год рождения:" + year);
        System.out.println("email:" + email);
    }
    public int GetYear(){
        return year;
    }
}
