import java.util.Formatter;
import java.util.Date;
/**
 * Демонстрация работы со StringBuilder
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }

    /**
     * @param args
     * @return void
     * @see Показывает пример работы с исключениями
     */
    public static void main(String[] args) {
         try {
            int[] numbers = {1, 2, 3};
            System.out.println("Обращаемся к элементу массива: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
        
        System.out.println("\n=== Пример с НЕперехваченным исключением ===");
        
        int[] numbers = {1, 2, 3};
        System.out.println("Обращаемся к элементу массива: " + numbers[5]);
    }
}