class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}



/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
* @verision 1.0
* @since 2025
 */
public class Solution {
     /**
     * @return void
     * @see Перегрузка без параметров
     */
    public void print() {
        System.out.println("Метод без параметров");
    }

     /**
     * @param number 
     * @return void
     * @see Перегрузка с параметром int
     */
    public void print(int number) {
        System.out.println("Метод с int: " + number);
    }

     /**
     * @param text
     * @return void
     * @see Перегрузка с параметром String
     */
    public void print(String text) {
        System.out.println("Метод с String: " + text);
    }


     /**
     * @param args
     * @return void
     * @see Показывает использование  перегрузки
     */
    public static void main(String[] args) {
        Solution obj = new Solution();

        obj.print();  
        obj.print(123);
        obj.print("Hello");  

        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Animal ad = new Dog();
        ad.sound();
    }
}
