package TeleDoc;

import java.time.LocalDate;
public class Pharmacy extends  MedicineList{

    LocalDate date = LocalDate.now();


    UserInfo user = new UserInfo();
    DoctorInfo doctor = new DoctorInfo();

    String getName = user.getUserName();
    String getGender = user.getUserGender();
    int getAge = user.getUserAge();


    String[] medic;

    String investigationReports;
    void getRep(String Report){
        investigationReports = Report;
    }

    String getInvestigationReports(){
        return investigationReports;
    }

    void displayPrescription() {
        Main.clearScreen();

        System.out.println("┏ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ┓");
        System.out.println("┊                                █  ✪  █▓▓▓▓ TELEDOC HOSPITAL ▓▓▓▓█  ✪  █                                 ┊");
        System.out.println("┊                                \uD83D\uDD36        •• ━━━━━ ••●•• ━━━━━ ••       \uD83D\uDD36                                 ┊");
        System.out.println("                                     FOR SERIAL CONTACT - 01756978514                                   ");
        System.out.println("                                 \uD83D\uDD36 ⏩ ⏩ ⏩ ⏩ ⏩ ⏩ ⏩ ⏩ ⏩ ⏩ ⏩ ⏩ \uD83D\uDD36                                     ");
        System.out.println("DOCTOR PROFILE :                                                                      DATE   : "+date);
        System.out.println("•····················•·································•·················································•");
        System.out.println("   Name : "+doctor.getNewDocName());
        System.out.println("   Specialization  : "+doctor.getNewDocSpecification());
        System.out.println("   Work Experience  : "+doctor.getNewDocExperience());
        System.out.println("•····················•·································•·················································•");
        System.out.println("PATIENT PROFILE :                                                                                          ");
        System.out.println("•·················•·················•");
        System.out.println("   Name : "+getName);
        System.out.println("   Age  : "+getAge);
        System.out.println("   Sex  : "+getGender);
        System.out.println("•·················•·················•");
        System.out.println("INVESTIGATION REPORT : "+getInvestigationReports());
        System.out.println("•·················•·················•");
        System.out.println("MEDICINE NAME :                                                                                            ");
        System.out.println("•·················•·················•");
        for(String medicine: medic){
            System.out.println(medicine);
        }

        System.out.println("                       ╒◖═══════════════════════════════════════════════════════◗╕");
        System.out.println("                             THANKS FOR VISITING OUR HOSPITAL - GET WELL SOON                              ");
        System.out.println("┊                      ╘◖═══════════════════════════════════════════════════════◗╛                        ┊");
        System.out.println("┊                                         FOR EMERGENCY CALL 16263                                         ┊");
        System.out.println("┗ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ┛");
    }
    void medicDisplay(String[] medicines){
        medic = medicines;
    }
}