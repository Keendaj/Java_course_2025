class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void staticRun() {
        printVars();
    }

    public void run() {
        printVars();
    }
}

/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
* @verision 1.0
* @since 2025
 */
public class Solution {
     /**
     * @param args
     * @return void
     * @see Показывает все варианты вызова static метода
     */
    public static void main(String[] args) {
        A.printVars(); // Вызов через сам класс

        A obj = new A();
        obj.printVars(); // Вызов через экземпляр класса

        A.staticRun(); // Внутри статического метода

        obj.run(); // Внутри нестатического метода

    }
}
