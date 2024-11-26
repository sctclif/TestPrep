package medical_database;

import javax.swing.*;

public class BP_scan extends MedicalTest{
    private final float systolic_pressure;
    private final float diastolic_pressure;
    private final String measurement_length;
    public BP_scan(float diastolic_pressure, float systolic_pressure,String measurement_length,int year, int month, int day) {
        super(year, month, day);
        this.systolic_pressure = systolic_pressure;
        this.measurement_length = measurement_length;
        this.diastolic_pressure = diastolic_pressure;

    }

    @Override
    public JPanel printToDoctor() {
        JPanel bp_panel = new JPanel();
        JLabel bp_info = new JLabel("Blood pressure " + systolic_pressure + " over " + diastolic_pressure);
        bp_panel.add(bp_info);
        return bp_panel;
    }

    @Override
    public String printToConsole() {
        return "BP: " + measurement_length + "," + exam_date;
    }
}
