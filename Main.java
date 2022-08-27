package TeleDoc;

import java.util.Scanner;


public class Main {
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        UserInfo user = new UserInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO TELEDOC HOSPITAL");
        System.out.println("•··························•");
        System.out.print("Please Enter Your Name : ");
        String userName = scanner.nextLine();
        System.out.println();
        user.validatorGender();
        String userGender = user.getUserGender();
        System.out.println("•·············•");
        System.out.print("Please Enter Your Age : ");
        int userAge = scanner.nextInt();
        System.out.println("•························•");
        user.setUserInfo(userName, userGender, userAge);
        new Lobby();
    }
}
