import java.util.StringJoiner;

/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {

    /**
     * @param args
     * @return void
     * @see Показывает пример работы с StringJoiner
     */
    public static void main(String[] args) {
        StringJoiner fruits = new StringJoiner(", ");
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        System.out.println(fruits.toString());
        
        StringJoiner names = new StringJoiner(" | ", "[ ", " ]");
        names.add("Вася");
        names.add("Петя");
        names.add("Маша");
        System.out.println(names.toString()); // [ Вася | Петя | Маша ]
    }
}