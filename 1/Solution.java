import java.util.Formatter;
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
     * @see Показывает пример работы со спецификаторами
     */
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("Строка: %s%n", "Hello World");

        formatter.format("Число: %d%n", 123);

        formatter.format("Дробное: %.2f%n", 3.14159);

        formatter.format("Логическое: %b%n", true);

        formatter.format("Символ: %c%n", 'A');
        
        System.out.println(formatter);
    }
}