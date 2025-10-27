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
     * @see Показывает случай выброса NullPointerException
     */
    public static void main(String[] args){
        Integer i = null;

        try {
            int j = i;
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}