package user_interface;

import medical_database.Patient;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PatientScrollPanel extends JScrollPane {
    public PatientScrollPanel(ArrayList<Patient> patients) {

        JPanel allPatientsPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(patients.size(), 1);
        allPatientsPanel.setLayout(gridLayout);
        for (Patient patient : patients) {
            allPatientsPanel.add(new PatientPanel(patient));
        }

        setViewportView(allPatientsPanel);
        setVisible(true);
    }
}
