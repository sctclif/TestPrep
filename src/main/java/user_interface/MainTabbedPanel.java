package user_interface;

import medical_database.Patient;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainTabbedPanel extends JTabbedPane {


    public MainTabbedPanel(ArrayList<Patient> patients) {
        // Create the main frame
        addTab("Patients", new PatientScrollPanel(patients));



        // Add panels to the tabbed pane with titles

        addTab("Input", new InputPanel());


        setVisible(true);

        // Center the frame on the screen


    }
}
