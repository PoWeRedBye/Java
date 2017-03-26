package StreamTest.FileCounter;

import StreamTest.dto.PathInfoDTO;
import StreamTest.utils.FileUtils;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Maxim_Ozarovskiy on 04.02.2017.
 */
public class DataWriter {

    private FileWriter writer;

    public DataWriter(String path) throws IOException {
        String csvFile = FileUtils.getFilePref() + path;
        FileWriter writer = new FileWriter(csvFile);
    }

    public void criterrateDataW(String path) {

    }

    public void saveData(PathInfoDTO pathInfoDTO) throws IOException {

        if (writer == null) {
            throw new RuntimeException("delete this dataWriter");
           // return;
        }
    }
        //try {
          //  CSVUtils.writeLine(writer, Arrays.asList(Integer.toString(pathInfoDTO.getCounter()), pathInfoDTO.getPath(), ',', "'"));
        //} catch (IOException e) {
          //  e.printStackTrace();
        //}

    public void saveAndDestroy() throws IOException {
        try {
            writer.flush();
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}






