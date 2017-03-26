package BackToScool;

/**
 * Created by Maxim_Ozarovskiy on 25.12.2016.
 */
public class ColledgeStudent {

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String major;
    public int year;


    public ColledgeStudent(String major, int year) {
        this.major = major;
        this.year = year;
    }


}
