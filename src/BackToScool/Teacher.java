package BackToScool;

/**
 * Created by Maxim_Ozarovskiy on 25.12.2016.
 */
public class Teacher {

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double salary;

    public Teacher(String subject, double salary) {
        this.subject = subject;
        this.salary = salary;
    }


}
