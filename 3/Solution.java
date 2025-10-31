import java.util.Formatter;
import java.util.Date;
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
     * @see Показывает пример работы с временными спецификаторами
     */
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Date currentDate = new Date();

        formatter.format("Час: %tH%n", currentDate);

        formatter.format("Минуты: %tM%n", currentDate);

        formatter.format("Год: %tY%n", currentDate);

        formatter.format("Месяц: %tB%n", currentDate);

        formatter.format("День недели: %tA%n", currentDate);
        
        System.out.println(formatter);
    }
}