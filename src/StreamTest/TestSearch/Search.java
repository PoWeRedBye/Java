package StreamTest.TestSearch;

import java.io.File;

/**
 * Created by Maxim_Ozarovskiy on 01.02.2017.
 */
public class Search {
    static boolean flag;

    public static void main(String[] args) {
        func("c:\\","Test");
    }

    static void func(String path, String find) {
        File f = new File(path);
        String[] list = f.list();     //список файлов в текущей папке
        for (String file : list) {      //проверка на совпадение
            if (find.equals(file)) {
                flag=true;
                System.out.println(path + "\\" + file + " !!!!!!!!!!!!!!!!!!");  //если найден, то выход
                return;
            }
            if (!path.endsWith("\\")) {
                path += "\\";
            }
            File tempfile = new File(path, file);
            System.out.println(path + file);
            if (!file.equals(".") && !file.equals("..")) {        //!!!
                if (tempfile.isDirectory()) {      //иначе проверяем, если это папка
                    //path += file;
                    func(path + file, find);               //то рекурсивный вызов этой функции
                    if(flag) return;
                }
            }
        }
    }

}
