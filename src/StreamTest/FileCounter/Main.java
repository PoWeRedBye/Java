package StreamTest.FileCounter;

import StreamTest.db.MemDB;
import StreamTest.dto.PathInfoDTO;
import StreamTest.utils.FileUtils;

import java.io.IOException;


/**
 * Created by Maxim_Ozarovskiy on 01.02.2017.
 */
public class Main {

    private final static FileUtils fileUtils = new FileUtils();
    private final static FileParser fileParser = new FileParser();

    public static void main(String[] args) throws IOException {
        FileParserPool fpl = new FileParserPool();
        String filesPath = fileUtils.read("input.txt");
        FileParserPool fileParserPool = new FileParserPool();
        fileParserPool.createPool(filesPath);

        while (fpl.getActiveThread() == 0);
        DataWriter dataWriter = new DataWriter("output.csv");

        for (PathInfoDTO infoDTO : MemDB.filesInfo){
            System.out.println(infoDTO.toString());
        }
        dataWriter.saveAndDestroy();
        System.exit(0);
    }

}
