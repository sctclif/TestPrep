package user_interface;
import medical_database.BP_scan;
import medical_database.MRI_scan;
import medical_database.MedicalTest;
import medical_database.Patient;
import javax.swing.*;
import java.awt.*;

public class PatientPanel extends JPanel {

    public PatientPanel(Patient patient) {
        GridLayout gridLayout = new GridLayout(1, 2);
        setLayout(gridLayout);
        add(new InfoPanel(patient));
        add(new TestsPanel(patient));
        System.out.print("Patient: " + patient.getFullName());
        for(MedicalTest i: patient.getTests()){
            System.out.print(": "+i.printToConsole());
        }
        System.out.println();

    }
}
