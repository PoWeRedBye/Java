package StreamTest.FileCounter;


import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maxim_Ozarovskiy on 01.02.2017.
 */
public class FileParserPool {
    private final ThreadPoolExecutor threadPool =
            new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                    Runtime.getRuntime().availableProcessors() * 4,
                    60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

    public void createPool(String paths) {
        int counter =0;
        String[] filesPath = paths.split(",");
        int i =0;
        for(String path : filesPath){
            FileParserThread fileParserThread =  new FileParserThread(i++,path);
            threadPool.execute(fileParserThread);
        }

    }

    public int getActiveThread(){
        return threadPool.getActiveCount();
    }
}
