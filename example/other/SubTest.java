package example.other;

import example.Test;

public class SubTest extends Test {
    /**
     * @param args
     * @return void
     * @see Показывает, что был использован protected метод у наследника
     */
    public void testProtectedAccess() {
        System.out.println("Доступ к protectedField: " + protectedField);
        protectedMethod();
    }
}
