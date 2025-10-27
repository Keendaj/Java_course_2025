/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
* @verision 1.0
* @since 2025
 */
public class Solution {

    /**
     * @param args
     * @return void
     * @see Показывает примитивные бесконечные циклы
     */
    public static void main(String[] args){
        while (true) {
            System.out.println("Infinity cycle while");
            break; // Чтобы просто выйти
        }

        do {
            System.out.println("Infinity cycle do-while");
            break; // Чтобы просто выйти
        } while (true);
    }
}