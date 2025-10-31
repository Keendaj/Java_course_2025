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
     */
    public static void main(String[] args) {
        String text = "Hello WoRld!";
        
        // 1. length() - длина строки
        System.out.println("Длина: " + text.length());
        
        // 2. toUpperCase() - в большие буквы
        System.out.println("Большие: " + text.toUpperCase());
        
        // 3. toLowerCase() - в маленькие буквы  
        System.out.println("Маленькие: " + text.toLowerCase());
        
        // 4. charAt() - символ по номеру
        System.out.println("Первый символ: " + text.charAt(0));
        
        // 5. substring() - часть строки
        System.out.println("С 8 символа: " + text.substring(8));
        System.out.println("С 0 по 6: " + text.substring(0, 6));
        
        // 6. contains() - проверяет есть ли слово
        System.out.println("Есть 'WoRld!'? " + text.contains("WoRld!"));
        System.out.println("Есть 'Python'? " + text.contains("Python"));
        
        // 7. replace() - заменить
        System.out.println("Заменить e на E: " + text.replace('e', 'E')); 
        
        // 8. equals() - сравнить
        String text2 = "Hello world!";
        System.out.println("Равны? " + text.equals(text2));
        
        // 9. equalsIgnoreCase() - сравнить без учета больших/маленьких
        System.out.println("Равны без учета регистра? " + text.equalsIgnoreCase(text2));
        
        // 10. trim() - убрать пробелы по краям
        String text3 = "   много пробелов   ";
        System.out.println("Без пробелов: '" + text3.trim() + "'");
    }
}