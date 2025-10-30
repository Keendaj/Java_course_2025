class Animal {
    public final void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating dog food");
    }
    
    // Вызовет ошибку, если раскомментировать
    /*
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    */
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
     * @see Показывает примеры работы с final методом. 
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();      
    }
}