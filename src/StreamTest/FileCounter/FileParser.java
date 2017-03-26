package StreamTest.FileCounter;

import java.io.File;

/**
 * Created by Maxim_Ozarovskiy on 01.02.2017.
 */
public class FileParser {
    public int getRealFiles(File file) {
        File[] files = file.listFiles();
        int fileCounter = 0;
        for (File insideFile : files) {
            if (insideFile.isDirectory()) {
                fileCounter += getRealFiles(insideFile);
            } else {
                fileCounter++;
            }
        }
        return fileCounter;
    }
}
