package TeleDoc;

import java.util.Scanner;

public class Lobby {
    int choice;
    Scanner sc = new Scanner(System.in);
    AiDocSearcher aDS = new AiDocSearcher();
    ManualDocSearcher mDs = new ManualDocSearcher();
    Lobby() {
        System.out.println("Please Enter Your Choice ");
        System.out.println("•·······················•");
        System.out.println("1 -> Search Doctor Automatically\n2 -> Search Doctor Manually");
        System.out.println("•··························•");
        System.out.print("Choice : ");
        choice = sc.nextInt();
        choiceValidator(choice);
    }



    public void choiceValidator(int userChoice) {
        if (userChoice >= 1 && userChoice <= 2) {
            rightChoice(userChoice);
        } else {
            wrongChoice(userChoice);
        }
    }
    public void rightChoice(int input) {
        switch (input) {
              case 1 -> aDS.AiDocSearchers();
              case 2 -> mDs.docCategory();
        }
    }
    public void wrongChoice(int userInput){
        System.out.println("Invalid Choice\nInput: ");
        choice = sc.nextInt();
        choiceValidator(choice);
    }
}
