import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 *
 */
public class Number44ZadachiFail {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 1, 2, 3, 4, 4, 1};
        System.out.println(Arrays.deepToString(someDo(array)));
    }


    private static int[][] someDo(int[] array) {
        int[][] result = new int[array.length][2];
        Arrays.sort(array);
        for (int i = 1, j = 0, animal = array[0], counter = 1; i < array.length; i++) {
            if ((animal != array[i]) ) {
                result[j][0] = animal;
                result[j][1] = procent(counter, array.length);
                j++;
                animal = array[i];
                counter = 1;
            } else if(i == array.length-1){
                counter++;
                result[j][0] = animal;
                result[j][1] = procent(counter, array.length);
            }else{
                counter++;
            }
        }
        return result;
    }

    private static int procent(int i, int maxLength) {
        return i * 100 / maxLength;
    }

}
