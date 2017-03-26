package Zada4ki;

/**
 * Создать класс Dog, который будет содержать 2 поля name и says. В main() создать 2
 * экземпляра класса с name "spot" (says, "Ruff!") и "scruffy" (says, "Wurf!"). И распечатать поля
 * объектов.
 */
public class Home2 {
    public static class Dog {
        public String name;
        public String says;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        System.out.print(dog1.name);
        System.out.println(" says: " + dog1.says);
        System.out.print(dog2.name);
        System.out.println(" says: " + dog2.says);
    }

}
