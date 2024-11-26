package medical_database;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class MRI_scan extends MedicalTest{
    private final String URL;
    private final float magnetic_field_strength;
    public MRI_scan(String URL, float magnetic_field_strength, int year, int month, int day) {
        super(year, month, day);
        this.URL = URL;
        this.magnetic_field_strength = magnetic_field_strength;
    }

    @Override
    public JPanel printToDoctor() {
        JPanel mri_panel = new JPanel();
        JLabel image = new JLabel();
        java.net.URL imageURL=null;
        try {
            imageURL = new URL(URL);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        image.setIcon(thisImageIcon);
        mri_panel.add(image);
        return mri_panel;
    }

    @Override
    public String printToConsole() {
        return "MRI: " + magnetic_field_strength + "," + exam_date;
    }
}
