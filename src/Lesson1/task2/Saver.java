package Lesson1.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by DmRG on 23.02.2017.
 */
public class Saver {
    
    @SaveTo(path = "C:\\Ruslan\\test\\test1.txt")
    public void save (String path, String str) {
        File file = new File(path);
         if (file.exists()) {
             try (PrintWriter pw = new PrintWriter(file)) {
                 pw.println(str);
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             }
         } else System.out.println("File doesn't exist");
    }
}
