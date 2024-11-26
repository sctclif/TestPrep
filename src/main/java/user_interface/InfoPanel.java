package user_interface;

import medical_database.Patient;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class InfoPanel extends JPanel {
    String pictureURL;
    String fullName;
    int age;
    public InfoPanel(Patient patient) {

        pictureURL = patient.getURL();
        fullName = patient.getFullName();
        age = patient.getAge();

        setBackground(Color.GRAY);
        GridLayout layout = new GridLayout(1,2);
        setLayout(layout);

        add(generateImage());
        add(generatePersonalInfo());
        setVisible(true);

    }
    private JPanel generateImage(){
        JPanel img_subpanel = new JPanel();
        img_subpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel image = new JLabel();
        URL imageURL=null;
        try {
            imageURL = new URL(pictureURL);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        image.setIcon(thisImageIcon);
        img_subpanel.add(image);
        return img_subpanel;
    }
    private JPanel generatePersonalInfo(){
        JPanel info_subpanel = new JPanel();
        info_subpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel personalInfo = new JLabel();
        personalInfo.setText("<html>Name: "+fullName+"<br>Age: " +age+"</html>");
        info_subpanel.add(personalInfo);
        return info_subpanel;
    }

}
