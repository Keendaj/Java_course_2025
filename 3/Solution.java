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
     * @see Показывает пример работы с тройными кавычками
     */
    public static void main(String[] args) {
        String oldText = "Первая строка\n" +
                        "Вторая строка\n" +
                        "Третья строка";

        String newText = """
                Первая строка
                Вторая строка  
                Третья строка""";
        
        System.out.println("Старый способ:");
        System.out.println(oldText);
        System.out.println("Новый способ:");
        System.out.println(newText);
    }
}