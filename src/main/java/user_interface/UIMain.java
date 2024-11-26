package user_interface;

import jdk.tools.jmod.Main;
import medical_database.BP_scan;
import medical_database.MRI_scan;
import medical_database.Patient;
import medical_database.ImportPatients;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UIMain extends JFrame {
    static GraphicsConfiguration gc;
    public UIMain() {

        ImportPatients importPatients = new ImportPatients();
        ArrayList<Patient> patients = importPatients.getPatients();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,300);

        getContentPane().add(new MainTabbedPanel(patients));

        //frame.setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }
}
