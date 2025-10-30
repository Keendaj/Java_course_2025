interface Singer {
    default void perform() {
        System.out.println("Singing");
    }
}

interface Dancer {
    default void perform() {
        System.out.println("Dancing");
    }
}
//Явное наследование обычное вызовёт ошибку
/*class Performer implements Singer, Dancer {
}*/

class Performer1 implements Singer, Dancer {
    @Override
    public void perform() {
        System.out.println("Performing1!");//Полностью новый переопределённый метод
    }
}

class Performer2 implements Singer, Dancer {
    @Override
    public void perform() {
        Singer.super.perform(); //Явно указываем 1 интерфейс
    }
}

class Performer3 implements Singer, Dancer {
    @Override
    public void perform() {
        System.out.println("Starting");
        Singer.super.perform(); //Комбинируем оба
        Dancer.super.perform(); 
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
     * @see Показывает пример работы с множественным наследованием
     */
    public static void main(String[] args) {
        System.out.println("=== 1 ===");
        Performer1 p1 = new Performer1();
        p1.perform();
        
        System.out.println("\n=== 2 ===");
        Performer2 p2 = new Performer2();
        p2.perform();
        
        System.out.println("\n=== 3 ===");
        Performer3 p3 = new Performer3();
        p3.perform();

    }
}