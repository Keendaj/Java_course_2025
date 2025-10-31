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
     * @see Показывает пример работы с InputStream 
     */
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69};
        
        try (ByteArrayInputStream input = new ByteArrayInputStream(data)) {
            int byteRead;
            System.out.println("Чтение байтов по одному:");

            while ((byteRead = input.read()) != -1) {
                System.out.println("Прочитан байт: " + byteRead + 
                                 " -> символ: '" + (char)byteRead + "'");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}