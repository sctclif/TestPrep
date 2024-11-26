package user_interface;

import medical_database.Patient;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InputPanel extends JSplitPane {
    public InputPanel(){
        super(JSplitPane.HORIZONTAL_SPLIT,new PatientInfoInput(), new InputMonitorPanel());
        setResizeWeight(0.5);
        GridLayout layout = new GridLayout(1,2);


    }
}
