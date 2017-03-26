package StreamTest.utils;

import java.io.*;

/**
 * Created by Ferotekh-Service on 01.02.2017.
 */
public class FileUtils {

    public static String getFilePref() {
        return filePref;
    }

    private final static String filePref = "dataFiles/";

    //////////////////////////////////////////////////////////////////////////////////

    public void write(String fileName, String text) {
        File file = new File(filePref + fileName);
        try {
            if (!file.exists()) {
                if (!file.createNewFile()) {
                    throw new RuntimeException("Where my fuckin' file?");
                }
            }
            try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())) {
                out.print(text);
            }
        } catch (IOException ololo) {
            throw new RuntimeException(ololo);
        }
    }

    //////////////////////////////////////////////////////////////////////////////////

    public String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        exists(filePref + fileName);
        try {
            File file = new File(filePref + fileName);

            try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    //////////////////////////////////////////////////////////////////////////////////

    public void update(String nameFile, String newText) throws FileNotFoundException {
        exists(filePref + nameFile);
        StringBuilder sb = new StringBuilder();
        String oldFile = read(filePref + nameFile);
        sb.append(oldFile);
        sb.append(newText);
        write(filePref + nameFile, sb.toString());
    }

    private void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) throw new FileNotFoundException(file.getName());
    }

}

