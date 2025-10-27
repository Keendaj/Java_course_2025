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
     * @see Показывает использование break и continue
     */
    public static void main(String[] args){
        for(int i = 0; i <= 10; i++){
            if (i == 6) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Output: " + i);
        }
    }
}