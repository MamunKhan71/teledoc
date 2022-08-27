package TeleDoc;

import java.util.Scanner;

public class DiseaseAnalyzer {
    Pharmacy pharmacy = new Pharmacy();
    MedicineList medicineList = new MedicineList();

    // Nephrology
    public static String kidneyInfectionD = "Pain burning urinating Pus blood  urine Cloudy";
    public static String kidneyStonesD = "Pain urinating Blood urine abdomen Nausea vomiting";
    public static String kidneyCancerD = "Blood urine Pain side lump bulge belly Weight loss lose";


    //Dermatology related disease
    public static String lupusD = "Headaches fever Fatigue Scaly red patches";
    public static String acneD = "Crusting skin bumps Cysts Redness skin eruptions";
    public static String eczemaD = "Skin itches turns red burns stings Itchy bumps hives Fluid blisters ooze crust";


    //Orthopedic related disease
    public static String lowBackPainD = "Aching Burning Stabbing well-defined or vague ";
    public static String fracturesD = "movement pain trouble injured area joint pain Swelling Obvious deformity Warmth bruising redness";
    public static String osteoarthritisD = "Joint pain stiffness Less movement sleep inactivity";


    //Gastrology related disease
    public static String achalasiaD = "heartburn chest pain infections";
    public static String stomachCancerD = "Poor appetite Nausea Weight loss Abdominal belly pain";
    public static String gastroparesisD = "feeling full eating vomiting weight loss quickly";

    //Ophthalmology related disease

    public static String glaucomaD = "Intense pain Red eye tenderness Blurred vision";
    public static String cataractsD = "Clouded blurred vision Increasing difficulty night Sensitivity light and glare Fading yellowing colors";
    public static String strabismusD = "Crossed eyes Double vision Uncoordinated movements";

    //Dental diseases

    public static String gingivitisD = "Swollen puffy gums Bad breath Tender gums";
    public static String oralCancerD = "ear pain white reddish patch mouth Loose teeth";
    public static String cavitiesD = "toothache tooth sensitivity grey brown black spots teeth";

    //ENT related disease
    public static String earInfectionsD = " pain ear difficulty hearing  pressure fullness itching irritation";
    public static String noiseD = "Hearing loss Throbbing headache Especially one sided Sensitivity bright light Dizziness";
    public static String tinnitusD = "Buzzing Hissing Humming";

    //NOSE

    public static String sinusitisD = "Postnasal drip Discolored nasal discharge Tenderness of the face Frontal headaches";
    public static String nasalCancerD = "Difficulty breathing through nose Loss sense  smell Nosebleeds Facial swelling pain sore  lesion roof mouth";
    public static String noseInjuriesD = "Swelling nose surrounding areas Bruising around nose eyes Crooked misshapen nose Difficulty breathing nose";

    //Throat

    public static String tonsillitisD = "Red swollen tonsils Sore throat Bad breath";
    public static String voiceDisorderD = "Hoarse voice discomfort speaking Chronic sore throat Vocal fatigue";
    public static String dysphagiaD = "coughing drinking persistent drooling saliva unable chew food properly";

    //Medicine Related disease

    public static String anemiaD = "Fatigue Weakness Pale  yellowish skin Irregular heartbeats Shortness breath";
    public static String typhoidD = "Stomach pain Diarrhea constipation Loss appetite";
    public static String diarrhoeaD = "Loose watery stools Abdominal pain cramps Blood in the stool Mucus stool";
    static int kidneyInfection = 0, kidneyStones = 0, kidneyCancer = 0, lupus = 0, acne = 0, eczema = 0, lowBackPain = 0;

    // Counting Variable

    static int fractures = 0, osteoarthritis = 0, achalasia = 0, stomachCancer = 0, gastroparesis = 0, glaucoma = 0;
    static int cataracts = 0, strabIsmus = 0, gingivitis = 0, oralCancer = 0, cavities = 0, earInfections = 0;
    static int noise = 0, tinnitus = 0, sinusitis = 0, nasalCancer = 0, noseInjuries = 0, tonsillitis = 0;
    static int voiceDisorder = 0, dysphagia = 0, anemia = 0, typhoid = 0, diarrhoea = 0;



    //Array Initialize


    //Orthopedic related disease
    String[] kidneyInfectionArray = kidneyInfectionD.split(" ");
    String[] kidneyStonesArray = kidneyStonesD.split(" ");
    String[] kidneyCancerArray = kidneyCancerD.split(" ");
    String[] lupusArray = lupusD.split(" ");
    String[] acneArray = acneD.split(" ");
    String[] eczemaArray = eczemaD.split(" ");
    String[] lowBackPainArray = lowBackPainD.split(" ");
    String[] fracturesArray = fracturesD.split(" ");
    String[] osteoarthritisArray = osteoarthritisD.split(" ");
    //Gastrology related disease
    String[] achalasiaArray = achalasiaD.split(" ");
    String[] stomachCancerArray = stomachCancerD.split(" ");
    String[] gastroparesisArray = gastroparesisD.split(" ");
    //Ophthalmology related disease
    String[] glaucomaArray = glaucomaD.split(" ");
    String[] cataractsArray = cataractsD.split(" ");
    String[] strabismusArray = strabismusD.split(" ");
    //Dental diseases
    String[] gingivitisArray = gingivitisD.split(" ");
    String[] oralCancerArray = oralCancerD.split(" ");
    String[] cavitiesArray = cavitiesD.split(" ");
    //ENT related disease
    String[] earInfectionsArray = earInfectionsD.split(" ");
    String[] noiseArray = noiseD.split(" ");
    String[] tinnitusArray = tinnitusD.split(" ");
    //NOSE
    String[] sinusitisArray = sinusitisD.split(" ");
    String[] nasalCancerArray = nasalCancerD.split(" ");
    String[] noseInjuriesArray = noseInjuriesD.split(" ");
    //Throat
    String[] tonsillitisArray = tonsillitisD.split(" ");

    //Counting disease
    String[] voiceDisorderArray = voiceDisorderD.split(" ");
    String[] dysphagiaArray = dysphagiaD.split(" ");
    //Medicine Related disease
    String[] anemiaArray = anemiaD.split(" ");
    String[] typhoidArray = typhoidD.split(" ");
    String[] diarrhoeaArray = diarrhoeaD.split(" ");


    DiseaseAnalyzer() {

    }

    DiseaseAnalyzer(String[] diseaseSaver, String docCAT) {

        switch (docCAT) {
            case "nephrologist" -> {
                neproCaller(diseaseSaver);
                pharmacy.displayPrescription();
            }

            case "dermatologist" -> {
                dermatologyCaller(diseaseSaver);
                pharmacy.displayPrescription();
            }
            case "orthopredics" -> {
                orthopedicCaller(diseaseSaver);
                pharmacy.displayPrescription();
            }
            case "gastroenterology" -> {
                gastrologyCaller(diseaseSaver);
                pharmacy.displayPrescription();
            }

            case "Ophthalmologists" -> {
                ophthalmologyCaller(diseaseSaver);
                pharmacy.displayPrescription();
            }
            case "dentist" -> {
                dentalCaller(diseaseSaver);
                pharmacy.displayPrescription();
            }

            case "entSpecialist" -> {
                entCaller(diseaseSaver);
                pharmacy.displayPrescription();
            }
            case "medicineSpecialist" -> {
                medicineCaller(diseaseSaver);
                pharmacy.displayPrescription();
            }
        }

    }

    //nephro specialist

    private void neproCaller( String[] diseaseDetector) {


        for (String s : diseaseDetector) {
            int j = 0, k = 0, l = 0;

            for (; j < kidneyInfectionArray.length; j++) {

                if (s.equalsIgnoreCase(kidneyInfectionArray[j])) {


                    kidneyInfection++;
                }
            }

            for (; k < kidneyStonesArray.length; k++) {
                if (s.equalsIgnoreCase(kidneyStonesArray[k])) {
                    kidneyStones++;
                }
            }

            for (; l < kidneyCancerArray.length; l++) {
                if (s.equalsIgnoreCase(kidneyCancerArray[l])) {
                    kidneyCancer++;
                }
            }
        }

        if (kidneyInfection > kidneyStones && kidneyInfection > kidneyCancer) {
            pharmacy.getRep("Kidney Infection");
            String[] kidneyInfection =medicineList.kidneyInfectionMeds();
            pharmacy.medicDisplay(kidneyInfection);

        } else if (kidneyStones > kidneyInfection && kidneyStones > kidneyCancer) {
            pharmacy.getRep("Kidney Stone");
            String[] kidneyStone = medicineList.kidneyStonesMeds();
            pharmacy.medicDisplay(kidneyStone);

        } else if (kidneyCancer > kidneyInfection && kidneyCancer > kidneyStones) {
            pharmacy.getRep("Kidney Cancer");
            String[] kidneyCancer =medicineList.kidneyCancerMeds();
            pharmacy.medicDisplay(kidneyCancer);
        } else {
            System.out.println("Unable to detect the disease. Call 16263");
        }
    }

    //dermatoloy specialist

    private void dermatologyCaller( String[] diseaseDetector) {

        for (String s : diseaseDetector) {
            int j = 0, k = 0, l = 0;

            for (; j < lupusArray.length; j++) {

                if (s.equalsIgnoreCase(lupusArray[j])) {


                    lupus++;
                }
            }

            for (; k < acneArray.length; k++) {
                if (s.equalsIgnoreCase(acneArray[k])) {
                    acne++;
                }
            }

            for (; l < eczemaArray.length; l++) {
                if (s.equalsIgnoreCase(eczemaArray[l])) {
                    eczema++;
                }
            }


        }

        if (lupus > acne && lupus > eczema) {
            pharmacy.getRep("Lupus Infection");

            String[] lupus =medicineList.lupusMeds();
            pharmacy.medicDisplay(lupus);

        } else if (acne > lupus && acne > eczema) {
            pharmacy.getRep("Acne");
            String[] acne =medicineList.acneMeds();
            pharmacy.medicDisplay(acne);

        } else if (eczema > lupus && eczema > acne) {
            pharmacy.getRep("Eczema");

            String[] eczema =medicineList.eczemaMeds();
            pharmacy.medicDisplay(eczema);
        } else {
            System.out.println("Unable to detect the disease. Call 16263");
        }
    }

    //orthopedic specialist

    private void orthopedicCaller(String[] diseaseDetector) {

        for (String s : diseaseDetector) {
            int j = 0, k = 0, l = 0;

            for (; j < lowBackPainArray.length; j++) {

                if (s.equalsIgnoreCase(lowBackPainArray[j])) {
                    lowBackPain++;
                }
            }

            for (; k < fracturesArray.length; k++) {
                if (s.equalsIgnoreCase(fracturesArray[k])) {
                    fractures++;
                }
            }

            for (; l < osteoarthritisArray.length; l++) {
                if (s.equalsIgnoreCase(osteoarthritisArray[l])) {
                    osteoarthritis++;
                }
            }
        }

        if (lowBackPain > fractures && lowBackPain > osteoarthritis) {
            pharmacy.getRep("Lower Back Pain");

            String[] lowBackPain =medicineList.lowBackPainMeds();
            pharmacy.medicDisplay(lowBackPain);

        } else if (fractures > lowBackPain && fractures > osteoarthritis) {
            pharmacy.getRep("Bone Fractures");

            String[] fractures =medicineList.fracturesMeds();
            pharmacy.medicDisplay(fractures);

        } else if (osteoarthritis > lowBackPain && osteoarthritis > fractures) {

            pharmacy.getRep("Osteoarthritis");

            String[] osteoarthritis =medicineList.osteoarthritisMeds();
            pharmacy.medicDisplay(osteoarthritis);
        } else {
            System.out.println("Unable to detect the disease. Call 16263");

        }
    }

    //Gastrology specialist

    private void gastrologyCaller( String[] diseaseDetector) {

        for (String s : diseaseDetector) {
            int j = 0, k = 0, l = 0;

            for (; j < achalasiaArray.length; j++) {

                if (s.equalsIgnoreCase(achalasiaArray[j])) {
                    achalasia++;
                }
            }

            for (; k < stomachCancerArray.length; k++) {
                if (s.equalsIgnoreCase(stomachCancerArray[k])) {
                    stomachCancer++;
                }
            }

            for (; l < gastroparesisArray.length; l++) {
                if (s.equalsIgnoreCase(gastroparesisArray[l])) {
                    gastroparesis++;
                }
            }
        }

        if (achalasia > stomachCancer && achalasia > gastroparesis) {
            pharmacy.getRep("Achalasia");

            String[] achalasia =medicineList.achalasiaMeds();
            pharmacy.medicDisplay(achalasia);
        } else if (stomachCancer > achalasia && stomachCancer > gastroparesis) {
            pharmacy.getRep("Stomach Cancer");
            String[] stomachCancer =medicineList.stomachCancerMeds();
            pharmacy.medicDisplay(stomachCancer);
        } else if (gastroparesis > achalasia && gastroparesis > stomachCancer) {
            pharmacy.getRep("Gastroparesis");

            String[] gastroparesis =medicineList.gastroparesisMeds();
            pharmacy.medicDisplay(gastroparesis);
        } else {
            System.out.println("Unable to detect the disease. Call 16263");

        }
    }

    //opthalmologist Specialist

    private void ophthalmologyCaller( String[] diseaseDetector) {

        for (String s : diseaseDetector) {
            int j = 0, k = 0, l = 0;

            for (; j < glaucomaArray.length; j++) {

                if (s.equalsIgnoreCase(glaucomaArray[j])) {
                    glaucoma++;
                }
            }

            for (; k < cataractsArray.length; k++) {
                if (s.equalsIgnoreCase(cataractsArray[k])) {
                    cataracts++;
                }
            }

            for (; l < strabismusArray.length; l++) {
                if (s.equalsIgnoreCase(strabismusArray[l])) {
                    strabIsmus++;
                }
            }
        }

        if (glaucoma > cataracts && glaucoma > strabIsmus) {
            pharmacy.getRep("Glaucoma");

            String[] glaucoma =medicineList.glaucomaMeds();
            pharmacy.medicDisplay(glaucoma);
        } else if (cataracts > glaucoma && cataracts > strabIsmus) {
            pharmacy.getRep("Cataracts");

            String[] cataracts =medicineList.cataractsMeds();
            pharmacy.medicDisplay(cataracts);
        } else if (strabIsmus > glaucoma && strabIsmus > cataracts) {
            pharmacy.getRep("Strabismus");

            String[] strabIsmus =medicineList.strabismusMeds();
            pharmacy.medicDisplay(strabIsmus);
        } else {
            System.out.println("Unable to detect the disease. Call 16263");

        }
    }

    // dental specialist

    private void dentalCaller( String[] diseaseDetector) {

        for (String s : diseaseDetector) {
            int j = 0, k = 0, l = 0;

            for (; j < gingivitisArray.length; j++) {

                if (s.equalsIgnoreCase(gingivitisArray[j])) {
                    gingivitis++;
                }
            }

            for (; k < oralCancerArray.length; k++) {
                if (s.equalsIgnoreCase(oralCancerArray[k])) {
                    oralCancer++;
                }
            }

            for (; l < cavitiesArray.length; l++) {
                if (s.equalsIgnoreCase(cavitiesArray[l])) {
                    cavities++;
                }
            }
        }

        if (gingivitis > oralCancer && gingivitis > cavities) {
            pharmacy.getRep("Gingivitis");

            String[] gingivitis =medicineList.gingivitisMeds();
            pharmacy.medicDisplay(gingivitis);

        } else if (oralCancer > gingivitis && oralCancer > cavities) {
            pharmacy.getRep("Oral Cancer");

            String[] oralCancer =medicineList.oralCancerMeds();
            pharmacy.medicDisplay(oralCancer);
        } else if (cavities > gingivitis && cavities > oralCancer) {
            pharmacy.getRep("Cavities");
            
            String[] cavities =medicineList.cavitiesMeds();
            pharmacy.medicDisplay(cavities);
        } else {
            System.out.println("Unable to detect the disease. Call 16263");

        }
    }

    //ent specialist

    private void entCaller( String[] diseaseDetector) {


        for (String s : diseaseDetector) {
            int j = 0, k = 0, l = 0;

            //---------------------EAR------------

            for (; j < earInfectionsArray.length; j++) {

                if (s.equalsIgnoreCase(earInfectionsArray[j])) {
                    earInfections++;
                }
            }

            for (; k < noiseArray.length; k++) {
                if (s.equalsIgnoreCase(noiseArray[k])) {
                    noise++;
                }
            }

            for (; l < tinnitusArray.length; l++) {
                if (s.equalsIgnoreCase(tinnitusArray[l])) {
                    tinnitus++;
                }
            }
        }

        if (earInfections > noise && earInfections > tinnitus) {
            pharmacy.getRep("Ear Infection");

            String[] earInfection =medicineList.earInfectionsMeds();
            pharmacy.medicDisplay(earInfection);
        } else if (noise > earInfections && noise > tinnitus) {
            pharmacy.getRep("Nose Problem");

            String[] noise =medicineList.noiseMeds();
            pharmacy.medicDisplay(noise);
        } else if (tinnitus > earInfections && tinnitus > noise) {
            pharmacy.getRep("Tinnitus");
            
            String[] tinnitus =medicineList.tinnitusMeds();
            pharmacy.medicDisplay(tinnitus);
        } else {
            System.out.println("Unable to detect the disease. Call 16263");

        }
    }


    //Medicine Specialist

    private void medicineCaller( String[] diseaseDetector) {


        for (String s : diseaseDetector) {
            int j = 0, k = 0, l = 0;

            //---------------------EAR------------

            for (; j < anemiaArray.length; j++) {

                if (s.equalsIgnoreCase(anemiaArray[j])) {
                    anemia++;
                }
            }

            for (; k < typhoidArray.length; k++) {
                if (s.equalsIgnoreCase(typhoidArray[k])) {
                    typhoid++;
                }
            }

            for (; l < diarrhoeaArray.length; l++) {
                if (s.equalsIgnoreCase(diarrhoeaArray[l])) {
                    diarrhoea++;
                }
            }
        }

        if (anemia > typhoid && anemia > diarrhoea) {
            pharmacy.getRep("Anemia");

            String[] anemia =medicineList.anemiaMeds();
            pharmacy.medicDisplay(anemia);
        } else if (typhoid > anemia && typhoid > diarrhoea) {
            pharmacy.getRep("Typhoid");


            String[] typhoid =medicineList.typhoidMeds();
            pharmacy.medicDisplay(typhoid);
        } else if (diarrhoea > anemia && diarrhoea > typhoid) {
            pharmacy.getRep("Diarrhoea");

            String[] diarrhoea =medicineList.diarrhoeaMeds();
            pharmacy.medicDisplay(diarrhoea);
        } else {
            System.out.println("Unable to detect the disease. Call 16263");
        }
    }
}