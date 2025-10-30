interface MyInterface {
    void interfaceMethod(); 

    static class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }
        
        public static int multiply(int a, int b) {
            return a * b;
        }
    }
}

class MyImplementation implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implemented interface method");
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
     * @see Показывает пример для интерфейсом и вложенными классами
     */
    public static void main(String[] args) {

        int sum = MyInterface.Calculator.add(5, 3);
        int product = MyInterface.Calculator.multiply(5, 3);
        
        System.out.println("5 + 3 = " + sum);
        System.out.println("5 * 3 = " + product);
        
        MyImplementation impl = new MyImplementation();
        impl.interfaceMethod();
        //impl.Calculator.add(5, 3); Ошибка
    }
}