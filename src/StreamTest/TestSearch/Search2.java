package StreamTest.TestSearch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Печатаем все дерево папок и файлов с указанием начального пути.
 */
public class Search2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter directory: ");
        String Path = scanner.nextLine();
        printTreeFiles(Path);


    }

    public static void printTreeFiles(String Path) {
        File Directory = new File(Path);

        if (Directory.exists()) {
            getContent(Directory, 0);
        } else System.out.println("Directory is not found...");
    }

    //recursive procedure for finding the contents of a directory
    public static void getContent(File Directory, int Indents) {
        for (int i = 0; i < Indents; i++) System.out.print("\t");

        if (Directory.isFile()) System.out.println(Directory.getName());
        else {
            System.out.println(Directory.getName());
            File[] SubDirectory = Directory.listFiles();
            for (File SubWay : SubDirectory)
                getContent(SubWay, Indents + 1);
        }
    }

    public void searchFile(File dir) throws IOException {
        if (dir.isDirectory()) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory())
                searchFile(file);
        }
        for (File file : files) {
            int n = 0;
            if (file.isFile()) {   //проверяем, файл ли это
                n++;
                System.out.println("Файл номер " + n + " найден в " + file.getAbsolutePath());
            }
        }
    }
    }
}