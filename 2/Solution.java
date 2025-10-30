class Outer {
    private String privateField = "private field";
    protected String protectedField = "protected field";
    String packageField = "package field";
    public String publicField = "public field";
    
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    public void publicMethod() {
        System.out.println("Public method");
    }
    
    class Inner {
        public void accessOuter() {
            System.out.println("Accessing from Inner:");
            System.out.println(privateField);    // private
            System.out.println(protectedField);  // protected  
            System.out.println(packageField);    // default
            System.out.println(publicField);     // public
            
            privateMethod();  // private
            publicMethod();   // public

            System.out.println("Outer reference: " + Outer.this);
        }
    }
    
    public void createInner() {
        Inner inner = new Inner();
        inner.accessOuter();
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
     * @see Показывает пример доступа к outer классу от inner
     * inner класс имеет доступ ко всем полями и методам независимо от спецификатора
     */
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner();

        Outer.Inner inner = outer.new Inner();
        inner.accessOuter();
    }
}