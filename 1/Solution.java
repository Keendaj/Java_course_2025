class Parent {
    public void display() {
        System.out.println("Parent method");
    }
    
    @Deprecated //Помечает метод как устаревший, при вызове напрямую выдаст предупреждение
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

class Child extends Parent {
    @Override // Говорит о переопределении старого метода
    public void display() {
        System.out.println("Child method");
    }

    @SuppressWarnings("deprecation") //Убирает предупреждение об устаревшести метода (в целом убирает конкретное предупреждение)
    public void useDeprecatedMethod() {
        oldMethod();
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
     * @see Показывает пример работы с Аннтоациями
     */
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        
        child.useDeprecatedMethod(); 
        
        @SuppressWarnings("unchecked")
        java.util.List<String> list = new java.util.ArrayList();
    }
}