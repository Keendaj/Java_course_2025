class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

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
     * @see Показывает примеры работы с перегруженными методами. 
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("add(5, 3): " + calc.add(5, 3));
        System.out.println("add(1, 2, 3): " + calc.add(1, 2, 3));
    }
}