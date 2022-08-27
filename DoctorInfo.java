package TeleDoc;
import java.util.Scanner;
public class DoctorInfo {
    Scanner sc = new Scanner(System.in);
    private String docName;
    private String docQualification;
    private String docSpecialList;
    private String docWorkPlace;
    private String trimmedName;
    private static String newDocName;
    private static String newDocSpecification;
    private static String newDocExperience;

    String getNewDocName(){
        return newDocName;
    }
    String getNewDocSpecification(){
        return newDocSpecification;
    }
    String getNewDocExperience(){
        return newDocExperience;
    }

    public DoctorInfo() {
    }

    DoctorInfo(String docName, String docQualification, String docSpecialList, String docWorkPlace) {
        this.docName = docName;
        this.docQualification = docQualification;
        this.docSpecialList = docSpecialList;
        this.docWorkPlace = docWorkPlace;
        this.trimmedName = docName.substring(3);
    }

 String getDocName() {
        return trimmedName;
    }
    String getDocWorkExperience(){
        return docWorkPlace;
    }

    String getDocQualification() {
        return docQualification;
    }

    String getDocSpecialList() {
        return docSpecialList;
    }

    String getDocWorkPlace() {
        return docWorkPlace;
    }
    void docSelector(DoctorInfo[] select, String docCategory){
        System.out.print("Choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                DoctorInfo doc = select[0];
                newDocName = doc.getDocName();
                newDocSpecification = doc.getDocSpecialList();
                newDocExperience = doc.getDocWorkExperience();
                System.out.println("××××××××××××××××××××××××××××××××××××××××××××××××××");
                System.out.println("Welcome to "+doc.trimmedName+"'s Chamber");
                System.out.println("•······································································•");
                new OptionalDiseaseCheck(docCategory);

            }
            case 2 -> {
                DoctorInfo doc = select[1];
                newDocName = doc.getDocName();
                newDocSpecification = doc.getDocSpecialList();
                newDocExperience = doc.getDocWorkExperience();
                System.out.println("××××××××××××××××××××××××××××××××××××××××××××××××××");
                System.out.println("Welcome to "+doc.trimmedName+"'s Chamber");
                System.out.println("•······································································•");
                new OptionalDiseaseCheck(docCategory);

            }
            case 3 -> {
                DoctorInfo doc = select[2];
                newDocName = doc.getDocName();
                newDocSpecification = doc.getDocSpecialList();
                newDocExperience = doc.getDocWorkExperience();
                System.out.println("××××××××××××××××××××××××××××××××××××××××××××××××××");
                System.out.println("Welcome to "+doc.trimmedName+"'s Chamber");
                System.out.println("•······································································•");
                new OptionalDiseaseCheck(docCategory);

            }
        }
    }

    static void displayInfo(DoctorInfo[] list) {
        System.out.println("•·························•");
        System.out.println("LIST OF AVAILABLE DOCTORS");
        System.out.println("•·························•");
        for (DoctorInfo l : list) {
            System.out.println(l.docName);
            System.out.println("   "+l.docQualification);
            System.out.println("   "+l.docSpecialList);
            System.out.println("   "+l.docWorkPlace);
            System.out.println("××××××××××××××××××××××××××××××××××××××××××××××××××");
        }
    }


//Nephrologist Info

    void nephrologist() {
        DoctorInfo Id1 = new DoctorInfo("1. Prof. Dr. Md. Nizamuddin Chowdhury",
                "MBBS, MD(Nephrology),MCPS(Medicine).",
                "Nephrology / Kidney Specialist",
                "Dhaka Medical College Hospital");

        DoctorInfo Id2 = new DoctorInfo("2. Prof. Brig Gen(Rtd.) Dr. MamunMostafi",
                "MBBS, MACP, MRACP, FCPS, FRCP",
                "Medicine & Nephrology Specialist",
                "GSSV Medical College and Gonoshasthaya Nogor Hospital");

        DoctorInfo Id3 = new DoctorInfo("3. Prof. Dr. Shamim Ahmed",
                "MBBS(DMC), FCPS(Med), FRCP(Rain) FRCP(Glasg), FACP(USA), FWHO(Neph)",
                "Kidney & Medicine Specialist",
                "Popular Diagnostic Centre Ltd ");

        DoctorInfo[] DocList = {Id1, Id2, Id3,};

        displayInfo(DocList);
        docSelector(DocList, "nephrologist");

    }

    void gastroenterology() {
        DoctorInfo Id1 = new DoctorInfo("1. Professor Dr. Mahbub H Khan",
                "MBBS, PhD Liver Med(Sydney), DSM(Vienna), Fellow in Liver and Gastroenterolog",
                "International Liver Association Medicine, Liver & Gastroenterology Specialist ",
                "BIHS Hospital of Diabetic Association");

        DoctorInfo Id2 = new DoctorInfo("2. Prof. Dr. Brig Md. Delwar Hossain",
                "MBBS, FCPS (Medicine), FCPS (Gastroenterology) Medicine ",
                "Liver & Gastroenterology Specialist",
                "Square Hospitals Ltd.");

        DoctorInfo Id3 = new DoctorInfo("3. Associate Prof. Dr. N C Nath",
                "MBBS, MCPS, FCPS, MD (Gastroenterology)",
                "Medicine and Gastroenterology Specialist",
                " Cumilla Medical College");

        DoctorInfo[] DocList = {Id1, Id2, Id3};

        displayInfo(DocList);
        docSelector(DocList,"gastroenterology");
    }

    void orthopredics() {
        DoctorInfo Id1 = new DoctorInfo("1.Prof. Dr. Abu Zaffar Chowdhury (Biru)",
                "MBBS, MS (Ortho)",
                "Orthopedics, Arthroscopy, Arthroplasty & Trauma Surgeon",
                " Bangabandhu Sheikh Mujib Medical University");

        DoctorInfo Id2 = new DoctorInfo("2.Prof. Dr. Parvez Ahsan",
                "MBBS, D.Orth (DU), MS (Ortho Surgery) Orthopedic ",
                "Surgery (Hip & Knee) Specialist",
                " Ibn Sina Medical College, Dhaka");

        DoctorInfo Id3 = new DoctorInfo("3.Associate Prof. Dr. Md. Yousuf Ali",
                "MBBS(Dhaka), MS(Ortho - Nitor)",
                "Spine and Orthopedic Surgeon",
                "Bangabandhu Sheikh Mujib Medical University,");

        DoctorInfo[] DocList = {Id1, Id2, Id3};

        displayInfo(DocList);
        docSelector(DocList,"orthopredics");

    }

    void Ophthalmologists() {
        DoctorInfo Id1 = new DoctorInfo("1.Professor Dr. Md. Anisur Rahman",
                "MBBS (DMC) DO (DU) FCPS (EYE)",
                "Ophthalmology / Eye Specialist & Surgeon",
                "Dhaka Medical College Hospital, Dhaka");

        DoctorInfo Id2 = new DoctorInfo("2.Professor Dr. Dipak Kumar Nag",
                "MBBS, FCPS (Ophth) Msc (Epid, UK) Msc (CEH, UK), FRF (India)",
                "Retina Specialist and Surgeon",
                "National Institute of Ophthalmology & Hospital");

        DoctorInfo Id3 = new DoctorInfo("3.Dr. Md. Nowroz Bahar (Pintu)",
                "MBBS, DO, FVRS",
                "Eye Specialist, Retina and Phaco Surgeon",
                "Islamia Eye Institute & Hospital, Dhaka");

        DoctorInfo[] DocList = {Id1, Id2, Id3};

        displayInfo(DocList);
        docSelector(DocList,"Ophthalmologists");

    }

    void dermatologist() {
        DoctorInfo Id1 = new DoctorInfo("1. Prof. Col. Dr. Md. Shirajul Islam Khan",
                "MBBS, DDV, MCPS, FCPS(Dermatology and Venereology) Grading Course in Dermatology (AFMI),",
                "Dermatology and Venereology, Allergy, Cosmetic and Sexual Medicine Specialist",
                "Dermatology and Venereology, Combined Military Hospital (CMH), Dhaka");

        DoctorInfo Id2 = new DoctorInfo("2.Associate Prof. Dr Lubna Khondker",
                "MBBS, MPH, DDV (BSMMU), MCPS, FCPS ",
                "Dermatology and Venereology, Allergy, Cosmetic and Laser Specialist",
                "Bangabandhu Sheikh Mujib Medical University");

        DoctorInfo Id3 = new DoctorInfo("3.Dr. Lutfun Nahar",
                "MBBS (DMC) PhD (Dermatology, Nagoya University School Of Medicine, Japan)",
                "Allergy, Cosmetic and Laser Specialist",
                "Dermatology, Venereology & Laser Specialites Nahar Skin & Laser Centre");

        DoctorInfo[] DocList = {Id1, Id2, Id3};

        displayInfo(DocList);
        docSelector(DocList,"dermatologist");

    }

    void entSpecialist() {
        DoctorInfo Id1 = new DoctorInfo("1.Professor Dr. M A Matin",
                "MBBS(DMC) DLO(London) FRCS (England) FRCS(Edin) FRCS(Glasgow) ",
                "ENT Specialist & Head & Neck Surgeon Ear Surgeon",
                "Professor and Head of ENT & Head Neck Surgery. Shaheed Suhrawardy Medical College Dhaka");

        DoctorInfo Id2 = new DoctorInfo("2.Associate Prof. Dr. Mashiur Rahman",
                "MBBS, FCPS(ENT)",
                "ENT Specialist & Head & Neck Surgeon Ear Surgeon",
                "Nose, DNS Surgeon, Thyroid Surgeon, Tonsil Surgeon");

        DoctorInfo Id3 = new DoctorInfo("3.Prof. Dr. Md. Abdullah HelKafi",
                "MBBS (Dhaka), MCPS (ENT), FCPS (ENT) ENT",
                "Specialist & Head & Neck Surgeon",
                "Ibn Sina Medical College, Dhaka.");

        DoctorInfo[] DocList = {Id1, Id2, Id3};

        displayInfo(DocList);
        docSelector(DocList,"entSpecialist");

    }

    void medicineSpecialist() {
        DoctorInfo Id1 = new DoctorInfo("1.Prof. Dr. Mohiuddin Ahmed",
                "MBBS(Dhaka), BCS(Health), FCPS(Medicine), MD(Neuromedicine), ",
                "MACP(USA) Medicine & Neuromedicine Specialist",
                "Dhaka Medical College Hospital, Dhaka");

        DoctorInfo Id2 = new DoctorInfo("2.Associate Prof. Dr. AKM Humayon Kabir",
                "MBBS(DMC), MCPS(Medicine), FCPS( Medicine)",
                "Special Interest in Diabetes, Rheumatology and Chest Diseases",
                "Dhaka Medical College Hospital");

        DoctorInfo Id3 = new DoctorInfo("3.Major (Dr.) Syed Jamil Abdal (Retd)",
                "MBBS, FCPS (Medicine), FCPS (Rheumatology)",
                "Medicine Specialist & Rheumatologist Medicine \n" +
                        "Specialist & Consultant Rheumatologist",
                "Green Life Hospital");

        DoctorInfo[] DocList = {Id1, Id2, Id3};

        displayInfo(DocList);
        docSelector(DocList,"medicineSpecialist");

    }

    void dentist() {
        DoctorInfo Id1 = new DoctorInfo("1. Prof. Col. Dr. Md. Shirajul Islam Khan",
                "MBBS, DDV, MCPS, FCPS(Dermatology and Venereology), AFMI",
                "Dermatology and Venereology, Allergy, Cosmetic and Sexual Medicine Specialist",
                "Professor, Combined Military Hospital (CMH), Dhaka Cantonment");

        DoctorInfo Id2 = new DoctorInfo("2.Associate Prof. Dr Lubna Khondker",
                "MBBS, MPH, DDV (BSMMU), MCPS, FCPS",
                "Dermatology and Venereology, Allergy, Cosmetic and Laser Specialist",
                "Bangabandhu Sheikh Mujib Medical University (BSMMU), Dhaka");

        DoctorInfo Id3 = new DoctorInfo("3.Dr. Lutfun Nahar",
                "MBBS (DMC) PhD (Dermatology, Nagoya University School Of Medicine, Japan)",
                "Dermatology, Venereology & Laser Specialites",
                " Nahar Skin & Laser Centre, Dhaka");

        DoctorInfo[] DocList = {Id1, Id2, Id3};

        displayInfo(DocList);
        docSelector(DocList,"dentist");
    }
}
