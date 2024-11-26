package medical_database;

import java.util.ArrayList;

public class ImportPatients {
    ArrayList<Patient> patients = new ArrayList<>();
    public ImportPatients() {

        Patient pat1 = new Patient("Daphne Von Oram", 62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        BP_scan bp_scan = new BP_scan(70, 130, "ST", 2023,9,15);
        MRI_scan mriScan1 = new MRI_scan("https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2, 2023, 9, 14);
        pat1.addTests(mriScan1);
        pat1.addTests(bp_scan);
        Patient pat2 = new Patient("Sebastian Compton", 31, "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        MRI_scan mriScan2 = new MRI_scan("https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4,2023, 9, 15);
        pat2.addTests(mriScan2);
        BP_scan bp_scan2 = new BP_scan(80, 150, "VST", 2023,11,20);
        pat2.addTests(bp_scan2);
        patients.add(pat1);
        patients.add(pat2);


    }
    public ArrayList<Patient> getPatients() {
        return patients;
    }


}
