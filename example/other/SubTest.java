package example.other;

import example.Test;

public class SubTest extends Test {
    public void testProtectedAccess() {
        System.out.println("Доступ к protectedField: " + protectedField);
        protectedMethod();
    }
}
