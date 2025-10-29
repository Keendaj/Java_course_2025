import java.util.ArrayList;
import java.util.List;

/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {
    
    public static void printNumbers(int... numbers) {
        System.out.print("Числа: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void printNumbers(String... strings) {
        System.out.print("Строки: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void printNumbers(String message, int... numbers) {
        System.out.print(message + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * @param args
     * @return void
     * @see Показывает примеры работы перегрузками в функциях с переменным число аргументов. 
     */
    public static void main(String[] args) {
        printNumbers(1, 2, 3);                    
        printNumbers("A", "B", "C");              
        printNumbers("Результат", 10, 20, 30);    
        printNumbers(42);                        
        //printNumbers("Один"); <- попадает под сразу 2 перегрузки                     
        //printNumbers(); <- попадает под сразу 2 перегрузки
    }
}