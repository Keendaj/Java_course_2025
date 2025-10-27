package example.other;

import example.Test;

public class OtherTest {
    /**
     * @param args
     * @return void
     * @see Показывает, доступ для класса из другого пакета
     */
    public void testAccess() {
        Test obj = new Test();

        // PUBLIC - доступен из другого пакета
        System.out.println("TestFromOtherTest.publicField = " + obj.publicField);
        obj.publicMethod();

        // PROTECTED - недоступен из другого пакета, если нет наследования
        // System.out.println(obj.protectedField); // Ошибка
        // obj.protectedMethod(); // Ошибка

        // DEFAULT - недоступен вне пакета
        // System.out.println(obj.defaultField); // Ошибка
        // obj.defaultMethod(); // Ошибка

        // PRIVATE - недоступен
        // System.out.println(obj.privateField); // Ошибка
        // obj.privateMethod(); // Ошибка
    }
}
