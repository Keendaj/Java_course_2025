package example;

public class Test {
    public int publicField = 1;
    protected int protectedField = 2;
    int defaultField = 3;
    private int privateField = 4;

    /**
     * @param args
     * @return void
     * @see Показывает, что был использован public метод
     */
    public void publicMethod() {
        System.out.println("publicMethod");
    }
    
    /**
     * @param args
     * @return void
     * @see Показывает, что был использован protected метод
     */
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    /**
     * @param args
     * @return void
     * @see Показывает, что был использован default метод
     */
    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    /**
     * @param args
     * @return void
     * @see Показывает, что был использован private метод
     */
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    /**
     * @param args
     * @return void
     * @see Показывает, что был использован public метод для доступа к private
     */
    public void accessPrivateInside() {
        System.out.println("privateField = " + privateField);
        privateMethod();
    }
}
