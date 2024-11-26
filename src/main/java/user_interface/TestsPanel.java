package user_interface;

import medical_database.MedicalTest;
import medical_database.Patient;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TestsPanel extends JPanel {
    private ArrayList<MedicalTest> tests = new ArrayList<>();
    public TestsPanel(Patient pat1) {

        this.tests = pat1.getTests();
        setBackground(Color.GRAY);
        GridLayout layout = new GridLayout(1,tests.size());
        setLayout(layout);
        generateTestPanels();

        setVisible(true);
    }
    private void generateTestPanels(){
        for (MedicalTest test : tests) {
            JPanel panel = test.printToDoctor();
            panel.setBorder(BorderFactory.createLineBorder(Color.black));
            add(panel);

        }
    }
}
