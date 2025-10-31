import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
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
     * @see Показывает пример работы с Scanner
     */
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(new File("data.txt"))) {
            fileScanner.useLocale(Locale.US);//Точка разделитель

            String word = fileScanner.next();   
            int number = fileScanner.nextInt();      
            double decimal = fileScanner.nextDouble();
            boolean flag = fileScanner.nextBoolean(); 
            
            System.out.println("Слово: " + word);
            System.out.println("Число: " + number);
            System.out.println("Дробное: " + decimal);
            System.out.println("Флаг: " + flag);
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}