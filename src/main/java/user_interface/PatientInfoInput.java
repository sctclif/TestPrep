package user_interface;

import javax.swing.*;
import java.awt.*;

public class PatientInfoInput extends JPanel {
    public PatientInfoInput() {
        GridLayout layout = new GridLayout(4, 1);
        JPanel patientInfo = new JPanel(layout);
        patientInfo.setLayout(layout);
        patientInfo.add(new JLabel("Patient Photo URL:"));
        patientInfo.add(new JTextField(20));
        patientInfo.add(new JLabel("Patient Name:"));
        patientInfo.add(new JTextField(20));
        patientInfo.add(new JLabel("Patient Age:"));
        patientInfo.add(new JTextField(20));
        //JCombo Box
        String[] medicalTest = {""};
        add(patientInfo);
        JSeparator s = new JSeparator();

        // set layout as vertical
        s.setOrientation(SwingConstants.HORIZONTAL);
        add(s);



        setVisible(true);

    }
}
