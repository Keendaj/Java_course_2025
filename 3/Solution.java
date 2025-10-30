class OuterClass {
    private String outerField = "Outer field";

    public class PublicInner {
        public String publicInnerField = "Public inner field";
        private String privateInnerField = "Private inner field";
        
        public void publicInnerMethod() {
            System.out.println("Public inner method");
        }
        
        private void privateInnerMethod() {
            System.out.println("Private inner method");
        }
    }
    
    private class PrivateInner {
        public String innerField = "Private inner field";
        
        public void show() {
            System.out.println("From private inner: " + outerField);
        }
    }
    
    public void accessInnerClasses() {
        System.out.println("Outer accessing inner classes:");
        
        PublicInner publicInner = new PublicInner();
        PrivateInner privateInner = new PrivateInner();
        
        // public
        System.out.println(publicInner.publicInnerField);
        publicInner.publicInnerMethod();
        
        // private методы и поля
        // System.out.println(publicInner.privateInnerField); // Ошибка компиляции
        // publicInner.privateInnerMethod(); // Ошибка компиляции
        
        // private класс
        System.out.println(privateInner.innerField);
        privateInner.show();
    }
    
    public PublicInner getPublicInner() {
        return new PublicInner();
    }
    
    public PrivateInner getPrivateInner() {
        return new PrivateInner();
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
     * @see Показывает пример переопределния equals.
     */
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClasses();
    }
}