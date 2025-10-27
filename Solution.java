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
     * @see Показывает применение тернарного оператора
     */
    public static void main(String[] args){
        int i = 0;
        int a = 2;
        if (a == 1) {
            i = 1;
        } else if (a == 2) {
            i = 2;
        } else {
            i = 3; 
        }
        System.out.println(i);

        i = 0;
        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        System.out.println(i);
    }
}