package TeleDoc;

public class MedicineList implements MedicineDirectory{
    @Override
    public String[] kidneyInfectionMeds() {
        return new String[]{"1. Amoxicillin.", "2. Bactrim.", "3. Cephalexin."};
    }

    @Override
    public String[] kidneyStonesMeds() {
        return new String[]{"1. Allopurinol", "2. Antibiotics", "3. Diuretics"};
    }

    public String[] kidneyCancerMeds() {
        return new String[]{"1. Avastin", "2. Avelumab", "3. Axitinib"};
    }

    @Override
    public String[] lupusMeds() {
        return new String[]{"1. Plaquenil", "2. Hydroxychloroquine", "3. Prednisone"};
    }

    @Override
    public String[] acneMeds() {
        return new String[]{"1. Clobetasol", "2. Elidel", "3. Dupixent"};
    }

    @Override
    public String[] eczemaMeds() {
        return new String[]{"1. Tri-Linyah", "2. Retinoin 0.025 % topical cream", "3. Tilia Fe"};
    }

    @Override
    public String[] lowBackPainMeds() {
        return new String[]{"1. Ostocal G", "2. Neurobest", "3. Defrol"};
    }

    @Override
    public String[] fracturesMeds() {
        return new String[]{"1. Tylenol", "2. Panadol", "3. Aspirin-free Anacin"};
    }

    @Override
    public String[] osteoarthritisMeds() {
        return new String[]{"1. meloxicam", "2. Celebrex", "3. diclofenac"};
    }

    @Override
    public String[] achalasiaMeds() {
        return new String[]{"1. Laparoscopic myotomy", "2. Nitrates", "3. Verapamil"};
    }

    @Override
    public String[] stomachCancerMeds() {
        return new String[]{"1. Cyramza (Ramucirumab)","2. Docetaxel" ,"3. Doxorubicin"};
    }

    @Override
    public String[] gastroparesisMeds() {
        return new String[]{"1. metoclopramide", "2. Reglan"};
    }

    @Override
    public String[] glaucomaMeds() {
        return new String[]{"1. Combigan", "2. Acetazolamide", "3. brimonidine"};
    }

    @Override
    public String[] cataractsMeds() {
        return new String[]{"1. Ciloxan", "2. Moxesa", "3, Vigamox"};
    }

    @Override
    public String[] strabismusMeds() {
        return new String[]{"1. Botox", "2. Onabotulinumtoxina"};
    }

    @Override
    public String[] gingivitisMeds() {
        return new String[]{"1. Perioshield (delmopinol)", "2. Arestin (minocycline)", "3. Atridox (doxycycline)"};
    }

    @Override
    public String[] oralCancerMeds() {
        return new String[]{"1. Cisplatin", "2. Carboplatin", "3. 5-fluorouracil (5-FU)"};
    }

    @Override
    public String[] cavitiesMeds() {
        return new String[]{"1. Ibuprofen", "2. Advil Liqui-Gels", "3. Advil Children's"};
    }

    @Override
    public String[] earInfectionsMeds() {
        return new String[]{"1. acetaminophen (Tylenol)", "2. ibuprofen, Motrin"};
    }

    @Override
    public String[] noiseMeds() {
        return new String[]{"1. Guaifenesin", "2. Dextromethorphan", "3. Acetaminophen"};
    }

    @Override
    public String[] tinnitusMeds() {
        return new String[]{"1. Valium", "2. Antidepressants", "3. Alprazolam"};
    }

    @Override
    public String[] sinusitisMeds() {
        return new String[]{"1. Augmentin", "2. Azithromycin", "3. prednisone"};
    }

    @Override
    public String[] nasalCancerMeds() {
        return new String[]{"1. cisplatin (Platinol AQ)", "2. carboplatin (Paraplatin", "3. Paraplatin AQ)","4. 5-fluorouracil (5-FU) "};
    }

    @Override
    public String[] noseInjuriesMeds() {
        return new String[]{"1. Decongestants", "2. Analgesics"};
    }

    @Override
    public String[] tonsillitisMeds() {
        return new String[]{"1. Amoxil", "2. Azithromycin", "3. Clarithromycin"};
    }

    @Override
    public String[] voiceDisorderMeds() {
        return new String[]{"1. Corticosteroids"};
    }

    @Override
    public String[] dysphagiaMeds() {
        return new String[]{"1. Diltiazem", "2. Bont –A"};
    }

    @Override
    public String[] anemiaMeds() {
        return new String[]{"1. folic acid", "2. ferrous sulfate", "3. ferrous gluconate."};
    }

    @Override
    public String[] typhoidMeds() {
        return new String[]{"1. Ciprofloxacin(Cipro)", "2. Azithromycin (Zithromax)"};
    }

    @Override
    public String[] diarrhoeaMeds() {
        return new String[]{"1. loperamide", "2. Lomotil", "3. Imodium"};
    }
}