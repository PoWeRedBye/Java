package Zada4i;


/**
 * Created by Ferotekh-Service on 05.12.2016.
 */
public class Home10 {
    public static class HanoiTower {
        private int count = 0;

        private void getHanoi(int n, String a, String b, String c) {

            if (n > 0) {
                getHanoi(n - 1, a, c, b);

                System.out.println(a + ">>>" + b);
                count++;
                getHanoi(n - 1, c, b, a);

            }
        }

        public static void main(String[] args) {
            HanoiTower tower = new HanoiTower();
            tower.getHanoi(8, "A", "B", "C");
            System.out.println(tower.count);
        }
    }
}