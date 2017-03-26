package BackToScool;

/**
 * Created by Maxim_Ozarovskiy on 25.12.2016.
 */
public class Student {

    public String getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String idNumber;
    public double gpa;


    public Student(String idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
    }


}
