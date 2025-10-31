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
     * @see Показывает пример работы со StringBuilder
     * append() - добавить в конец
     * insert() - вставить в середину
     * delete() - удалить часть
     * reverse() - перевернуть строку
     * replace() - заменить часть
     * charAt() - получить символ по индексу
     * length() - получить длину
     * setCharAt() - изменить один символ
     * substring() - получить часть строки
     * capacity() - получить емкость
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        sb.append(" World");
        System.out.println("1. append(): " + sb);
        
        sb.insert(5, " Java");
        System.out.println("2. insert(): " + sb);
        
        sb.delete(5, 10);
        System.out.println("3. delete(): " + sb);
        
        sb.reverse();
        System.out.println("4. reverse(): " + sb);
        
        sb.reverse();
        System.out.println("5. reverse() обратно: " + sb);
        
        sb.replace(6, 11, "Java");
        System.out.println("6. replace(): " + sb);
        
        System.out.println("7. charAt(0): " + sb.charAt(0));
        
        System.out.println("8. length(): " + sb.length());
        
        sb.setCharAt(0, 'h');
        System.out.println("9. setCharAt(): " + sb);
        
        System.out.println("10. substring(0,5): " + sb.substring(0, 5));
        
        System.out.println("11. capacity(): " + sb.capacity());
        
        System.out.println("12. toString(): " + sb.toString());
    }
}