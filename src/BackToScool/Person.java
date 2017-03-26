package BackToScool;

/**
 * Created by Maxim_Ozarovskiy on 25.12.2016.
 */

public class Person {



    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String name;
    public String gender;
    public int age;


    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static void main(String[] args) {


    }

}

