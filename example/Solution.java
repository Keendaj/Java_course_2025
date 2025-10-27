package example;

import example.other.OtherTest;
import example.other.SubTest;

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
     * @see Показывает использование спецификаций
     */
    public static void main(String[] args) {
        System.out.println("=== Пример спецификаторов доступа ===");

        Test Test = new Test();

        // PUBLIC - доступен всем
        System.out.println("publicField = " + Test.publicField);
        Test.publicMethod();

        // PROTECTED - доступен в том же пакете
        System.out.println("protectedField = " + Test.protectedField);
        Test.protectedMethod();

        // DEFAULT (package-private) - доступен в том же пакете
        System.out.println("defaultField = " + Test.defaultField);
        Test.defaultMethod();

        // PRIVATE - доступен только внутри класса
        // System.out.println(Test.privateField); // Ошибка компиляции
        // Test.privateMethod(); // Ошибка компиляции

        // Доступ к protected и public из другого пакета
        OtherTest other = new OtherTest();
        other.testAccess();

        SubTest sub = new SubTest();
        sub.testProtectedAccess();
    }
}
