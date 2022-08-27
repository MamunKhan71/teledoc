package TeleDoc;
import java.util.Scanner;
public class ManualDocSearcher {
    Scanner sc = new Scanner(System.in);
    DoctorInfo dI = new DoctorInfo();
    public void docCategory(){
        System.out.println("Please Select a Category : ");
        System.out.println("1 : Nephrology");
        System.out.println("2 : Gastroenterology");
        System.out.println("3 : Orthopaedics");
        System.out.println("4 : Ophthalmologists");
        System.out.println("5 : ENT Specialist");
        System.out.println("6 : Medicine Specialist");
        System.out.println("7 : Dentist");
        int catChoice = sc.nextInt();
        switch (catChoice){
            case 1 -> dI.nephrologist();
            case 2 -> dI.gastroenterology();
            case 3 -> dI.orthopredics();
            case 4 -> dI.Ophthalmologists();
            case 5 -> dI.entSpecialist();
            case 6 -> dI.medicineSpecialist();
            case 7 -> dI.dentist();
            default -> {
                System.out.println("Invalid choice! Try Again");
                docCategory();
            }
        }


    }

}
