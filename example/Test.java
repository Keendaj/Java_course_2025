package example;

public class Test {
    public int publicField = 1;
    protected int protectedField = 2;
    int defaultField = 3;
    private int privateField = 4;

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    public void accessPrivateInside() {
        System.out.println("privateField = " + privateField);
        privateMethod();
    }
}
