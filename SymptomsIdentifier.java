package TeleDoc;

import java.util.ArrayList;
import java.util.Scanner;

public class SymptomsIdentifier {
    Scanner sc = new Scanner(System.in);
    boolean validityChecker = true;
    int i = 0, choice = 0;
    ArrayList<String> aL = new ArrayList<>();

    SymptomsIdentifier() {
        do {
            System.out.println("Do You have any other complications: ");
            System.out.println("1 -> Yes");
            System.out.println("2 -> No");
            choice = sc.nextInt();
            if (choice == 1) {
                aL.add(sc.next());
            } else {
                validityChecker = false;
            }
        } while (validityChecker);
        diseaseDetector(aL);

    }
//    public void display(){
//        for(i = 0;i<aL.size();i++){
//            System.out.println(aL.get(i));
//        }
//        diseaseDetector(aL);
//    }

    public void diseaseDetector(ArrayList<String> aL) {
        for(String i:aL){
            System.out.println(i);
        }
    }
    //
}
