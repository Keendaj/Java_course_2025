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
     * @see Показывает пример работы со String
     * length() - длина строки
     * toUpperCase() - в большие буквы
     * toLowerCase() - в маленькие буквы  
     * charAt() - символ по номеру
     * substring() - часть строки
     * contains() - проверяет есть ли слово
     * equals() - сравнить
     * replace() - заменить
     * equalsIgnoreCase() - сравнить без учета больших/маленьких
     * trim() - убрать пробелы по краям
     */
    public static void main(String[] args) {
        String text = "Hello WoRld!";
        
        System.out.println("Длина: " + text.length());
        
        System.out.println("Большие: " + text.toUpperCase());

        System.out.println("Маленькие: " + text.toLowerCase());

        System.out.println("Первый символ: " + text.charAt(0));

        System.out.println("С 8 символа: " + text.substring(8));
        System.out.println("С 0 по 6: " + text.substring(0, 6));

        System.out.println("Есть 'WoRld!'? " + text.contains("WoRld!"));
        System.out.println("Есть 'Python'? " + text.contains("Python"));

        System.out.println("Заменить e на E: " + text.replace('e', 'E')); 

        String text2 = "Hello world!";
        System.out.println("Равны? " + text.equals(text2));

        System.out.println("Равны без учета регистра? " + text.equalsIgnoreCase(text2));

        String text3 = "   много пробелов   ";
        System.out.println("Без пробелов: '" + text3.trim() + "'");
    }
}