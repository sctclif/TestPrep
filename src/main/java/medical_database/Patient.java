package medical_database;

import java.util.ArrayList;

public class Patient {
    private String fullName;
    private int age;
    private String URL;
    private ArrayList<MedicalTest> tests = new ArrayList<>();
    public Patient(String fullName, int age, String URL) {
        this.fullName = fullName;
        this.age = age;
        this.URL = URL;
    }
    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }
    public String getURL() {
        return URL;
    }
    public ArrayList<MedicalTest> getTests() {
        return tests;
    }
    public void addTests(MedicalTest test) {
        tests.add(test);
    }
}
