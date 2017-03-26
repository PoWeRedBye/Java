package StreamTest.dto;

/**
 * Created by Maxim_Ozarovskiy on 01.02.2017.
 */
public class PathInfoDTO {

    private int number;
    private int counter;
    private String path;

    public PathInfoDTO(int number, int counter, String path) {
        this.number = number;
        this.counter = counter;
        this.path = path;
    }

    public int getNumber() {
        return number;
    }

    public int getCounter() {
        return counter;
    }

    public String getPath() {
        return path;
    }
}
