class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    public String getName() {
        return "Unknown Animal";
    }
    
    public Animal getInstance() {
        return new Animal();
    }
}

class Dog extends Animal {
    /* 
    Ошибки, которые будут выявлены
    @Override
    public void makeSound(String name) {
        System.out.println("Dog barks");
    }

    @Override
    public void mkeSound() { <- метода с таким названием просто нет в родителе
        System.out.println("Dog barks");
    }
    */

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }



    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public Dog getInstance() {
        return new Dog();
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
     * @see Показывает примеры исправления ошибок с Override. 
     */
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();

        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.makeSound();
        dog.makeSound();
    }
}