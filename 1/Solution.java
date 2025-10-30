interface IBase {

    default void sayHello() {
        System.out.println("default method!");
    }

    static void sayGoodbye() {
        System.out.println("static method!");
    }
}

class Base implements IBase {
    //Можем так и оставить
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
     * @see Показывает пример работы с default и static в interface
     */
    public static void main(String[] args) {
        Base greeter = new Base();
        
        greeter.sayHello(); 
        
        IBase.sayGoodbye(); 

        // Base.sayGoodbye();
    }
}