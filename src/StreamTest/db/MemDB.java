package StreamTest.db;

import StreamTest.dto.PathInfoDTO;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Maxim_Ozarovskiy on 01.02.2017.
 */
public class MemDB {
    public static final ConcurrentLinkedQueue<PathInfoDTO> filesInfo = new ConcurrentLinkedQueue<>();
}
