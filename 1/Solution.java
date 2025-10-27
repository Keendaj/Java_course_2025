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
     * @see Показывает работу с decode на примере Integer
     */
    public static void main(String[] args){
        Integer number = Integer.decode("54");     // dec 54
        Integer hex = Integer.decode("0x36");       // hex 6 + 3 * 16 =  54
        Integer hex2 = Integer.decode("#36");       // hex same
        Integer octal = Integer.decode("066");      // oct 6 + 6 * 8 = 54

        System.out.println("decimal = " + number);
        System.out.println("hex = " + hex);
        System.out.println("hex2 = " + hex2);
        System.out.println("octal = " + octal);
    }
}