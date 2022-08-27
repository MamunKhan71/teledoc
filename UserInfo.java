package TeleDoc;


import java.util.Scanner;

public class UserInfo {

    Scanner sc = new Scanner(System.in);
    private static String userName;
    private static String userGender;
    private static int userAge;

    public void setUserInfo(String name, String gender, int age){
        userName = name;
        userGender = gender;
        userAge = age;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserGender(){
        return userGender;
    }
    public int getUserAge(){
        return userAge;
    }
    public void validatorGender(){
        userGender = " ";
        System.out.println("Please Select Your Gender");
        System.out.println("•·························•");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Others");
        try{
            System.out.println("•·········•");
            System.out.print("Input : ");
            switch(sc.nextInt()){
                case 1 -> userGender = "Male";
                case 2 -> userGender = "Female";
                case 3 -> userGender = "Others";
                default -> validatorGender();
            }
        }catch(Exception e){
            System.out.println("Please Enter a Value!");
            validatorGender();
        }
    }
}
