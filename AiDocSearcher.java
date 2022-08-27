package TeleDoc;
import java.util.Scanner;

public class AiDocSearcher extends DoctorInfo{
    String diseasedPart;
    Scanner sc = new Scanner(System.in);
    void AiDocSearchers(){
        System.out.println("•··························•");
        System.out.println("Please Enter Your diseased part of your body:  ");
        System.out.println("•··············································•");
        System.out.print(" Type Here : ");
        diseasedPart = sc.next();
        diseaseChecker(diseasedPart);
    }
    public void diseaseChecker(String dp){
        if(dp.equalsIgnoreCase("kidney")||dp.equalsIgnoreCase("kidneys")||dp.equalsIgnoreCase("nephron")||dp.equalsIgnoreCase("urinary-organ")){
           nephrologist();
        }
        else if(dp.equalsIgnoreCase("stomach")|| dp.equalsIgnoreCase("belly")||dp.equalsIgnoreCase("gastric")||dp.equalsIgnoreCase("ulcer")){
            gastroenterology();
        }
        else if(dp.equalsIgnoreCase("bone")||dp.equalsIgnoreCase("cartilage")||dp.equalsIgnoreCase("ossein")||dp.equalsIgnoreCase("osteo")){
            orthopredics();
        }
        else if(dp.equalsIgnoreCase("eye")||dp.equalsIgnoreCase("eyeball")||dp.equalsIgnoreCase("optic")||dp.equalsIgnoreCase("view")){
            Ophthalmologists();
        }
        else if(dp.equalsIgnoreCase("Skin") || dp.equalsIgnoreCase("dick") || dp.equalsIgnoreCase("vagina")||dp.equalsIgnoreCase("vulva")||dp.equalsIgnoreCase("uterus ")||dp.equalsIgnoreCase("testicles")||dp.equalsIgnoreCase("penis")){
            dermatologist();
        }
        else if(dp.equalsIgnoreCase("ear") || dp.equalsIgnoreCase("nose") || dp.equalsIgnoreCase("throat")||dp.equalsIgnoreCase("earhole")||dp.equalsIgnoreCase("neck")){
            entSpecialist();
        }
        else if(dp.equalsIgnoreCase("cold") || dp.equalsIgnoreCase("fever") || dp.equalsIgnoreCase("vomit") || dp.equalsIgnoreCase("headache") || dp.equalsIgnoreCase("infection")){
            medicineSpecialist();
        }
        else if(dp.equalsIgnoreCase("teeth")||dp.equalsIgnoreCase("tooth")||dp.equalsIgnoreCase("Oral")||dp.equalsIgnoreCase("Mouth")||dp.equalsIgnoreCase("Toothaches")||dp.equalsIgnoreCase("Sores")){
            dentist();
        }
        else{
            System.out.println("Invalid Body part name detected! Try Again");
            diseaseChecker(sc.next());
        }
    }

}


