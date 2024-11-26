package medical_database;

import javax.swing.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class MedicalTest {
    protected LocalDate exam_date;

    public MedicalTest(int year, int month, int day) {
        exam_date = LocalDate.of(year, month, day);
    }
    public LocalDate getExam_date(){
        return exam_date;
    }
    public abstract JPanel printToDoctor();
    public abstract String printToConsole();

}
