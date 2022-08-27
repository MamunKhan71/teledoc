package TeleDoc;
import java.util.Scanner;
import java.util.ArrayList;
public class OptionalDiseaseCheck {
    ArrayList<String> diseaseRecords = new ArrayList<>();
    String complications;
    Scanner sc = new Scanner(System.in);

    OptionalDiseaseCheck(){

    }
    OptionalDiseaseCheck(String docCategory){
        System.out.print("Briefly describe the problem you are facing : ");
        compRecorder(docCategory);

    }
    void compRecorder(String docCat){
        String diseaseDirectory = sc.nextLine();
        String [] diseaseSaver = diseaseDirectory.split(" ");
        new DiseaseAnalyzer(diseaseSaver, docCat);
    }
}