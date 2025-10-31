import java.io.*;
/**
 * Демонстрация работы со StringBuilder
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {

    /**
     * @param args
     * @return void
     * @see Показывает пример работы с AutoCloseable
     */
    public static void main(String[] args) {
        FileOutputStream file1 = null;
        try {
            file1 = new FileOutputStream("test.txt");
            file1.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file1 != null) file1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        try (FileOutputStream file2 = new FileOutputStream("test2.txt")) { //Само закроется
            file2.write(66);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}