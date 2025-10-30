final class FinalClass {
    private String data;
    
    public FinalClass(String data) {
        this.data = data;
    }
    
    public void showInfo() {
        System.out.println("Data: " + data);
    }
}

// Попытка наследовать final класс вызовет ошибку компиляции
/*
class ExtendedClass extends FinalClass {
    public ExtendedClass(String data) {
        super(data);
    }
    
    public void additionalMethod() {
        System.out.println("Additional functionality");
    }
}
*/

class BaseClass {
    protected String info;
    
    public BaseClass(String info) {
        this.info = info;
    }
}
class DerivedClass extends BaseClass {
    public DerivedClass(String info) {
        super(info);
    }
    
    public void showInfo() {
        System.out.println("Info: " + info);
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
     * @see Показывает примеры работы с final классом. 
     */
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass("Hello World");
        finalObj.showInfo();
        
        // Обычное наследование работает
        DerivedClass child = new DerivedClass("Inheritance works");
        child.showInfo(); 
    }
}