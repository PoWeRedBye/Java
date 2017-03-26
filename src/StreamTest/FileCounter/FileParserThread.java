package StreamTest.FileCounter;

import StreamTest.db.MemDB;
import StreamTest.dto.PathInfoDTO;

import java.io.File;

/**
 * Created by Maxim_Ozarovskiy on 01.02.2017.
 */
public class FileParserThread implements Runnable {

    private final int number;
    private final String path;

    public FileParserThread(int number, String path){
        this.number = number;
        this.path = path;
    }

    @Override
    public void run() {
        FileParser fileParser = new FileParser();
        int counter = fileParser.getRealFiles(new File(path.trim()));
        MemDB.filesInfo.add(new PathInfoDTO(number,counter,path));
    }
}
